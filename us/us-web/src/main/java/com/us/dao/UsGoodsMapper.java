package com.us.dao;

import com.us.model.defaults.UsGoods;
import com.us.model.defaults.UsGoodsExample;
import java.util.List;

public interface UsGoodsMapper {
    int countByExample(UsGoodsExample example);

    int deleteByExample(UsGoodsExample example);

    int deleteByPrimaryKey(String goodsId);

    int insert(UsGoods record);

    int insertSelective(UsGoods record);

    List<UsGoods> selectByExample(UsGoodsExample example);

    UsGoods selectByPrimaryKey(String goodsId);

    int updateByPrimaryKeySelective(UsGoods record);

    int updateByPrimaryKey(UsGoods record);
}