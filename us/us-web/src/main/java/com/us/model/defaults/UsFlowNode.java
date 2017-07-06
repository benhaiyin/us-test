package com.us.model.defaults;

import java.util.Date;

public class UsFlowNode {
    private String flowNodeId;

    private String parentNodeId;

    private String description;

    private String hoursLimit;

    private String ignoreHoliday;

    private String flowId;

    private String loopMethedCode;

    private Long isDelete;

    private String creater;

    private Date createTime;

    private String modifier;

    private Date modifyTime;

    private Long ver;

    public String getFlowNodeId() {
        return flowNodeId;
    }

    public void setFlowNodeId(String flowNodeId) {
        this.flowNodeId = flowNodeId == null ? null : flowNodeId.trim();
    }

    public String getParentNodeId() {
        return parentNodeId;
    }

    public void setParentNodeId(String parentNodeId) {
        this.parentNodeId = parentNodeId == null ? null : parentNodeId.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getHoursLimit() {
        return hoursLimit;
    }

    public void setHoursLimit(String hoursLimit) {
        this.hoursLimit = hoursLimit == null ? null : hoursLimit.trim();
    }

    public String getIgnoreHoliday() {
        return ignoreHoliday;
    }

    public void setIgnoreHoliday(String ignoreHoliday) {
        this.ignoreHoliday = ignoreHoliday == null ? null : ignoreHoliday.trim();
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId == null ? null : flowId.trim();
    }

    public String getLoopMethedCode() {
        return loopMethedCode;
    }

    public void setLoopMethedCode(String loopMethedCode) {
        this.loopMethedCode = loopMethedCode == null ? null : loopMethedCode.trim();
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