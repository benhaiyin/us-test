package com.us.dao;

import com.us.model.defaults.UsCompanyGoods;
import com.us.model.defaults.UsCompanyGoodsExample;
import com.us.model.defaults.UsCompanyGoodsKey;
import java.util.List;

public interface UsCompanyGoodsMapper {
    int countByExample(UsCompanyGoodsExample example);

    int deleteByExample(UsCompanyGoodsExample example);

    int deleteByPrimaryKey(UsCompanyGoodsKey key);

    int insert(UsCompanyGoods record);

    int insertSelective(UsCompanyGoods record);

    List<UsCompanyGoods> selectByExample(UsCompanyGoodsExample example);

    UsCompanyGoods selectByPrimaryKey(UsCompanyGoodsKey key);

    int updateByPrimaryKeySelective(UsCompanyGoods record);

    int updateByPrimaryKey(UsCompanyGoods record);
}