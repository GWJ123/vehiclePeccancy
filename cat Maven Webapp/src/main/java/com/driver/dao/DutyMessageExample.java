package com.driver.dao;

import java.util.ArrayList;
import java.util.List;

public class DutyMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DutyMessageExample() {
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

        public Criteria andDutynoIsNull() {
            addCriterion("dutyNo is null");
            return (Criteria) this;
        }

        public Criteria andDutynoIsNotNull() {
            addCriterion("dutyNo is not null");
            return (Criteria) this;
        }

        public Criteria andDutynoEqualTo(String value) {
            addCriterion("dutyNo =", value, "dutyno");
            return (Criteria) this;
        }

        public Criteria andDutynoNotEqualTo(String value) {
            addCriterion("dutyNo <>", value, "dutyno");
            return (Criteria) this;
        }

        public Criteria andDutynoGreaterThan(String value) {
            addCriterion("dutyNo >", value, "dutyno");
            return (Criteria) this;
        }

        public Criteria andDutynoGreaterThanOrEqualTo(String value) {
            addCriterion("dutyNo >=", value, "dutyno");
            return (Criteria) this;
        }

        public Criteria andDutynoLessThan(String value) {
            addCriterion("dutyNo <", value, "dutyno");
            return (Criteria) this;
        }

        public Criteria andDutynoLessThanOrEqualTo(String value) {
            addCriterion("dutyNo <=", value, "dutyno");
            return (Criteria) this;
        }

        public Criteria andDutynoLike(String value) {
            addCriterion("dutyNo like", value, "dutyno");
            return (Criteria) this;
        }

        public Criteria andDutynoNotLike(String value) {
            addCriterion("dutyNo not like", value, "dutyno");
            return (Criteria) this;
        }

        public Criteria andDutynoIn(List<String> values) {
            addCriterion("dutyNo in", values, "dutyno");
            return (Criteria) this;
        }

        public Criteria andDutynoNotIn(List<String> values) {
            addCriterion("dutyNo not in", values, "dutyno");
            return (Criteria) this;
        }

        public Criteria andDutynoBetween(String value1, String value2) {
            addCriterion("dutyNo between", value1, value2, "dutyno");
            return (Criteria) this;
        }

        public Criteria andDutynoNotBetween(String value1, String value2) {
            addCriterion("dutyNo not between", value1, value2, "dutyno");
            return (Criteria) this;
        }

        public Criteria andDutytypeIsNull() {
            addCriterion("dutyType is null");
            return (Criteria) this;
        }

        public Criteria andDutytypeIsNotNull() {
            addCriterion("dutyType is not null");
            return (Criteria) this;
        }

        public Criteria andDutytypeEqualTo(String value) {
            addCriterion("dutyType =", value, "dutytype");
            return (Criteria) this;
        }

        public Criteria andDutytypeNotEqualTo(String value) {
            addCriterion("dutyType <>", value, "dutytype");
            return (Criteria) this;
        }

        public Criteria andDutytypeGreaterThan(String value) {
            addCriterion("dutyType >", value, "dutytype");
            return (Criteria) this;
        }

        public Criteria andDutytypeGreaterThanOrEqualTo(String value) {
            addCriterion("dutyType >=", value, "dutytype");
            return (Criteria) this;
        }

        public Criteria andDutytypeLessThan(String value) {
            addCriterion("dutyType <", value, "dutytype");
            return (Criteria) this;
        }

        public Criteria andDutytypeLessThanOrEqualTo(String value) {
            addCriterion("dutyType <=", value, "dutytype");
            return (Criteria) this;
        }

        public Criteria andDutytypeLike(String value) {
            addCriterion("dutyType like", value, "dutytype");
            return (Criteria) this;
        }

        public Criteria andDutytypeNotLike(String value) {
            addCriterion("dutyType not like", value, "dutytype");
            return (Criteria) this;
        }

        public Criteria andDutytypeIn(List<String> values) {
            addCriterion("dutyType in", values, "dutytype");
            return (Criteria) this;
        }

        public Criteria andDutytypeNotIn(List<String> values) {
            addCriterion("dutyType not in", values, "dutytype");
            return (Criteria) this;
        }

        public Criteria andDutytypeBetween(String value1, String value2) {
            addCriterion("dutyType between", value1, value2, "dutytype");
            return (Criteria) this;
        }

