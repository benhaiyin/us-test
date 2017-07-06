package com.us.dao;

import com.us.model.defaults.UsGoodsImage;
import com.us.model.defaults.UsGoodsImageExample;
import com.us.model.defaults.UsGoodsImageKey;
import java.util.List;

public interface UsGoodsImageMapper {
    int countByExample(UsGoodsImageExample example);

    int deleteByExample(UsGoodsImageExample example);

    int deleteByPrimaryKey(UsGoodsImageKey key);

    int insert(UsGoodsImage record);

    int insertSelective(UsGoodsImage record);

    List<UsGoodsImage> selectByExample(UsGoodsImageExample example);

    UsGoodsImage selectByPrimaryKey(UsGoodsImageKey key);

    int updateByPrimaryKeySelective(UsGoodsImage record);

    int updateByPrimaryKey(UsGoodsImage record);
}