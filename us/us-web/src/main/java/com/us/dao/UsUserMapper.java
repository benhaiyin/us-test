package com.us.dao;

import com.us.dao.datasource.MyBatisRepository;
import com.us.model.defaults.UsUser;
import com.us.model.defaults.UsUserExample;

@MyBatisRepository
public interface UsUserMapper extends BasePrimaryKeyTableDao <UsUser,String,UsUserExample> {
    
}