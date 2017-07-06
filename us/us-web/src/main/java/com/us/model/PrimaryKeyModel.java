package com.us.model;

/**
 * 有主键Id的modle
 * 
 * @author wumenghua
 * @version 1.0
 */
public class PrimaryKeyModel<T> extends BaseModel
{
	private T id;

	public T getId()
	{
		return id;
	}

	public void setId(T id)
	{
		this.id = id;
	}
}