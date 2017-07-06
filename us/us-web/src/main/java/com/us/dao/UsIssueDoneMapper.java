package com.us.dao;

import com.us.model.defaults.UsIssueDone;
import com.us.model.defaults.UsIssueDoneExample;
import java.util.List;

public interface UsIssueDoneMapper {
    int countByExample(UsIssueDoneExample example);

    int deleteByExample(UsIssueDoneExample example);

    int deleteByPrimaryKey(String issueDoneId);

    int insert(UsIssueDone record);

    int insertSelective(UsIssueDone record);

    List<UsIssueDone> selectByExample(UsIssueDoneExample example);

    UsIssueDone selectByPrimaryKey(String issueDoneId);

    int updateByPrimaryKeySelective(UsIssueDone record);

    int updateByPrimaryKey(UsIssueDone record);
}