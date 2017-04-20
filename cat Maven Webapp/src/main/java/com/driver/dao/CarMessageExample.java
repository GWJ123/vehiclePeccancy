package com.driver.dao;

import java.util.ArrayList;
import java.util.List;

public class CarMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarMessageExample() {
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

        public Criteria andOffencenoIsNull() {
            addCriterion("offenceNo is null");
            return (Criteria) this;
        }

        public Criteria andOffencenoIsNotNull() {
            addCriterion("offenceNo is not null");
            return (Criteria) this;
        }

        public Criteria andOffencenoEqualTo(String value) {
            addCriterion("offenceNo =", value, "offenceno");
            return (Criteria) this;
        }

        public Criteria andOffencenoNotEqualTo(String value) {
            addCriterion("offenceNo <>", value, "offenceno");
            return (Criteria) this;
        }

        public Criteria andOffencenoGreaterThan(String value) {
            addCriterion("offenceNo >", value, "offenceno");
            return (Criteria) this;
        }

        public Criteria andOffencenoGreaterThanOrEqualTo(String value) {
            addCriterion("offenceNo >=", value, "offenceno");
            return (Criteria) this;
        }

        public Criteria andOffencenoLessThan(String value) {
            addCriterion("offenceNo <", value, "offenceno");
            return (Criteria) this;
        }

        public Criteria andOffencenoLessThanOrEqualTo(String value) {
            addCriterion("offenceNo <=", value, "offenceno");
            return (Criteria) this;
        }

        public Criteria andOffencenoLike(String value) {
            addCriterion("offenceNo like", value, "offenceno");
            return (Criteria) this;
        }

        public Criteria andOffencenoNotLike(String value) {
            addCriterion("offenceNo not like", value, "offenceno");
            return (Criteria) this;
        }

        public Criteria andOffencenoIn(List<String> values) {
            addCriterion("offenceNo in", values, "offenceno");
            return (Criteria) this;
        }

        public Criteria andOffencenoNotIn(List<String> values) {
            addCriterion("offenceNo not in", values, "offenceno");
            return (Criteria) this;
        }

        public Criteria andOffencenoBetween(String value1, String value2) {
            addCriterion("offenceNo between", value1, value2, "offenceno");
            return (Criteria) this;
        }

        public Criteria andOffencenoNotBetween(String value1, String value2) {
            addCriterion("offenceNo not between", value1, value2, "offenceno");
            return (Criteria) this;
        }

        public Criteria andOffencetypeIsNull() {
            addCriterion("offenceType is null");
            return (Criteria) this;
        }

        public Criteria andOffencetypeIsNotNull() {
            addCriterion("offenceType is not null");
            return (Criteria) this;
        }

        public Criteria andOffencetypeEqualTo(String value) {
            addCriterion("offenceType =", value, "offencetype");
            return (Criteria) this;
        }

        public Criteria andOffencetypeNotEqualTo(String value) {
            addCriterion("offenceType <>", value, "offencetype");
            return (Criteria) this;
        }

        public Criteria andOffencetypeGreaterThan(String value) {
            addCriterion("offenceType >", value, "offencetype");
            return (Criteria) this;
        }

        public Criteria andOffencetypeGreaterThanOrEqualTo(String value) {
            addCriterion("offenceType >=", value, "offencetype");
            return (Criteria) this;
        }

        public Criteria andOffencetypeLessThan(String value) {
            addCriterion("offenceType <", value, "offencetype");
            return (Criteria) this;
        }

        public Criteria andOffencetypeLessThanOrEqualTo(String value) {
            addCriterion("offenceType <=", value, "offencetype");
            return (Criteria) this;
        }

        public Criteria andOffencetypeLike(String value) {
            addCriterion("offenceType like", value, "offencetype");
            return (Criteria) this;
        }

        public Criteria andOffencetypeNotLike(String value) {
            addCriterion("offenceType not like", value, "offencetype");
            return (Criteria) this;
        }

        public Criteria andOffencetypeIn(List<String> values) {
            addCriterion("offenceType in", values, "offencetype");
            return (Criteria) this;
        }

