package com.us.dao;

import com.us.model.defaults.UsOperator;
import com.us.model.defaults.UsOperatorExample;
import java.util.List;

public interface UsOperatorMapper {
    int countByExample(UsOperatorExample example);

    int deleteByExample(UsOperatorExample example);

    int deleteByPrimaryKey(String companyId);

    int insert(UsOperator record);

    int insertSelective(UsOperator record);

    List<UsOperator> selectByExample(UsOperatorExample example);

    UsOperator selectByPrimaryKey(String companyId);

    int updateByPrimaryKeySelective(UsOperator record);

    int updateByPrimaryKey(UsOperator record);
}