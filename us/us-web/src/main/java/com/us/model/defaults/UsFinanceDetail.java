package com.us.model.defaults;

import java.util.Date;

public class UsFinanceDetail {
    private String financeDetailId;

    private String orderId;

    private String companyId;

    private String tradeCompanyId;

    private String money;

    private String moneyDirectionCode;

    private Long isDelete;

    private String creater;

    private String createTime;

    private String modifier;

    private Date modifyTime;

    private Long ver;

    public String getFinanceDetailId() {
        return financeDetailId;
    }

    public void setFinanceDetailId(String financeDetailId) {
        this.financeDetailId = financeDetailId == null ? null : financeDetailId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getTradeCompanyId() {
        return tradeCompanyId;
    }

    public void setTradeCompanyId(String tradeCompanyId) {
        this.tradeCompanyId = tradeCompanyId == null ? null : tradeCompanyId.trim();
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    public String getMoneyDirectionCode() {
        return moneyDirectionCode;
    }

    public void setMoneyDirectionCode(String moneyDirectionCode) {
        this.moneyDirectionCode = moneyDirectionCode == null ? null : moneyDirectionCode.trim();
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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
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