package com.us.model.defaults;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsCompanyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsCompanyInfoExample() {
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

        public Criteria andCompanyInfoIdIsNull() {
            addCriterion("company_info_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIdIsNotNull() {
            addCriterion("company_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIdEqualTo(String value) {
            addCriterion("company_info_id =", value, "companyInfoId");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIdNotEqualTo(String value) {
            addCriterion("company_info_id <>", value, "companyInfoId");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIdGreaterThan(String value) {
            addCriterion("company_info_id >", value, "companyInfoId");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_info_id >=", value, "companyInfoId");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIdLessThan(String value) {
            addCriterion("company_info_id <", value, "companyInfoId");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIdLessThanOrEqualTo(String value) {
            addCriterion("company_info_id <=", value, "companyInfoId");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIdLike(String value) {
            addCriterion("company_info_id like", value, "companyInfoId");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIdNotLike(String value) {
            addCriterion("company_info_id not like", value, "companyInfoId");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIdIn(List<String> values) {
            addCriterion("company_info_id in", values, "companyInfoId");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIdNotIn(List<String> values) {
            addCriterion("company_info_id not in", values, "companyInfoId");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIdBetween(String value1, String value2) {
            addCriterion("company_info_id between", value1, value2, "companyInfoId");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIdNotBetween(String value1, String value2) {
            addCriterion("company_info_id not between", value1, value2, "companyInfoId");
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

        public Criteria andBizLicenseFileIdIsNull() {
            addCriterion("biz_license_file_id is null");
            return (Criteria) this;
        }

        public Criteria andBizLicenseFileIdIsNotNull() {
            addCriterion("biz_license_file_id is not null");
            return (Criteria) this;
        }

        public Criteria andBizLicenseFileIdEqualTo(String value) {
            addCriterion("biz_license_file_id =", value, "bizLicenseFileId");
            return (Criteria) this;
        }

        public Criteria andBizLicenseFileIdNotEqualTo(String value) {
            addCriterion("biz_license_file_id <>", value, "bizLicenseFileId");
            return (Criteria) this;
        }

        public Criteria andBizLicenseFileIdGreaterThan(String value) {
            addCriterion("biz_license_file_id >", value, "bizLicenseFileId");
            return (Criteria) this;
        }

        public Criteria andBizLicenseFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("biz_license_file_id >=", value, "bizLicenseFileId");
            return (Criteria) this;
        }

        public Criteria andBizLicenseFileIdLessThan(String value) {
            addCriterion("biz_license_file_id <", value, "bizLicenseFileId");
            return (Criteria) this;
        }

        public Criteria andBizLicenseFileIdLessThanOrEqualTo(String value) {
            addCriterion("biz_license_file_id <=", value, "bizLicenseFileId");
            return (Criteria) this;
        }

        public Criteria andBizLicenseFileIdLike(String value) {
            addCriterion("biz_license_file_id like", value, "bizLicenseFileId");
            return (Criteria) this;
        }

        public Criteria andBizLicenseFileIdNotLike(String value) {
            addCriterion("biz_license_file_id not like", value, "bizLicenseFileId");
            return (Criteria) this;
        }

        public Criteria andBizLicenseFileIdIn(List<String> values) {
            addCriterion("biz_license_file_id in", values, "bizLicenseFileId");
            return (Criteria) this;
        }

        public Criteria andBizLicenseFileIdNotIn(List<String> values) {
            addCriterion("biz_license_file_id not in", values, "bizLicenseFileId");
            return (Criteria) this;
        }

        public Criteria andBizLicenseFileIdBetween(String value1, String value2) {
            addCriterion("biz_license_file_id between", value1, value2, "bizLicenseFileId");
            return (Criteria) this;
        }

        public Criteria andBizLicenseFileIdNotBetween(String value1, String value2) {
            addCriterion("biz_license_file_id not between", value1, value2, "bizLicenseFileId");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeIsNull() {
            addCriterion("currency_code is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeIsNotNull() {
            addCriterion("currency_code is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeEqualTo(String value) {
            addCriterion("currency_code =", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotEqualTo(String value) {
            addCriterion("currency_code <>", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeGreaterThan(String value) {
            addCriterion("currency_code >", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("currency_code >=", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeLessThan(String value) {
            addCriterion("currency_code <", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeLessThanOrEqualTo(String value) {
            addCriterion("currency_code <=", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeLike(String value) {
            addCriterion("currency_code like", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotLike(String value) {
            addCriterion("currency_code not like", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeIn(List<String> values) {
            addCriterion("currency_code in", values, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotIn(List<String> values) {
            addCriterion("currency_code not in", values, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeBetween(String value1, String value2) {
            addCriterion("currency_code between", value1, value2, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotBetween(String value1, String value2) {
            addCriterion("currency_code not between", value1, value2, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andBizCityCodeIsNull() {
            addCriterion("biz_city_code is null");
            return (Criteria) this;
        }

        public Criteria andBizCityCodeIsNotNull() {
            addCriterion("biz_city_code is not null");
            return (Criteria) this;
        }

        public Criteria andBizCityCodeEqualTo(String value) {
            addCriterion("biz_city_code =", value, "bizCityCode");
            return (Criteria) this;
        }

        public Criteria andBizCityCodeNotEqualTo(String value) {
            addCriterion("biz_city_code <>", value, "bizCityCode");
            return (Criteria) this;
        }

        public Criteria andBizCityCodeGreaterThan(String value) {
            addCriterion("biz_city_code >", value, "bizCityCode");
            return (Criteria) this;
        }

        public Criteria andBizCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("biz_city_code >=", value, "bizCityCode");
            return (Criteria) this;
        }

        public Criteria andBizCityCodeLessThan(String value) {
            addCriterion("biz_city_code <", value, "bizCityCode");
            return (Criteria) this;
        }

        public Criteria andBizCityCodeLessThanOrEqualTo(String value) {
            addCriterion("biz_city_code <=", value, "bizCityCode");
            return (Criteria) this;
        }

        public Criteria andBizCityCodeLike(String value) {
            addCriterion("biz_city_code like", value, "bizCityCode");
            return (Criteria) this;
        }

        public Criteria andBizCityCodeNotLike(String value) {
            addCriterion("biz_city_code not like", value, "bizCityCode");
            return (Criteria) this;
        }

        public Criteria andBizCityCodeIn(List<String> values) {
            addCriterion("biz_city_code in", values, "bizCityCode");
            return (Criteria) this;
        }

        public Criteria andBizCityCodeNotIn(List<String> values) {
            addCriterion("biz_city_code not in", values, "bizCityCode");
            return (Criteria) this;
        }

        public Criteria andBizCityCodeBetween(String value1, String value2) {
            addCriterion("biz_city_code between", value1, value2, "bizCityCode");
            return (Criteria) this;
        }

        public Criteria andBizCityCodeNotBetween(String value1, String value2) {
            addCriterion("biz_city_code not between", value1, value2, "bizCityCode");
            return (Criteria) this;
        }

        public Criteria andRegCityCodeIsNull() {
            addCriterion("reg_city_code is null");
            return (Criteria) this;
        }

        public Criteria andRegCityCodeIsNotNull() {
            addCriterion("reg_city_code is not null");
            return (Criteria) this;
        }

        public Criteria andRegCityCodeEqualTo(String value) {
            addCriterion("reg_city_code =", value, "regCityCode");
            return (Criteria) this;
        }

        public Criteria andRegCityCodeNotEqualTo(String value) {
            addCriterion("reg_city_code <>", value, "regCityCode");
            return (Criteria) this;
        }

        public Criteria andRegCityCodeGreaterThan(String value) {
            addCriterion("reg_city_code >", value, "regCityCode");
            return (Criteria) this;
        }

        public Criteria andRegCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("reg_city_code >=", value, "regCityCode");
            return (Criteria) this;
        }

        public Criteria andRegCityCodeLessThan(String value) {
            addCriterion("reg_city_code <", value, "regCityCode");
            return (Criteria) this;
        }

        public Criteria andRegCityCodeLessThanOrEqualTo(String value) {
            addCriterion("reg_city_code <=", value, "regCityCode");
            return (Criteria) this;
        }

        public Criteria andRegCityCodeLike(String value) {
            addCriterion("reg_city_code like", value, "regCityCode");
            return (Criteria) this;
        }

        public Criteria andRegCityCodeNotLike(String value) {
            addCriterion("reg_city_code not like", value, "regCityCode");
            return (Criteria) this;
        }

        public Criteria andRegCityCodeIn(List<String> values) {
            addCriterion("reg_city_code in", values, "regCityCode");
            return (Criteria) this;
        }

        public Criteria andRegCityCodeNotIn(List<String> values) {
            addCriterion("reg_city_code not in", values, "regCityCode");
            return (Criteria) this;
        }

        public Criteria andRegCityCodeBetween(String value1, String value2) {
            addCriterion("reg_city_code between", value1, value2, "regCityCode");
            return (Criteria) this;
        }

        public Criteria andRegCityCodeNotBetween(String value1, String value2) {
            addCriterion("reg_city_code not between", value1, value2, "regCityCode");
            return (Criteria) this;
        }

        public Criteria andBizStreetIsNull() {
            addCriterion("biz_street is null");
            return (Criteria) this;
        }

        public Criteria andBizStreetIsNotNull() {
            addCriterion("biz_street is not null");
            return (Criteria) this;
        }

        public Criteria andBizStreetEqualTo(String value) {
            addCriterion("biz_street =", value, "bizStreet");
            return (Criteria) this;
        }

        public Criteria andBizStreetNotEqualTo(String value) {
            addCriterion("biz_street <>", value, "bizStreet");
            return (Criteria) this;
        }

        public Criteria andBizStreetGreaterThan(String value) {
            addCriterion("biz_street >", value, "bizStreet");
            return (Criteria) this;
        }

        public Criteria andBizStreetGreaterThanOrEqualTo(String value) {
            addCriterion("biz_street >=", value, "bizStreet");
            return (Criteria) this;
        }

        public Criteria andBizStreetLessThan(String value) {
            addCriterion("biz_street <", value, "bizStreet");
            return (Criteria) this;
        }

        public Criteria andBizStreetLessThanOrEqualTo(String value) {
            addCriterion("biz_street <=", value, "bizStreet");
            return (Criteria) this;
        }

        public Criteria andBizStreetLike(String value) {
            addCriterion("biz_street like", value, "bizStreet");
            return (Criteria) this;
        }

        public Criteria andBizStreetNotLike(String value) {
            addCriterion("biz_street not like", value, "bizStreet");
            return (Criteria) this;
        }

        public Criteria andBizStreetIn(List<String> values) {
            addCriterion("biz_street in", values, "bizStreet");
            return (Criteria) this;
        }

        public Criteria andBizStreetNotIn(List<String> values) {
            addCriterion("biz_street not in", values, "bizStreet");
            return (Criteria) this;
        }

        public Criteria andBizStreetBetween(String value1, String value2) {
            addCriterion("biz_street between", value1, value2, "bizStreet");
            return (Criteria) this;
        }

        public Criteria andBizStreetNotBetween(String value1, String value2) {
            addCriterion("biz_street not between", value1, value2, "bizStreet");
            return (Criteria) this;
        }

        public Criteria andBizPostIsNull() {
            addCriterion("biz_post is null");
            return (Criteria) this;
        }

        public Criteria andBizPostIsNotNull() {
            addCriterion("biz_post is not null");
            return (Criteria) this;
        }

        public Criteria andBizPostEqualTo(String value) {
            addCriterion("biz_post =", value, "bizPost");
            return (Criteria) this;
        }

        public Criteria andBizPostNotEqualTo(String value) {
            addCriterion("biz_post <>", value, "bizPost");
            return (Criteria) this;
        }

        public Criteria andBizPostGreaterThan(String value) {
            addCriterion("biz_post >", value, "bizPost");
            return (Criteria) this;
        }

        public Criteria andBizPostGreaterThanOrEqualTo(String value) {
            addCriterion("biz_post >=", value, "bizPost");
            return (Criteria) this;
        }

        public Criteria andBizPostLessThan(String value) {
            addCriterion("biz_post <", value, "bizPost");
            return (Criteria) this;
        }

        public Criteria andBizPostLessThanOrEqualTo(String value) {
            addCriterion("biz_post <=", value, "bizPost");
            return (Criteria) this;
        }

        public Criteria andBizPostLike(String value) {
            addCriterion("biz_post like", value, "bizPost");
            return (Criteria) this;
        }

        public Criteria andBizPostNotLike(String value) {
            addCriterion("biz_post not like", value, "bizPost");
            return (Criteria) this;
        }

        public Criteria andBizPostIn(List<String> values) {
            addCriterion("biz_post in", values, "bizPost");
            return (Criteria) this;
        }

        public Criteria andBizPostNotIn(List<String> values) {
            addCriterion("biz_post not in", values, "bizPost");
            return (Criteria) this;
        }

        public Criteria andBizPostBetween(String value1, String value2) {
            addCriterion("biz_post between", value1, value2, "bizPost");
            return (Criteria) this;
        }

        public Criteria andBizPostNotBetween(String value1, String value2) {
            addCriterion("biz_post not between", value1, value2, "bizPost");
            return (Criteria) this;
        }

        public Criteria andRegStreetIsNull() {
            addCriterion("reg_street is null");
            return (Criteria) this;
        }

        public Criteria andRegStreetIsNotNull() {
            addCriterion("reg_street is not null");
            return (Criteria) this;
        }

        public Criteria andRegStreetEqualTo(String value) {
            addCriterion("reg_street =", value, "regStreet");
            return (Criteria) this;
        }

        public Criteria andRegStreetNotEqualTo(String value) {
            addCriterion("reg_street <>", value, "regStreet");
            return (Criteria) this;
        }

        public Criteria andRegStreetGreaterThan(String value) {
            addCriterion("reg_street >", value, "regStreet");
            return (Criteria) this;
        }

        public Criteria andRegStreetGreaterThanOrEqualTo(String value) {
            addCriterion("reg_street >=", value, "regStreet");
            return (Criteria) this;
        }

        public Criteria andRegStreetLessThan(String value) {
            addCriterion("reg_street <", value, "regStreet");
            return (Criteria) this;
        }

        public Criteria andRegStreetLessThanOrEqualTo(String value) {
            addCriterion("reg_street <=", value, "regStreet");
            return (Criteria) this;
        }

        public Criteria andRegStreetLike(String value) {
            addCriterion("reg_street like", value, "regStreet");
            return (Criteria) this;
        }

        public Criteria andRegStreetNotLike(String value) {
            addCriterion("reg_street not like", value, "regStreet");
            return (Criteria) this;
        }

        public Criteria andRegStreetIn(List<String> values) {
            addCriterion("reg_street in", values, "regStreet");
            return (Criteria) this;
        }

        public Criteria andRegStreetNotIn(List<String> values) {
            addCriterion("reg_street not in", values, "regStreet");
            return (Criteria) this;
        }

        public Criteria andRegStreetBetween(String value1, String value2) {
            addCriterion("reg_street between", value1, value2, "regStreet");
            return (Criteria) this;
        }

        public Criteria andRegStreetNotBetween(String value1, String value2) {
            addCriterion("reg_street not between", value1, value2, "regStreet");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(String value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(String value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(String value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(String value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(String value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLike(String value) {
            addCriterion("money like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotLike(String value) {
            addCriterion("money not like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<String> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<String> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(String value1, String value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(String value1, String value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andLegalNameIsNull() {
            addCriterion("legal_name is null");
            return (Criteria) this;
        }

        public Criteria andLegalNameIsNotNull() {
            addCriterion("legal_name is not null");
            return (Criteria) this;
        }

        public Criteria andLegalNameEqualTo(String value) {
            addCriterion("legal_name =", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotEqualTo(String value) {
            addCriterion("legal_name <>", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameGreaterThan(String value) {
            addCriterion("legal_name >", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameGreaterThanOrEqualTo(String value) {
            addCriterion("legal_name >=", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLessThan(String value) {
            addCriterion("legal_name <", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLessThanOrEqualTo(String value) {
            addCriterion("legal_name <=", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameLike(String value) {
            addCriterion("legal_name like", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotLike(String value) {
            addCriterion("legal_name not like", value, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameIn(List<String> values) {
            addCriterion("legal_name in", values, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotIn(List<String> values) {
            addCriterion("legal_name not in", values, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameBetween(String value1, String value2) {
            addCriterion("legal_name between", value1, value2, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalNameNotBetween(String value1, String value2) {
            addCriterion("legal_name not between", value1, value2, "legalName");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityCodeIsNull() {
            addCriterion("legal_identity_code is null");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityCodeIsNotNull() {
            addCriterion("legal_identity_code is not null");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityCodeEqualTo(String value) {
            addCriterion("legal_identity_code =", value, "legalIdentityCode");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityCodeNotEqualTo(String value) {
            addCriterion("legal_identity_code <>", value, "legalIdentityCode");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityCodeGreaterThan(String value) {
            addCriterion("legal_identity_code >", value, "legalIdentityCode");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("legal_identity_code >=", value, "legalIdentityCode");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityCodeLessThan(String value) {
            addCriterion("legal_identity_code <", value, "legalIdentityCode");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityCodeLessThanOrEqualTo(String value) {
            addCriterion("legal_identity_code <=", value, "legalIdentityCode");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityCodeLike(String value) {
            addCriterion("legal_identity_code like", value, "legalIdentityCode");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityCodeNotLike(String value) {
            addCriterion("legal_identity_code not like", value, "legalIdentityCode");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityCodeIn(List<String> values) {
            addCriterion("legal_identity_code in", values, "legalIdentityCode");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityCodeNotIn(List<String> values) {
            addCriterion("legal_identity_code not in", values, "legalIdentityCode");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityCodeBetween(String value1, String value2) {
            addCriterion("legal_identity_code between", value1, value2, "legalIdentityCode");
            return (Criteria) this;
        }

        public Criteria andLegalIdentityCodeNotBetween(String value1, String value2) {
            addCriterion("legal_identity_code not between", value1, value2, "legalIdentityCode");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andDustryCodeIsNull() {
            addCriterion("dustry_code is null");
            return (Criteria) this;
        }

        public Criteria andDustryCodeIsNotNull() {
            addCriterion("dustry_code is not null");
            return (Criteria) this;
        }

        public Criteria andDustryCodeEqualTo(String value) {
            addCriterion("dustry_code =", value, "dustryCode");
            return (Criteria) this;
        }

        public Criteria andDustryCodeNotEqualTo(String value) {
            addCriterion("dustry_code <>", value, "dustryCode");
            return (Criteria) this;
        }

        public Criteria andDustryCodeGreaterThan(String value) {
            addCriterion("dustry_code >", value, "dustryCode");
            return (Criteria) this;
        }

        public Criteria andDustryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dustry_code >=", value, "dustryCode");
            return (Criteria) this;
        }

        public Criteria andDustryCodeLessThan(String value) {
            addCriterion("dustry_code <", value, "dustryCode");
            return (Criteria) this;
        }

        public Criteria andDustryCodeLessThanOrEqualTo(String value) {
            addCriterion("dustry_code <=", value, "dustryCode");
            return (Criteria) this;
        }

        public Criteria andDustryCodeLike(String value) {
            addCriterion("dustry_code like", value, "dustryCode");
            return (Criteria) this;
        }

        public Criteria andDustryCodeNotLike(String value) {
            addCriterion("dustry_code not like", value, "dustryCode");
            return (Criteria) this;
        }

        public Criteria andDustryCodeIn(List<String> values) {
            addCriterion("dustry_code in", values, "dustryCode");
            return (Criteria) this;
        }

        public Criteria andDustryCodeNotIn(List<String> values) {
            addCriterion("dustry_code not in", values, "dustryCode");
            return (Criteria) this;
        }

        public Criteria andDustryCodeBetween(String value1, String value2) {
            addCriterion("dustry_code between", value1, value2, "dustryCode");
            return (Criteria) this;
        }

        public Criteria andDustryCodeNotBetween(String value1, String value2) {
            addCriterion("dustry_code not between", value1, value2, "dustryCode");
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