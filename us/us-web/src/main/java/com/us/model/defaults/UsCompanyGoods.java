package com.us.model.defaults;

import java.util.Date;

public class UsCompanyGoods extends UsCompanyGoodsKey {
    private String agencyPrice;

    private String onSale;

    private String isVerify;

    private String verifyTime;

    private String userId;

    private String creater;

    private String createTime;

    private String modifier;

    private Date modifyTime;

    private Long ver;

    public String getAgencyPrice() {
        return agencyPrice;
    }

    public void setAgencyPrice(String agencyPrice) {
        this.agencyPrice = agencyPrice == null ? null : agencyPrice.trim();
    }

    public String getOnSale() {
        return onSale;
    }

    public void setOnSale(String onSale) {
        this.onSale = onSale == null ? null : onSale.trim();
    }

    public String getIsVerify() {
        return isVerify;
    }

    public void setIsVerify(String isVerify) {
        this.isVerify = isVerify == null ? null : isVerify.trim();
    }

    public String getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(String verifyTime) {
        this.verifyTime = verifyTime == null ? null : verifyTime.trim();
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