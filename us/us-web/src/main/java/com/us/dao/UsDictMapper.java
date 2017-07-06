package com.us.dao;

import com.us.model.defaults.UsDict;
import com.us.model.defaults.UsDictExample;
import java.util.List;

public interface UsDictMapper {
    int countByExample(UsDictExample example);

    int deleteByExample(UsDictExample example);

    int deleteByPrimaryKey(String dictCode);

    int insert(UsDict record);

    int insertSelective(UsDict record);

    List<UsDict> selectByExample(UsDictExample example);

    UsDict selectByPrimaryKey(String dictCode);

    int updateByPrimaryKeySelective(UsDict record);

    int updateByPrimaryKey(UsDict record);
}