package com.us.core.common.exception;

import com.us.core.common.constant.UsConstants;

/**
 * 自定义验证的错误
 *
 */
public class ValidateException  extends UsException 
{
	private static final long serialVersionUID = 3642149887998012492L;

	public ValidateException(String message)
	{
		super(UsConstants.VALIDATE_ERROR_CODE,message);
	}
	
	public ValidateException(String code, String message)
	{
		super(code,message);
		
	}
}
