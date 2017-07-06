package com.us.dao;

import com.us.model.defaults.UsCity;
import com.us.model.defaults.UsCityExample;
import java.util.List;

public interface UsCityMapper {
    int countByExample(UsCityExample example);

    int deleteByExample(UsCityExample example);

    int deleteByPrimaryKey(String cityCode);

    int insert(UsCity record);

    int insertSelective(UsCity record);

    List<UsCity> selectByExample(UsCityExample example);

    UsCity selectByPrimaryKey(String cityCode);

    int updateByPrimaryKeySelective(UsCity record);

    int updateByPrimaryKey(UsCity record);
}