        public Criteria andOffencetypeNotIn(List<String> values) {
            addCriterion("offenceType not in", values, "offencetype");
            return (Criteria) this;
        }

        public Criteria andOffencetypeBetween(String value1, String value2) {
            addCriterion("offenceType between", value1, value2, "offencetype");
            return (Criteria) this;
        }

        public Criteria andOffencetypeNotBetween(String value1, String value2) {
            addCriterion("offenceType not between", value1, value2, "offencetype");
            return (Criteria) this;
        }

        public Criteria andOffencenameIsNull() {
            addCriterion("offenceName is null");
            return (Criteria) this;
        }

        public Criteria andOffencenameIsNotNull() {
            addCriterion("offenceName is not null");
            return (Criteria) this;
        }

        public Criteria andOffencenameEqualTo(String value) {
            addCriterion("offenceName =", value, "offencename");
            return (Criteria) this;
        }

        public Criteria andOffencenameNotEqualTo(String value) {
            addCriterion("offenceName <>", value, "offencename");
            return (Criteria) this;
        }

        public Criteria andOffencenameGreaterThan(String value) {
            addCriterion("offenceName >", value, "offencename");
            return (Criteria) this;
        }

        public Criteria andOffencenameGreaterThanOrEqualTo(String value) {
            addCriterion("offenceName >=", value, "offencename");
            return (Criteria) this;
        }

        public Criteria andOffencenameLessThan(String value) {
            addCriterion("offenceName <", value, "offencename");
            return (Criteria) this;
        }

        public Criteria andOffencenameLessThanOrEqualTo(String value) {
            addCriterion("offenceName <=", value, "offencename");
            return (Criteria) this;
        }

        public Criteria andOffencenameLike(String value) {
            addCriterion("offenceName like", value, "offencename");
            return (Criteria) this;
        }

        public Criteria andOffencenameNotLike(String value) {
            addCriterion("offenceName not like", value, "offencename");
            return (Criteria) this;
        }

        public Criteria andOffencenameIn(List<String> values) {
            addCriterion("offenceName in", values, "offencename");
            return (Criteria) this;
        }

        public Criteria andOffencenameNotIn(List<String> values) {
            addCriterion("offenceName not in", values, "offencename");
            return (Criteria) this;
        }

        public Criteria andOffencenameBetween(String value1, String value2) {
            addCriterion("offenceName between", value1, value2, "offencename");
            return (Criteria) this;
        }

        public Criteria andOffencenameNotBetween(String value1, String value2) {
            addCriterion("offenceName not between", value1, value2, "offencename");
            return (Criteria) this;
        }

        public Criteria andOffencecityIsNull() {
            addCriterion("offenceCity is null");
            return (Criteria) this;
        }

        public Criteria andOffencecityIsNotNull() {
            addCriterion("offenceCity is not null");
            return (Criteria) this;
        }

        public Criteria andOffencecityEqualTo(String value) {
            addCriterion("offenceCity =", value, "offencecity");
            return (Criteria) this;
        }

        public Criteria andOffencecityNotEqualTo(String value) {
            addCriterion("offenceCity <>", value, "offencecity");
            return (Criteria) this;
        }

        public Criteria andOffencecityGreaterThan(String value) {
            addCriterion("offenceCity >", value, "offencecity");
            return (Criteria) this;
        }

        public Criteria andOffencecityGreaterThanOrEqualTo(String value) {
            addCriterion("offenceCity >=", value, "offencecity");
            return (Criteria) this;
        }

        public Criteria andOffencecityLessThan(String value) {
            addCriterion("offenceCity <", value, "offencecity");
            return (Criteria) this;
        }

        public Criteria andOffencecityLessThanOrEqualTo(String value) {
            addCriterion("offenceCity <=", value, "offencecity");
            return (Criteria) this;
        }

        public Criteria andOffencecityLike(String value) {
            addCriterion("offenceCity like", value, "offencecity");
            return (Criteria) this;
        }

