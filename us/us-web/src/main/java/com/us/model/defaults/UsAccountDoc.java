package com.us.model.defaults;

import java.util.Date;

public class UsAccountDoc {
    private String accountDocId;

    private String financeDetailId;

    private String money;

    private String moneyDirectionCode;

    private String moneyChannelCode;

    private String eventTime;

    private String companyId;

    private String userId;

    private String creater;

    private String createTime;

    private String modifier;

    private Date modifyTime;

    private Long ver;

    public String getAccountDocId() {
        return accountDocId;
    }

    public void setAccountDocId(String accountDocId) {
        this.accountDocId = accountDocId == null ? null : accountDocId.trim();
    }

    public String getFinanceDetailId() {
        return financeDetailId;
    }

    public void setFinanceDetailId(String financeDetailId) {
        this.financeDetailId = financeDetailId == null ? null : financeDetailId.trim();
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

    public String getMoneyChannelCode() {
        return moneyChannelCode;
    }

    public void setMoneyChannelCode(String moneyChannelCode) {
        this.moneyChannelCode = moneyChannelCode == null ? null : moneyChannelCode.trim();
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime == null ? null : eventTime.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
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