package com.us.model.defaults;

import java.util.Date;

public class UsCompanyInfo {
    private String companyInfoId;

    private String companyId;

    private String bizLicenseFileId;

    private String currencyCode;

    private String bizCityCode;

    private String regCityCode;

    private String bizStreet;

    private String bizPost;

    private String regStreet;

    private String money;

    private String legalName;

    private String legalIdentityCode;

    private String companyName;

    private String version;

    private String dustryCode;

    private String creater;

    private Date createTime;

    private String modifier;

    private Date modifyTime;

    private Long ver;

    public String getCompanyInfoId() {
        return companyInfoId;
    }

    public void setCompanyInfoId(String companyInfoId) {
        this.companyInfoId = companyInfoId == null ? null : companyInfoId.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getBizLicenseFileId() {
        return bizLicenseFileId;
    }

    public void setBizLicenseFileId(String bizLicenseFileId) {
        this.bizLicenseFileId = bizLicenseFileId == null ? null : bizLicenseFileId.trim();
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode == null ? null : currencyCode.trim();
    }

    public String getBizCityCode() {
        return bizCityCode;
    }

    public void setBizCityCode(String bizCityCode) {
        this.bizCityCode = bizCityCode == null ? null : bizCityCode.trim();
    }

    public String getRegCityCode() {
        return regCityCode;
    }

    public void setRegCityCode(String regCityCode) {
        this.regCityCode = regCityCode == null ? null : regCityCode.trim();
    }

    public String getBizStreet() {
        return bizStreet;
    }

    public void setBizStreet(String bizStreet) {
        this.bizStreet = bizStreet == null ? null : bizStreet.trim();
    }

    public String getBizPost() {
        return bizPost;
    }

    public void setBizPost(String bizPost) {
        this.bizPost = bizPost == null ? null : bizPost.trim();
    }

    public String getRegStreet() {
        return regStreet;
    }

    public void setRegStreet(String regStreet) {
        this.regStreet = regStreet == null ? null : regStreet.trim();
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName == null ? null : legalName.trim();
    }

    public String getLegalIdentityCode() {
        return legalIdentityCode;
    }

    public void setLegalIdentityCode(String legalIdentityCode) {
        this.legalIdentityCode = legalIdentityCode == null ? null : legalIdentityCode.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getDustryCode() {
        return dustryCode;
    }

    public void setDustryCode(String dustryCode) {
        this.dustryCode = dustryCode == null ? null : dustryCode.trim();
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