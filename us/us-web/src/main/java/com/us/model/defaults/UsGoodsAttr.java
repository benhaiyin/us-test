package com.us.model.defaults;

import java.util.Date;

public class UsGoodsAttr {
    private String goodsAttrId;

    private String attrName;

    private String goodsId;

    private String sequence;

    private String unit;

    private String isPriceFactor;

    private String valueMethodCode;

    private Long isDelete;

    private String creater;

    private Date createTime;

    private String modifier;

    private Date modifyTime;

    private Long ver;

    public String getGoodsAttrId() {
        return goodsAttrId;
    }

    public void setGoodsAttrId(String goodsAttrId) {
        this.goodsAttrId = goodsAttrId == null ? null : goodsAttrId.trim();
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName == null ? null : attrName.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence == null ? null : sequence.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getIsPriceFactor() {
        return isPriceFactor;
    }

    public void setIsPriceFactor(String isPriceFactor) {
        this.isPriceFactor = isPriceFactor == null ? null : isPriceFactor.trim();
    }

    public String getValueMethodCode() {
        return valueMethodCode;
    }

    public void setValueMethodCode(String valueMethodCode) {
        this.valueMethodCode = valueMethodCode == null ? null : valueMethodCode.trim();
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