package com.us.dao;

import com.us.model.defaults.UsOrder;
import com.us.model.defaults.UsOrderExample;
import java.util.List;

public interface UsOrderMapper {
    int countByExample(UsOrderExample example);

    int deleteByExample(UsOrderExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(UsOrder record);

    int insertSelective(UsOrder record);

    List<UsOrder> selectByExample(UsOrderExample example);

    UsOrder selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(UsOrder record);

    int updateByPrimaryKey(UsOrder record);
}