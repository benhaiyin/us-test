package com.us.dao;

import com.us.model.defaults.UsOrderGoods;
import com.us.model.defaults.UsOrderGoodsExample;
import com.us.model.defaults.UsOrderGoodsKey;
import java.util.List;

public interface UsOrderGoodsMapper {
    int countByExample(UsOrderGoodsExample example);

    int deleteByExample(UsOrderGoodsExample example);

    int deleteByPrimaryKey(UsOrderGoodsKey key);

    int insert(UsOrderGoods record);

    int insertSelective(UsOrderGoods record);

    List<UsOrderGoods> selectByExample(UsOrderGoodsExample example);

    UsOrderGoods selectByPrimaryKey(UsOrderGoodsKey key);

    int updateByPrimaryKeySelective(UsOrderGoods record);

    int updateByPrimaryKey(UsOrderGoods record);
}