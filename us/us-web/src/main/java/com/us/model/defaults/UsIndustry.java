package com.us.model.defaults;

import java.util.Date;

public class UsIndustry {
    private String dustryCode;

    private String dustryParentCode;

    private String enabled;

    private Long isDelete;

    private String creater;

    private Date createTime;

    private String modifier;

    private Date modifyTime;

    private Long ver;

    public String getDustryCode() {
        return dustryCode;
    }

    public void setDustryCode(String dustryCode) {
        this.dustryCode = dustryCode == null ? null : dustryCode.trim();
    }

    public String getDustryParentCode() {
        return dustryParentCode;
    }

    public void setDustryParentCode(String dustryParentCode) {
        this.dustryParentCode = dustryParentCode == null ? null : dustryParentCode.trim();
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled == null ? null : enabled.trim();
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