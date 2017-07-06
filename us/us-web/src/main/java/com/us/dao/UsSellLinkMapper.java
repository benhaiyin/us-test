package com.us.dao;

import com.us.model.defaults.UsSellLink;
import com.us.model.defaults.UsSellLinkExample;
import java.util.List;

public interface UsSellLinkMapper {
    int countByExample(UsSellLinkExample example);

    int deleteByExample(UsSellLinkExample example);

    int deleteByPrimaryKey(String goodsId);

    int insert(UsSellLink record);

    int insertSelective(UsSellLink record);

    List<UsSellLink> selectByExample(UsSellLinkExample example);

    UsSellLink selectByPrimaryKey(String goodsId);

    int updateByPrimaryKeySelective(UsSellLink record);

    int updateByPrimaryKey(UsSellLink record);
}