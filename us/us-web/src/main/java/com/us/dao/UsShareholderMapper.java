package com.us.dao;

import com.us.model.defaults.UsShareholder;
import com.us.model.defaults.UsShareholderExample;
import java.util.List;

public interface UsShareholderMapper {
    int countByExample(UsShareholderExample example);

    int deleteByExample(UsShareholderExample example);

    int deleteByPrimaryKey(String shareholderId);

    int insert(UsShareholder record);

    int insertSelective(UsShareholder record);

    List<UsShareholder> selectByExample(UsShareholderExample example);

    UsShareholder selectByPrimaryKey(String shareholderId);

    int updateByPrimaryKeySelective(UsShareholder record);

    int updateByPrimaryKey(UsShareholder record);
}