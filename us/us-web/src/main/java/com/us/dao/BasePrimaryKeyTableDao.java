package com.us.dao;


/**
 * Dao 约束一些公共操作
 * 
 * @author wumenghua
 * @version 1.0
 */
public interface BasePrimaryKeyTableDao<T, ID extends Object, PK extends Object> extends BaseDao<T, PK>
{
	/**
	 * 根据主键删除记录
	 * 
	 * @param id 主键
	 * @return
	 */
	int deleteByPrimaryKey(ID id);

	/**
	 * 根据主键查询记录
	 * 
	 * @param id 主键
	 * @return
	 */
	T selectByPrimaryKey(ID id);

	/**
	 * 根据查询条件更新
	 * 
	 * @param record 记录
	 * @return
	 */
	int updateByPrimaryKeySelective(T record);

	/**
	 * 根据主键更新
	 * 
	 * @param record 记录
	 * @return
	 */
	int updateByPrimaryKey(T record);

}