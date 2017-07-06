package com.us.dao;

import com.us.model.defaults.UsFlow;
import com.us.model.defaults.UsFlowExample;
import java.util.List;

public interface UsFlowMapper {
    int countByExample(UsFlowExample example);

    int deleteByExample(UsFlowExample example);

    int deleteByPrimaryKey(String flowId);

    int insert(UsFlow record);

    int insertSelective(UsFlow record);

    List<UsFlow> selectByExample(UsFlowExample example);

    UsFlow selectByPrimaryKey(String flowId);

    int updateByPrimaryKeySelective(UsFlow record);

    int updateByPrimaryKey(UsFlow record);
}