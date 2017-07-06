package com.us.model.defaults;

public class UsIssueDoneAttachKey {
    private String issueDoneId;

    private String fileId;

    public String getIssueDoneId() {
        return issueDoneId;
    }

    public void setIssueDoneId(String issueDoneId) {
        this.issueDoneId = issueDoneId == null ? null : issueDoneId.trim();
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }
}