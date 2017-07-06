package com.us.dao;

import java.util.List;

import com.us.core.common.exception.ValidateException;



/**
 * Dao 约束一些公共操作
 * 
 * @author wumenghua
 * @version 1.0
 */
public interface BaseDao<T, PK extends Object>
{

	/**
	 * 根据条件查询总记录数
	 * 
	 * @param record 扩展条件
	 * @return 总记录数
	 */
	int countByExample(PK example);

	/**
	 * 根据 Example 删除几棵
	 * 
	 * @param example
	 * @return
	 * @throws ValidatorException
	 */
	int deleteByExample(PK example) throws ValidateException;

	/**
	 * 插入记录<全部字段>
	 * 
	 * @param record 记录
	 * @return
	 */
	int insert(T record);

	/**
	 * 插入记录<部分字段>
	 * 
	 * @param record
	 * @return
	 */
	int insertSelective(T record);

	/**
	 * 根据条件查询集合
	 * 
	 * @param example
	 * @return
	 */
	List<T> selectByExample(PK example);

}