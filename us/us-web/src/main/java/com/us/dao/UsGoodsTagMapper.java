package com.us.dao;

import com.us.model.defaults.UsGoodsTag;
import com.us.model.defaults.UsGoodsTagExample;
import com.us.model.defaults.UsGoodsTagKey;
import java.util.List;

public interface UsGoodsTagMapper {
    int countByExample(UsGoodsTagExample example);

    int deleteByExample(UsGoodsTagExample example);

    int deleteByPrimaryKey(UsGoodsTagKey key);

    int insert(UsGoodsTag record);

    int insertSelective(UsGoodsTag record);

    List<UsGoodsTag> selectByExample(UsGoodsTagExample example);

    UsGoodsTag selectByPrimaryKey(UsGoodsTagKey key);

    int updateByPrimaryKeySelective(UsGoodsTag record);

    int updateByPrimaryKey(UsGoodsTag record);
}