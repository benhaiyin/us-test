package com.us.model.defaults;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsGoodsExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("goods_id like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("goods_id not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
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

        public Criteria andGoodsTypeCodeIsNull() {
            addCriterion("goods_type_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeCodeIsNotNull() {
            addCriterion("goods_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeCodeEqualTo(String value) {
            addCriterion("goods_type_code =", value, "goodsTypeCode");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeCodeNotEqualTo(String value) {
            addCriterion("goods_type_code <>", value, "goodsTypeCode");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeCodeGreaterThan(String value) {
            addCriterion("goods_type_code >", value, "goodsTypeCode");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_type_code >=", value, "goodsTypeCode");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeCodeLessThan(String value) {
            addCriterion("goods_type_code <", value, "goodsTypeCode");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("goods_type_code <=", value, "goodsTypeCode");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeCodeLike(String value) {
            addCriterion("goods_type_code like", value, "goodsTypeCode");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeCodeNotLike(String value) {
            addCriterion("goods_type_code not like", value, "goodsTypeCode");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeCodeIn(List<String> values) {
            addCriterion("goods_type_code in", values, "goodsTypeCode");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeCodeNotIn(List<String> values) {
            addCriterion("goods_type_code not in", values, "goodsTypeCode");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeCodeBetween(String value1, String value2) {
            addCriterion("goods_type_code between", value1, value2, "goodsTypeCode");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeCodeNotBetween(String value1, String value2) {
            addCriterion("goods_type_code not between", value1, value2, "goodsTypeCode");
            return (Criteria) this;
        }

        public Criteria andViewPriceIsNull() {
            addCriterion("view_price is null");
            return (Criteria) this;
        }

        public Criteria andViewPriceIsNotNull() {
            addCriterion("view_price is not null");
            return (Criteria) this;
        }

        public Criteria andViewPriceEqualTo(String value) {
            addCriterion("view_price =", value, "viewPrice");
            return (Criteria) this;
        }

        public Criteria andViewPriceNotEqualTo(String value) {
            addCriterion("view_price <>", value, "viewPrice");
            return (Criteria) this;
        }

        public Criteria andViewPriceGreaterThan(String value) {
            addCriterion("view_price >", value, "viewPrice");
            return (Criteria) this;
        }

        public Criteria andViewPriceGreaterThanOrEqualTo(String value) {
            addCriterion("view_price >=", value, "viewPrice");
            return (Criteria) this;
        }

        public Criteria andViewPriceLessThan(String value) {
            addCriterion("view_price <", value, "viewPrice");
            return (Criteria) this;
        }

        public Criteria andViewPriceLessThanOrEqualTo(String value) {
            addCriterion("view_price <=", value, "viewPrice");
            return (Criteria) this;
        }

        public Criteria andViewPriceLike(String value) {
            addCriterion("view_price like", value, "viewPrice");
            return (Criteria) this;
        }

        public Criteria andViewPriceNotLike(String value) {
            addCriterion("view_price not like", value, "viewPrice");
            return (Criteria) this;
        }

        public Criteria andViewPriceIn(List<String> values) {
            addCriterion("view_price in", values, "viewPrice");
            return (Criteria) this;
        }

        public Criteria andViewPriceNotIn(List<String> values) {
            addCriterion("view_price not in", values, "viewPrice");
            return (Criteria) this;
        }

        public Criteria andViewPriceBetween(String value1, String value2) {
            addCriterion("view_price between", value1, value2, "viewPrice");
            return (Criteria) this;
        }

        public Criteria andViewPriceNotBetween(String value1, String value2) {
            addCriterion("view_price not between", value1, value2, "viewPrice");
            return (Criteria) this;
        }

        public Criteria andViewAgencyPriceIsNull() {
            addCriterion("view_agency_price is null");
            return (Criteria) this;
        }

        public Criteria andViewAgencyPriceIsNotNull() {
            addCriterion("view_agency_price is not null");
            return (Criteria) this;
        }

        public Criteria andViewAgencyPriceEqualTo(String value) {
            addCriterion("view_agency_price =", value, "viewAgencyPrice");
            return (Criteria) this;
        }

        public Criteria andViewAgencyPriceNotEqualTo(String value) {
            addCriterion("view_agency_price <>", value, "viewAgencyPrice");
            return (Criteria) this;
        }

        public Criteria andViewAgencyPriceGreaterThan(String value) {
            addCriterion("view_agency_price >", value, "viewAgencyPrice");
            return (Criteria) this;
        }

        public Criteria andViewAgencyPriceGreaterThanOrEqualTo(String value) {
            addCriterion("view_agency_price >=", value, "viewAgencyPrice");
            return (Criteria) this;
        }

        public Criteria andViewAgencyPriceLessThan(String value) {
            addCriterion("view_agency_price <", value, "viewAgencyPrice");
            return (Criteria) this;
        }

        public Criteria andViewAgencyPriceLessThanOrEqualTo(String value) {
            addCriterion("view_agency_price <=", value, "viewAgencyPrice");
            return (Criteria) this;
        }

        public Criteria andViewAgencyPriceLike(String value) {
            addCriterion("view_agency_price like", value, "viewAgencyPrice");
            return (Criteria) this;
        }

        public Criteria andViewAgencyPriceNotLike(String value) {
            addCriterion("view_agency_price not like", value, "viewAgencyPrice");
            return (Criteria) this;
        }

        public Criteria andViewAgencyPriceIn(List<String> values) {
            addCriterion("view_agency_price in", values, "viewAgencyPrice");
            return (Criteria) this;
        }

        public Criteria andViewAgencyPriceNotIn(List<String> values) {
            addCriterion("view_agency_price not in", values, "viewAgencyPrice");
            return (Criteria) this;
        }

        public Criteria andViewAgencyPriceBetween(String value1, String value2) {
            addCriterion("view_agency_price between", value1, value2, "viewAgencyPrice");
            return (Criteria) this;
        }

        public Criteria andViewAgencyPriceNotBetween(String value1, String value2) {
            addCriterion("view_agency_price not between", value1, value2, "viewAgencyPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNull() {
            addCriterion("goods_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNotNull() {
            addCriterion("goods_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeEqualTo(String value) {
            addCriterion("goods_code =", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotEqualTo(String value) {
            addCriterion("goods_code <>", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThan(String value) {
            addCriterion("goods_code >", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_code >=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThan(String value) {
            addCriterion("goods_code <", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThanOrEqualTo(String value) {
            addCriterion("goods_code <=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLike(String value) {
            addCriterion("goods_code like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotLike(String value) {
            addCriterion("goods_code not like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIn(List<String> values) {
            addCriterion("goods_code in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotIn(List<String> values) {
            addCriterion("goods_code not in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeBetween(String value1, String value2) {
            addCriterion("goods_code between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotBetween(String value1, String value2) {
            addCriterion("goods_code not between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andAdvancePaymentIsNull() {
            addCriterion("advance_payment is null");
            return (Criteria) this;
        }

        public Criteria andAdvancePaymentIsNotNull() {
            addCriterion("advance_payment is not null");
            return (Criteria) this;
        }

        public Criteria andAdvancePaymentEqualTo(String value) {
            addCriterion("advance_payment =", value, "advancePayment");
            return (Criteria) this;
        }

        public Criteria andAdvancePaymentNotEqualTo(String value) {
            addCriterion("advance_payment <>", value, "advancePayment");
            return (Criteria) this;
        }

        public Criteria andAdvancePaymentGreaterThan(String value) {
            addCriterion("advance_payment >", value, "advancePayment");
            return (Criteria) this;
        }

        public Criteria andAdvancePaymentGreaterThanOrEqualTo(String value) {
            addCriterion("advance_payment >=", value, "advancePayment");
            return (Criteria) this;
        }

        public Criteria andAdvancePaymentLessThan(String value) {
            addCriterion("advance_payment <", value, "advancePayment");
            return (Criteria) this;
        }

        public Criteria andAdvancePaymentLessThanOrEqualTo(String value) {
            addCriterion("advance_payment <=", value, "advancePayment");
            return (Criteria) this;
        }

        public Criteria andAdvancePaymentLike(String value) {
            addCriterion("advance_payment like", value, "advancePayment");
            return (Criteria) this;
        }

        public Criteria andAdvancePaymentNotLike(String value) {
            addCriterion("advance_payment not like", value, "advancePayment");
            return (Criteria) this;
        }

        public Criteria andAdvancePaymentIn(List<String> values) {
            addCriterion("advance_payment in", values, "advancePayment");
            return (Criteria) this;
        }

        public Criteria andAdvancePaymentNotIn(List<String> values) {
            addCriterion("advance_payment not in", values, "advancePayment");
            return (Criteria) this;
        }

        public Criteria andAdvancePaymentBetween(String value1, String value2) {
            addCriterion("advance_payment between", value1, value2, "advancePayment");
            return (Criteria) this;
        }

        public Criteria andAdvancePaymentNotBetween(String value1, String value2) {
            addCriterion("advance_payment not between", value1, value2, "advancePayment");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIsNull() {
            addCriterion("is_verify is null");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIsNotNull() {
            addCriterion("is_verify is not null");
            return (Criteria) this;
        }

        public Criteria andIsVerifyEqualTo(String value) {
            addCriterion("is_verify =", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyNotEqualTo(String value) {
            addCriterion("is_verify <>", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyGreaterThan(String value) {
            addCriterion("is_verify >", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyGreaterThanOrEqualTo(String value) {
            addCriterion("is_verify >=", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyLessThan(String value) {
            addCriterion("is_verify <", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyLessThanOrEqualTo(String value) {
            addCriterion("is_verify <=", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyLike(String value) {
            addCriterion("is_verify like", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyNotLike(String value) {
            addCriterion("is_verify not like", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIn(List<String> values) {
            addCriterion("is_verify in", values, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyNotIn(List<String> values) {
            addCriterion("is_verify not in", values, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyBetween(String value1, String value2) {
            addCriterion("is_verify between", value1, value2, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyNotBetween(String value1, String value2) {
            addCriterion("is_verify not between", value1, value2, "isVerify");
            return (Criteria) this;
        }

        public Criteria andOnSaleIsNull() {
            addCriterion("on_sale is null");
            return (Criteria) this;
        }

        public Criteria andOnSaleIsNotNull() {
            addCriterion("on_sale is not null");
            return (Criteria) this;
        }

        public Criteria andOnSaleEqualTo(String value) {
            addCriterion("on_sale =", value, "onSale");
            return (Criteria) this;
        }

        public Criteria andOnSaleNotEqualTo(String value) {
            addCriterion("on_sale <>", value, "onSale");
            return (Criteria) this;
        }

        public Criteria andOnSaleGreaterThan(String value) {
            addCriterion("on_sale >", value, "onSale");
            return (Criteria) this;
        }

        public Criteria andOnSaleGreaterThanOrEqualTo(String value) {
            addCriterion("on_sale >=", value, "onSale");
            return (Criteria) this;
        }

        public Criteria andOnSaleLessThan(String value) {
            addCriterion("on_sale <", value, "onSale");
            return (Criteria) this;
        }

        public Criteria andOnSaleLessThanOrEqualTo(String value) {
            addCriterion("on_sale <=", value, "onSale");
            return (Criteria) this;
        }

        public Criteria andOnSaleLike(String value) {
            addCriterion("on_sale like", value, "onSale");
            return (Criteria) this;
        }

        public Criteria andOnSaleNotLike(String value) {
            addCriterion("on_sale not like", value, "onSale");
            return (Criteria) this;
        }

        public Criteria andOnSaleIn(List<String> values) {
            addCriterion("on_sale in", values, "onSale");
            return (Criteria) this;
        }

        public Criteria andOnSaleNotIn(List<String> values) {
            addCriterion("on_sale not in", values, "onSale");
            return (Criteria) this;
        }

        public Criteria andOnSaleBetween(String value1, String value2) {
            addCriterion("on_sale between", value1, value2, "onSale");
            return (Criteria) this;
        }

        public Criteria andOnSaleNotBetween(String value1, String value2) {
            addCriterion("on_sale not between", value1, value2, "onSale");
            return (Criteria) this;
        }

        public Criteria andIsAgentAbleIsNull() {
            addCriterion("is_agent_able is null");
            return (Criteria) this;
        }

        public Criteria andIsAgentAbleIsNotNull() {
            addCriterion("is_agent_able is not null");
            return (Criteria) this;
        }

        public Criteria andIsAgentAbleEqualTo(String value) {
            addCriterion("is_agent_able =", value, "isAgentAble");
            return (Criteria) this;
        }

        public Criteria andIsAgentAbleNotEqualTo(String value) {
            addCriterion("is_agent_able <>", value, "isAgentAble");
            return (Criteria) this;
        }

        public Criteria andIsAgentAbleGreaterThan(String value) {
            addCriterion("is_agent_able >", value, "isAgentAble");
            return (Criteria) this;
        }

        public Criteria andIsAgentAbleGreaterThanOrEqualTo(String value) {
            addCriterion("is_agent_able >=", value, "isAgentAble");
            return (Criteria) this;
        }

        public Criteria andIsAgentAbleLessThan(String value) {
            addCriterion("is_agent_able <", value, "isAgentAble");
            return (Criteria) this;
        }

        public Criteria andIsAgentAbleLessThanOrEqualTo(String value) {
            addCriterion("is_agent_able <=", value, "isAgentAble");
            return (Criteria) this;
        }

        public Criteria andIsAgentAbleLike(String value) {
            addCriterion("is_agent_able like", value, "isAgentAble");
            return (Criteria) this;
        }

        public Criteria andIsAgentAbleNotLike(String value) {
            addCriterion("is_agent_able not like", value, "isAgentAble");
            return (Criteria) this;
        }

        public Criteria andIsAgentAbleIn(List<String> values) {
            addCriterion("is_agent_able in", values, "isAgentAble");
            return (Criteria) this;
        }

        public Criteria andIsAgentAbleNotIn(List<String> values) {
            addCriterion("is_agent_able not in", values, "isAgentAble");
            return (Criteria) this;
        }

        public Criteria andIsAgentAbleBetween(String value1, String value2) {
            addCriterion("is_agent_able between", value1, value2, "isAgentAble");
            return (Criteria) this;
        }

        public Criteria andIsAgentAbleNotBetween(String value1, String value2) {
            addCriterion("is_agent_able not between", value1, value2, "isAgentAble");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("update_time like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("update_time not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andStockQuantityIsNull() {
            addCriterion("stock_quantity is null");
            return (Criteria) this;
        }

        public Criteria andStockQuantityIsNotNull() {
            addCriterion("stock_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andStockQuantityEqualTo(String value) {
            addCriterion("stock_quantity =", value, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityNotEqualTo(String value) {
            addCriterion("stock_quantity <>", value, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityGreaterThan(String value) {
            addCriterion("stock_quantity >", value, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityGreaterThanOrEqualTo(String value) {
            addCriterion("stock_quantity >=", value, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityLessThan(String value) {
            addCriterion("stock_quantity <", value, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityLessThanOrEqualTo(String value) {
            addCriterion("stock_quantity <=", value, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityLike(String value) {
            addCriterion("stock_quantity like", value, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityNotLike(String value) {
            addCriterion("stock_quantity not like", value, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityIn(List<String> values) {
            addCriterion("stock_quantity in", values, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityNotIn(List<String> values) {
            addCriterion("stock_quantity not in", values, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityBetween(String value1, String value2) {
            addCriterion("stock_quantity between", value1, value2, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityNotBetween(String value1, String value2) {
            addCriterion("stock_quantity not between", value1, value2, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andAllowOversellIsNull() {
            addCriterion("allow_oversell is null");
            return (Criteria) this;
        }

        public Criteria andAllowOversellIsNotNull() {
            addCriterion("allow_oversell is not null");
            return (Criteria) this;
        }

        public Criteria andAllowOversellEqualTo(String value) {
            addCriterion("allow_oversell =", value, "allowOversell");
            return (Criteria) this;
        }

        public Criteria andAllowOversellNotEqualTo(String value) {
            addCriterion("allow_oversell <>", value, "allowOversell");
            return (Criteria) this;
        }

        public Criteria andAllowOversellGreaterThan(String value) {
            addCriterion("allow_oversell >", value, "allowOversell");
            return (Criteria) this;
        }

        public Criteria andAllowOversellGreaterThanOrEqualTo(String value) {
            addCriterion("allow_oversell >=", value, "allowOversell");
            return (Criteria) this;
        }

        public Criteria andAllowOversellLessThan(String value) {
            addCriterion("allow_oversell <", value, "allowOversell");
            return (Criteria) this;
        }

        public Criteria andAllowOversellLessThanOrEqualTo(String value) {
            addCriterion("allow_oversell <=", value, "allowOversell");
            return (Criteria) this;
        }

        public Criteria andAllowOversellLike(String value) {
            addCriterion("allow_oversell like", value, "allowOversell");
            return (Criteria) this;
        }

        public Criteria andAllowOversellNotLike(String value) {
            addCriterion("allow_oversell not like", value, "allowOversell");
            return (Criteria) this;
        }

        public Criteria andAllowOversellIn(List<String> values) {
            addCriterion("allow_oversell in", values, "allowOversell");
            return (Criteria) this;
        }

        public Criteria andAllowOversellNotIn(List<String> values) {
            addCriterion("allow_oversell not in", values, "allowOversell");
            return (Criteria) this;
        }

        public Criteria andAllowOversellBetween(String value1, String value2) {
            addCriterion("allow_oversell between", value1, value2, "allowOversell");
            return (Criteria) this;
        }

        public Criteria andAllowOversellNotBetween(String value1, String value2) {
            addCriterion("allow_oversell not between", value1, value2, "allowOversell");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andKickbackIsNull() {
            addCriterion("kickback is null");
            return (Criteria) this;
        }

        public Criteria andKickbackIsNotNull() {
            addCriterion("kickback is not null");
            return (Criteria) this;
        }

        public Criteria andKickbackEqualTo(String value) {
            addCriterion("kickback =", value, "kickback");
            return (Criteria) this;
        }

        public Criteria andKickbackNotEqualTo(String value) {
            addCriterion("kickback <>", value, "kickback");
            return (Criteria) this;
        }

        public Criteria andKickbackGreaterThan(String value) {
            addCriterion("kickback >", value, "kickback");
            return (Criteria) this;
        }

        public Criteria andKickbackGreaterThanOrEqualTo(String value) {
            addCriterion("kickback >=", value, "kickback");
            return (Criteria) this;
        }

        public Criteria andKickbackLessThan(String value) {
            addCriterion("kickback <", value, "kickback");
            return (Criteria) this;
        }

        public Criteria andKickbackLessThanOrEqualTo(String value) {
            addCriterion("kickback <=", value, "kickback");
            return (Criteria) this;
        }

        public Criteria andKickbackLike(String value) {
            addCriterion("kickback like", value, "kickback");
            return (Criteria) this;
        }

        public Criteria andKickbackNotLike(String value) {
            addCriterion("kickback not like", value, "kickback");
            return (Criteria) this;
        }

        public Criteria andKickbackIn(List<String> values) {
            addCriterion("kickback in", values, "kickback");
            return (Criteria) this;
        }

        public Criteria andKickbackNotIn(List<String> values) {
            addCriterion("kickback not in", values, "kickback");
            return (Criteria) this;
        }

        public Criteria andKickbackBetween(String value1, String value2) {
            addCriterion("kickback between", value1, value2, "kickback");
            return (Criteria) this;
        }

        public Criteria andKickbackNotBetween(String value1, String value2) {
            addCriterion("kickback not between", value1, value2, "kickback");
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

        public Criteria andCountBaseIsNull() {
            addCriterion("count_base is null");
            return (Criteria) this;
        }

        public Criteria andCountBaseIsNotNull() {
            addCriterion("count_base is not null");
            return (Criteria) this;
        }

        public Criteria andCountBaseEqualTo(String value) {
            addCriterion("count_base =", value, "countBase");
            return (Criteria) this;
        }

        public Criteria andCountBaseNotEqualTo(String value) {
            addCriterion("count_base <>", value, "countBase");
            return (Criteria) this;
        }

        public Criteria andCountBaseGreaterThan(String value) {
            addCriterion("count_base >", value, "countBase");
            return (Criteria) this;
        }

        public Criteria andCountBaseGreaterThanOrEqualTo(String value) {
            addCriterion("count_base >=", value, "countBase");
            return (Criteria) this;
        }

        public Criteria andCountBaseLessThan(String value) {
            addCriterion("count_base <", value, "countBase");
            return (Criteria) this;
        }

        public Criteria andCountBaseLessThanOrEqualTo(String value) {
            addCriterion("count_base <=", value, "countBase");
            return (Criteria) this;
        }

        public Criteria andCountBaseLike(String value) {
            addCriterion("count_base like", value, "countBase");
            return (Criteria) this;
        }

        public Criteria andCountBaseNotLike(String value) {
            addCriterion("count_base not like", value, "countBase");
            return (Criteria) this;
        }

        public Criteria andCountBaseIn(List<String> values) {
            addCriterion("count_base in", values, "countBase");
            return (Criteria) this;
        }

        public Criteria andCountBaseNotIn(List<String> values) {
            addCriterion("count_base not in", values, "countBase");
            return (Criteria) this;
        }

        public Criteria andCountBaseBetween(String value1, String value2) {
            addCriterion("count_base between", value1, value2, "countBase");
            return (Criteria) this;
        }

        public Criteria andCountBaseNotBetween(String value1, String value2) {
            addCriterion("count_base not between", value1, value2, "countBase");
            return (Criteria) this;
        }

        public Criteria andDescAbstractIsNull() {
            addCriterion("desc_abstract is null");
            return (Criteria) this;
        }

        public Criteria andDescAbstractIsNotNull() {
            addCriterion("desc_abstract is not null");
            return (Criteria) this;
        }

        public Criteria andDescAbstractEqualTo(String value) {
            addCriterion("desc_abstract =", value, "descAbstract");
            return (Criteria) this;
        }

        public Criteria andDescAbstractNotEqualTo(String value) {
            addCriterion("desc_abstract <>", value, "descAbstract");
            return (Criteria) this;
        }

        public Criteria andDescAbstractGreaterThan(String value) {
            addCriterion("desc_abstract >", value, "descAbstract");
            return (Criteria) this;
        }

        public Criteria andDescAbstractGreaterThanOrEqualTo(String value) {
            addCriterion("desc_abstract >=", value, "descAbstract");
            return (Criteria) this;
        }

        public Criteria andDescAbstractLessThan(String value) {
            addCriterion("desc_abstract <", value, "descAbstract");
            return (Criteria) this;
        }

        public Criteria andDescAbstractLessThanOrEqualTo(String value) {
            addCriterion("desc_abstract <=", value, "descAbstract");
            return (Criteria) this;
        }

        public Criteria andDescAbstractLike(String value) {
            addCriterion("desc_abstract like", value, "descAbstract");
            return (Criteria) this;
        }

        public Criteria andDescAbstractNotLike(String value) {
            addCriterion("desc_abstract not like", value, "descAbstract");
            return (Criteria) this;
        }

        public Criteria andDescAbstractIn(List<String> values) {
            addCriterion("desc_abstract in", values, "descAbstract");
            return (Criteria) this;
        }

        public Criteria andDescAbstractNotIn(List<String> values) {
            addCriterion("desc_abstract not in", values, "descAbstract");
            return (Criteria) this;
        }

        public Criteria andDescAbstractBetween(String value1, String value2) {
            addCriterion("desc_abstract between", value1, value2, "descAbstract");
            return (Criteria) this;
        }

        public Criteria andDescAbstractNotBetween(String value1, String value2) {
            addCriterion("desc_abstract not between", value1, value2, "descAbstract");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Long value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Long value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Long value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Long value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Long value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Long value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Long> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Long> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Long value1, Long value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Long value1, Long value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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