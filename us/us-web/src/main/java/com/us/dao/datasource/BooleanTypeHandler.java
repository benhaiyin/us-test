package com.us.dao.datasource;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

/**
 * myBatis bigInt转换 boolean
 * 
 * @version 1.0
 */
public class BooleanTypeHandler extends BaseTypeHandler<Boolean>
{

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Boolean parameter, JdbcType jdbcType) throws SQLException
	{
		ps.setLong(i, ((parameter == true) ? 1 : 0));
	}

	@Override
	public Boolean getNullableResult(ResultSet rs, String columnName) throws SQLException
	{
		Long var = rs.getLong(columnName);
		Boolean r = (var > 0);
		return r;
	}

	@Override
	public Boolean getNullableResult(ResultSet rs, int columnIndex) throws SQLException
	{
		Long var = rs.getLong(columnIndex);
		Boolean r = (var > 0);
		return r;
	}

	@Override
	public Boolean getNullableResult(CallableStatement cs, int columnIndex) throws SQLException
	{
		Long var = cs.getLong(columnIndex);
		Boolean r = (var > 0);
		return r;
	}

}
