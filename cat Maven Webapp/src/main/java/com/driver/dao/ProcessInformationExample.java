package com.driver.dao;

import java.util.ArrayList;
import java.util.List;

public class ProcessInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProcessInformationExample() {
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

        public Criteria andProcessorTypeIsNull() {
            addCriterion("processor_type is null");
            return (Criteria) this;
        }

        public Criteria andProcessorTypeIsNotNull() {
            addCriterion("processor_type is not null");
            return (Criteria) this;
        }

        public Criteria andProcessorTypeEqualTo(String value) {
            addCriterion("processor_type =", value, "processorType");
            return (Criteria) this;
        }

        public Criteria andProcessorTypeNotEqualTo(String value) {
            addCriterion("processor_type <>", value, "processorType");
            return (Criteria) this;
        }

        public Criteria andProcessorTypeGreaterThan(String value) {
            addCriterion("processor_type >", value, "processorType");
            return (Criteria) this;
        }

        public Criteria andProcessorTypeGreaterThanOrEqualTo(String value) {
            addCriterion("processor_type >=", value, "processorType");
            return (Criteria) this;
        }

        public Criteria andProcessorTypeLessThan(String value) {
            addCriterion("processor_type <", value, "processorType");
            return (Criteria) this;
        }

        public Criteria andProcessorTypeLessThanOrEqualTo(String value) {
            addCriterion("processor_type <=", value, "processorType");
            return (Criteria) this;
        }

        public Criteria andProcessorTypeLike(String value) {
            addCriterion("processor_type like", value, "processorType");
            return (Criteria) this;
        }

        public Criteria andProcessorTypeNotLike(String value) {
            addCriterion("processor_type not like", value, "processorType");
            return (Criteria) this;
        }

        public Criteria andProcessorTypeIn(List<String> values) {
            addCriterion("processor_type in", values, "processorType");
            return (Criteria) this;
        }

        public Criteria andProcessorTypeNotIn(List<String> values) {
            addCriterion("processor_type not in", values, "processorType");
            return (Criteria) this;
        }

        public Criteria andProcessorTypeBetween(String value1, String value2) {
            addCriterion("processor_type between", value1, value2, "processorType");
            return (Criteria) this;
        }

        public Criteria andProcessorTypeNotBetween(String value1, String value2) {
            addCriterion("processor_type not between", value1, value2, "processorType");
            return (Criteria) this;
        }

