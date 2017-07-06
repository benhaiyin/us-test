package com.us.model.defaults;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsAccountDocExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsAccountDocExample() {
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

        public Criteria andAccountDocIdIsNull() {
            addCriterion("account_doc_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountDocIdIsNotNull() {
            addCriterion("account_doc_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountDocIdEqualTo(String value) {
            addCriterion("account_doc_id =", value, "accountDocId");
            return (Criteria) this;
        }

        public Criteria andAccountDocIdNotEqualTo(String value) {
            addCriterion("account_doc_id <>", value, "accountDocId");
            return (Criteria) this;
        }

        public Criteria andAccountDocIdGreaterThan(String value) {
            addCriterion("account_doc_id >", value, "accountDocId");
            return (Criteria) this;
        }

        public Criteria andAccountDocIdGreaterThanOrEqualTo(String value) {
            addCriterion("account_doc_id >=", value, "accountDocId");
            return (Criteria) this;
        }

        public Criteria andAccountDocIdLessThan(String value) {
            addCriterion("account_doc_id <", value, "accountDocId");
            return (Criteria) this;
        }

        public Criteria andAccountDocIdLessThanOrEqualTo(String value) {
            addCriterion("account_doc_id <=", value, "accountDocId");
            return (Criteria) this;
        }

        public Criteria andAccountDocIdLike(String value) {
            addCriterion("account_doc_id like", value, "accountDocId");
            return (Criteria) this;
        }

        public Criteria andAccountDocIdNotLike(String value) {
            addCriterion("account_doc_id not like", value, "accountDocId");
            return (Criteria) this;
        }

        public Criteria andAccountDocIdIn(List<String> values) {
            addCriterion("account_doc_id in", values, "accountDocId");
            return (Criteria) this;
        }

        public Criteria andAccountDocIdNotIn(List<String> values) {
            addCriterion("account_doc_id not in", values, "accountDocId");
            return (Criteria) this;
        }

        public Criteria andAccountDocIdBetween(String value1, String value2) {
            addCriterion("account_doc_id between", value1, value2, "accountDocId");
            return (Criteria) this;
        }

        public Criteria andAccountDocIdNotBetween(String value1, String value2) {
            addCriterion("account_doc_id not between", value1, value2, "accountDocId");
            return (Criteria) this;
        }

        public Criteria andFinanceDetailIdIsNull() {
            addCriterion("finance_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andFinanceDetailIdIsNotNull() {
            addCriterion("finance_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceDetailIdEqualTo(String value) {
            addCriterion("finance_detail_id =", value, "financeDetailId");
            return (Criteria) this;
        }

        public Criteria andFinanceDetailIdNotEqualTo(String value) {
            addCriterion("finance_detail_id <>", value, "financeDetailId");
            return (Criteria) this;
        }

        public Criteria andFinanceDetailIdGreaterThan(String value) {
            addCriterion("finance_detail_id >", value, "financeDetailId");
            return (Criteria) this;
        }

        public Criteria andFinanceDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("finance_detail_id >=", value, "financeDetailId");
            return (Criteria) this;
        }

        public Criteria andFinanceDetailIdLessThan(String value) {
            addCriterion("finance_detail_id <", value, "financeDetailId");
            return (Criteria) this;
        }

        public Criteria andFinanceDetailIdLessThanOrEqualTo(String value) {
            addCriterion("finance_detail_id <=", value, "financeDetailId");
            return (Criteria) this;
        }

        public Criteria andFinanceDetailIdLike(String value) {
            addCriterion("finance_detail_id like", value, "financeDetailId");
            return (Criteria) this;
        }

        public Criteria andFinanceDetailIdNotLike(String value) {
            addCriterion("finance_detail_id not like", value, "financeDetailId");
            return (Criteria) this;
        }

        public Criteria andFinanceDetailIdIn(List<String> values) {
            addCriterion("finance_detail_id in", values, "financeDetailId");
            return (Criteria) this;
        }

        public Criteria andFinanceDetailIdNotIn(List<String> values) {
            addCriterion("finance_detail_id not in", values, "financeDetailId");
            return (Criteria) this;
        }

        public Criteria andFinanceDetailIdBetween(String value1, String value2) {
            addCriterion("finance_detail_id between", value1, value2, "financeDetailId");
            return (Criteria) this;
        }

        public Criteria andFinanceDetailIdNotBetween(String value1, String value2) {
            addCriterion("finance_detail_id not between", value1, value2, "financeDetailId");
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

        public Criteria andMoneyDirectionCodeIsNull() {
            addCriterion("money_direction_code is null");
            return (Criteria) this;
        }

        public Criteria andMoneyDirectionCodeIsNotNull() {
            addCriterion("money_direction_code is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyDirectionCodeEqualTo(String value) {
            addCriterion("money_direction_code =", value, "moneyDirectionCode");
            return (Criteria) this;
        }

        public Criteria andMoneyDirectionCodeNotEqualTo(String value) {
            addCriterion("money_direction_code <>", value, "moneyDirectionCode");
            return (Criteria) this;
        }

        public Criteria andMoneyDirectionCodeGreaterThan(String value) {
            addCriterion("money_direction_code >", value, "moneyDirectionCode");
            return (Criteria) this;
        }

        public Criteria andMoneyDirectionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("money_direction_code >=", value, "moneyDirectionCode");
            return (Criteria) this;
        }

        public Criteria andMoneyDirectionCodeLessThan(String value) {
            addCriterion("money_direction_code <", value, "moneyDirectionCode");
            return (Criteria) this;
        }

        public Criteria andMoneyDirectionCodeLessThanOrEqualTo(String value) {
            addCriterion("money_direction_code <=", value, "moneyDirectionCode");
            return (Criteria) this;
        }

        public Criteria andMoneyDirectionCodeLike(String value) {
            addCriterion("money_direction_code like", value, "moneyDirectionCode");
            return (Criteria) this;
        }

        public Criteria andMoneyDirectionCodeNotLike(String value) {
            addCriterion("money_direction_code not like", value, "moneyDirectionCode");
            return (Criteria) this;
        }

        public Criteria andMoneyDirectionCodeIn(List<String> values) {
            addCriterion("money_direction_code in", values, "moneyDirectionCode");
            return (Criteria) this;
        }

        public Criteria andMoneyDirectionCodeNotIn(List<String> values) {
            addCriterion("money_direction_code not in", values, "moneyDirectionCode");
            return (Criteria) this;
        }

        public Criteria andMoneyDirectionCodeBetween(String value1, String value2) {
            addCriterion("money_direction_code between", value1, value2, "moneyDirectionCode");
            return (Criteria) this;
        }

        public Criteria andMoneyDirectionCodeNotBetween(String value1, String value2) {
            addCriterion("money_direction_code not between", value1, value2, "moneyDirectionCode");
            return (Criteria) this;
        }

        public Criteria andMoneyChannelCodeIsNull() {
            addCriterion("money_channel_code is null");
            return (Criteria) this;
        }

        public Criteria andMoneyChannelCodeIsNotNull() {
            addCriterion("money_channel_code is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyChannelCodeEqualTo(String value) {
            addCriterion("money_channel_code =", value, "moneyChannelCode");
            return (Criteria) this;
        }

        public Criteria andMoneyChannelCodeNotEqualTo(String value) {
            addCriterion("money_channel_code <>", value, "moneyChannelCode");
            return (Criteria) this;
        }

        public Criteria andMoneyChannelCodeGreaterThan(String value) {
            addCriterion("money_channel_code >", value, "moneyChannelCode");
            return (Criteria) this;
        }

        public Criteria andMoneyChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("money_channel_code >=", value, "moneyChannelCode");
            return (Criteria) this;
        }

        public Criteria andMoneyChannelCodeLessThan(String value) {
            addCriterion("money_channel_code <", value, "moneyChannelCode");
            return (Criteria) this;
        }

        public Criteria andMoneyChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("money_channel_code <=", value, "moneyChannelCode");
            return (Criteria) this;
        }

        public Criteria andMoneyChannelCodeLike(String value) {
            addCriterion("money_channel_code like", value, "moneyChannelCode");
            return (Criteria) this;
        }

        public Criteria andMoneyChannelCodeNotLike(String value) {
            addCriterion("money_channel_code not like", value, "moneyChannelCode");
            return (Criteria) this;
        }

        public Criteria andMoneyChannelCodeIn(List<String> values) {
            addCriterion("money_channel_code in", values, "moneyChannelCode");
            return (Criteria) this;
        }

        public Criteria andMoneyChannelCodeNotIn(List<String> values) {
            addCriterion("money_channel_code not in", values, "moneyChannelCode");
            return (Criteria) this;
        }

        public Criteria andMoneyChannelCodeBetween(String value1, String value2) {
            addCriterion("money_channel_code between", value1, value2, "moneyChannelCode");
            return (Criteria) this;
        }

        public Criteria andMoneyChannelCodeNotBetween(String value1, String value2) {
            addCriterion("money_channel_code not between", value1, value2, "moneyChannelCode");
            return (Criteria) this;
        }

        public Criteria andEventTimeIsNull() {
            addCriterion("event_time is null");
            return (Criteria) this;
        }

        public Criteria andEventTimeIsNotNull() {
            addCriterion("event_time is not null");
            return (Criteria) this;
        }

        public Criteria andEventTimeEqualTo(String value) {
            addCriterion("event_time =", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeNotEqualTo(String value) {
            addCriterion("event_time <>", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeGreaterThan(String value) {
            addCriterion("event_time >", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeGreaterThanOrEqualTo(String value) {
            addCriterion("event_time >=", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeLessThan(String value) {
            addCriterion("event_time <", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeLessThanOrEqualTo(String value) {
            addCriterion("event_time <=", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeLike(String value) {
            addCriterion("event_time like", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeNotLike(String value) {
            addCriterion("event_time not like", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeIn(List<String> values) {
            addCriterion("event_time in", values, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeNotIn(List<String> values) {
            addCriterion("event_time not in", values, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeBetween(String value1, String value2) {
            addCriterion("event_time between", value1, value2, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeNotBetween(String value1, String value2) {
            addCriterion("event_time not between", value1, value2, "eventTime");
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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