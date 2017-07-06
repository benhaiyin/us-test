package com.us.service.user;

import com.us.info.user.UserInfo;

public interface UserService {
	
	/**
	 * 获取用户信息
	 * @param userId
	 * @return
	 */
	UserInfo getUserInfo(String userId);

	UserInfo getUserByMobile(String name);
}
