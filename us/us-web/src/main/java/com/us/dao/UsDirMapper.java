package com.us.dao;

import com.us.model.defaults.UsDir;
import com.us.model.defaults.UsDirExample;
import java.util.List;

public interface UsDirMapper {
    int countByExample(UsDirExample example);

    int deleteByExample(UsDirExample example);

    int deleteByPrimaryKey(String dirId);

    int insert(UsDir record);

    int insertSelective(UsDir record);

    List<UsDir> selectByExample(UsDirExample example);

    UsDir selectByPrimaryKey(String dirId);

    int updateByPrimaryKeySelective(UsDir record);

    int updateByPrimaryKey(UsDir record);
}