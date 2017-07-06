package com.us.service.user.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.us.common.CACHE_TYPE;
import com.us.dao.UsUserMapper;
import com.us.info.user.UserInfo;
import com.us.model.defaults.UsUser;
import com.us.model.defaults.UsUserExample;
import com.us.service.cache.CacheService;
import com.us.service.user.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UsUserMapper userMapper;
	@Resource
	CacheService cacheService;
	
	@Override
	public UserInfo getUserInfo(String userId) {
		UserInfo info =(UserInfo) cacheService.getCacheCode(userId, CACHE_TYPE.DICCACHE.getName());
		if(info==null){
			UsUser user = userMapper.selectByPrimaryKey(userId);
			info = new UserInfo(user.getName(),user.getMobile());
			cacheService.pushCacheCode(userId, info, CACHE_TYPE.DICCACHE.getName());
		}
		return info;
	}

	@Override
	public UserInfo getUserByMobile(String name) {
		UsUserExample userExp = new UsUserExample();
		userExp.createCriteria().andMobileEqualTo(name);
		List<UsUser> usList = userMapper.selectByExample(userExp);
		if(usList!=null&&usList.size()>0){
			UsUser user = usList.get(0);
			UserInfo info =new UserInfo(user.getName(),user.getUserId());
			info.setPassword(user.getPassword());
			info.setMobile(user.getMobile());
			return info;
		}
		return null;
	}

}
