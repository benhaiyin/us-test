package com.us.dao;

import com.us.model.defaults.UsInvoice;
import com.us.model.defaults.UsInvoiceExample;
import java.util.List;

public interface UsInvoiceMapper {
    int countByExample(UsInvoiceExample example);

    int deleteByExample(UsInvoiceExample example);

    int deleteByPrimaryKey(String invoiceId);

    int insert(UsInvoice record);

    int insertSelective(UsInvoice record);

    List<UsInvoice> selectByExample(UsInvoiceExample example);

    UsInvoice selectByPrimaryKey(String invoiceId);

    int updateByPrimaryKeySelective(UsInvoice record);

    int updateByPrimaryKey(UsInvoice record);
}