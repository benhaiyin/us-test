package com.us.dao;

import com.us.model.defaults.UsAccountDoc;
import com.us.model.defaults.UsAccountDocExample;
import java.util.List;

public interface UsAccountDocMapper {
    int countByExample(UsAccountDocExample example);

    int deleteByExample(UsAccountDocExample example);

    int deleteByPrimaryKey(String accountDocId);

    int insert(UsAccountDoc record);

    int insertSelective(UsAccountDoc record);

    List<UsAccountDoc> selectByExample(UsAccountDocExample example);

    UsAccountDoc selectByPrimaryKey(String accountDocId);

    int updateByPrimaryKeySelective(UsAccountDoc record);

    int updateByPrimaryKey(UsAccountDoc record);
}