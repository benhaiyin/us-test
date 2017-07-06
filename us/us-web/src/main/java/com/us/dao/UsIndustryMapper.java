package com.us.dao;

import com.us.model.defaults.UsIndustry;
import com.us.model.defaults.UsIndustryExample;
import java.util.List;

public interface UsIndustryMapper {
    int countByExample(UsIndustryExample example);

    int deleteByExample(UsIndustryExample example);

    int deleteByPrimaryKey(String dustryCode);

    int insert(UsIndustry record);

    int insertSelective(UsIndustry record);

    List<UsIndustry> selectByExample(UsIndustryExample example);

    UsIndustry selectByPrimaryKey(String dustryCode);

    int updateByPrimaryKeySelective(UsIndustry record);

    int updateByPrimaryKey(UsIndustry record);
}