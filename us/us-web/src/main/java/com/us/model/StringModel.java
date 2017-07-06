package com.us.model;

/**
 * 公共model
 * 
 * @author wumenghua
 * @version 1.0
 */
public class StringModel extends PrimaryKeyModel<String>
{
	@Override
	public int hashCode()
	{
		int r = 17;
		String key = getId();
		int a = (null == key ? super.hashCode() : key.hashCode());
		r = 31 * r + a;
		return r;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (!(obj instanceof StringModel))
		{
			return false;
		}
		final StringModel po = (StringModel) obj;
		return (this.getId() == null ? po.getId() == null : this.getId().equals(po.getId()));
	}
}