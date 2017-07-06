package com.us.dao;

import com.us.model.defaults.UsCustomer;
import com.us.model.defaults.UsCustomerExample;
import java.util.List;

public interface UsCustomerMapper {
    int countByExample(UsCustomerExample example);

    int deleteByExample(UsCustomerExample example);

    int insert(UsCustomer record);

    int insertSelective(UsCustomer record);

    List<UsCustomer> selectByExample(UsCustomerExample example);
}