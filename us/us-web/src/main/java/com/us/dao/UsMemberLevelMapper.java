package com.us.dao;

import com.us.model.defaults.UsMemberLevel;
import com.us.model.defaults.UsMemberLevelExample;
import java.util.List;

public interface UsMemberLevelMapper {
    int countByExample(UsMemberLevelExample example);

    int deleteByExample(UsMemberLevelExample example);

    int deleteByPrimaryKey(String memberLevelId);

    int insert(UsMemberLevel record);

    int insertSelective(UsMemberLevel record);

    List<UsMemberLevel> selectByExample(UsMemberLevelExample example);

    UsMemberLevel selectByPrimaryKey(String memberLevelId);

    int updateByPrimaryKeySelective(UsMemberLevel record);

    int updateByPrimaryKey(UsMemberLevel record);
}