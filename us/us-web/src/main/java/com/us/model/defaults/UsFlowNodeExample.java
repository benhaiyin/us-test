package com.us.model.defaults;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsFlowNodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsFlowNodeExample() {
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

        public Criteria andFlowNodeIdIsNull() {
            addCriterion("flow_node_id is null");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIdIsNotNull() {
            addCriterion("flow_node_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIdEqualTo(String value) {
            addCriterion("flow_node_id =", value, "flowNodeId");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIdNotEqualTo(String value) {
            addCriterion("flow_node_id <>", value, "flowNodeId");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIdGreaterThan(String value) {
            addCriterion("flow_node_id >", value, "flowNodeId");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("flow_node_id >=", value, "flowNodeId");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIdLessThan(String value) {
            addCriterion("flow_node_id <", value, "flowNodeId");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIdLessThanOrEqualTo(String value) {
            addCriterion("flow_node_id <=", value, "flowNodeId");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIdLike(String value) {
            addCriterion("flow_node_id like", value, "flowNodeId");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIdNotLike(String value) {
            addCriterion("flow_node_id not like", value, "flowNodeId");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIdIn(List<String> values) {
            addCriterion("flow_node_id in", values, "flowNodeId");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIdNotIn(List<String> values) {
            addCriterion("flow_node_id not in", values, "flowNodeId");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIdBetween(String value1, String value2) {
            addCriterion("flow_node_id between", value1, value2, "flowNodeId");
            return (Criteria) this;
        }

        public Criteria andFlowNodeIdNotBetween(String value1, String value2) {
            addCriterion("flow_node_id not between", value1, value2, "flowNodeId");
            return (Criteria) this;
        }

        public Criteria andParentNodeIdIsNull() {
            addCriterion("parent_node_id is null");
            return (Criteria) this;
        }

        public Criteria andParentNodeIdIsNotNull() {
            addCriterion("parent_node_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentNodeIdEqualTo(String value) {
            addCriterion("parent_node_id =", value, "parentNodeId");
            return (Criteria) this;
        }

        public Criteria andParentNodeIdNotEqualTo(String value) {
            addCriterion("parent_node_id <>", value, "parentNodeId");
            return (Criteria) this;
        }

        public Criteria andParentNodeIdGreaterThan(String value) {
            addCriterion("parent_node_id >", value, "parentNodeId");
            return (Criteria) this;
        }

        public Criteria andParentNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_node_id >=", value, "parentNodeId");
            return (Criteria) this;
        }

        public Criteria andParentNodeIdLessThan(String value) {
            addCriterion("parent_node_id <", value, "parentNodeId");
            return (Criteria) this;
        }

        public Criteria andParentNodeIdLessThanOrEqualTo(String value) {
            addCriterion("parent_node_id <=", value, "parentNodeId");
            return (Criteria) this;
        }

        public Criteria andParentNodeIdLike(String value) {
            addCriterion("parent_node_id like", value, "parentNodeId");
            return (Criteria) this;
        }

        public Criteria andParentNodeIdNotLike(String value) {
            addCriterion("parent_node_id not like", value, "parentNodeId");
            return (Criteria) this;
        }

        public Criteria andParentNodeIdIn(List<String> values) {
            addCriterion("parent_node_id in", values, "parentNodeId");
            return (Criteria) this;
        }

        public Criteria andParentNodeIdNotIn(List<String> values) {
            addCriterion("parent_node_id not in", values, "parentNodeId");
            return (Criteria) this;
        }

        public Criteria andParentNodeIdBetween(String value1, String value2) {
            addCriterion("parent_node_id between", value1, value2, "parentNodeId");
            return (Criteria) this;
        }

        public Criteria andParentNodeIdNotBetween(String value1, String value2) {
            addCriterion("parent_node_id not between", value1, value2, "parentNodeId");
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

        public Criteria andHoursLimitIsNull() {
            addCriterion("hours_limit is null");
            return (Criteria) this;
        }

        public Criteria andHoursLimitIsNotNull() {
            addCriterion("hours_limit is not null");
            return (Criteria) this;
        }

        public Criteria andHoursLimitEqualTo(String value) {
            addCriterion("hours_limit =", value, "hoursLimit");
            return (Criteria) this;
        }

        public Criteria andHoursLimitNotEqualTo(String value) {
            addCriterion("hours_limit <>", value, "hoursLimit");
            return (Criteria) this;
        }

        public Criteria andHoursLimitGreaterThan(String value) {
            addCriterion("hours_limit >", value, "hoursLimit");
            return (Criteria) this;
        }

        public Criteria andHoursLimitGreaterThanOrEqualTo(String value) {
            addCriterion("hours_limit >=", value, "hoursLimit");
            return (Criteria) this;
        }

        public Criteria andHoursLimitLessThan(String value) {
            addCriterion("hours_limit <", value, "hoursLimit");
            return (Criteria) this;
        }

        public Criteria andHoursLimitLessThanOrEqualTo(String value) {
            addCriterion("hours_limit <=", value, "hoursLimit");
            return (Criteria) this;
        }

        public Criteria andHoursLimitLike(String value) {
            addCriterion("hours_limit like", value, "hoursLimit");
            return (Criteria) this;
        }

        public Criteria andHoursLimitNotLike(String value) {
            addCriterion("hours_limit not like", value, "hoursLimit");
            return (Criteria) this;
        }

        public Criteria andHoursLimitIn(List<String> values) {
            addCriterion("hours_limit in", values, "hoursLimit");
            return (Criteria) this;
        }

        public Criteria andHoursLimitNotIn(List<String> values) {
            addCriterion("hours_limit not in", values, "hoursLimit");
            return (Criteria) this;
        }

        public Criteria andHoursLimitBetween(String value1, String value2) {
            addCriterion("hours_limit between", value1, value2, "hoursLimit");
            return (Criteria) this;
        }

        public Criteria andHoursLimitNotBetween(String value1, String value2) {
            addCriterion("hours_limit not between", value1, value2, "hoursLimit");
            return (Criteria) this;
        }

        public Criteria andIgnoreHolidayIsNull() {
            addCriterion("ignore_holiday is null");
            return (Criteria) this;
        }

        public Criteria andIgnoreHolidayIsNotNull() {
            addCriterion("ignore_holiday is not null");
            return (Criteria) this;
        }

        public Criteria andIgnoreHolidayEqualTo(String value) {
            addCriterion("ignore_holiday =", value, "ignoreHoliday");
            return (Criteria) this;
        }

        public Criteria andIgnoreHolidayNotEqualTo(String value) {
            addCriterion("ignore_holiday <>", value, "ignoreHoliday");
            return (Criteria) this;
        }

        public Criteria andIgnoreHolidayGreaterThan(String value) {
            addCriterion("ignore_holiday >", value, "ignoreHoliday");
            return (Criteria) this;
        }

        public Criteria andIgnoreHolidayGreaterThanOrEqualTo(String value) {
            addCriterion("ignore_holiday >=", value, "ignoreHoliday");
            return (Criteria) this;
        }

        public Criteria andIgnoreHolidayLessThan(String value) {
            addCriterion("ignore_holiday <", value, "ignoreHoliday");
            return (Criteria) this;
        }

        public Criteria andIgnoreHolidayLessThanOrEqualTo(String value) {
            addCriterion("ignore_holiday <=", value, "ignoreHoliday");
            return (Criteria) this;
        }

        public Criteria andIgnoreHolidayLike(String value) {
            addCriterion("ignore_holiday like", value, "ignoreHoliday");
            return (Criteria) this;
        }

        public Criteria andIgnoreHolidayNotLike(String value) {
            addCriterion("ignore_holiday not like", value, "ignoreHoliday");
            return (Criteria) this;
        }

        public Criteria andIgnoreHolidayIn(List<String> values) {
            addCriterion("ignore_holiday in", values, "ignoreHoliday");
            return (Criteria) this;
        }

        public Criteria andIgnoreHolidayNotIn(List<String> values) {
            addCriterion("ignore_holiday not in", values, "ignoreHoliday");
            return (Criteria) this;
        }

        public Criteria andIgnoreHolidayBetween(String value1, String value2) {
            addCriterion("ignore_holiday between", value1, value2, "ignoreHoliday");
            return (Criteria) this;
        }

        public Criteria andIgnoreHolidayNotBetween(String value1, String value2) {
            addCriterion("ignore_holiday not between", value1, value2, "ignoreHoliday");
            return (Criteria) this;
        }

        public Criteria andFlowIdIsNull() {
            addCriterion("flow_id is null");
            return (Criteria) this;
        }

        public Criteria andFlowIdIsNotNull() {
            addCriterion("flow_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlowIdEqualTo(String value) {
            addCriterion("flow_id =", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotEqualTo(String value) {
            addCriterion("flow_id <>", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThan(String value) {
            addCriterion("flow_id >", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThanOrEqualTo(String value) {
            addCriterion("flow_id >=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThan(String value) {
            addCriterion("flow_id <", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThanOrEqualTo(String value) {
            addCriterion("flow_id <=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLike(String value) {
            addCriterion("flow_id like", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotLike(String value) {
            addCriterion("flow_id not like", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdIn(List<String> values) {
            addCriterion("flow_id in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotIn(List<String> values) {
            addCriterion("flow_id not in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdBetween(String value1, String value2) {
            addCriterion("flow_id between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotBetween(String value1, String value2) {
            addCriterion("flow_id not between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andLoopMethedCodeIsNull() {
            addCriterion("loop_methed_code is null");
            return (Criteria) this;
        }

        public Criteria andLoopMethedCodeIsNotNull() {
            addCriterion("loop_methed_code is not null");
            return (Criteria) this;
        }

        public Criteria andLoopMethedCodeEqualTo(String value) {
            addCriterion("loop_methed_code =", value, "loopMethedCode");
            return (Criteria) this;
        }

        public Criteria andLoopMethedCodeNotEqualTo(String value) {
            addCriterion("loop_methed_code <>", value, "loopMethedCode");
            return (Criteria) this;
        }

        public Criteria andLoopMethedCodeGreaterThan(String value) {
            addCriterion("loop_methed_code >", value, "loopMethedCode");
            return (Criteria) this;
        }

        public Criteria andLoopMethedCodeGreaterThanOrEqualTo(String value) {
            addCriterion("loop_methed_code >=", value, "loopMethedCode");
            return (Criteria) this;
        }

        public Criteria andLoopMethedCodeLessThan(String value) {
            addCriterion("loop_methed_code <", value, "loopMethedCode");
            return (Criteria) this;
        }

        public Criteria andLoopMethedCodeLessThanOrEqualTo(String value) {
            addCriterion("loop_methed_code <=", value, "loopMethedCode");
            return (Criteria) this;
        }

        public Criteria andLoopMethedCodeLike(String value) {
            addCriterion("loop_methed_code like", value, "loopMethedCode");
            return (Criteria) this;
        }

        public Criteria andLoopMethedCodeNotLike(String value) {
            addCriterion("loop_methed_code not like", value, "loopMethedCode");
            return (Criteria) this;
        }

        public Criteria andLoopMethedCodeIn(List<String> values) {
            addCriterion("loop_methed_code in", values, "loopMethedCode");
            return (Criteria) this;
        }

        public Criteria andLoopMethedCodeNotIn(List<String> values) {
            addCriterion("loop_methed_code not in", values, "loopMethedCode");
            return (Criteria) this;
        }

        public Criteria andLoopMethedCodeBetween(String value1, String value2) {
            addCriterion("loop_methed_code between", value1, value2, "loopMethedCode");
            return (Criteria) this;
        }

        public Criteria andLoopMethedCodeNotBetween(String value1, String value2) {
            addCriterion("loop_methed_code not between", value1, value2, "loopMethedCode");
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