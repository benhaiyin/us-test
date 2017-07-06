package com.us.core.common.exception;

/**
 * Us 异常 
 */
public class UsException extends Exception {
	
	private static final long serialVersionUID = 9129750305176124637L;
	
	private String code;
	
	public UsException(String code,String message){
		super(message);
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
}