        public Criteria andOffencecityNotLike(String value) {
            addCriterion("offenceCity not like", value, "offencecity");
            return (Criteria) this;
        }

        public Criteria andOffencecityIn(List<String> values) {
            addCriterion("offenceCity in", values, "offencecity");
            return (Criteria) this;
        }

        public Criteria andOffencecityNotIn(List<String> values) {
            addCriterion("offenceCity not in", values, "offencecity");
            return (Criteria) this;
        }

        public Criteria andOffencecityBetween(String value1, String value2) {
            addCriterion("offenceCity between", value1, value2, "offencecity");
            return (Criteria) this;
        }

        public Criteria andOffencecityNotBetween(String value1, String value2) {
            addCriterion("offenceCity not between", value1, value2, "offencecity");
            return (Criteria) this;
        }

        public Criteria andOffencesiteIsNull() {
            addCriterion("offenceSite is null");
            return (Criteria) this;
        }

        public Criteria andOffencesiteIsNotNull() {
            addCriterion("offenceSite is not null");
            return (Criteria) this;
        }

        public Criteria andOffencesiteEqualTo(String value) {
            addCriterion("offenceSite =", value, "offencesite");
            return (Criteria) this;
        }

        public Criteria andOffencesiteNotEqualTo(String value) {
            addCriterion("offenceSite <>", value, "offencesite");
            return (Criteria) this;
        }

        public Criteria andOffencesiteGreaterThan(String value) {
            addCriterion("offenceSite >", value, "offencesite");
            return (Criteria) this;
        }

        public Criteria andOffencesiteGreaterThanOrEqualTo(String value) {
            addCriterion("offenceSite >=", value, "offencesite");
            return (Criteria) this;
        }

        public Criteria andOffencesiteLessThan(String value) {
            addCriterion("offenceSite <", value, "offencesite");
            return (Criteria) this;
        }

        public Criteria andOffencesiteLessThanOrEqualTo(String value) {
            addCriterion("offenceSite <=", value, "offencesite");
            return (Criteria) this;
        }

        public Criteria andOffencesiteLike(String value) {
            addCriterion("offenceSite like", value, "offencesite");
            return (Criteria) this;
        }

        public Criteria andOffencesiteNotLike(String value) {
            addCriterion("offenceSite not like", value, "offencesite");
            return (Criteria) this;
        }

        public Criteria andOffencesiteIn(List<String> values) {
            addCriterion("offenceSite in", values, "offencesite");
            return (Criteria) this;
        }

        public Criteria andOffencesiteNotIn(List<String> values) {
            addCriterion("offenceSite not in", values, "offencesite");
            return (Criteria) this;
        }

        public Criteria andOffencesiteBetween(String value1, String value2) {
            addCriterion("offenceSite between", value1, value2, "offencesite");
            return (Criteria) this;
        }

        public Criteria andOffencesiteNotBetween(String value1, String value2) {
            addCriterion("offenceSite not between", value1, value2, "offencesite");
            return (Criteria) this;
        }

        public Criteria andOffencetimeIsNull() {
            addCriterion("offenceTime is null");
            return (Criteria) this;
        }

        public Criteria andOffencetimeIsNotNull() {
            addCriterion("offenceTime is not null");
            return (Criteria) this;
        }

        public Criteria andOffencetimeEqualTo(String value) {
            addCriterion("offenceTime =", value, "offencetime");
            return (Criteria) this;
        }

        public Criteria andOffencetimeNotEqualTo(String value) {
            addCriterion("offenceTime <>", value, "offencetime");
            return (Criteria) this;
        }

        public Criteria andOffencetimeGreaterThan(String value) {
            addCriterion("offenceTime >", value, "offencetime");
            return (Criteria) this;
        }

        public Criteria andOffencetimeGreaterThanOrEqualTo(String value) {
            addCriterion("offenceTime >=", value, "offencetime");
            return (Criteria) this;
        }

        public Criteria andOffencetimeLessThan(String value) {
            addCriterion("offenceTime <", value, "offencetime");
            return (Criteria) this;
        }