        public Criteria andDutytypeNotBetween(String value1, String value2) {
            addCriterion("dutyType not between", value1, value2, "dutytype");
            return (Criteria) this;
        }

        public Criteria andDutynameIsNull() {
            addCriterion("dutyName is null");
            return (Criteria) this;
        }

        public Criteria andDutynameIsNotNull() {
            addCriterion("dutyName is not null");
            return (Criteria) this;
        }

        public Criteria andDutynameEqualTo(String value) {
            addCriterion("dutyName =", value, "dutyname");
            return (Criteria) this;
        }

        public Criteria andDutynameNotEqualTo(String value) {
            addCriterion("dutyName <>", value, "dutyname");
            return (Criteria) this;
        }

        public Criteria andDutynameGreaterThan(String value) {
            addCriterion("dutyName >", value, "dutyname");
            return (Criteria) this;
        }

        public Criteria andDutynameGreaterThanOrEqualTo(String value) {
            addCriterion("dutyName >=", value, "dutyname");
            return (Criteria) this;
        }

        public Criteria andDutynameLessThan(String value) {
            addCriterion("dutyName <", value, "dutyname");
            return (Criteria) this;
        }

        public Criteria andDutynameLessThanOrEqualTo(String value) {
            addCriterion("dutyName <=", value, "dutyname");
            return (Criteria) this;
        }

        public Criteria andDutynameLike(String value) {
            addCriterion("dutyName like", value, "dutyname");
            return (Criteria) this;
        }

        public Criteria andDutynameNotLike(String value) {
            addCriterion("dutyName not like", value, "dutyname");
            return (Criteria) this;
        }

        public Criteria andDutynameIn(List<String> values) {
            addCriterion("dutyName in", values, "dutyname");
            return (Criteria) this;
        }

        public Criteria andDutynameNotIn(List<String> values) {
            addCriterion("dutyName not in", values, "dutyname");
            return (Criteria) this;
        }

        public Criteria andDutynameBetween(String value1, String value2) {
            addCriterion("dutyName between", value1, value2, "dutyname");
            return (Criteria) this;
        }

        public Criteria andDutynameNotBetween(String value1, String value2) {
            addCriterion("dutyName not between", value1, value2, "dutyname");
            return (Criteria) this;
        }

        public Criteria andDutytelIsNull() {
            addCriterion("dutyTel is null");
            return (Criteria) this;
        }

        public Criteria andDutytelIsNotNull() {
            addCriterion("dutyTel is not null");
            return (Criteria) this;
        }

        public Criteria andDutytelEqualTo(String value) {
            addCriterion("dutyTel =", value, "dutytel");
            return (Criteria) this;
        }

        public Criteria andDutytelNotEqualTo(String value) {
            addCriterion("dutyTel <>", value, "dutytel");
            return (Criteria) this;
        }

        public Criteria andDutytelGreaterThan(String value) {
            addCriterion("dutyTel >", value, "dutytel");
            return (Criteria) this;
        }

        public Criteria andDutytelGreaterThanOrEqualTo(String value) {
            addCriterion("dutyTel >=", value, "dutytel");
            return (Criteria) this;
        }

        public Criteria andDutytelLessThan(String value) {
            addCriterion("dutyTel <", value, "dutytel");
            return (Criteria) this;
        }

        public Criteria andDutytelLessThanOrEqualTo(String value) {
            addCriterion("dutyTel <=", value, "dutytel");
            return (Criteria) this;
        }

        public Criteria andDutytelLike(String value) {
            addCriterion("dutyTel like", value, "dutytel");
            return (Criteria) this;
        }

        public Criteria andDutytelNotLike(String value) {
            addCriterion("dutyTel not like", value, "dutytel");
            return (Criteria) this;
        }

        public Criteria andDutytelIn(List<String> values) {
            addCriterion("dutyTel in", values, "dutytel");
            return (Criteria) this;
        }

        public Criteria andDutytelNotIn(List<String> values) {
            addCriterion("dutyTel not in", values, "dutytel");
            return (Criteria) this;
        }

        public Criteria andDutytelBetween(String value1, String value2) {
            addCriterion("dutyTel between", value1, value2, "dutytel");
            return (Criteria) this;
        }

        public Criteria andDutytelNotBetween(String value1, String value2) {
            addCriterion("dutyTel not between", value1, value2, "dutytel");
            return (Criteria) this;
        }

