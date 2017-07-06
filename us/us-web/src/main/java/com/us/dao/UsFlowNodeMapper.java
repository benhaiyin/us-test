package com.us.dao;

import com.us.model.defaults.UsFlowNode;
import com.us.model.defaults.UsFlowNodeExample;
import java.util.List;

public interface UsFlowNodeMapper {
    int countByExample(UsFlowNodeExample example);

    int deleteByExample(UsFlowNodeExample example);

    int deleteByPrimaryKey(String flowNodeId);

    int insert(UsFlowNode record);

    int insertSelective(UsFlowNode record);

    List<UsFlowNode> selectByExample(UsFlowNodeExample example);

    UsFlowNode selectByPrimaryKey(String flowNodeId);

    int updateByPrimaryKeySelective(UsFlowNode record);

    int updateByPrimaryKey(UsFlowNode record);
}