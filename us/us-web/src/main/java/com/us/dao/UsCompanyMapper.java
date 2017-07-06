package com.us.dao;

import com.us.model.defaults.UsCompany;
import com.us.model.defaults.UsCompanyExample;
import java.util.List;

public interface UsCompanyMapper {
    int countByExample(UsCompanyExample example);

    int deleteByExample(UsCompanyExample example);

    int deleteByPrimaryKey(String companyId);

    int insert(UsCompany record);

    int insertSelective(UsCompany record);

    List<UsCompany> selectByExample(UsCompanyExample example);

    UsCompany selectByPrimaryKey(String companyId);

    int updateByPrimaryKeySelective(UsCompany record);

    int updateByPrimaryKey(UsCompany record);
}