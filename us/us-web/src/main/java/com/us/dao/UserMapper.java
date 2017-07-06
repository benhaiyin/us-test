package com.us.dao;

import com.us.dao.datasource.MyBatisRepository;
import com.us.model.defaults.User;
import com.us.model.defaults.UserExample;


@MyBatisRepository
public interface UserMapper extends BasePrimaryKeyTableDao<User, String, UserExample>
{
	
}