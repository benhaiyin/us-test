package com.us.web.filter.security.realm;

import java.util.Collection;
import java.util.HashSet;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;

import com.us.info.user.UserInfo;
import com.us.info.user.UserToken;
import com.us.service.user.UserService;

/**
 * 自定义用户权限提供类 ,用户获取登录用户的权限
 * 
 * @version 1.0
 */
public class UsRealm extends AuthorizingRealm{

	@Resource
	private UserService userService;
	
	/*@Override
	public boolean supports(AuthenticationToken token)
	{
		// 仅支持ApiToken类型的Token
		return token instanceof UserToken;
	}*/
	
	/** 
     * 权限认证 
     */ 
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
		String token = (String) principal.getPrimaryPrincipal();
		Subject subject = SecurityUtils.getSubject();
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		UserInfo userInfo = (UserInfo) subject.getSession().getAttribute(token);
		if(null!=userInfo){
			//获取用户的角色 roles | 授权  permissions
			Collection<String> roles = new HashSet<String>();
			roles.add("普通用户");
			roles.add("数据管理员");
			Collection<String> permissions = new HashSet<String>();
			permissions.add("manage/test");
			authorizationInfo.addRoles(roles);
			authorizationInfo.addStringPermissions(permissions);
		}	
		return authorizationInfo;
	}

	/**
	 * 获取认证信息
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken autheToken) throws AuthenticationException {
		if (autheToken instanceof UserToken)
		{
			UserToken userToken = (UserToken) autheToken;
			UserInfo userInfo = userService.getUserInfo(userToken.getAccessToken());
			if (null == userInfo)
			{
				throw new UnknownAccountException();// 没找到帐号
			}
			
			Subject currentUser = SecurityUtils.getSubject();
			currentUser.getSession().setAttribute(userToken.getAccessToken(), userInfo);
			return new SimpleAuthenticationInfo(userToken.getAccessToken(), userToken.getAccessToken(), getName());
		}
		else
		{
			UsernamePasswordToken token = (UsernamePasswordToken) autheToken;
			String name = token.getUsername();
			if (StringUtils.isNotBlank(name))
			{
				UserInfo user = userService.getUserByMobile(name);
				if (null == user)
				{
					throw new UnknownAccountException();// 没找到帐号
				}
				Subject currentUser = SecurityUtils.getSubject();
				currentUser.getSession().setAttribute(user.getMobile(), user);
				return new SimpleAuthenticationInfo(user.getMobile(), user.getPassword(), getName());
			}
			else
			{
				throw new UnknownAccountException();// 没找到帐号
			}
		}
	}
	
	@Override
	public void clearCachedAuthorizationInfo(PrincipalCollection principals)
	{
		super.clearCachedAuthorizationInfo(principals);
	}

	@Override
	public void clearCachedAuthenticationInfo(PrincipalCollection principals)
	{
		super.clearCachedAuthenticationInfo(principals);
	}

	@Override
	public void clearCache(PrincipalCollection principals)
	{
		super.clearCache(principals);
	}

	public void clearAllCachedAuthorizationInfo()
	{
		getAuthorizationCache().clear();
	}

	public void clearAllCachedAuthenticationInfo()
	{
		getAuthenticationCache().clear();
	}

	public void clearAllCache()
	{
		clearAllCachedAuthenticationInfo();
		clearAllCachedAuthorizationInfo();
	}

}
