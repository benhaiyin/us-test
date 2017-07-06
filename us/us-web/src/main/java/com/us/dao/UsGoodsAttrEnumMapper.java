package com.us.dao;

import com.us.model.defaults.UsGoodsAttrEnum;
import com.us.model.defaults.UsGoodsAttrEnumExample;
import java.util.List;

public interface UsGoodsAttrEnumMapper {
    int countByExample(UsGoodsAttrEnumExample example);

    int deleteByExample(UsGoodsAttrEnumExample example);

    int deleteByPrimaryKey(String attrEnumId);

    int insert(UsGoodsAttrEnum record);

    int insertSelective(UsGoodsAttrEnum record);

    List<UsGoodsAttrEnum> selectByExample(UsGoodsAttrEnumExample example);

    UsGoodsAttrEnum selectByPrimaryKey(String attrEnumId);

    int updateByPrimaryKeySelective(UsGoodsAttrEnum record);

    int updateByPrimaryKey(UsGoodsAttrEnum record);
}