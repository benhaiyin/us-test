package com.us.model.defaults;

import java.math.BigDecimal;

import com.us.model.StringModel;

public class User extends StringModel
{

    private String name;

    private String mobile;

    private String password;

    private String fixedTelephone;

    private String contactAddressId;

    private String headPhotoId;

    private String idcardFrontPhotoId;

    private String idcardBackPhotoId;

    private Long enbaleStatus;

    private Long certificationState;

    private Long activatedState;

    private String companyId;

    private Long funcitonPermissionType;

    private Long dataPermissionType;

    private Long controlledState;

    private String idcardNo;

    private String loginName;

    private String salt;

    private String email;

    private Long approvalStatus;

    private String driverLicencePhoneId;

    private Long drivingYears;

    private String description;

    private Long isDriver;

    private BigDecimal creditCount;

    private Long isVip;

    private String qrcodePhotoId;

    private Long userType;

    private Long userCategory;

    private String drivingLicensePhotoId;

    private String recentPhotoId;

    private String fingerprintsPhotoId;

    private String thirdUserId;

    private Long isSns;

    private Integer lbsStatus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getFixedTelephone() {
        return fixedTelephone;
    }

    public void setFixedTelephone(String fixedTelephone) {
        this.fixedTelephone = fixedTelephone == null ? null : fixedTelephone.trim();
    }

    public String getContactAddressId() {
        return contactAddressId;
    }

    public void setContactAddressId(String contactAddressId) {
        this.contactAddressId = contactAddressId == null ? null : contactAddressId.trim();
    }

    public String getHeadPhotoId() {
        return headPhotoId;
    }

    public void setHeadPhotoId(String headPhotoId) {
        this.headPhotoId = headPhotoId == null ? null : headPhotoId.trim();
    }

    public String getIdcardFrontPhotoId() {
        return idcardFrontPhotoId;
    }

    public void setIdcardFrontPhotoId(String idcardFrontPhotoId) {
        this.idcardFrontPhotoId = idcardFrontPhotoId == null ? null : idcardFrontPhotoId.trim();
    }

    public String getIdcardBackPhotoId() {
        return idcardBackPhotoId;
    }

    public void setIdcardBackPhotoId(String idcardBackPhotoId) {
        this.idcardBackPhotoId = idcardBackPhotoId == null ? null : idcardBackPhotoId.trim();
    }

    public Long getEnbaleStatus() {
        return enbaleStatus;
    }

    public void setEnbaleStatus(Long enbaleStatus) {
        this.enbaleStatus = enbaleStatus;
    }

    public Long getCertificationState() {
        return certificationState;
    }

    public void setCertificationState(Long certificationState) {
        this.certificationState = certificationState;
    }

    public Long getActivatedState() {
        return activatedState;
    }

    public void setActivatedState(Long activatedState) {
        this.activatedState = activatedState;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public Long getFuncitonPermissionType() {
        return funcitonPermissionType;
    }

    public void setFuncitonPermissionType(Long funcitonPermissionType) {
        this.funcitonPermissionType = funcitonPermissionType;
    }

    public Long getDataPermissionType() {
        return dataPermissionType;
    }

    public void setDataPermissionType(Long dataPermissionType) {
        this.dataPermissionType = dataPermissionType;
    }

    public Long getControlledState() {
        return controlledState;
    }

    public void setControlledState(Long controlledState) {
        this.controlledState = controlledState;
    }

    public String getIdcardNo() {
        return idcardNo;
    }

    public void setIdcardNo(String idcardNo) {
        this.idcardNo = idcardNo == null ? null : idcardNo.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Long getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(Long approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getDriverLicencePhoneId() {
        return driverLicencePhoneId;
    }

    public void setDriverLicencePhoneId(String driverLicencePhoneId) {
        this.driverLicencePhoneId = driverLicencePhoneId == null ? null : driverLicencePhoneId.trim();
    }

    public Long getDrivingYears() {
        return drivingYears;
    }

    public void setDrivingYears(Long drivingYears) {
        this.drivingYears = drivingYears;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getIsDriver() {
        return isDriver;
    }

    public void setIsDriver(Long isDriver) {
        this.isDriver = isDriver;
    }

    public BigDecimal getCreditCount() {
        return creditCount;
    }

    public void setCreditCount(BigDecimal creditCount) {
        this.creditCount = creditCount;
    }

    public Long getIsVip() {
        return isVip;
    }

    public void setIsVip(Long isVip) {
        this.isVip = isVip;
    }

    public String getQrcodePhotoId() {
        return qrcodePhotoId;
    }

    public void setQrcodePhotoId(String qrcodePhotoId) {
        this.qrcodePhotoId = qrcodePhotoId == null ? null : qrcodePhotoId.trim();
    }

    public Long getUserType() {
        return userType;
    }

    public void setUserType(Long userType) {
        this.userType = userType;
    }

    public Long getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(Long userCategory) {
        this.userCategory = userCategory;
    }

    public String getDrivingLicensePhotoId() {
        return drivingLicensePhotoId;
    }

    public void setDrivingLicensePhotoId(String drivingLicensePhotoId) {
        this.drivingLicensePhotoId = drivingLicensePhotoId == null ? null : drivingLicensePhotoId.trim();
    }

    public String getRecentPhotoId() {
        return recentPhotoId;
    }

    public void setRecentPhotoId(String recentPhotoId) {
        this.recentPhotoId = recentPhotoId == null ? null : recentPhotoId.trim();
    }

    public String getFingerprintsPhotoId() {
        return fingerprintsPhotoId;
    }

    public void setFingerprintsPhotoId(String fingerprintsPhotoId) {
        this.fingerprintsPhotoId = fingerprintsPhotoId == null ? null : fingerprintsPhotoId.trim();
    }

    public String getThirdUserId() {
        return thirdUserId;
    }

    public void setThirdUserId(String thirdUserId) {
        this.thirdUserId = thirdUserId == null ? null : thirdUserId.trim();
    }

    public Long getIsSns() {
        return isSns;
    }

    public void setIsSns(Long isSns) {
        this.isSns = isSns;
    }

	public Integer getLbsStatus() {
		return lbsStatus;
	}

	public void setLbsStatus(Integer lbsStatus) {
		this.lbsStatus = lbsStatus;
	}
    
}