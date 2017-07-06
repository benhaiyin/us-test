package com.us.dao;

import com.us.model.defaults.UsCompanyInfo;
import com.us.model.defaults.UsCompanyInfoExample;
import java.util.List;

public interface UsCompanyInfoMapper {
    int countByExample(UsCompanyInfoExample example);

    int deleteByExample(UsCompanyInfoExample example);

    int deleteByPrimaryKey(String companyInfoId);

    int insert(UsCompanyInfo record);

    int insertSelective(UsCompanyInfo record);

    List<UsCompanyInfo> selectByExample(UsCompanyInfoExample example);

    UsCompanyInfo selectByPrimaryKey(String companyInfoId);

    int updateByPrimaryKeySelective(UsCompanyInfo record);

    int updateByPrimaryKey(UsCompanyInfo record);
}