        public Criteria andProcessorIdIsNull() {
            addCriterion("processor_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessorIdIsNotNull() {
            addCriterion("processor_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessorIdEqualTo(String value) {
            addCriterion("processor_id =", value, "processorId");
            return (Criteria) this;
        }

        public Criteria andProcessorIdNotEqualTo(String value) {
            addCriterion("processor_id <>", value, "processorId");
            return (Criteria) this;
        }

        public Criteria andProcessorIdGreaterThan(String value) {
            addCriterion("processor_id >", value, "processorId");
            return (Criteria) this;
        }

        public Criteria andProcessorIdGreaterThanOrEqualTo(String value) {
            addCriterion("processor_id >=", value, "processorId");
            return (Criteria) this;
        }

        public Criteria andProcessorIdLessThan(String value) {
            addCriterion("processor_id <", value, "processorId");
            return (Criteria) this;
        }

        public Criteria andProcessorIdLessThanOrEqualTo(String value) {
            addCriterion("processor_id <=", value, "processorId");
            return (Criteria) this;
        }

        public Criteria andProcessorIdLike(String value) {
            addCriterion("processor_id like", value, "processorId");
            return (Criteria) this;
        }

        public Criteria andProcessorIdNotLike(String value) {
            addCriterion("processor_id not like", value, "processorId");
            return (Criteria) this;
        }

        public Criteria andProcessorIdIn(List<String> values) {
            addCriterion("processor_id in", values, "processorId");
            return (Criteria) this;
        }

        public Criteria andProcessorIdNotIn(List<String> values) {
            addCriterion("processor_id not in", values, "processorId");
            return (Criteria) this;
        }

        public Criteria andProcessorIdBetween(String value1, String value2) {
            addCriterion("processor_id between", value1, value2, "processorId");
            return (Criteria) this;
        }

        public Criteria andProcessorIdNotBetween(String value1, String value2) {
            addCriterion("processor_id not between", value1, value2, "processorId");
            return (Criteria) this;
        }

        public Criteria andProcessorNameIsNull() {
            addCriterion("processor_name is null");
            return (Criteria) this;
        }

        public Criteria andProcessorNameIsNotNull() {
            addCriterion("processor_name is not null");
            return (Criteria) this;
        }

        public Criteria andProcessorNameEqualTo(String value) {
            addCriterion("processor_name =", value, "processorName");
            return (Criteria) this;
        }

        public Criteria andProcessorNameNotEqualTo(String value) {
            addCriterion("processor_name <>", value, "processorName");
            return (Criteria) this;
        }

        public Criteria andProcessorNameGreaterThan(String value) {
            addCriterion("processor_name >", value, "processorName");
            return (Criteria) this;
        }

        public Criteria andProcessorNameGreaterThanOrEqualTo(String value) {
            addCriterion("processor_name >=", value, "processorName");
            return (Criteria) this;
        }

        public Criteria andProcessorNameLessThan(String value) {
            addCriterion("processor_name <", value, "processorName");
            return (Criteria) this;
        }

        public Criteria andProcessorNameLessThanOrEqualTo(String value) {
            addCriterion("processor_name <=", value, "processorName");
            return (Criteria) this;
        }

        public Criteria andProcessorNameLike(String value) {
            addCriterion("processor_name like", value, "processorName");
            return (Criteria) this;
        }

        public Criteria andProcessorNameNotLike(String value) {
            addCriterion("processor_name not like", value, "processorName");
            return (Criteria) this;
        }

        public Criteria andProcessorNameIn(List<String> values) {
            addCriterion("processor_name in", values, "processorName");
            return (Criteria) this;
        }

        public Criteria andProcessorNameNotIn(List<String> values) {
            addCriterion("processor_name not in", values, "processorName");
            return (Criteria) this;
        }

        public Criteria andProcessorNameBetween(String value1, String value2) {
            addCriterion("processor_name between", value1, value2, "processorName");
            return (Criteria) this;
        }

        public Criteria andProcessorNameNotBetween(String value1, String value2) {
            addCriterion("processor_name not between", value1, value2, "processorName");
            return (Criteria) this;
        }

        public Criteria andProcessorPhoneIsNull() {
            addCriterion("processor_phone is null");
            return (Criteria) this;
        }

        public Criteria andProcessorPhoneIsNotNull() {
            addCriterion("processor_phone is not null");
            return (Criteria) this;
        }

        public Criteria andProcessorPhoneEqualTo(String value) {
            addCriterion("processor_phone =", value, "processorPhone");
            return (Criteria) this;
        }

        public Criteria andProcessorPhoneNotEqualTo(String value) {
            addCriterion("processor_phone <>", value, "processorPhone");
            return (Criteria) this;
        }

        public Criteria andProcessorPhoneGreaterThan(String value) {
            addCriterion("processor_phone >", value, "processorPhone");
            return (Criteria) this;
        }

        public Criteria andProcessorPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("processor_phone >=", value, "processorPhone");
            return (Criteria) this;
        }

        public Criteria andProcessorPhoneLessThan(String value) {
            addCriterion("processor_phone <", value, "processorPhone");
            return (Criteria) this;
        }

        public Criteria andProcessorPhoneLessThanOrEqualTo(String value) {
            addCriterion("processor_phone <=", value, "processorPhone");
            return (Criteria) this;
        }

        public Criteria andProcessorPhoneLike(String value) {
            addCriterion("processor_phone like", value, "processorPhone");
            return (Criteria) this;
        }

        public Criteria andProcessorPhoneNotLike(String value) {
            addCriterion("processor_phone not like", value, "processorPhone");
            return (Criteria) this;
        }

        public Criteria andProcessorPhoneIn(List<String> values) {
            addCriterion("processor_phone in", values, "processorPhone");
            return (Criteria) this;
        }

        public Criteria andProcessorPhoneNotIn(List<String> values) {
            addCriterion("processor_phone not in", values, "processorPhone");
            return (Criteria) this;
        }

        public Criteria andProcessorPhoneBetween(String value1, String value2) {
            addCriterion("processor_phone between", value1, value2, "processorPhone");
            return (Criteria) this;
        }

        public Criteria andProcessorPhoneNotBetween(String value1, String value2) {
            addCriterion("processor_phone not between", value1, value2, "processorPhone");
            return (Criteria) this;
        }

        public Criteria andServeCityIsNull() {
            addCriterion("serve_city is null");
            return (Criteria) this;
        }

        public Criteria andServeCityIsNotNull() {
            addCriterion("serve_city is not null");
            return (Criteria) this;
        }

        public Criteria andServeCityEqualTo(String value) {
            addCriterion("serve_city =", value, "serveCity");
            return (Criteria) this;
        }

        public Criteria andServeCityNotEqualTo(String value) {
            addCriterion("serve_city <>", value, "serveCity");
            return (Criteria) this;
        }

        public Criteria andServeCityGreaterThan(String value) {
            addCriterion("serve_city >", value, "serveCity");
            return (Criteria) this;
        }

        public Criteria andServeCityGreaterThanOrEqualTo(String value) {
            addCriterion("serve_city >=", value, "serveCity");
            return (Criteria) this;
        }

        public Criteria andServeCityLessThan(String value) {
            addCriterion("serve_city <", value, "serveCity");
            return (Criteria) this;
        }

        public Criteria andServeCityLessThanOrEqualTo(String value) {
            addCriterion("serve_city <=", value, "serveCity");
            return (Criteria) this;
        }

        public Criteria andServeCityLike(String value) {
            addCriterion("serve_city like", value, "serveCity");
            return (Criteria) this;
        }

        public Criteria andServeCityNotLike(String value) {
            addCriterion("serve_city not like", value, "serveCity");
            return (Criteria) this;
        }

        public Criteria andServeCityIn(List<String> values) {
            addCriterion("serve_city in", values, "serveCity");
            return (Criteria) this;
        }

        public Criteria andServeCityNotIn(List<String> values) {
            addCriterion("serve_city not in", values, "serveCity");
            return (Criteria) this;
        }

        public Criteria andServeCityBetween(String value1, String value2) {
            addCriterion("serve_city between", value1, value2, "serveCity");
            return (Criteria) this;
        }

        public Criteria andServeCityNotBetween(String value1, String value2) {
            addCriterion("serve_city not between", value1, value2, "serveCity");
            return (Criteria) this;
        }

        public Criteria andPeccancyCityIsNull() {
            addCriterion("peccancy_city is null");
            return (Criteria) this;
        }

        public Criteria andPeccancyCityIsNotNull() {
            addCriterion("peccancy_city is not null");
            return (Criteria) this;
        }

        public Criteria andPeccancyCityEqualTo(String value) {
            addCriterion("peccancy_city =", value, "peccancyCity");
            return (Criteria) this;
        }

        public Criteria andPeccancyCityNotEqualTo(String value) {
            addCriterion("peccancy_city <>", value, "peccancyCity");
            return (Criteria) this;
        }

        public Criteria andPeccancyCityGreaterThan(String value) {
            addCriterion("peccancy_city >", value, "peccancyCity");
            return (Criteria) this;
        }

        public Criteria andPeccancyCityGreaterThanOrEqualTo(String value) {
            addCriterion("peccancy_city >=", value, "peccancyCity");
            return (Criteria) this;
        }

        public Criteria andPeccancyCityLessThan(String value) {
            addCriterion("peccancy_city <", value, "peccancyCity");
            return (Criteria) this;
        }

        public Criteria andPeccancyCityLessThanOrEqualTo(String value) {
            addCriterion("peccancy_city <=", value, "peccancyCity");
            return (Criteria) this;
        }

        public Criteria andPeccancyCityLike(String value) {
            addCriterion("peccancy_city like", value, "peccancyCity");
            return (Criteria) this;
        }

        public Criteria andPeccancyCityNotLike(String value) {
            addCriterion("peccancy_city not like", value, "peccancyCity");
            return (Criteria) this;
        }

        public Criteria andPeccancyCityIn(List<String> values) {
            addCriterion("peccancy_city in", values, "peccancyCity");
            return (Criteria) this;
        }

        public Criteria andPeccancyCityNotIn(List<String> values) {
            addCriterion("peccancy_city not in", values, "peccancyCity");
            return (Criteria) this;
        }

        public Criteria andPeccancyCityBetween(String value1, String value2) {
            addCriterion("peccancy_city between", value1, value2, "peccancyCity");
            return (Criteria) this;
        }

        public Criteria andPeccancyCityNotBetween(String value1, String value2) {
            addCriterion("peccancy_city not between", value1, value2, "peccancyCity");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("check_status is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("check_status is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(String value) {
            addCriterion("check_status =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(String value) {
            addCriterion("check_status <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(String value) {
            addCriterion("check_status >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(String value) {
            addCriterion("check_status >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(String value) {
            addCriterion("check_status <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(String value) {
            addCriterion("check_status <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLike(String value) {
            addCriterion("check_status like", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotLike(String value) {
            addCriterion("check_status not like", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<String> values) {
            addCriterion("check_status in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<String> values) {
            addCriterion("check_status not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(String value1, String value2) {
            addCriterion("check_status between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(String value1, String value2) {
            addCriterion("check_status not between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(String value) {
            addCriterion("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(String value) {
            addCriterion("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(String value) {
            addCriterion("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(String value) {
            addCriterion("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(String value) {
            addCriterion("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(String value) {
            addCriterion("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLike(String value) {
            addCriterion("check_time like", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotLike(String value) {
            addCriterion("check_time not like", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<String> values) {
            addCriterion("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<String> values) {
            addCriterion("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(String value1, String value2) {
            addCriterion("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(String value1, String value2) {
            addCriterion("check_time not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckMessageIsNull() {
            addCriterion("check_message is null");
            return (Criteria) this;
        }

        public Criteria andCheckMessageIsNotNull() {
            addCriterion("check_message is not null");
            return (Criteria) this;
        }

        public Criteria andCheckMessageEqualTo(String value) {
            addCriterion("check_message =", value, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageNotEqualTo(String value) {
            addCriterion("check_message <>", value, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageGreaterThan(String value) {
            addCriterion("check_message >", value, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageGreaterThanOrEqualTo(String value) {
            addCriterion("check_message >=", value, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageLessThan(String value) {
            addCriterion("check_message <", value, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageLessThanOrEqualTo(String value) {
            addCriterion("check_message <=", value, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageLike(String value) {
            addCriterion("check_message like", value, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageNotLike(String value) {
            addCriterion("check_message not like", value, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageIn(List<String> values) {
            addCriterion("check_message in", values, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageNotIn(List<String> values) {
            addCriterion("check_message not in", values, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageBetween(String value1, String value2) {
            addCriterion("check_message between", value1, value2, "checkMessage");
            return (Criteria) this;
        }

        public Criteria andCheckMessageNotBetween(String value1, String value2) {
            addCriterion("check_message not between", value1, value2, "checkMessage");
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