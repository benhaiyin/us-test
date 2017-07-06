package com.us.dao.datasource;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.support.DefaultTransactionStatus;

/**
 * 数据库事务扩展
 * 
 * @author wumenghua
 * @version V1.0
 */
public class DataTransactionManager extends DataSourceTransactionManager
{
	private static final long serialVersionUID = -8739647292395181958L;

	public static final ThreadLocal<String> session = new ThreadLocal<String>();

	@Override
	protected void doCommit(DefaultTransactionStatus status)
	{
		super.doCommit(status);
	}
}