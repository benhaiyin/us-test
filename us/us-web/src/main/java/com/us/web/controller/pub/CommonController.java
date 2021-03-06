package com.us.web.controller.pub;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.druid.support.json.JSONUtils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.us.core.common.exception.ValidateException;
import com.us.core.utils.JsonUtils;
import com.us.core.utils.ValidateUtil;
import com.us.info.user.UserInfo;
import com.us.info.user.UserInfo2;
import com.us.info.user.UserToken;
import com.us.service.user.UserService;
import com.us.web.filter.security.ApplicationUsContext;
import com.us.web.param.user.UserQryOut;
import com.us.web.param.user.UserQryParamIn;

@Controller
@Scope("prototype")
@RequestMapping("manage")
public class CommonController {

	@Resource
	private UserService userService;
	
	@RequestMapping("test")
	public ModelAndView index(){
		ModelAndView view = new ModelAndView();
		view.setViewName("index");
		return view;
	}
	
	@RequestMapping("test/qry")
	/**
	 * http://blog.csdn.net/eson_15/article/details/51725470
	 * @param param
	 * @param bindingResult
	 * @return
	 */
	public ModelAndView qry(@Valid UserQryParamIn param,BindingResult bindingResult){
		ModelAndView view = new ModelAndView();
		
		try {
			ValidateUtil.validateError(bindingResult);
			UserInfo userInfo = userService.getUserInfo(param.getUserId());
			view.addObject("userInfo", userInfo);
		} catch (ValidateException e) {
			view.addObject("error", e.getMessage());
		}
		view.setViewName("index");
		return view;
	}
	
	@RequestMapping("test/submit/obj")
	/**
	 * 单个对象
	 * 这里必须用userName="test"而不是userInfo.userName="test"，因为默认情况下springMVC是不支持userInfo.userName这种传参方式的
	 * @param userInfo 必须有无参构造器
	 * @return
	 */
	public ModelAndView testSubmit(UserInfo userInfo){
		
		List<UserToken>  arrUserToken = JsonUtils.json2Object(userInfo.getArrUserToken(), new TypeReference<List<UserToken>>() {
		});
		System.out.println(arrUserToken.size());
		
		UserToken userToken = JsonUtils.json2Object(userInfo.getUserToken(), new TypeReference<UserToken>() {
		});
		System.out.println(userToken.getAccessToken());
		
	
		ModelAndView view = new ModelAndView();
		view.addObject("userInfo", userInfo);
		view.setViewName("index");
		return view;
	}
	
	@RequestMapping("test/submit/objList")
	/**
	 * list 对象
	 * 格式：arrUser[0].userName="test1",arrUser[1].userName="test2"
	 * @param arrUser 
	 * @return
	 */
	public ModelAndView testSubmit(UserQryOut arrUser1){
		System.out.println("objList loginUser.mobile:"+ApplicationUsContext.getCurrentUserMobile());
		ModelAndView view = new ModelAndView();
		view.addObject("arrUserInfo", arrUser1.getArrUser());
		view.setViewName("index");
		return view;
	}
	
	@RequestMapping("test/submit/login")
	public ModelAndView testLogin(){
		ModelAndView view = new ModelAndView();
		/*UsernamePasswordToken token = new UsernamePasswordToken("15618386759","123456");
		try {  
            SecurityUtils.getSubject().login(token);  
                  
        } catch (AuthenticationException e) {  
           System.out.println("登录验证失败！");
        } */ 
		UserInfo userInfo = userService.getUserByMobile("15618386759");
		System.out.println(userInfo.getMobile()+"-----------------"+userInfo.getPassword()+"------------"+ userInfo.getUserName());
		userService.getUserInfo(userInfo.getUserId());
		System.out.println(userInfo.getUserId()+"----------"+userInfo.getMobile()+"-----------------"+userInfo.getPassword()+"------------"+ userInfo.getUserName());
		view.setViewName("index");
		return view;
		
	}
}
