package com.us.dao;

import com.us.model.defaults.UsMenuGoods;
import com.us.model.defaults.UsMenuGoodsExample;
import com.us.model.defaults.UsMenuGoodsKey;
import java.util.List;

public interface UsMenuGoodsMapper {
    int countByExample(UsMenuGoodsExample example);

    int deleteByExample(UsMenuGoodsExample example);

    int deleteByPrimaryKey(UsMenuGoodsKey key);

    int insert(UsMenuGoods record);

    int insertSelective(UsMenuGoods record);

    List<UsMenuGoods> selectByExample(UsMenuGoodsExample example);

    UsMenuGoods selectByPrimaryKey(UsMenuGoodsKey key);

    int updateByPrimaryKeySelective(UsMenuGoods record);

    int updateByPrimaryKey(UsMenuGoods record);
}