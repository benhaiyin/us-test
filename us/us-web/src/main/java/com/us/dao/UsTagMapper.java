package com.us.dao;

import com.us.model.defaults.UsTag;
import com.us.model.defaults.UsTagExample;
import java.util.List;

public interface UsTagMapper {
    int countByExample(UsTagExample example);

    int deleteByExample(UsTagExample example);

    int deleteByPrimaryKey(String tagId);

    int insert(UsTag record);

    int insertSelective(UsTag record);

    List<UsTag> selectByExample(UsTagExample example);

    UsTag selectByPrimaryKey(String tagId);

    int updateByPrimaryKeySelective(UsTag record);

    int updateByPrimaryKey(UsTag record);
}