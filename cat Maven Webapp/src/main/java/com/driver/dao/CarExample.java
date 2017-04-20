package com.driver.dao;

import java.util.ArrayList;
import java.util.List;

public class CarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCarNumberIsNull() {
            addCriterion("car_number is null");
            return (Criteria) this;
        }

        public Criteria andCarNumberIsNotNull() {
            addCriterion("car_number is not null");
            return (Criteria) this;
        }

        public Criteria andCarNumberEqualTo(String value) {
            addCriterion("car_number =", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotEqualTo(String value) {
            addCriterion("car_number <>", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberGreaterThan(String value) {
            addCriterion("car_number >", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberGreaterThanOrEqualTo(String value) {
            addCriterion("car_number >=", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLessThan(String value) {
            addCriterion("car_number <", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLessThanOrEqualTo(String value) {
            addCriterion("car_number <=", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLike(String value) {
            addCriterion("car_number like", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotLike(String value) {
            addCriterion("car_number not like", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberIn(List<String> values) {
            addCriterion("car_number in", values, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotIn(List<String> values) {
            addCriterion("car_number not in", values, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberBetween(String value1, String value2) {
            addCriterion("car_number between", value1, value2, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotBetween(String value1, String value2) {
            addCriterion("car_number not between", value1, value2, "carNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberIsNull() {
            addCriterion("frame_number is null");
            return (Criteria) this;
        }

        public Criteria andFrameNumberIsNotNull() {
            addCriterion("frame_number is not null");
            return (Criteria) this;
        }

        public Criteria andFrameNumberEqualTo(String value) {
            addCriterion("frame_number =", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberNotEqualTo(String value) {
            addCriterion("frame_number <>", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberGreaterThan(String value) {
            addCriterion("frame_number >", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberGreaterThanOrEqualTo(String value) {
            addCriterion("frame_number >=", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberLessThan(String value) {
            addCriterion("frame_number <", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberLessThanOrEqualTo(String value) {
            addCriterion("frame_number <=", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberLike(String value) {
            addCriterion("frame_number like", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberNotLike(String value) {
            addCriterion("frame_number not like", value, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberIn(List<String> values) {
            addCriterion("frame_number in", values, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberNotIn(List<String> values) {
            addCriterion("frame_number not in", values, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberBetween(String value1, String value2) {
            addCriterion("frame_number between", value1, value2, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andFrameNumberNotBetween(String value1, String value2) {
            addCriterion("frame_number not between", value1, value2, "frameNumber");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNull() {
            addCriterion("car_type is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNotNull() {
            addCriterion("car_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeEqualTo(String value) {
            addCriterion("car_type =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(String value) {
            addCriterion("car_type <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(String value) {
            addCriterion("car_type >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("car_type >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(String value) {
            addCriterion("car_type <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(String value) {
            addCriterion("car_type <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLike(String value) {
            addCriterion("car_type like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotLike(String value) {
            addCriterion("car_type not like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<String> values) {
            addCriterion("car_type in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<String> values) {
            addCriterion("car_type not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(String value1, String value2) {
            addCriterion("car_type between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(String value1, String value2) {
            addCriterion("car_type not between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarCityIsNull() {
            addCriterion("car_city is null");
            return (Criteria) this;
        }

        public Criteria andCarCityIsNotNull() {
            addCriterion("car_city is not null");
            return (Criteria) this;
        }

        public Criteria andCarCityEqualTo(String value) {
            addCriterion("car_city =", value, "carCity");
            return (Criteria) this;
        }

        public Criteria andCarCityNotEqualTo(String value) {
            addCriterion("car_city <>", value, "carCity");
            return (Criteria) this;
        }

        public Criteria andCarCityGreaterThan(String value) {
            addCriterion("car_city >", value, "carCity");
            return (Criteria) this;
        }

        public Criteria andCarCityGreaterThanOrEqualTo(String value) {
            addCriterion("car_city >=", value, "carCity");
            return (Criteria) this;
        }

        public Criteria andCarCityLessThan(String value) {
            addCriterion("car_city <", value, "carCity");
            return (Criteria) this;
        }

        public Criteria andCarCityLessThanOrEqualTo(String value) {
            addCriterion("car_city <=", value, "carCity");
            return (Criteria) this;
        }

        public Criteria andCarCityLike(String value) {
            addCriterion("car_city like", value, "carCity");
            return (Criteria) this;
        }

        public Criteria andCarCityNotLike(String value) {
            addCriterion("car_city not like", value, "carCity");
            return (Criteria) this;
        }

        public Criteria andCarCityIn(List<String> values) {
            addCriterion("car_city in", values, "carCity");
            return (Criteria) this;
        }

        public Criteria andCarCityNotIn(List<String> values) {
            addCriterion("car_city not in", values, "carCity");
            return (Criteria) this;
        }

        public Criteria andCarCityBetween(String value1, String value2) {
            addCriterion("car_city between", value1, value2, "carCity");
            return (Criteria) this;
        }

        public Criteria andCarCityNotBetween(String value1, String value2) {
            addCriterion("car_city not between", value1, value2, "carCity");
            return (Criteria) this;
        }

        public Criteria andCarUserIsNull() {
            addCriterion("car_user is null");
            return (Criteria) this;
        }

        public Criteria andCarUserIsNotNull() {
            addCriterion("car_user is not null");
            return (Criteria) this;
        }

        public Criteria andCarUserEqualTo(String value) {
            addCriterion("car_user =", value, "carUser");
            return (Criteria) this;
        }

        public Criteria andCarUserNotEqualTo(String value) {
            addCriterion("car_user <>", value, "carUser");
            return (Criteria) this;
        }

        public Criteria andCarUserGreaterThan(String value) {
            addCriterion("car_user >", value, "carUser");
            return (Criteria) this;
        }

        public Criteria andCarUserGreaterThanOrEqualTo(String value) {
            addCriterion("car_user >=", value, "carUser");
            return (Criteria) this;
        }

        public Criteria andCarUserLessThan(String value) {
            addCriterion("car_user <", value, "carUser");
            return (Criteria) this;
        }

        public Criteria andCarUserLessThanOrEqualTo(String value) {
            addCriterion("car_user <=", value, "carUser");
            return (Criteria) this;
        }

        public Criteria andCarUserLike(String value) {
            addCriterion("car_user like", value, "carUser");
            return (Criteria) this;
        }

        public Criteria andCarUserNotLike(String value) {
            addCriterion("car_user not like", value, "carUser");
            return (Criteria) this;
        }

        public Criteria andCarUserIn(List<String> values) {
            addCriterion("car_user in", values, "carUser");
            return (Criteria) this;
        }

        public Criteria andCarUserNotIn(List<String> values) {
            addCriterion("car_user not in", values, "carUser");
            return (Criteria) this;
        }

        public Criteria andCarUserBetween(String value1, String value2) {
            addCriterion("car_user between", value1, value2, "carUser");
            return (Criteria) this;
        }

        public Criteria andCarUserNotBetween(String value1, String value2) {
            addCriterion("car_user not between", value1, value2, "carUser");
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