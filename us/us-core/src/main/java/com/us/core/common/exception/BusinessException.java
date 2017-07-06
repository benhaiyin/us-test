package com.us.core.common.exception;

import com.us.core.common.constant.UsConstants;

/**
 * 业务异常
 * 
 * @version 1.0
 */
public class BusinessException extends Exception
{
	private static final long serialVersionUID = 3642149887998012492L;

	public BusinessException(String message)
	{
		super(message);
	}
	
	public BusinessException(String code, String message)
	{
		super(message);
		this.setCode(code);
	}

	private String code =  UsConstants.BUSINESS_ERROR_CODE ; // 错误编码

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}
}
