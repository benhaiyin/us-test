package com.us.model.defaults;

import java.util.Date;

public class UsOrderInvoiceItem {
    private String invoiceItemId;

    private String goodsName;

    private String amount;

    private String nonTaxPrice;

    private String orderInvoiceId;

    private Long isDelete;

    private String creater;

    private Date createTime;

    private String modifier;

    private Date modifyTime;

    private Long ver;

    public String getInvoiceItemId() {
        return invoiceItemId;
    }

    public void setInvoiceItemId(String invoiceItemId) {
        this.invoiceItemId = invoiceItemId == null ? null : invoiceItemId.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    public String getNonTaxPrice() {
        return nonTaxPrice;
    }

    public void setNonTaxPrice(String nonTaxPrice) {
        this.nonTaxPrice = nonTaxPrice == null ? null : nonTaxPrice.trim();
    }

    public String getOrderInvoiceId() {
        return orderInvoiceId;
    }

    public void setOrderInvoiceId(String orderInvoiceId) {
        this.orderInvoiceId = orderInvoiceId == null ? null : orderInvoiceId.trim();
    }

    public Long getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Long isDelete) {
        this.isDelete = isDelete;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getVer() {
        return ver;
    }

    public void setVer(Long ver) {
        this.ver = ver;
    }
}