        public Criteria andOffencetimeLessThanOrEqualTo(String value) {
            addCriterion("offenceTime <=", value, "offencetime");
            return (Criteria) this;
        }

        public Criteria andOffencetimeLike(String value) {
            addCriterion("offenceTime like", value, "offencetime");
            return (Criteria) this;
        }

        public Criteria andOffencetimeNotLike(String value) {
            addCriterion("offenceTime not like", value, "offencetime");
            return (Criteria) this;
        }

        public Criteria andOffencetimeIn(List<String> values) {
            addCriterion("offenceTime in", values, "offencetime");
            return (Criteria) this;
        }

        public Criteria andOffencetimeNotIn(List<String> values) {
            addCriterion("offenceTime not in", values, "offencetime");
            return (Criteria) this;
        }

        public Criteria andOffencetimeBetween(String value1, String value2) {
            addCriterion("offenceTime between", value1, value2, "offencetime");
            return (Criteria) this;
        }

        public Criteria andOffencetimeNotBetween(String value1, String value2) {
            addCriterion("offenceTime not between", value1, value2, "offencetime");
            return (Criteria) this;
        }

        public Criteria andOffencestateIsNull() {
            addCriterion("offenceState is null");
            return (Criteria) this;
        }

        public Criteria andOffencestateIsNotNull() {
            addCriterion("offenceState is not null");
            return (Criteria) this;
        }

        public Criteria andOffencestateEqualTo(String value) {
            addCriterion("offenceState =", value, "offencestate");
            return (Criteria) this;
        }

        public Criteria andOffencestateNotEqualTo(String value) {
            addCriterion("offenceState <>", value, "offencestate");
            return (Criteria) this;
        }

        public Criteria andOffencestateGreaterThan(String value) {
            addCriterion("offenceState >", value, "offencestate");
            return (Criteria) this;
        }

        public Criteria andOffencestateGreaterThanOrEqualTo(String value) {
            addCriterion("offenceState >=", value, "offencestate");
            return (Criteria) this;
        }

        public Criteria andOffencestateLessThan(String value) {
            addCriterion("offenceState <", value, "offencestate");
            return (Criteria) this;
        }

        public Criteria andOffencestateLessThanOrEqualTo(String value) {
            addCriterion("offenceState <=", value, "offencestate");
            return (Criteria) this;
        }

        public Criteria andOffencestateLike(String value) {
            addCriterion("offenceState like", value, "offencestate");
            return (Criteria) this;
        }

        public Criteria andOffencestateNotLike(String value) {
            addCriterion("offenceState not like", value, "offencestate");
            return (Criteria) this;
        }

        public Criteria andOffencestateIn(List<String> values) {
            addCriterion("offenceState in", values, "offencestate");
            return (Criteria) this;
        }

        public Criteria andOffencestateNotIn(List<String> values) {
            addCriterion("offenceState not in", values, "offencestate");
            return (Criteria) this;
        }

        public Criteria andOffencestateBetween(String value1, String value2) {
            addCriterion("offenceState between", value1, value2, "offencestate");
            return (Criteria) this;
        }

        public Criteria andOffencestateNotBetween(String value1, String value2) {
            addCriterion("offenceState not between", value1, value2, "offencestate");
            return (Criteria) this;
        }

        public Criteria andOffenceoverdueIsNull() {
            addCriterion("offenceOverdue is null");
            return (Criteria) this;
        }

        public Criteria andOffenceoverdueIsNotNull() {
            addCriterion("offenceOverdue is not null");
            return (Criteria) this;
        }

        public Criteria andOffenceoverdueEqualTo(Integer value) {
            addCriterion("offenceOverdue =", value, "offenceoverdue");
            return (Criteria) this;
        }

        public Criteria andOffenceoverdueNotEqualTo(Integer value) {
            addCriterion("offenceOverdue <>", value, "offenceoverdue");
            return (Criteria) this;
        }

        public Criteria andOffenceoverdueGreaterThan(Integer value) {
            addCriterion("offenceOverdue >", value, "offenceoverdue");
            return (Criteria) this;
        }

