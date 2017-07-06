package com.us.dao;

import com.us.model.defaults.UsGoodsFlow;
import com.us.model.defaults.UsGoodsFlowExample;
import com.us.model.defaults.UsGoodsFlowKey;
import java.util.List;

public interface UsGoodsFlowMapper {
    int countByExample(UsGoodsFlowExample example);

    int deleteByExample(UsGoodsFlowExample example);

    int deleteByPrimaryKey(UsGoodsFlowKey key);

    int insert(UsGoodsFlow record);

    int insertSelective(UsGoodsFlow record);

    List<UsGoodsFlow> selectByExample(UsGoodsFlowExample example);

    UsGoodsFlow selectByPrimaryKey(UsGoodsFlowKey key);

    int updateByPrimaryKeySelective(UsGoodsFlow record);

    int updateByPrimaryKey(UsGoodsFlow record);
}