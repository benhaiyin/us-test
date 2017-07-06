package com.us.dao;

import com.us.model.defaults.UsOrderGoodsAttr;
import com.us.model.defaults.UsOrderGoodsAttrExample;
import com.us.model.defaults.UsOrderGoodsAttrKey;
import java.util.List;

public interface UsOrderGoodsAttrMapper {
    int countByExample(UsOrderGoodsAttrExample example);

    int deleteByExample(UsOrderGoodsAttrExample example);

    int deleteByPrimaryKey(UsOrderGoodsAttrKey key);

    int insert(UsOrderGoodsAttr record);

    int insertSelective(UsOrderGoodsAttr record);

    List<UsOrderGoodsAttr> selectByExample(UsOrderGoodsAttrExample example);

    UsOrderGoodsAttr selectByPrimaryKey(UsOrderGoodsAttrKey key);

    int updateByPrimaryKeySelective(UsOrderGoodsAttr record);

    int updateByPrimaryKey(UsOrderGoodsAttr record);
}