package com.us.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 公共model
 * 
 * @author wumenghua
 * @version 1.0
 */
public class BaseModel
{
	@JsonIgnore
	private String creater;

	@JsonIgnore
	private Date createTime;

	@JsonIgnore
	private String modifier;

	@JsonIgnore
	private Date modifyTime;

	@JsonIgnore
	private Long ver;

	public String getCreater()
	{
		return creater;
	}

	public void setCreater(String creater)
	{
		this.creater = creater;
	}

	public Date getCreateTime()
	{
		return createTime;
	}

	public void setCreateTime(Date createTime)
	{
		this.createTime = createTime;
	}

	public String getModifier()
	{
		return modifier;
	}

	public void setModifier(String modifier)
	{
		this.modifier = modifier;
	}

	public Date getModifyTime()
	{
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime)
	{
		this.modifyTime = modifyTime;
	}

	public Long getVer()
	{
		return ver;
	}

	public void setVer(Long ver)
	{
		this.ver = ver;
	}
}