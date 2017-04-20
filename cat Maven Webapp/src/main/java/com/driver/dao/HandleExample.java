package com.driver.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HandleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HandleExample() {
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

        public Criteria andHandleIdIsNull() {
            addCriterion("handle_id is null");
            return (Criteria) this;
        }

        public Criteria andHandleIdIsNotNull() {
            addCriterion("handle_id is not null");
            return (Criteria) this;
        }

        public Criteria andHandleIdEqualTo(Integer value) {
            addCriterion("handle_id =", value, "handleId");
            return (Criteria) this;
        }

        public Criteria andHandleIdNotEqualTo(Integer value) {
            addCriterion("handle_id <>", value, "handleId");
            return (Criteria) this;
        }

        public Criteria andHandleIdGreaterThan(Integer value) {
            addCriterion("handle_id >", value, "handleId");
            return (Criteria) this;
        }

        public Criteria andHandleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("handle_id >=", value, "handleId");
            return (Criteria) this;
        }

        public Criteria andHandleIdLessThan(Integer value) {
            addCriterion("handle_id <", value, "handleId");
            return (Criteria) this;
        }

        public Criteria andHandleIdLessThanOrEqualTo(Integer value) {
            addCriterion("handle_id <=", value, "handleId");
            return (Criteria) this;
        }

        public Criteria andHandleIdIn(List<Integer> values) {
            addCriterion("handle_id in", values, "handleId");
            return (Criteria) this;
        }

        public Criteria andHandleIdNotIn(List<Integer> values) {
            addCriterion("handle_id not in", values, "handleId");
            return (Criteria) this;
        }

        public Criteria andHandleIdBetween(Integer value1, Integer value2) {
            addCriterion("handle_id between", value1, value2, "handleId");
            return (Criteria) this;
        }

        public Criteria andHandleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("handle_id not between", value1, value2, "handleId");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIsNull() {
            addCriterion("handle_time is null");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIsNotNull() {
            addCriterion("handle_time is not null");
            return (Criteria) this;
        }

        public Criteria andHandleTimeEqualTo(Date value) {
            addCriterion("handle_time =", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotEqualTo(Date value) {
            addCriterion("handle_time <>", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeGreaterThan(Date value) {
            addCriterion("handle_time >", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("handle_time >=", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeLessThan(Date value) {
            addCriterion("handle_time <", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeLessThanOrEqualTo(Date value) {
            addCriterion("handle_time <=", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIn(List<Date> values) {
            addCriterion("handle_time in", values, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotIn(List<Date> values) {
            addCriterion("handle_time not in", values, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeBetween(Date value1, Date value2) {
            addCriterion("handle_time between", value1, value2, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotBetween(Date value1, Date value2) {
            addCriterion("handle_time not between", value1, value2, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleManTypeIsNull() {
            addCriterion("handle_man_type is null");
            return (Criteria) this;
        }

        public Criteria andHandleManTypeIsNotNull() {
            addCriterion("handle_man_type is not null");
            return (Criteria) this;
        }

        public Criteria andHandleManTypeEqualTo(String value) {
            addCriterion("handle_man_type =", value, "handleManType");
            return (Criteria) this;
        }

        public Criteria andHandleManTypeNotEqualTo(String value) {
            addCriterion("handle_man_type <>", value, "handleManType");
            return (Criteria) this;
        }

        public Criteria andHandleManTypeGreaterThan(String value) {
            addCriterion("handle_man_type >", value, "handleManType");
            return (Criteria) this;
        }

        public Criteria andHandleManTypeGreaterThanOrEqualTo(String value) {
            addCriterion("handle_man_type >=", value, "handleManType");
            return (Criteria) this;
        }

        public Criteria andHandleManTypeLessThan(String value) {
            addCriterion("handle_man_type <", value, "handleManType");
            return (Criteria) this;
        }

        public Criteria andHandleManTypeLessThanOrEqualTo(String value) {
            addCriterion("handle_man_type <=", value, "handleManType");
            return (Criteria) this;
        }

        public Criteria andHandleManTypeLike(String value) {
            addCriterion("handle_man_type like", value, "handleManType");
            return (Criteria) this;
        }

        public Criteria andHandleManTypeNotLike(String value) {
            addCriterion("handle_man_type not like", value, "handleManType");
            return (Criteria) this;
        }

        public Criteria andHandleManTypeIn(List<String> values) {
            addCriterion("handle_man_type in", values, "handleManType");
            return (Criteria) this;
        }

        public Criteria andHandleManTypeNotIn(List<String> values) {
            addCriterion("handle_man_type not in", values, "handleManType");
            return (Criteria) this;
        }

        public Criteria andHandleManTypeBetween(String value1, String value2) {
            addCriterion("handle_man_type between", value1, value2, "handleManType");
            return (Criteria) this;
        }

        public Criteria andHandleManTypeNotBetween(String value1, String value2) {
            addCriterion("handle_man_type not between", value1, value2, "handleManType");
            return (Criteria) this;
        }

        public Criteria andHandleManNameIsNull() {
            addCriterion("handle_man_name is null");
            return (Criteria) this;
        }

        public Criteria andHandleManNameIsNotNull() {
            addCriterion("handle_man_name is not null");
            return (Criteria) this;
        }

        public Criteria andHandleManNameEqualTo(String value) {
            addCriterion("handle_man_name =", value, "handleManName");
            return (Criteria) this;
        }

        public Criteria andHandleManNameNotEqualTo(String value) {
            addCriterion("handle_man_name <>", value, "handleManName");
            return (Criteria) this;
        }

        public Criteria andHandleManNameGreaterThan(String value) {
            addCriterion("handle_man_name >", value, "handleManName");
            return (Criteria) this;
        }

        public Criteria andHandleManNameGreaterThanOrEqualTo(String value) {
            addCriterion("handle_man_name >=", value, "handleManName");
            return (Criteria) this;
        }

        public Criteria andHandleManNameLessThan(String value) {
            addCriterion("handle_man_name <", value, "handleManName");
            return (Criteria) this;
        }

        public Criteria andHandleManNameLessThanOrEqualTo(String value) {
            addCriterion("handle_man_name <=", value, "handleManName");
            return (Criteria) this;
        }

        public Criteria andHandleManNameLike(String value) {
            addCriterion("handle_man_name like", value, "handleManName");
            return (Criteria) this;
        }

        public Criteria andHandleManNameNotLike(String value) {
            addCriterion("handle_man_name not like", value, "handleManName");
            return (Criteria) this;
        }

        public Criteria andHandleManNameIn(List<String> values) {
            addCriterion("handle_man_name in", values, "handleManName");
            return (Criteria) this;
        }

        public Criteria andHandleManNameNotIn(List<String> values) {
            addCriterion("handle_man_name not in", values, "handleManName");
            return (Criteria) this;
        }

        public Criteria andHandleManNameBetween(String value1, String value2) {
            addCriterion("handle_man_name between", value1, value2, "handleManName");
            return (Criteria) this;
        }

        public Criteria andHandleManNameNotBetween(String value1, String value2) {
            addCriterion("handle_man_name not between", value1, value2, "handleManName");
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