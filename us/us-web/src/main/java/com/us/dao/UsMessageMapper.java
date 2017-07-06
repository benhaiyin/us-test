package com.us.dao;

import com.us.model.defaults.UsMessage;
import com.us.model.defaults.UsMessageExample;
import java.util.List;

public interface UsMessageMapper {
    int countByExample(UsMessageExample example);

    int deleteByExample(UsMessageExample example);

    int deleteByPrimaryKey(String messageId);

    int insert(UsMessage record);

    int insertSelective(UsMessage record);

    List<UsMessage> selectByExample(UsMessageExample example);

    UsMessage selectByPrimaryKey(String messageId);

    int updateByPrimaryKeySelective(UsMessage record);

    int updateByPrimaryKey(UsMessage record);
}