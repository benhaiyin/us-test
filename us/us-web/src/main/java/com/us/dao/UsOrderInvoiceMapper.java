package com.us.dao;

import com.us.model.defaults.UsOrderInvoice;
import com.us.model.defaults.UsOrderInvoiceExample;
import java.util.List;

public interface UsOrderInvoiceMapper {
    int countByExample(UsOrderInvoiceExample example);

    int deleteByExample(UsOrderInvoiceExample example);

    int deleteByPrimaryKey(String orderInvoiceId);

    int insert(UsOrderInvoice record);

    int insertSelective(UsOrderInvoice record);

    List<UsOrderInvoice> selectByExample(UsOrderInvoiceExample example);

    UsOrderInvoice selectByPrimaryKey(String orderInvoiceId);

    int updateByPrimaryKeySelective(UsOrderInvoice record);

    int updateByPrimaryKey(UsOrderInvoice record);
}