        public Criteria andOffenceoverdueGreaterThanOrEqualTo(Integer value) {
            addCriterion("offenceOverdue >=", value, "offenceoverdue");
            return (Criteria) this;
        }

        public Criteria andOffenceoverdueLessThan(Integer value) {
            addCriterion("offenceOverdue <", value, "offenceoverdue");
            return (Criteria) this;
        }

        public Criteria andOffenceoverdueLessThanOrEqualTo(Integer value) {
            addCriterion("offenceOverdue <=", value, "offenceoverdue");
            return (Criteria) this;
        }

        public Criteria andOffenceoverdueIn(List<Integer> values) {
            addCriterion("offenceOverdue in", values, "offenceoverdue");
            return (Criteria) this;
        }

        public Criteria andOffenceoverdueNotIn(List<Integer> values) {
            addCriterion("offenceOverdue not in", values, "offenceoverdue");
            return (Criteria) this;
        }

        public Criteria andOffenceoverdueBetween(Integer value1, Integer value2) {
            addCriterion("offenceOverdue between", value1, value2, "offenceoverdue");
            return (Criteria) this;
        }

        public Criteria andOffenceoverdueNotBetween(Integer value1, Integer value2) {
            addCriterion("offenceOverdue not between", value1, value2, "offenceoverdue");
            return (Criteria) this;
        }

        public Criteria andPenaltypointIsNull() {
            addCriterion("penaltyPoint is null");
            return (Criteria) this;
        }

