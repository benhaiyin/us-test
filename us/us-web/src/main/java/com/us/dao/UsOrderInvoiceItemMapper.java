package com.us.dao;

import com.us.model.defaults.UsOrderInvoiceItem;
import com.us.model.defaults.UsOrderInvoiceItemExample;
import java.util.List;

public interface UsOrderInvoiceItemMapper {
    int countByExample(UsOrderInvoiceItemExample example);

    int deleteByExample(UsOrderInvoiceItemExample example);

    int deleteByPrimaryKey(String invoiceItemId);

    int insert(UsOrderInvoiceItem record);

    int insertSelective(UsOrderInvoiceItem record);

    List<UsOrderInvoiceItem> selectByExample(UsOrderInvoiceItemExample example);

    UsOrderInvoiceItem selectByPrimaryKey(String invoiceItemId);

    int updateByPrimaryKeySelective(UsOrderInvoiceItem record);

    int updateByPrimaryKey(UsOrderInvoiceItem record);
}