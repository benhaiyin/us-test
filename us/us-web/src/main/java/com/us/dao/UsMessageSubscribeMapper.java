package com.us.dao;

import com.us.model.defaults.UsMessageSubscribe;
import com.us.model.defaults.UsMessageSubscribeExample;
import com.us.model.defaults.UsMessageSubscribeKey;
import java.util.List;

public interface UsMessageSubscribeMapper {
    int countByExample(UsMessageSubscribeExample example);

    int deleteByExample(UsMessageSubscribeExample example);

    int deleteByPrimaryKey(UsMessageSubscribeKey key);

    int insert(UsMessageSubscribe record);

    int insertSelective(UsMessageSubscribe record);

    List<UsMessageSubscribe> selectByExample(UsMessageSubscribeExample example);

    UsMessageSubscribe selectByPrimaryKey(UsMessageSubscribeKey key);

    int updateByPrimaryKeySelective(UsMessageSubscribe record);

    int updateByPrimaryKey(UsMessageSubscribe record);
}