        public Criteria andPenaltypointIsNotNull() {
            addCriterion("penaltyPoint is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltypointEqualTo(String value) {
            addCriterion("penaltyPoint =", value, "penaltypoint");
            return (Criteria) this;
        }

        public Criteria andPenaltypointNotEqualTo(String value) {
            addCriterion("penaltyPoint <>", value, "penaltypoint");
            return (Criteria) this;
        }

        public Criteria andPenaltypointGreaterThan(String value) {
            addCriterion("penaltyPoint >", value, "penaltypoint");
            return (Criteria) this;
        }

        public Criteria andPenaltypointGreaterThanOrEqualTo(String value) {
            addCriterion("penaltyPoint >=", value, "penaltypoint");
            return (Criteria) this;
        }

        public Criteria andPenaltypointLessThan(String value) {
            addCriterion("penaltyPoint <", value, "penaltypoint");
            return (Criteria) this;
        }

        public Criteria andPenaltypointLessThanOrEqualTo(String value) {
            addCriterion("penaltyPoint <=", value, "penaltypoint");
            return (Criteria) this;
        }

        public Criteria andPenaltypointLike(String value) {
            addCriterion("penaltyPoint like", value, "penaltypoint");
            return (Criteria) this;
        }

        public Criteria andPenaltypointNotLike(String value) {
            addCriterion("penaltyPoint not like", value, "penaltypoint");
            return (Criteria) this;
        }

        public Criteria andPenaltypointIn(List<String> values) {
            addCriterion("penaltyPoint in", values, "penaltypoint");
            return (Criteria) this;
        }

        public Criteria andPenaltypointNotIn(List<String> values) {
            addCriterion("penaltyPoint not in", values, "penaltypoint");
            return (Criteria) this;
        }

        public Criteria andPenaltypointBetween(String value1, String value2) {
            addCriterion("penaltyPoint between", value1, value2, "penaltypoint");
            return (Criteria) this;
        }

        public Criteria andPenaltypointNotBetween(String value1, String value2) {
            addCriterion("penaltyPoint not between", value1, value2, "penaltypoint");
            return (Criteria) this;
        }

        public Criteria andPenaltyfeeIsNull() {
            addCriterion("penaltyFee is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyfeeIsNotNull() {
            addCriterion("penaltyFee is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyfeeEqualTo(String value) {
            addCriterion("penaltyFee =", value, "penaltyfee");
            return (Criteria) this;
        }

        public Criteria andPenaltyfeeNotEqualTo(String value) {
            addCriterion("penaltyFee <>", value, "penaltyfee");
            return (Criteria) this;
        }

        public Criteria andPenaltyfeeGreaterThan(String value) {
            addCriterion("penaltyFee >", value, "penaltyfee");
            return (Criteria) this;
        }

        public Criteria andPenaltyfeeGreaterThanOrEqualTo(String value) {
            addCriterion("penaltyFee >=", value, "penaltyfee");
            return (Criteria) this;
        }

        public Criteria andPenaltyfeeLessThan(String value) {
            addCriterion("penaltyFee <", value, "penaltyfee");
            return (Criteria) this;
        }

        public Criteria andPenaltyfeeLessThanOrEqualTo(String value) {
            addCriterion("penaltyFee <=", value, "penaltyfee");
            return (Criteria) this;
        }

        public Criteria andPenaltyfeeLike(String value) {
            addCriterion("penaltyFee like", value, "penaltyfee");
            return (Criteria) this;
        }

        public Criteria andPenaltyfeeNotLike(String value) {
            addCriterion("penaltyFee not like", value, "penaltyfee");
            return (Criteria) this;
        }

        public Criteria andPenaltyfeeIn(List<String> values) {
            addCriterion("penaltyFee in", values, "penaltyfee");
            return (Criteria) this;
        }

        public Criteria andPenaltyfeeNotIn(List<String> values) {
            addCriterion("penaltyFee not in", values, "penaltyfee");
            return (Criteria) this;
        }

        public Criteria andPenaltyfeeBetween(String value1, String value2) {
            addCriterion("penaltyFee between", value1, value2, "penaltyfee");
            return (Criteria) this;
        }

        public Criteria andPenaltyfeeNotBetween(String value1, String value2) {
            addCriterion("penaltyFee not between", value1, value2, "penaltyfee");
            return (Criteria) this;
        }

        public Criteria andVehiclenoIsNull() {
            addCriterion("vehicleNo is null");
            return (Criteria) this;
        }

        public Criteria andVehiclenoIsNotNull() {
            addCriterion("vehicleNo is not null");
            return (Criteria) this;
        }

        public Criteria andVehiclenoEqualTo(String value) {
            addCriterion("vehicleNo =", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoNotEqualTo(String value) {
            addCriterion("vehicleNo <>", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoGreaterThan(String value) {
            addCriterion("vehicleNo >", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoGreaterThanOrEqualTo(String value) {
            addCriterion("vehicleNo >=", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoLessThan(String value) {
            addCriterion("vehicleNo <", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoLessThanOrEqualTo(String value) {
            addCriterion("vehicleNo <=", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoLike(String value) {
            addCriterion("vehicleNo like", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoNotLike(String value) {
            addCriterion("vehicleNo not like", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoIn(List<String> values) {
            addCriterion("vehicleNo in", values, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoNotIn(List<String> values) {
            addCriterion("vehicleNo not in", values, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoBetween(String value1, String value2) {
            addCriterion("vehicleNo between", value1, value2, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoNotBetween(String value1, String value2) {
            addCriterion("vehicleNo not between", value1, value2, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andProviderIsNull() {
            addCriterion("provider is null");
            return (Criteria) this;
        }

        public Criteria andProviderIsNotNull() {
            addCriterion("provider is not null");
            return (Criteria) this;
        }

        public Criteria andProviderEqualTo(String value) {
            addCriterion("provider =", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotEqualTo(String value) {
            addCriterion("provider <>", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderGreaterThan(String value) {
            addCriterion("provider >", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderGreaterThanOrEqualTo(String value) {
            addCriterion("provider >=", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderLessThan(String value) {
            addCriterion("provider <", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderLessThanOrEqualTo(String value) {
            addCriterion("provider <=", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderLike(String value) {
            addCriterion("provider like", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotLike(String value) {
            addCriterion("provider not like", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderIn(List<String> values) {
            addCriterion("provider in", values, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotIn(List<String> values) {
            addCriterion("provider not in", values, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderBetween(String value1, String value2) {
            addCriterion("provider between", value1, value2, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotBetween(String value1, String value2) {
            addCriterion("provider not between", value1, value2, "provider");
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