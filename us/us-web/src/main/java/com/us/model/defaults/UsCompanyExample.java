package com.us.model.defaults;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsCompanyExample() {
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

        public Criteria andBusinessNumberIsNull() {
            addCriterion("business_number is null");
            return (Criteria) this;
        }

        public Criteria andBusinessNumberIsNotNull() {
            addCriterion("business_number is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessNumberEqualTo(String value) {
            addCriterion("business_number =", value, "businessNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessNumberNotEqualTo(String value) {
            addCriterion("business_number <>", value, "businessNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessNumberGreaterThan(String value) {
            addCriterion("business_number >", value, "businessNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessNumberGreaterThanOrEqualTo(String value) {
            addCriterion("business_number >=", value, "businessNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessNumberLessThan(String value) {
            addCriterion("business_number <", value, "businessNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessNumberLessThanOrEqualTo(String value) {
            addCriterion("business_number <=", value, "businessNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessNumberLike(String value) {
            addCriterion("business_number like", value, "businessNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessNumberNotLike(String value) {
            addCriterion("business_number not like", value, "businessNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessNumberIn(List<String> values) {
            addCriterion("business_number in", values, "businessNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessNumberNotIn(List<String> values) {
            addCriterion("business_number not in", values, "businessNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessNumberBetween(String value1, String value2) {
            addCriterion("business_number between", value1, value2, "businessNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessNumberNotBetween(String value1, String value2) {
            addCriterion("business_number not between", value1, value2, "businessNumber");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdIsNull() {
            addCriterion("linkman_id is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdIsNotNull() {
            addCriterion("linkman_id is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdEqualTo(String value) {
            addCriterion("linkman_id =", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdNotEqualTo(String value) {
            addCriterion("linkman_id <>", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdGreaterThan(String value) {
            addCriterion("linkman_id >", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdGreaterThanOrEqualTo(String value) {
            addCriterion("linkman_id >=", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdLessThan(String value) {
            addCriterion("linkman_id <", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdLessThanOrEqualTo(String value) {
            addCriterion("linkman_id <=", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdLike(String value) {
            addCriterion("linkman_id like", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdNotLike(String value) {
            addCriterion("linkman_id not like", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdIn(List<String> values) {
            addCriterion("linkman_id in", values, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdNotIn(List<String> values) {
            addCriterion("linkman_id not in", values, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdBetween(String value1, String value2) {
            addCriterion("linkman_id between", value1, value2, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdNotBetween(String value1, String value2) {
            addCriterion("linkman_id not between", value1, value2, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeIsNull() {
            addCriterion("org_type_code is null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeIsNotNull() {
            addCriterion("org_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeEqualTo(String value) {
            addCriterion("org_type_code =", value, "orgTypeCode");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeNotEqualTo(String value) {
            addCriterion("org_type_code <>", value, "orgTypeCode");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeGreaterThan(String value) {
            addCriterion("org_type_code >", value, "orgTypeCode");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("org_type_code >=", value, "orgTypeCode");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeLessThan(String value) {
            addCriterion("org_type_code <", value, "orgTypeCode");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("org_type_code <=", value, "orgTypeCode");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeLike(String value) {
            addCriterion("org_type_code like", value, "orgTypeCode");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeNotLike(String value) {
            addCriterion("org_type_code not like", value, "orgTypeCode");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeIn(List<String> values) {
            addCriterion("org_type_code in", values, "orgTypeCode");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeNotIn(List<String> values) {
            addCriterion("org_type_code not in", values, "orgTypeCode");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeBetween(String value1, String value2) {
            addCriterion("org_type_code between", value1, value2, "orgTypeCode");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeNotBetween(String value1, String value2) {
            addCriterion("org_type_code not between", value1, value2, "orgTypeCode");
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

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
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