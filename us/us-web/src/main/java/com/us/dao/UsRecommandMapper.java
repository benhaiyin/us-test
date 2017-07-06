package com.us.dao;

import com.us.model.defaults.UsRecommand;
import com.us.model.defaults.UsRecommandExample;
import com.us.model.defaults.UsRecommandKey;
import java.util.List;

public interface UsRecommandMapper {
    int countByExample(UsRecommandExample example);

    int deleteByExample(UsRecommandExample example);

    int deleteByPrimaryKey(UsRecommandKey key);

    int insert(UsRecommand record);

    int insertSelective(UsRecommand record);

    List<UsRecommand> selectByExample(UsRecommandExample example);

    UsRecommand selectByPrimaryKey(UsRecommandKey key);

    int updateByPrimaryKeySelective(UsRecommand record);

    int updateByPrimaryKey(UsRecommand record);
}