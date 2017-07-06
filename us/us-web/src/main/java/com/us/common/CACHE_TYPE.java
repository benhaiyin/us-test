package com.us.common;

/**
 * ecache 缓存类型 
 */
public enum CACHE_TYPE {
	
	DICCACHE("dicCache"),AUTHCACHE("authCache");
	
	private String name;
	
	private CACHE_TYPE(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
