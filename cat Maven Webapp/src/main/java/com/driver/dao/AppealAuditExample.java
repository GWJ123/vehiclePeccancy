package com.driver.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppealAuditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppealAuditExample() {
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

        public Criteria andAppealIdIsNull() {
            addCriterion("appeal_id is null");
            return (Criteria) this;
        }

        public Criteria andAppealIdIsNotNull() {
            addCriterion("appeal_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppealIdEqualTo(Integer value) {
            addCriterion("appeal_id =", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdNotEqualTo(Integer value) {
            addCriterion("appeal_id <>", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdGreaterThan(Integer value) {
            addCriterion("appeal_id >", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("appeal_id >=", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdLessThan(Integer value) {
            addCriterion("appeal_id <", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdLessThanOrEqualTo(Integer value) {
            addCriterion("appeal_id <=", value, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdIn(List<Integer> values) {
            addCriterion("appeal_id in", values, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdNotIn(List<Integer> values) {
            addCriterion("appeal_id not in", values, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdBetween(Integer value1, Integer value2) {
            addCriterion("appeal_id between", value1, value2, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIdNotBetween(Integer value1, Integer value2) {
            addCriterion("appeal_id not between", value1, value2, "appealId");
            return (Criteria) this;
        }

        public Criteria andAppealIllegalIdIsNull() {
            addCriterion("appeal_illegal_id is null");
            return (Criteria) this;
        }

        public Criteria andAppealIllegalIdIsNotNull() {
            addCriterion("appeal_illegal_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppealIllegalIdEqualTo(Integer value) {
            addCriterion("appeal_illegal_id =", value, "appealIllegalId");
            return (Criteria) this;
        }

        public Criteria andAppealIllegalIdNotEqualTo(Integer value) {
            addCriterion("appeal_illegal_id <>", value, "appealIllegalId");
            return (Criteria) this;
        }

        public Criteria andAppealIllegalIdGreaterThan(Integer value) {
            addCriterion("appeal_illegal_id >", value, "appealIllegalId");
            return (Criteria) this;
        }

        public Criteria andAppealIllegalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("appeal_illegal_id >=", value, "appealIllegalId");
            return (Criteria) this;
        }

        public Criteria andAppealIllegalIdLessThan(Integer value) {
            addCriterion("appeal_illegal_id <", value, "appealIllegalId");
            return (Criteria) this;
        }

        public Criteria andAppealIllegalIdLessThanOrEqualTo(Integer value) {
            addCriterion("appeal_illegal_id <=", value, "appealIllegalId");
            return (Criteria) this;
        }

        public Criteria andAppealIllegalIdIn(List<Integer> values) {
            addCriterion("appeal_illegal_id in", values, "appealIllegalId");
            return (Criteria) this;
        }

        public Criteria andAppealIllegalIdNotIn(List<Integer> values) {
            addCriterion("appeal_illegal_id not in", values, "appealIllegalId");
            return (Criteria) this;
        }

        public Criteria andAppealIllegalIdBetween(Integer value1, Integer value2) {
            addCriterion("appeal_illegal_id between", value1, value2, "appealIllegalId");
            return (Criteria) this;
        }

        public Criteria andAppealIllegalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("appeal_illegal_id not between", value1, value2, "appealIllegalId");
            return (Criteria) this;
        }

        public Criteria andAppealStateIsNull() {
            addCriterion("appeal_state is null");
            return (Criteria) this;
        }

        public Criteria andAppealStateIsNotNull() {
            addCriterion("appeal_state is not null");
            return (Criteria) this;
        }

        public Criteria andAppealStateEqualTo(String value) {
            addCriterion("appeal_state =", value, "appealState");
            return (Criteria) this;
        }

        public Criteria andAppealStateNotEqualTo(String value) {
            addCriterion("appeal_state <>", value, "appealState");
            return (Criteria) this;
        }

        public Criteria andAppealStateGreaterThan(String value) {
            addCriterion("appeal_state >", value, "appealState");
            return (Criteria) this;
        }

        public Criteria andAppealStateGreaterThanOrEqualTo(String value) {
            addCriterion("appeal_state >=", value, "appealState");
            return (Criteria) this;
        }

        public Criteria andAppealStateLessThan(String value) {
            addCriterion("appeal_state <", value, "appealState");
            return (Criteria) this;
        }

        public Criteria andAppealStateLessThanOrEqualTo(String value) {
            addCriterion("appeal_state <=", value, "appealState");
            return (Criteria) this;
        }

        public Criteria andAppealStateLike(String value) {
            addCriterion("appeal_state like", value, "appealState");
            return (Criteria) this;
        }

        public Criteria andAppealStateNotLike(String value) {
            addCriterion("appeal_state not like", value, "appealState");
            return (Criteria) this;
        }

        public Criteria andAppealStateIn(List<String> values) {
            addCriterion("appeal_state in", values, "appealState");
            return (Criteria) this;
        }

        public Criteria andAppealStateNotIn(List<String> values) {
            addCriterion("appeal_state not in", values, "appealState");
            return (Criteria) this;
        }

        public Criteria andAppealStateBetween(String value1, String value2) {
            addCriterion("appeal_state between", value1, value2, "appealState");
            return (Criteria) this;
        }

        public Criteria andAppealStateNotBetween(String value1, String value2) {
            addCriterion("appeal_state not between", value1, value2, "appealState");
            return (Criteria) this;
        }

        public Criteria andAppealReasonIsNull() {
            addCriterion("appeal_reason is null");
            return (Criteria) this;
        }

        public Criteria andAppealReasonIsNotNull() {
            addCriterion("appeal_reason is not null");
            return (Criteria) this;
        }

        public Criteria andAppealReasonEqualTo(String value) {
            addCriterion("appeal_reason =", value, "appealReason");
            return (Criteria) this;
        }

        public Criteria andAppealReasonNotEqualTo(String value) {
            addCriterion("appeal_reason <>", value, "appealReason");
            return (Criteria) this;
        }

        public Criteria andAppealReasonGreaterThan(String value) {
            addCriterion("appeal_reason >", value, "appealReason");
            return (Criteria) this;
        }

        public Criteria andAppealReasonGreaterThanOrEqualTo(String value) {
            addCriterion("appeal_reason >=", value, "appealReason");
            return (Criteria) this;
        }

        public Criteria andAppealReasonLessThan(String value) {
            addCriterion("appeal_reason <", value, "appealReason");
            return (Criteria) this;
        }

        public Criteria andAppealReasonLessThanOrEqualTo(String value) {
            addCriterion("appeal_reason <=", value, "appealReason");
            return (Criteria) this;
        }

        public Criteria andAppealReasonLike(String value) {
            addCriterion("appeal_reason like", value, "appealReason");
            return (Criteria) this;
        }

        public Criteria andAppealReasonNotLike(String value) {
            addCriterion("appeal_reason not like", value, "appealReason");
            return (Criteria) this;
        }

        public Criteria andAppealReasonIn(List<String> values) {
            addCriterion("appeal_reason in", values, "appealReason");
            return (Criteria) this;
        }

        public Criteria andAppealReasonNotIn(List<String> values) {
            addCriterion("appeal_reason not in", values, "appealReason");
            return (Criteria) this;
        }

        public Criteria andAppealReasonBetween(String value1, String value2) {
            addCriterion("appeal_reason between", value1, value2, "appealReason");
            return (Criteria) this;
        }

        public Criteria andAppealReasonNotBetween(String value1, String value2) {
            addCriterion("appeal_reason not between", value1, value2, "appealReason");
            return (Criteria) this;
        }

        public Criteria andAppealTimeIsNull() {
            addCriterion("appeal_time is null");
            return (Criteria) this;
        }

        public Criteria andAppealTimeIsNotNull() {
            addCriterion("appeal_time is not null");
            return (Criteria) this;
        }

        public Criteria andAppealTimeEqualTo(Date value) {
            addCriterion("appeal_time =", value, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeNotEqualTo(Date value) {
            addCriterion("appeal_time <>", value, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeGreaterThan(Date value) {
            addCriterion("appeal_time >", value, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("appeal_time >=", value, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeLessThan(Date value) {
            addCriterion("appeal_time <", value, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeLessThanOrEqualTo(Date value) {
            addCriterion("appeal_time <=", value, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeIn(List<Date> values) {
            addCriterion("appeal_time in", values, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeNotIn(List<Date> values) {
            addCriterion("appeal_time not in", values, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeBetween(Date value1, Date value2) {
            addCriterion("appeal_time between", value1, value2, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeNotBetween(Date value1, Date value2) {
            addCriterion("appeal_time not between", value1, value2, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAuditManTypeIsNull() {
            addCriterion("audit_man_type is null");
            return (Criteria) this;
        }

        public Criteria andAuditManTypeIsNotNull() {
            addCriterion("audit_man_type is not null");
            return (Criteria) this;
        }

        public Criteria andAuditManTypeEqualTo(String value) {
            addCriterion("audit_man_type =", value, "auditManType");
            return (Criteria) this;
        }

        public Criteria andAuditManTypeNotEqualTo(String value) {
            addCriterion("audit_man_type <>", value, "auditManType");
            return (Criteria) this;
        }

        public Criteria andAuditManTypeGreaterThan(String value) {
            addCriterion("audit_man_type >", value, "auditManType");
            return (Criteria) this;
        }

        public Criteria andAuditManTypeGreaterThanOrEqualTo(String value) {
            addCriterion("audit_man_type >=", value, "auditManType");
            return (Criteria) this;
        }

        public Criteria andAuditManTypeLessThan(String value) {
            addCriterion("audit_man_type <", value, "auditManType");
            return (Criteria) this;
        }

        public Criteria andAuditManTypeLessThanOrEqualTo(String value) {
            addCriterion("audit_man_type <=", value, "auditManType");
            return (Criteria) this;
        }

        public Criteria andAuditManTypeLike(String value) {
            addCriterion("audit_man_type like", value, "auditManType");
            return (Criteria) this;
        }

        public Criteria andAuditManTypeNotLike(String value) {
            addCriterion("audit_man_type not like", value, "auditManType");
            return (Criteria) this;
        }

        public Criteria andAuditManTypeIn(List<String> values) {
            addCriterion("audit_man_type in", values, "auditManType");
            return (Criteria) this;
        }

        public Criteria andAuditManTypeNotIn(List<String> values) {
            addCriterion("audit_man_type not in", values, "auditManType");
            return (Criteria) this;
        }

        public Criteria andAuditManTypeBetween(String value1, String value2) {
            addCriterion("audit_man_type between", value1, value2, "auditManType");
            return (Criteria) this;
        }

        public Criteria andAuditManTypeNotBetween(String value1, String value2) {
            addCriterion("audit_man_type not between", value1, value2, "auditManType");
            return (Criteria) this;
        }

        public Criteria andAuditManIdIsNull() {
            addCriterion("audit_man_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditManIdIsNotNull() {
            addCriterion("audit_man_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditManIdEqualTo(Integer value) {
            addCriterion("audit_man_id =", value, "auditManId");
            return (Criteria) this;
        }

        public Criteria andAuditManIdNotEqualTo(Integer value) {
            addCriterion("audit_man_id <>", value, "auditManId");
            return (Criteria) this;
        }

        public Criteria andAuditManIdGreaterThan(Integer value) {
            addCriterion("audit_man_id >", value, "auditManId");
            return (Criteria) this;
        }

        public Criteria andAuditManIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_man_id >=", value, "auditManId");
            return (Criteria) this;
        }

        public Criteria andAuditManIdLessThan(Integer value) {
            addCriterion("audit_man_id <", value, "auditManId");
            return (Criteria) this;
        }

        public Criteria andAuditManIdLessThanOrEqualTo(Integer value) {
            addCriterion("audit_man_id <=", value, "auditManId");
            return (Criteria) this;
        }

        public Criteria andAuditManIdIn(List<Integer> values) {
            addCriterion("audit_man_id in", values, "auditManId");
            return (Criteria) this;
        }

        public Criteria andAuditManIdNotIn(List<Integer> values) {
            addCriterion("audit_man_id not in", values, "auditManId");
            return (Criteria) this;
        }

        public Criteria andAuditManIdBetween(Integer value1, Integer value2) {
            addCriterion("audit_man_id between", value1, value2, "auditManId");
            return (Criteria) this;
        }

        public Criteria andAuditManIdNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_man_id not between", value1, value2, "auditManId");
            return (Criteria) this;
        }

        public Criteria andAuditManNameIsNull() {
            addCriterion("audit_man_name is null");
            return (Criteria) this;
        }

        public Criteria andAuditManNameIsNotNull() {
            addCriterion("audit_man_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuditManNameEqualTo(String value) {
            addCriterion("audit_man_name =", value, "auditManName");
            return (Criteria) this;
        }

        public Criteria andAuditManNameNotEqualTo(String value) {
            addCriterion("audit_man_name <>", value, "auditManName");
            return (Criteria) this;
        }

        public Criteria andAuditManNameGreaterThan(String value) {
            addCriterion("audit_man_name >", value, "auditManName");
            return (Criteria) this;
        }

        public Criteria andAuditManNameGreaterThanOrEqualTo(String value) {
            addCriterion("audit_man_name >=", value, "auditManName");
            return (Criteria) this;
        }

        public Criteria andAuditManNameLessThan(String value) {
            addCriterion("audit_man_name <", value, "auditManName");
            return (Criteria) this;
        }

        public Criteria andAuditManNameLessThanOrEqualTo(String value) {
            addCriterion("audit_man_name <=", value, "auditManName");
            return (Criteria) this;
        }

        public Criteria andAuditManNameLike(String value) {
            addCriterion("audit_man_name like", value, "auditManName");
            return (Criteria) this;
        }

        public Criteria andAuditManNameNotLike(String value) {
            addCriterion("audit_man_name not like", value, "auditManName");
            return (Criteria) this;
        }

        public Criteria andAuditManNameIn(List<String> values) {
            addCriterion("audit_man_name in", values, "auditManName");
            return (Criteria) this;
        }

        public Criteria andAuditManNameNotIn(List<String> values) {
            addCriterion("audit_man_name not in", values, "auditManName");
            return (Criteria) this;
        }

        public Criteria andAuditManNameBetween(String value1, String value2) {
            addCriterion("audit_man_name between", value1, value2, "auditManName");
            return (Criteria) this;
        }

        public Criteria andAuditManNameNotBetween(String value1, String value2) {
            addCriterion("audit_man_name not between", value1, value2, "auditManName");
            return (Criteria) this;
        }

        public Criteria andAuditManTelIsNull() {
            addCriterion("audit_man_tel is null");
            return (Criteria) this;
        }

        public Criteria andAuditManTelIsNotNull() {
            addCriterion("audit_man_tel is not null");
            return (Criteria) this;
        }

        public Criteria andAuditManTelEqualTo(Integer value) {
            addCriterion("audit_man_tel =", value, "auditManTel");
            return (Criteria) this;
        }

        public Criteria andAuditManTelNotEqualTo(Integer value) {
            addCriterion("audit_man_tel <>", value, "auditManTel");
            return (Criteria) this;
        }

        public Criteria andAuditManTelGreaterThan(Integer value) {
            addCriterion("audit_man_tel >", value, "auditManTel");
            return (Criteria) this;
        }

        public Criteria andAuditManTelGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_man_tel >=", value, "auditManTel");
            return (Criteria) this;
        }

        public Criteria andAuditManTelLessThan(Integer value) {
            addCriterion("audit_man_tel <", value, "auditManTel");
            return (Criteria) this;
        }

        public Criteria andAuditManTelLessThanOrEqualTo(Integer value) {
            addCriterion("audit_man_tel <=", value, "auditManTel");
            return (Criteria) this;
        }

        public Criteria andAuditManTelIn(List<Integer> values) {
            addCriterion("audit_man_tel in", values, "auditManTel");
            return (Criteria) this;
        }

        public Criteria andAuditManTelNotIn(List<Integer> values) {
            addCriterion("audit_man_tel not in", values, "auditManTel");
            return (Criteria) this;
        }

        public Criteria andAuditManTelBetween(Integer value1, Integer value2) {
            addCriterion("audit_man_tel between", value1, value2, "auditManTel");
            return (Criteria) this;
        }

        public Criteria andAuditManTelNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_man_tel not between", value1, value2, "auditManTel");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(String value) {
            addCriterion("audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(String value) {
            addCriterion("audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(String value) {
            addCriterion("audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(String value) {
            addCriterion("audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(String value) {
            addCriterion("audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(String value) {
            addCriterion("audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLike(String value) {
            addCriterion("audit_state like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotLike(String value) {
            addCriterion("audit_state not like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<String> values) {
            addCriterion("audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<String> values) {
            addCriterion("audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(String value1, String value2) {
            addCriterion("audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(String value1, String value2) {
            addCriterion("audit_state not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditCommitTimeIsNull() {
            addCriterion("audit_commit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditCommitTimeIsNotNull() {
            addCriterion("audit_commit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditCommitTimeEqualTo(Date value) {
            addCriterion("audit_commit_time =", value, "auditCommitTime");
            return (Criteria) this;
        }

        public Criteria andAuditCommitTimeNotEqualTo(Date value) {
            addCriterion("audit_commit_time <>", value, "auditCommitTime");
            return (Criteria) this;
        }

        public Criteria andAuditCommitTimeGreaterThan(Date value) {
            addCriterion("audit_commit_time >", value, "auditCommitTime");
            return (Criteria) this;
        }

        public Criteria andAuditCommitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_commit_time >=", value, "auditCommitTime");
            return (Criteria) this;
        }

        public Criteria andAuditCommitTimeLessThan(Date value) {
            addCriterion("audit_commit_time <", value, "auditCommitTime");
            return (Criteria) this;
        }

        public Criteria andAuditCommitTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_commit_time <=", value, "auditCommitTime");
            return (Criteria) this;
        }

        public Criteria andAuditCommitTimeIn(List<Date> values) {
            addCriterion("audit_commit_time in", values, "auditCommitTime");
            return (Criteria) this;
        }

        public Criteria andAuditCommitTimeNotIn(List<Date> values) {
            addCriterion("audit_commit_time not in", values, "auditCommitTime");
            return (Criteria) this;
        }

        public Criteria andAuditCommitTimeBetween(Date value1, Date value2) {
            addCriterion("audit_commit_time between", value1, value2, "auditCommitTime");
            return (Criteria) this;
        }

        public Criteria andAuditCommitTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_commit_time not between", value1, value2, "auditCommitTime");
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