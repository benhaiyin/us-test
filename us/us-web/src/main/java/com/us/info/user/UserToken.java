package com.us.info.user;

import org.apache.shiro.authc.AuthenticationToken;

public class UserToken implements AuthenticationToken{
	
	private static final long serialVersionUID = -1630888572578319702L;
	
	private String accessToken;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	@Override
	public Object getPrincipal() {
		return this.getPrincipal();
	}

	@Override
	public Object getCredentials() {
		return this.getCredentials();
	}
	
}
