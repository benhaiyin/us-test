package com.us.dao;

import com.us.model.defaults.UsCustomerMemeberLevel;
import com.us.model.defaults.UsCustomerMemeberLevelExample;
import java.util.List;

public interface UsCustomerMemeberLevelMapper {
    int countByExample(UsCustomerMemeberLevelExample example);

    int deleteByExample(UsCustomerMemeberLevelExample example);

    int insert(UsCustomerMemeberLevel record);

    int insertSelective(UsCustomerMemeberLevel record);

    List<UsCustomerMemeberLevel> selectByExample(UsCustomerMemeberLevelExample example);
}