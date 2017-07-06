package com.us.dao;

import com.us.model.defaults.UsGoodsCity;
import com.us.model.defaults.UsGoodsCityExample;
import com.us.model.defaults.UsGoodsCityKey;
import java.util.List;

public interface UsGoodsCityMapper {
    int countByExample(UsGoodsCityExample example);

    int deleteByExample(UsGoodsCityExample example);

    int deleteByPrimaryKey(UsGoodsCityKey key);

    int insert(UsGoodsCity record);

    int insertSelective(UsGoodsCity record);

    List<UsGoodsCity> selectByExample(UsGoodsCityExample example);

    UsGoodsCity selectByPrimaryKey(UsGoodsCityKey key);

    int updateByPrimaryKeySelective(UsGoodsCity record);

    int updateByPrimaryKey(UsGoodsCity record);
}