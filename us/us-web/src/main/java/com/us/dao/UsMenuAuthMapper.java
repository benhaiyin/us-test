package com.us.dao;

import com.us.model.defaults.UsMenuAuth;
import com.us.model.defaults.UsMenuAuthExample;
import com.us.model.defaults.UsMenuAuthKey;
import java.util.List;

public interface UsMenuAuthMapper {
    int countByExample(UsMenuAuthExample example);

    int deleteByExample(UsMenuAuthExample example);

    int deleteByPrimaryKey(UsMenuAuthKey key);

    int insert(UsMenuAuth record);

    int insertSelective(UsMenuAuth record);

    List<UsMenuAuth> selectByExample(UsMenuAuthExample example);

    UsMenuAuth selectByPrimaryKey(UsMenuAuthKey key);

    int updateByPrimaryKeySelective(UsMenuAuth record);

    int updateByPrimaryKey(UsMenuAuth record);
}