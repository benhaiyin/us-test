package com.us.web.param.user;

import org.hibernate.validator.constraints.NotBlank;



/**
 * 用户模块查询条件
 */
public class UserQryParamIn {
	
	@NotBlank(message = "参数不能为空！")
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
