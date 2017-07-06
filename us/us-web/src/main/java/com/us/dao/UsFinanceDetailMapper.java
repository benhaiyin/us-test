package com.us.dao;

import com.us.model.defaults.UsFinanceDetail;
import com.us.model.defaults.UsFinanceDetailExample;
import java.util.List;

public interface UsFinanceDetailMapper {
    int countByExample(UsFinanceDetailExample example);

    int deleteByExample(UsFinanceDetailExample example);

    int deleteByPrimaryKey(String financeDetailId);

    int insert(UsFinanceDetail record);

    int insertSelective(UsFinanceDetail record);

    List<UsFinanceDetail> selectByExample(UsFinanceDetailExample example);

    UsFinanceDetail selectByPrimaryKey(String financeDetailId);

    int updateByPrimaryKeySelective(UsFinanceDetail record);

    int updateByPrimaryKey(UsFinanceDetail record);
}