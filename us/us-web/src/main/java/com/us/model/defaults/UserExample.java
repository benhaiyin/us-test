package com.us.model.defaults;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andFixedTelephoneIsNull() {
            addCriterion("fixed_telephone is null");
            return (Criteria) this;
        }

        public Criteria andFixedTelephoneIsNotNull() {
            addCriterion("fixed_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andFixedTelephoneEqualTo(String value) {
            addCriterion("fixed_telephone =", value, "fixedTelephone");
            return (Criteria) this;
        }

        public Criteria andFixedTelephoneNotEqualTo(String value) {
            addCriterion("fixed_telephone <>", value, "fixedTelephone");
            return (Criteria) this;
        }

        public Criteria andFixedTelephoneGreaterThan(String value) {
            addCriterion("fixed_telephone >", value, "fixedTelephone");
            return (Criteria) this;
        }

        public Criteria andFixedTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("fixed_telephone >=", value, "fixedTelephone");
            return (Criteria) this;
        }

        public Criteria andFixedTelephoneLessThan(String value) {
            addCriterion("fixed_telephone <", value, "fixedTelephone");
            return (Criteria) this;
        }

        public Criteria andFixedTelephoneLessThanOrEqualTo(String value) {
            addCriterion("fixed_telephone <=", value, "fixedTelephone");
            return (Criteria) this;
        }

        public Criteria andFixedTelephoneLike(String value) {
            addCriterion("fixed_telephone like", value, "fixedTelephone");
            return (Criteria) this;
        }

        public Criteria andFixedTelephoneNotLike(String value) {
            addCriterion("fixed_telephone not like", value, "fixedTelephone");
            return (Criteria) this;
        }

        public Criteria andFixedTelephoneIn(List<String> values) {
            addCriterion("fixed_telephone in", values, "fixedTelephone");
            return (Criteria) this;
        }

        public Criteria andFixedTelephoneNotIn(List<String> values) {
            addCriterion("fixed_telephone not in", values, "fixedTelephone");
            return (Criteria) this;
        }

        public Criteria andFixedTelephoneBetween(String value1, String value2) {
            addCriterion("fixed_telephone between", value1, value2, "fixedTelephone");
            return (Criteria) this;
        }

        public Criteria andFixedTelephoneNotBetween(String value1, String value2) {
            addCriterion("fixed_telephone not between", value1, value2, "fixedTelephone");
            return (Criteria) this;
        }

        public Criteria andContactAddressIdIsNull() {
            addCriterion("contact_address_id is null");
            return (Criteria) this;
        }

        public Criteria andContactAddressIdIsNotNull() {
            addCriterion("contact_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andContactAddressIdEqualTo(String value) {
            addCriterion("contact_address_id =", value, "contactAddressId");
            return (Criteria) this;
        }

        public Criteria andContactAddressIdNotEqualTo(String value) {
            addCriterion("contact_address_id <>", value, "contactAddressId");
            return (Criteria) this;
        }

        public Criteria andContactAddressIdGreaterThan(String value) {
            addCriterion("contact_address_id >", value, "contactAddressId");
            return (Criteria) this;
        }

        public Criteria andContactAddressIdGreaterThanOrEqualTo(String value) {
            addCriterion("contact_address_id >=", value, "contactAddressId");
            return (Criteria) this;
        }

        public Criteria andContactAddressIdLessThan(String value) {
            addCriterion("contact_address_id <", value, "contactAddressId");
            return (Criteria) this;
        }

        public Criteria andContactAddressIdLessThanOrEqualTo(String value) {
            addCriterion("contact_address_id <=", value, "contactAddressId");
            return (Criteria) this;
        }

        public Criteria andContactAddressIdLike(String value) {
            addCriterion("contact_address_id like", value, "contactAddressId");
            return (Criteria) this;
        }

        public Criteria andContactAddressIdNotLike(String value) {
            addCriterion("contact_address_id not like", value, "contactAddressId");
            return (Criteria) this;
        }

        public Criteria andContactAddressIdIn(List<String> values) {
            addCriterion("contact_address_id in", values, "contactAddressId");
            return (Criteria) this;
        }

        public Criteria andContactAddressIdNotIn(List<String> values) {
            addCriterion("contact_address_id not in", values, "contactAddressId");
            return (Criteria) this;
        }

        public Criteria andContactAddressIdBetween(String value1, String value2) {
            addCriterion("contact_address_id between", value1, value2, "contactAddressId");
            return (Criteria) this;
        }

        public Criteria andContactAddressIdNotBetween(String value1, String value2) {
            addCriterion("contact_address_id not between", value1, value2, "contactAddressId");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoIdIsNull() {
            addCriterion("head_photo_id is null");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoIdIsNotNull() {
            addCriterion("head_photo_id is not null");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoIdEqualTo(String value) {
            addCriterion("head_photo_id =", value, "headPhotoId");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoIdNotEqualTo(String value) {
            addCriterion("head_photo_id <>", value, "headPhotoId");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoIdGreaterThan(String value) {
            addCriterion("head_photo_id >", value, "headPhotoId");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoIdGreaterThanOrEqualTo(String value) {
            addCriterion("head_photo_id >=", value, "headPhotoId");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoIdLessThan(String value) {
            addCriterion("head_photo_id <", value, "headPhotoId");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoIdLessThanOrEqualTo(String value) {
            addCriterion("head_photo_id <=", value, "headPhotoId");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoIdLike(String value) {
            addCriterion("head_photo_id like", value, "headPhotoId");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoIdNotLike(String value) {
            addCriterion("head_photo_id not like", value, "headPhotoId");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoIdIn(List<String> values) {
            addCriterion("head_photo_id in", values, "headPhotoId");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoIdNotIn(List<String> values) {
            addCriterion("head_photo_id not in", values, "headPhotoId");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoIdBetween(String value1, String value2) {
            addCriterion("head_photo_id between", value1, value2, "headPhotoId");
            return (Criteria) this;
        }

        public Criteria andHeadPhotoIdNotBetween(String value1, String value2) {
            addCriterion("head_photo_id not between", value1, value2, "headPhotoId");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontPhotoIdIsNull() {
            addCriterion("idcard_front_photo_id is null");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontPhotoIdIsNotNull() {
            addCriterion("idcard_front_photo_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontPhotoIdEqualTo(String value) {
            addCriterion("idcard_front_photo_id =", value, "idcardFrontPhotoId");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontPhotoIdNotEqualTo(String value) {
            addCriterion("idcard_front_photo_id <>", value, "idcardFrontPhotoId");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontPhotoIdGreaterThan(String value) {
            addCriterion("idcard_front_photo_id >", value, "idcardFrontPhotoId");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontPhotoIdGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_front_photo_id >=", value, "idcardFrontPhotoId");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontPhotoIdLessThan(String value) {
            addCriterion("idcard_front_photo_id <", value, "idcardFrontPhotoId");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontPhotoIdLessThanOrEqualTo(String value) {
            addCriterion("idcard_front_photo_id <=", value, "idcardFrontPhotoId");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontPhotoIdLike(String value) {
            addCriterion("idcard_front_photo_id like", value, "idcardFrontPhotoId");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontPhotoIdNotLike(String value) {
            addCriterion("idcard_front_photo_id not like", value, "idcardFrontPhotoId");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontPhotoIdIn(List<String> values) {
            addCriterion("idcard_front_photo_id in", values, "idcardFrontPhotoId");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontPhotoIdNotIn(List<String> values) {
            addCriterion("idcard_front_photo_id not in", values, "idcardFrontPhotoId");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontPhotoIdBetween(String value1, String value2) {
            addCriterion("idcard_front_photo_id between", value1, value2, "idcardFrontPhotoId");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontPhotoIdNotBetween(String value1, String value2) {
            addCriterion("idcard_front_photo_id not between", value1, value2, "idcardFrontPhotoId");
            return (Criteria) this;
        }

        public Criteria andIdcardBackPhotoIdIsNull() {
            addCriterion("idcard_back_photo_id is null");
            return (Criteria) this;
        }

        public Criteria andIdcardBackPhotoIdIsNotNull() {
            addCriterion("idcard_back_photo_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardBackPhotoIdEqualTo(String value) {
            addCriterion("idcard_back_photo_id =", value, "idcardBackPhotoId");
            return (Criteria) this;
        }

        public Criteria andIdcardBackPhotoIdNotEqualTo(String value) {
            addCriterion("idcard_back_photo_id <>", value, "idcardBackPhotoId");
            return (Criteria) this;
        }

        public Criteria andIdcardBackPhotoIdGreaterThan(String value) {
            addCriterion("idcard_back_photo_id >", value, "idcardBackPhotoId");
            return (Criteria) this;
        }

        public Criteria andIdcardBackPhotoIdGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_back_photo_id >=", value, "idcardBackPhotoId");
            return (Criteria) this;
        }

        public Criteria andIdcardBackPhotoIdLessThan(String value) {
            addCriterion("idcard_back_photo_id <", value, "idcardBackPhotoId");
            return (Criteria) this;
        }

        public Criteria andIdcardBackPhotoIdLessThanOrEqualTo(String value) {
            addCriterion("idcard_back_photo_id <=", value, "idcardBackPhotoId");
            return (Criteria) this;
        }

        public Criteria andIdcardBackPhotoIdLike(String value) {
            addCriterion("idcard_back_photo_id like", value, "idcardBackPhotoId");
            return (Criteria) this;
        }

        public Criteria andIdcardBackPhotoIdNotLike(String value) {
            addCriterion("idcard_back_photo_id not like", value, "idcardBackPhotoId");
            return (Criteria) this;
        }

        public Criteria andIdcardBackPhotoIdIn(List<String> values) {
            addCriterion("idcard_back_photo_id in", values, "idcardBackPhotoId");
            return (Criteria) this;
        }

        public Criteria andIdcardBackPhotoIdNotIn(List<String> values) {
            addCriterion("idcard_back_photo_id not in", values, "idcardBackPhotoId");
            return (Criteria) this;
        }

        public Criteria andIdcardBackPhotoIdBetween(String value1, String value2) {
            addCriterion("idcard_back_photo_id between", value1, value2, "idcardBackPhotoId");
            return (Criteria) this;
        }

        public Criteria andIdcardBackPhotoIdNotBetween(String value1, String value2) {
            addCriterion("idcard_back_photo_id not between", value1, value2, "idcardBackPhotoId");
            return (Criteria) this;
        }

        public Criteria andEnbaleStatusIsNull() {
            addCriterion("enbale_status is null");
            return (Criteria) this;
        }

        public Criteria andEnbaleStatusIsNotNull() {
            addCriterion("enbale_status is not null");
            return (Criteria) this;
        }

        public Criteria andEnbaleStatusEqualTo(Long value) {
            addCriterion("enbale_status =", value, "enbaleStatus");
            return (Criteria) this;
        }

        public Criteria andEnbaleStatusNotEqualTo(Long value) {
            addCriterion("enbale_status <>", value, "enbaleStatus");
            return (Criteria) this;
        }

        public Criteria andEnbaleStatusGreaterThan(Long value) {
            addCriterion("enbale_status >", value, "enbaleStatus");
            return (Criteria) this;
        }

        public Criteria andEnbaleStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("enbale_status >=", value, "enbaleStatus");
            return (Criteria) this;
        }

        public Criteria andEnbaleStatusLessThan(Long value) {
            addCriterion("enbale_status <", value, "enbaleStatus");
            return (Criteria) this;
        }

        public Criteria andEnbaleStatusLessThanOrEqualTo(Long value) {
            addCriterion("enbale_status <=", value, "enbaleStatus");
            return (Criteria) this;
        }

        public Criteria andEnbaleStatusIn(List<Long> values) {
            addCriterion("enbale_status in", values, "enbaleStatus");
            return (Criteria) this;
        }

        public Criteria andEnbaleStatusNotIn(List<Long> values) {
            addCriterion("enbale_status not in", values, "enbaleStatus");
            return (Criteria) this;
        }

        public Criteria andEnbaleStatusBetween(Long value1, Long value2) {
            addCriterion("enbale_status between", value1, value2, "enbaleStatus");
            return (Criteria) this;
        }

        public Criteria andEnbaleStatusNotBetween(Long value1, Long value2) {
            addCriterion("enbale_status not between", value1, value2, "enbaleStatus");
            return (Criteria) this;
        }

        public Criteria andCertificationStateIsNull() {
            addCriterion("certification_state is null");
            return (Criteria) this;
        }

        public Criteria andCertificationStateIsNotNull() {
            addCriterion("certification_state is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationStateEqualTo(Long value) {
            addCriterion("certification_state =", value, "certificationState");
            return (Criteria) this;
        }

        public Criteria andCertificationStateNotEqualTo(Long value) {
            addCriterion("certification_state <>", value, "certificationState");
            return (Criteria) this;
        }

        public Criteria andCertificationStateGreaterThan(Long value) {
            addCriterion("certification_state >", value, "certificationState");
            return (Criteria) this;
        }

        public Criteria andCertificationStateGreaterThanOrEqualTo(Long value) {
            addCriterion("certification_state >=", value, "certificationState");
            return (Criteria) this;
        }

        public Criteria andCertificationStateLessThan(Long value) {
            addCriterion("certification_state <", value, "certificationState");
            return (Criteria) this;
        }

        public Criteria andCertificationStateLessThanOrEqualTo(Long value) {
            addCriterion("certification_state <=", value, "certificationState");
            return (Criteria) this;
        }

        public Criteria andCertificationStateIn(List<Long> values) {
            addCriterion("certification_state in", values, "certificationState");
            return (Criteria) this;
        }

        public Criteria andCertificationStateNotIn(List<Long> values) {
            addCriterion("certification_state not in", values, "certificationState");
            return (Criteria) this;
        }

        public Criteria andCertificationStateBetween(Long value1, Long value2) {
            addCriterion("certification_state between", value1, value2, "certificationState");
            return (Criteria) this;
        }

        public Criteria andCertificationStateNotBetween(Long value1, Long value2) {
            addCriterion("certification_state not between", value1, value2, "certificationState");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andActivatedStateIsNull() {
            addCriterion("activated_state is null");
            return (Criteria) this;
        }

        public Criteria andActivatedStateIsNotNull() {
            addCriterion("activated_state is not null");
            return (Criteria) this;
        }

        public Criteria andActivatedStateEqualTo(Long value) {
            addCriterion("activated_state =", value, "activatedState");
            return (Criteria) this;
        }

        public Criteria andActivatedStateNotEqualTo(Long value) {
            addCriterion("activated_state <>", value, "activatedState");
            return (Criteria) this;
        }

        public Criteria andActivatedStateGreaterThan(Long value) {
            addCriterion("activated_state >", value, "activatedState");
            return (Criteria) this;
        }

        public Criteria andActivatedStateGreaterThanOrEqualTo(Long value) {
            addCriterion("activated_state >=", value, "activatedState");
            return (Criteria) this;
        }

        public Criteria andActivatedStateLessThan(Long value) {
            addCriterion("activated_state <", value, "activatedState");
            return (Criteria) this;
        }

        public Criteria andActivatedStateLessThanOrEqualTo(Long value) {
            addCriterion("activated_state <=", value, "activatedState");
            return (Criteria) this;
        }

        public Criteria andActivatedStateIn(List<Long> values) {
            addCriterion("activated_state in", values, "activatedState");
            return (Criteria) this;
        }

        public Criteria andActivatedStateNotIn(List<Long> values) {
            addCriterion("activated_state not in", values, "activatedState");
            return (Criteria) this;
        }

        public Criteria andActivatedStateBetween(Long value1, Long value2) {
            addCriterion("activated_state between", value1, value2, "activatedState");
            return (Criteria) this;
        }

        public Criteria andActivatedStateNotBetween(Long value1, Long value2) {
            addCriterion("activated_state not between", value1, value2, "activatedState");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andFuncitonPermissionTypeIsNull() {
            addCriterion("funciton_permission_type is null");
            return (Criteria) this;
        }

        public Criteria andFuncitonPermissionTypeIsNotNull() {
            addCriterion("funciton_permission_type is not null");
            return (Criteria) this;
        }

        public Criteria andFuncitonPermissionTypeEqualTo(Long value) {
            addCriterion("funciton_permission_type =", value, "funcitonPermissionType");
            return (Criteria) this;
        }

        public Criteria andFuncitonPermissionTypeNotEqualTo(Long value) {
            addCriterion("funciton_permission_type <>", value, "funcitonPermissionType");
            return (Criteria) this;
        }

        public Criteria andFuncitonPermissionTypeGreaterThan(Long value) {
            addCriterion("funciton_permission_type >", value, "funcitonPermissionType");
            return (Criteria) this;
        }

        public Criteria andFuncitonPermissionTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("funciton_permission_type >=", value, "funcitonPermissionType");
            return (Criteria) this;
        }

        public Criteria andFuncitonPermissionTypeLessThan(Long value) {
            addCriterion("funciton_permission_type <", value, "funcitonPermissionType");
            return (Criteria) this;
        }

        public Criteria andFuncitonPermissionTypeLessThanOrEqualTo(Long value) {
            addCriterion("funciton_permission_type <=", value, "funcitonPermissionType");
            return (Criteria) this;
        }

        public Criteria andFuncitonPermissionTypeIn(List<Long> values) {
            addCriterion("funciton_permission_type in", values, "funcitonPermissionType");
            return (Criteria) this;
        }

        public Criteria andFuncitonPermissionTypeNotIn(List<Long> values) {
            addCriterion("funciton_permission_type not in", values, "funcitonPermissionType");
            return (Criteria) this;
        }

        public Criteria andFuncitonPermissionTypeBetween(Long value1, Long value2) {
            addCriterion("funciton_permission_type between", value1, value2, "funcitonPermissionType");
            return (Criteria) this;
        }

        public Criteria andFuncitonPermissionTypeNotBetween(Long value1, Long value2) {
            addCriterion("funciton_permission_type not between", value1, value2, "funcitonPermissionType");
            return (Criteria) this;
        }

        public Criteria andDataPermissionTypeIsNull() {
            addCriterion("data_permission_type is null");
            return (Criteria) this;
        }

        public Criteria andDataPermissionTypeIsNotNull() {
            addCriterion("data_permission_type is not null");
            return (Criteria) this;
        }

        public Criteria andDataPermissionTypeEqualTo(Long value) {
            addCriterion("data_permission_type =", value, "dataPermissionType");
            return (Criteria) this;
        }

        public Criteria andDataPermissionTypeNotEqualTo(Long value) {
            addCriterion("data_permission_type <>", value, "dataPermissionType");
            return (Criteria) this;
        }

        public Criteria andDataPermissionTypeGreaterThan(Long value) {
            addCriterion("data_permission_type >", value, "dataPermissionType");
            return (Criteria) this;
        }

        public Criteria andDataPermissionTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("data_permission_type >=", value, "dataPermissionType");
            return (Criteria) this;
        }

        public Criteria andDataPermissionTypeLessThan(Long value) {
            addCriterion("data_permission_type <", value, "dataPermissionType");
            return (Criteria) this;
        }

        public Criteria andDataPermissionTypeLessThanOrEqualTo(Long value) {
            addCriterion("data_permission_type <=", value, "dataPermissionType");
            return (Criteria) this;
        }

        public Criteria andDataPermissionTypeIn(List<Long> values) {
            addCriterion("data_permission_type in", values, "dataPermissionType");
            return (Criteria) this;
        }

        public Criteria andDataPermissionTypeNotIn(List<Long> values) {
            addCriterion("data_permission_type not in", values, "dataPermissionType");
            return (Criteria) this;
        }

        public Criteria andDataPermissionTypeBetween(Long value1, Long value2) {
            addCriterion("data_permission_type between", value1, value2, "dataPermissionType");
            return (Criteria) this;
        }

        public Criteria andDataPermissionTypeNotBetween(Long value1, Long value2) {
            addCriterion("data_permission_type not between", value1, value2, "dataPermissionType");
            return (Criteria) this;
        }

        public Criteria andControlledStateIsNull() {
            addCriterion("controlled_state is null");
            return (Criteria) this;
        }

        public Criteria andControlledStateIsNotNull() {
            addCriterion("controlled_state is not null");
            return (Criteria) this;
        }

        public Criteria andControlledStateEqualTo(Long value) {
            addCriterion("controlled_state =", value, "controlledState");
            return (Criteria) this;
        }

        public Criteria andControlledStateNotEqualTo(Long value) {
            addCriterion("controlled_state <>", value, "controlledState");
            return (Criteria) this;
        }

        public Criteria andControlledStateGreaterThan(Long value) {
            addCriterion("controlled_state >", value, "controlledState");
            return (Criteria) this;
        }

        public Criteria andControlledStateGreaterThanOrEqualTo(Long value) {
            addCriterion("controlled_state >=", value, "controlledState");
            return (Criteria) this;
        }

        public Criteria andControlledStateLessThan(Long value) {
            addCriterion("controlled_state <", value, "controlledState");
            return (Criteria) this;
        }

        public Criteria andControlledStateLessThanOrEqualTo(Long value) {
            addCriterion("controlled_state <=", value, "controlledState");
            return (Criteria) this;
        }

        public Criteria andControlledStateIn(List<Long> values) {
            addCriterion("controlled_state in", values, "controlledState");
            return (Criteria) this;
        }

        public Criteria andControlledStateNotIn(List<Long> values) {
            addCriterion("controlled_state not in", values, "controlledState");
            return (Criteria) this;
        }

        public Criteria andControlledStateBetween(Long value1, Long value2) {
            addCriterion("controlled_state between", value1, value2, "controlledState");
            return (Criteria) this;
        }

        public Criteria andControlledStateNotBetween(Long value1, Long value2) {
            addCriterion("controlled_state not between", value1, value2, "controlledState");
            return (Criteria) this;
        }

        public Criteria andIdcardNoIsNull() {
            addCriterion("idcard_no is null");
            return (Criteria) this;
        }

        public Criteria andIdcardNoIsNotNull() {
            addCriterion("idcard_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardNoEqualTo(String value) {
            addCriterion("idcard_no =", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotEqualTo(String value) {
            addCriterion("idcard_no <>", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoGreaterThan(String value) {
            addCriterion("idcard_no >", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_no >=", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoLessThan(String value) {
            addCriterion("idcard_no <", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoLessThanOrEqualTo(String value) {
            addCriterion("idcard_no <=", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoLike(String value) {
            addCriterion("idcard_no like", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotLike(String value) {
            addCriterion("idcard_no not like", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoIn(List<String> values) {
            addCriterion("idcard_no in", values, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotIn(List<String> values) {
            addCriterion("idcard_no not in", values, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoBetween(String value1, String value2) {
            addCriterion("idcard_no between", value1, value2, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotBetween(String value1, String value2) {
            addCriterion("idcard_no not between", value1, value2, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("login_name is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("login_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("login_name =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("login_name <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("login_name >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("login_name >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("login_name <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("login_name <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("login_name like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("login_name not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("login_name in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("login_name not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("login_name between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("login_name not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andVerIsNull() {
            addCriterion("ver is null");
            return (Criteria) this;
        }

        public Criteria andVerIsNotNull() {
            addCriterion("ver is not null");
            return (Criteria) this;
        }

        public Criteria andVerEqualTo(Long value) {
            addCriterion("ver =", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerNotEqualTo(Long value) {
            addCriterion("ver <>", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerGreaterThan(Long value) {
            addCriterion("ver >", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerGreaterThanOrEqualTo(Long value) {
            addCriterion("ver >=", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerLessThan(Long value) {
            addCriterion("ver <", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerLessThanOrEqualTo(Long value) {
            addCriterion("ver <=", value, "ver");
            return (Criteria) this;
        }

        public Criteria andVerIn(List<Long> values) {
            addCriterion("ver in", values, "ver");
            return (Criteria) this;
        }

        public Criteria andVerNotIn(List<Long> values) {
            addCriterion("ver not in", values, "ver");
            return (Criteria) this;
        }

        public Criteria andVerBetween(Long value1, Long value2) {
            addCriterion("ver between", value1, value2, "ver");
            return (Criteria) this;
        }

        public Criteria andVerNotBetween(Long value1, Long value2) {
            addCriterion("ver not between", value1, value2, "ver");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIsNull() {
            addCriterion("approval_status is null");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIsNotNull() {
            addCriterion("approval_status is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusEqualTo(Long value) {
            addCriterion("approval_status =", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotEqualTo(Long value) {
            addCriterion("approval_status <>", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusGreaterThan(Long value) {
            addCriterion("approval_status >", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("approval_status >=", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusLessThan(Long value) {
            addCriterion("approval_status <", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusLessThanOrEqualTo(Long value) {
            addCriterion("approval_status <=", value, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusIn(List<Long> values) {
            addCriterion("approval_status in", values, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotIn(List<Long> values) {
            addCriterion("approval_status not in", values, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusBetween(Long value1, Long value2) {
            addCriterion("approval_status between", value1, value2, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andApprovalStatusNotBetween(Long value1, Long value2) {
            addCriterion("approval_status not between", value1, value2, "approvalStatus");
            return (Criteria) this;
        }

        public Criteria andDriverLicencePhoneIdIsNull() {
            addCriterion("driver_licence_phone_id is null");
            return (Criteria) this;
        }

        public Criteria andDriverLicencePhoneIdIsNotNull() {
            addCriterion("driver_licence_phone_id is not null");
            return (Criteria) this;
        }

        public Criteria andDriverLicencePhoneIdEqualTo(String value) {
            addCriterion("driver_licence_phone_id =", value, "driverLicencePhoneId");
            return (Criteria) this;
        }

        public Criteria andDriverLicencePhoneIdNotEqualTo(String value) {
            addCriterion("driver_licence_phone_id <>", value, "driverLicencePhoneId");
            return (Criteria) this;
        }

        public Criteria andDriverLicencePhoneIdGreaterThan(String value) {
            addCriterion("driver_licence_phone_id >", value, "driverLicencePhoneId");
            return (Criteria) this;
        }

        public Criteria andDriverLicencePhoneIdGreaterThanOrEqualTo(String value) {
            addCriterion("driver_licence_phone_id >=", value, "driverLicencePhoneId");
            return (Criteria) this;
        }

        public Criteria andDriverLicencePhoneIdLessThan(String value) {
            addCriterion("driver_licence_phone_id <", value, "driverLicencePhoneId");
            return (Criteria) this;
        }

        public Criteria andDriverLicencePhoneIdLessThanOrEqualTo(String value) {
            addCriterion("driver_licence_phone_id <=", value, "driverLicencePhoneId");
            return (Criteria) this;
        }

        public Criteria andDriverLicencePhoneIdLike(String value) {
            addCriterion("driver_licence_phone_id like", value, "driverLicencePhoneId");
            return (Criteria) this;
        }

        public Criteria andDriverLicencePhoneIdNotLike(String value) {
            addCriterion("driver_licence_phone_id not like", value, "driverLicencePhoneId");
            return (Criteria) this;
        }

        public Criteria andDriverLicencePhoneIdIn(List<String> values) {
            addCriterion("driver_licence_phone_id in", values, "driverLicencePhoneId");
            return (Criteria) this;
        }

        public Criteria andDriverLicencePhoneIdNotIn(List<String> values) {
            addCriterion("driver_licence_phone_id not in", values, "driverLicencePhoneId");
            return (Criteria) this;
        }

        public Criteria andDriverLicencePhoneIdBetween(String value1, String value2) {
            addCriterion("driver_licence_phone_id between", value1, value2, "driverLicencePhoneId");
            return (Criteria) this;
        }

        public Criteria andDriverLicencePhoneIdNotBetween(String value1, String value2) {
            addCriterion("driver_licence_phone_id not between", value1, value2, "driverLicencePhoneId");
            return (Criteria) this;
        }

        public Criteria andDrivingYearsIsNull() {
            addCriterion("driving_years is null");
            return (Criteria) this;
        }

        public Criteria andDrivingYearsIsNotNull() {
            addCriterion("driving_years is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingYearsEqualTo(Long value) {
            addCriterion("driving_years =", value, "drivingYears");
            return (Criteria) this;
        }

        public Criteria andDrivingYearsNotEqualTo(Long value) {
            addCriterion("driving_years <>", value, "drivingYears");
            return (Criteria) this;
        }

        public Criteria andDrivingYearsGreaterThan(Long value) {
            addCriterion("driving_years >", value, "drivingYears");
            return (Criteria) this;
        }

        public Criteria andDrivingYearsGreaterThanOrEqualTo(Long value) {
            addCriterion("driving_years >=", value, "drivingYears");
            return (Criteria) this;
        }

        public Criteria andDrivingYearsLessThan(Long value) {
            addCriterion("driving_years <", value, "drivingYears");
            return (Criteria) this;
        }

        public Criteria andDrivingYearsLessThanOrEqualTo(Long value) {
            addCriterion("driving_years <=", value, "drivingYears");
            return (Criteria) this;
        }

        public Criteria andDrivingYearsIn(List<Long> values) {
            addCriterion("driving_years in", values, "drivingYears");
            return (Criteria) this;
        }

        public Criteria andDrivingYearsNotIn(List<Long> values) {
            addCriterion("driving_years not in", values, "drivingYears");
            return (Criteria) this;
        }

        public Criteria andDrivingYearsBetween(Long value1, Long value2) {
            addCriterion("driving_years between", value1, value2, "drivingYears");
            return (Criteria) this;
        }

        public Criteria andDrivingYearsNotBetween(Long value1, Long value2) {
            addCriterion("driving_years not between", value1, value2, "drivingYears");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andIsDriverIsNull() {
            addCriterion("is_driver is null");
            return (Criteria) this;
        }

        public Criteria andIsDriverIsNotNull() {
            addCriterion("is_driver is not null");
            return (Criteria) this;
        }

        public Criteria andIsDriverEqualTo(Long value) {
            addCriterion("is_driver =", value, "isDriver");
            return (Criteria) this;
        }

        public Criteria andIsDriverNotEqualTo(Long value) {
            addCriterion("is_driver <>", value, "isDriver");
            return (Criteria) this;
        }

        public Criteria andIsDriverGreaterThan(Long value) {
            addCriterion("is_driver >", value, "isDriver");
            return (Criteria) this;
        }

        public Criteria andIsDriverGreaterThanOrEqualTo(Long value) {
            addCriterion("is_driver >=", value, "isDriver");
            return (Criteria) this;
        }

        public Criteria andIsDriverLessThan(Long value) {
            addCriterion("is_driver <", value, "isDriver");
            return (Criteria) this;
        }

        public Criteria andIsDriverLessThanOrEqualTo(Long value) {
            addCriterion("is_driver <=", value, "isDriver");
            return (Criteria) this;
        }

        public Criteria andIsDriverIn(List<Long> values) {
            addCriterion("is_driver in", values, "isDriver");
            return (Criteria) this;
        }

        public Criteria andIsDriverNotIn(List<Long> values) {
            addCriterion("is_driver not in", values, "isDriver");
            return (Criteria) this;
        }

        public Criteria andIsDriverBetween(Long value1, Long value2) {
            addCriterion("is_driver between", value1, value2, "isDriver");
            return (Criteria) this;
        }

        public Criteria andIsDriverNotBetween(Long value1, Long value2) {
            addCriterion("is_driver not between", value1, value2, "isDriver");
            return (Criteria) this;
        }

        public Criteria andCreditCountIsNull() {
            addCriterion("credit_count is null");
            return (Criteria) this;
        }

        public Criteria andCreditCountIsNotNull() {
            addCriterion("credit_count is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCountEqualTo(BigDecimal value) {
            addCriterion("credit_count =", value, "creditCount");
            return (Criteria) this;
        }

        public Criteria andCreditCountNotEqualTo(BigDecimal value) {
            addCriterion("credit_count <>", value, "creditCount");
            return (Criteria) this;
        }

        public Criteria andCreditCountGreaterThan(BigDecimal value) {
            addCriterion("credit_count >", value, "creditCount");
            return (Criteria) this;
        }

        public Criteria andCreditCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_count >=", value, "creditCount");
            return (Criteria) this;
        }

        public Criteria andCreditCountLessThan(BigDecimal value) {
            addCriterion("credit_count <", value, "creditCount");
            return (Criteria) this;
        }

        public Criteria andCreditCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_count <=", value, "creditCount");
            return (Criteria) this;
        }

        public Criteria andCreditCountIn(List<BigDecimal> values) {
            addCriterion("credit_count in", values, "creditCount");
            return (Criteria) this;
        }

        public Criteria andCreditCountNotIn(List<BigDecimal> values) {
            addCriterion("credit_count not in", values, "creditCount");
            return (Criteria) this;
        }

        public Criteria andCreditCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_count between", value1, value2, "creditCount");
            return (Criteria) this;
        }

        public Criteria andCreditCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_count not between", value1, value2, "creditCount");
            return (Criteria) this;
        }

        public Criteria andIsVipIsNull() {
            addCriterion("is_vip is null");
            return (Criteria) this;
        }

        public Criteria andIsVipIsNotNull() {
            addCriterion("is_vip is not null");
            return (Criteria) this;
        }

        public Criteria andIsVipEqualTo(Long value) {
            addCriterion("is_vip =", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipNotEqualTo(Long value) {
            addCriterion("is_vip <>", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipGreaterThan(Long value) {
            addCriterion("is_vip >", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipGreaterThanOrEqualTo(Long value) {
            addCriterion("is_vip >=", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipLessThan(Long value) {
            addCriterion("is_vip <", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipLessThanOrEqualTo(Long value) {
            addCriterion("is_vip <=", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipIn(List<Long> values) {
            addCriterion("is_vip in", values, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipNotIn(List<Long> values) {
            addCriterion("is_vip not in", values, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipBetween(Long value1, Long value2) {
            addCriterion("is_vip between", value1, value2, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipNotBetween(Long value1, Long value2) {
            addCriterion("is_vip not between", value1, value2, "isVip");
            return (Criteria) this;
        }

        public Criteria andQrcodePhotoIdIsNull() {
            addCriterion("qrcode_photo_id is null");
            return (Criteria) this;
        }

        public Criteria andQrcodePhotoIdIsNotNull() {
            addCriterion("qrcode_photo_id is not null");
            return (Criteria) this;
        }

        public Criteria andQrcodePhotoIdEqualTo(String value) {
            addCriterion("qrcode_photo_id =", value, "qrcodePhotoId");
            return (Criteria) this;
        }

        public Criteria andQrcodePhotoIdNotEqualTo(String value) {
            addCriterion("qrcode_photo_id <>", value, "qrcodePhotoId");
            return (Criteria) this;
        }

        public Criteria andQrcodePhotoIdGreaterThan(String value) {
            addCriterion("qrcode_photo_id >", value, "qrcodePhotoId");
            return (Criteria) this;
        }

        public Criteria andQrcodePhotoIdGreaterThanOrEqualTo(String value) {
            addCriterion("qrcode_photo_id >=", value, "qrcodePhotoId");
            return (Criteria) this;
        }

        public Criteria andQrcodePhotoIdLessThan(String value) {
            addCriterion("qrcode_photo_id <", value, "qrcodePhotoId");
            return (Criteria) this;
        }

        public Criteria andQrcodePhotoIdLessThanOrEqualTo(String value) {
            addCriterion("qrcode_photo_id <=", value, "qrcodePhotoId");
            return (Criteria) this;
        }

        public Criteria andQrcodePhotoIdLike(String value) {
            addCriterion("qrcode_photo_id like", value, "qrcodePhotoId");
            return (Criteria) this;
        }

        public Criteria andQrcodePhotoIdNotLike(String value) {
            addCriterion("qrcode_photo_id not like", value, "qrcodePhotoId");
            return (Criteria) this;
        }

        public Criteria andQrcodePhotoIdIn(List<String> values) {
            addCriterion("qrcode_photo_id in", values, "qrcodePhotoId");
            return (Criteria) this;
        }

        public Criteria andQrcodePhotoIdNotIn(List<String> values) {
            addCriterion("qrcode_photo_id not in", values, "qrcodePhotoId");
            return (Criteria) this;
        }

        public Criteria andQrcodePhotoIdBetween(String value1, String value2) {
            addCriterion("qrcode_photo_id between", value1, value2, "qrcodePhotoId");
            return (Criteria) this;
        }

        public Criteria andQrcodePhotoIdNotBetween(String value1, String value2) {
            addCriterion("qrcode_photo_id not between", value1, value2, "qrcodePhotoId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Long value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Long value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Long value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Long value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Long value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Long> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Long> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Long value1, Long value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Long value1, Long value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserCategoryIsNull() {
            addCriterion("user_category is null");
            return (Criteria) this;
        }

        public Criteria andUserCategoryIsNotNull() {
            addCriterion("user_category is not null");
            return (Criteria) this;
        }

        public Criteria andUserCategoryEqualTo(Long value) {
            addCriterion("user_category =", value, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryNotEqualTo(Long value) {
            addCriterion("user_category <>", value, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryGreaterThan(Long value) {
            addCriterion("user_category >", value, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryGreaterThanOrEqualTo(Long value) {
            addCriterion("user_category >=", value, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryLessThan(Long value) {
            addCriterion("user_category <", value, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryLessThanOrEqualTo(Long value) {
            addCriterion("user_category <=", value, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryIn(List<Long> values) {
            addCriterion("user_category in", values, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryNotIn(List<Long> values) {
            addCriterion("user_category not in", values, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryBetween(Long value1, Long value2) {
            addCriterion("user_category between", value1, value2, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryNotBetween(Long value1, Long value2) {
            addCriterion("user_category not between", value1, value2, "userCategory");
            return (Criteria) this;
        }

        public Criteria andDrivingLicensePhotoIdIsNull() {
            addCriterion("driving_license_photo_id is null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicensePhotoIdIsNotNull() {
            addCriterion("driving_license_photo_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicensePhotoIdEqualTo(String value) {
            addCriterion("driving_license_photo_id =", value, "drivingLicensePhotoId");
            return (Criteria) this;
        }

        public Criteria andDrivingLicensePhotoIdNotEqualTo(String value) {
            addCriterion("driving_license_photo_id <>", value, "drivingLicensePhotoId");
            return (Criteria) this;
        }

        public Criteria andDrivingLicensePhotoIdGreaterThan(String value) {
            addCriterion("driving_license_photo_id >", value, "drivingLicensePhotoId");
            return (Criteria) this;
        }

        public Criteria andDrivingLicensePhotoIdGreaterThanOrEqualTo(String value) {
            addCriterion("driving_license_photo_id >=", value, "drivingLicensePhotoId");
            return (Criteria) this;
        }

        public Criteria andDrivingLicensePhotoIdLessThan(String value) {
            addCriterion("driving_license_photo_id <", value, "drivingLicensePhotoId");
            return (Criteria) this;
        }

        public Criteria andDrivingLicensePhotoIdLessThanOrEqualTo(String value) {
            addCriterion("driving_license_photo_id <=", value, "drivingLicensePhotoId");
            return (Criteria) this;
        }

        public Criteria andDrivingLicensePhotoIdLike(String value) {
            addCriterion("driving_license_photo_id like", value, "drivingLicensePhotoId");
            return (Criteria) this;
        }

        public Criteria andDrivingLicensePhotoIdNotLike(String value) {
            addCriterion("driving_license_photo_id not like", value, "drivingLicensePhotoId");
            return (Criteria) this;
        }

        public Criteria andDrivingLicensePhotoIdIn(List<String> values) {
            addCriterion("driving_license_photo_id in", values, "drivingLicensePhotoId");
            return (Criteria) this;
        }

        public Criteria andDrivingLicensePhotoIdNotIn(List<String> values) {
            addCriterion("driving_license_photo_id not in", values, "drivingLicensePhotoId");
            return (Criteria) this;
        }

        public Criteria andDrivingLicensePhotoIdBetween(String value1, String value2) {
            addCriterion("driving_license_photo_id between", value1, value2, "drivingLicensePhotoId");
            return (Criteria) this;
        }

        public Criteria andDrivingLicensePhotoIdNotBetween(String value1, String value2) {
            addCriterion("driving_license_photo_id not between", value1, value2, "drivingLicensePhotoId");
            return (Criteria) this;
        }

        public Criteria andRecentPhotoIdIsNull() {
            addCriterion("recent_photo_id is null");
            return (Criteria) this;
        }

        public Criteria andRecentPhotoIdIsNotNull() {
            addCriterion("recent_photo_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecentPhotoIdEqualTo(String value) {
            addCriterion("recent_photo_id =", value, "recentPhotoId");
            return (Criteria) this;
        }

        public Criteria andRecentPhotoIdNotEqualTo(String value) {
            addCriterion("recent_photo_id <>", value, "recentPhotoId");
            return (Criteria) this;
        }

        public Criteria andRecentPhotoIdGreaterThan(String value) {
            addCriterion("recent_photo_id >", value, "recentPhotoId");
            return (Criteria) this;
        }

        public Criteria andRecentPhotoIdGreaterThanOrEqualTo(String value) {
            addCriterion("recent_photo_id >=", value, "recentPhotoId");
            return (Criteria) this;
        }

        public Criteria andRecentPhotoIdLessThan(String value) {
            addCriterion("recent_photo_id <", value, "recentPhotoId");
            return (Criteria) this;
        }

        public Criteria andRecentPhotoIdLessThanOrEqualTo(String value) {
            addCriterion("recent_photo_id <=", value, "recentPhotoId");
            return (Criteria) this;
        }

        public Criteria andRecentPhotoIdLike(String value) {
            addCriterion("recent_photo_id like", value, "recentPhotoId");
            return (Criteria) this;
        }

        public Criteria andRecentPhotoIdNotLike(String value) {
            addCriterion("recent_photo_id not like", value, "recentPhotoId");
            return (Criteria) this;
        }

        public Criteria andRecentPhotoIdIn(List<String> values) {
            addCriterion("recent_photo_id in", values, "recentPhotoId");
            return (Criteria) this;
        }

        public Criteria andRecentPhotoIdNotIn(List<String> values) {
            addCriterion("recent_photo_id not in", values, "recentPhotoId");
            return (Criteria) this;
        }

        public Criteria andRecentPhotoIdBetween(String value1, String value2) {
            addCriterion("recent_photo_id between", value1, value2, "recentPhotoId");
            return (Criteria) this;
        }

        public Criteria andRecentPhotoIdNotBetween(String value1, String value2) {
            addCriterion("recent_photo_id not between", value1, value2, "recentPhotoId");
            return (Criteria) this;
        }

        public Criteria andFingerprintsPhotoIdIsNull() {
            addCriterion("fingerprints_photo_id is null");
            return (Criteria) this;
        }

        public Criteria andFingerprintsPhotoIdIsNotNull() {
            addCriterion("fingerprints_photo_id is not null");
            return (Criteria) this;
        }

        public Criteria andFingerprintsPhotoIdEqualTo(String value) {
            addCriterion("fingerprints_photo_id =", value, "fingerprintsPhotoId");
            return (Criteria) this;
        }

        public Criteria andFingerprintsPhotoIdNotEqualTo(String value) {
            addCriterion("fingerprints_photo_id <>", value, "fingerprintsPhotoId");
            return (Criteria) this;
        }

        public Criteria andFingerprintsPhotoIdGreaterThan(String value) {
            addCriterion("fingerprints_photo_id >", value, "fingerprintsPhotoId");
            return (Criteria) this;
        }

        public Criteria andFingerprintsPhotoIdGreaterThanOrEqualTo(String value) {
            addCriterion("fingerprints_photo_id >=", value, "fingerprintsPhotoId");
            return (Criteria) this;
        }

        public Criteria andFingerprintsPhotoIdLessThan(String value) {
            addCriterion("fingerprints_photo_id <", value, "fingerprintsPhotoId");
            return (Criteria) this;
        }

        public Criteria andFingerprintsPhotoIdLessThanOrEqualTo(String value) {
            addCriterion("fingerprints_photo_id <=", value, "fingerprintsPhotoId");
            return (Criteria) this;
        }

        public Criteria andFingerprintsPhotoIdLike(String value) {
            addCriterion("fingerprints_photo_id like", value, "fingerprintsPhotoId");
            return (Criteria) this;
        }

        public Criteria andFingerprintsPhotoIdNotLike(String value) {
            addCriterion("fingerprints_photo_id not like", value, "fingerprintsPhotoId");
            return (Criteria) this;
        }

        public Criteria andFingerprintsPhotoIdIn(List<String> values) {
            addCriterion("fingerprints_photo_id in", values, "fingerprintsPhotoId");
            return (Criteria) this;
        }

        public Criteria andFingerprintsPhotoIdNotIn(List<String> values) {
            addCriterion("fingerprints_photo_id not in", values, "fingerprintsPhotoId");
            return (Criteria) this;
        }

        public Criteria andFingerprintsPhotoIdBetween(String value1, String value2) {
            addCriterion("fingerprints_photo_id between", value1, value2, "fingerprintsPhotoId");
            return (Criteria) this;
        }

        public Criteria andFingerprintsPhotoIdNotBetween(String value1, String value2) {
            addCriterion("fingerprints_photo_id not between", value1, value2, "fingerprintsPhotoId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdIsNull() {
            addCriterion("third_user_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdIsNotNull() {
            addCriterion("third_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdEqualTo(String value) {
            addCriterion("third_user_id =", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdNotEqualTo(String value) {
            addCriterion("third_user_id <>", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdGreaterThan(String value) {
            addCriterion("third_user_id >", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("third_user_id >=", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdLessThan(String value) {
            addCriterion("third_user_id <", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdLessThanOrEqualTo(String value) {
            addCriterion("third_user_id <=", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdLike(String value) {
            addCriterion("third_user_id like", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdNotLike(String value) {
            addCriterion("third_user_id not like", value, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdIn(List<String> values) {
            addCriterion("third_user_id in", values, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdNotIn(List<String> values) {
            addCriterion("third_user_id not in", values, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdBetween(String value1, String value2) {
            addCriterion("third_user_id between", value1, value2, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andThirdUserIdNotBetween(String value1, String value2) {
            addCriterion("third_user_id not between", value1, value2, "thirdUserId");
            return (Criteria) this;
        }

        public Criteria andIsSnsIsNull() {
            addCriterion("is_sns is null");
            return (Criteria) this;
        }

        public Criteria andIsSnsIsNotNull() {
            addCriterion("is_sns is not null");
            return (Criteria) this;
        }

        public Criteria andIsSnsEqualTo(Long value) {
            addCriterion("is_sns =", value, "isSns");
            return (Criteria) this;
        }

        public Criteria andIsSnsNotEqualTo(Long value) {
            addCriterion("is_sns <>", value, "isSns");
            return (Criteria) this;
        }

        public Criteria andIsSnsGreaterThan(Long value) {
            addCriterion("is_sns >", value, "isSns");
            return (Criteria) this;
        }

        public Criteria andIsSnsGreaterThanOrEqualTo(Long value) {
            addCriterion("is_sns >=", value, "isSns");
            return (Criteria) this;
        }

        public Criteria andIsSnsLessThan(Long value) {
            addCriterion("is_sns <", value, "isSns");
            return (Criteria) this;
        }

        public Criteria andIsSnsLessThanOrEqualTo(Long value) {
            addCriterion("is_sns <=", value, "isSns");
            return (Criteria) this;
        }

        public Criteria andIsSnsIn(List<Long> values) {
            addCriterion("is_sns in", values, "isSns");
            return (Criteria) this;
        }

        public Criteria andIsSnsNotIn(List<Long> values) {
            addCriterion("is_sns not in", values, "isSns");
            return (Criteria) this;
        }

        public Criteria andIsSnsBetween(Long value1, Long value2) {
            addCriterion("is_sns between", value1, value2, "isSns");
            return (Criteria) this;
        }

        public Criteria andIsSnsNotBetween(Long value1, Long value2) {
            addCriterion("is_sns not between", value1, value2, "isSns");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}