        public Criteria andDutycityIsNull() {
            addCriterion("dutyCity is null");
            return (Criteria) this;
        }

        public Criteria andDutycityIsNotNull() {
            addCriterion("dutyCity is not null");
            return (Criteria) this;
        }

        public Criteria andDutycityEqualTo(String value) {
            addCriterion("dutyCity =", value, "dutycity");
            return (Criteria) this;
        }

        public Criteria andDutycityNotEqualTo(String value) {
            addCriterion("dutyCity <>", value, "dutycity");
            return (Criteria) this;
        }

        public Criteria andDutycityGreaterThan(String value) {
            addCriterion("dutyCity >", value, "dutycity");
            return (Criteria) this;
        }

        public Criteria andDutycityGreaterThanOrEqualTo(String value) {
            addCriterion("dutyCity >=", value, "dutycity");
            return (Criteria) this;
        }

        public Criteria andDutycityLessThan(String value) {
            addCriterion("dutyCity <", value, "dutycity");
            return (Criteria) this;
        }

        public Criteria andDutycityLessThanOrEqualTo(String value) {
            addCriterion("dutyCity <=", value, "dutycity");
            return (Criteria) this;
        }

        public Criteria andDutycityLike(String value) {
            addCriterion("dutyCity like", value, "dutycity");
            return (Criteria) this;
        }

        public Criteria andDutycityNotLike(String value) {
            addCriterion("dutyCity not like", value, "dutycity");
            return (Criteria) this;
        }

        public Criteria andDutycityIn(List<String> values) {
            addCriterion("dutyCity in", values, "dutycity");
            return (Criteria) this;
        }

        public Criteria andDutycityNotIn(List<String> values) {
            addCriterion("dutyCity not in", values, "dutycity");
            return (Criteria) this;
        }

        public Criteria andDutycityBetween(String value1, String value2) {
            addCriterion("dutyCity between", value1, value2, "dutycity");
            return (Criteria) this;
        }

        public Criteria andDutycityNotBetween(String value1, String value2) {
            addCriterion("dutyCity not between", value1, value2, "dutycity");
            return (Criteria) this;
        }

        public Criteria andDutyreasonIsNull() {
            addCriterion("dutyReason is null");
            return (Criteria) this;
        }

        public Criteria andDutyreasonIsNotNull() {
            addCriterion("dutyReason is not null");
            return (Criteria) this;
        }

        public Criteria andDutyreasonEqualTo(String value) {
            addCriterion("dutyReason =", value, "dutyreason");
            return (Criteria) this;
        }

        public Criteria andDutyreasonNotEqualTo(String value) {
            addCriterion("dutyReason <>", value, "dutyreason");
            return (Criteria) this;
        }

        public Criteria andDutyreasonGreaterThan(String value) {
            addCriterion("dutyReason >", value, "dutyreason");
            return (Criteria) this;
        }

        public Criteria andDutyreasonGreaterThanOrEqualTo(String value) {
            addCriterion("dutyReason >=", value, "dutyreason");
            return (Criteria) this;
        }

        public Criteria andDutyreasonLessThan(String value) {
            addCriterion("dutyReason <", value, "dutyreason");
            return (Criteria) this;
        }

        public Criteria andDutyreasonLessThanOrEqualTo(String value) {
            addCriterion("dutyReason <=", value, "dutyreason");
            return (Criteria) this;
        }

        public Criteria andDutyreasonLike(String value) {
            addCriterion("dutyReason like", value, "dutyreason");
            return (Criteria) this;
        }

        public Criteria andDutyreasonNotLike(String value) {
            addCriterion("dutyReason not like", value, "dutyreason");
            return (Criteria) this;
        }

        public Criteria andDutyreasonIn(List<String> values) {
            addCriterion("dutyReason in", values, "dutyreason");
            return (Criteria) this;
        }

        public Criteria andDutyreasonNotIn(List<String> values) {
            addCriterion("dutyReason not in", values, "dutyreason");
            return (Criteria) this;
        }

        public Criteria andDutyreasonBetween(String value1, String value2) {
            addCriterion("dutyReason between", value1, value2, "dutyreason");
            return (Criteria) this;
        }

        public Criteria andDutyreasonNotBetween(String value1, String value2) {
            addCriterion("dutyReason not between", value1, value2, "dutyreason");
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