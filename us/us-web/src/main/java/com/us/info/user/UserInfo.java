package com.us.info.user;

import java.io.Serializable;

public class UserInfo implements Serializable {
	
	private static final long serialVersionUID = -8034822160334876235L;
	
	private String userName;
	private String userId;
	private String password;
	private String mobile;
	
	public UserInfo(String userName,String userId){
		this.userName = userName;
		this.userId = userId;
	}

	public UserInfo(){
		
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
