package com.us.dao;

import com.us.model.defaults.UsGoodsAttr;
import com.us.model.defaults.UsGoodsAttrExample;
import java.util.List;

public interface UsGoodsAttrMapper {
    int countByExample(UsGoodsAttrExample example);

    int deleteByExample(UsGoodsAttrExample example);

    int deleteByPrimaryKey(String goodsAttrId);

    int insert(UsGoodsAttr record);

    int insertSelective(UsGoodsAttr record);

    List<UsGoodsAttr> selectByExample(UsGoodsAttrExample example);

    UsGoodsAttr selectByPrimaryKey(String goodsAttrId);

    int updateByPrimaryKeySelective(UsGoodsAttr record);

    int updateByPrimaryKey(UsGoodsAttr record);
}