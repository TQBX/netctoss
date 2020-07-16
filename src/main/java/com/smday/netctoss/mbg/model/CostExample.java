package com.smday.netctoss.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CostExample() {
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

        public Criteria andCostIdIsNull() {
            addCriterion("cost_id is null");
            return (Criteria) this;
        }

        public Criteria andCostIdIsNotNull() {
            addCriterion("cost_id is not null");
            return (Criteria) this;
        }

        public Criteria andCostIdEqualTo(Integer value) {
            addCriterion("cost_id =", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotEqualTo(Integer value) {
            addCriterion("cost_id <>", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdGreaterThan(Integer value) {
            addCriterion("cost_id >", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cost_id >=", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdLessThan(Integer value) {
            addCriterion("cost_id <", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdLessThanOrEqualTo(Integer value) {
            addCriterion("cost_id <=", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdIn(List<Integer> values) {
            addCriterion("cost_id in", values, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotIn(List<Integer> values) {
            addCriterion("cost_id not in", values, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdBetween(Integer value1, Integer value2) {
            addCriterion("cost_id between", value1, value2, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cost_id not between", value1, value2, "costId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andBaseDurationIsNull() {
            addCriterion("base_duration is null");
            return (Criteria) this;
        }

        public Criteria andBaseDurationIsNotNull() {
            addCriterion("base_duration is not null");
            return (Criteria) this;
        }

        public Criteria andBaseDurationEqualTo(Integer value) {
            addCriterion("base_duration =", value, "baseDuration");
            return (Criteria) this;
        }

        public Criteria andBaseDurationNotEqualTo(Integer value) {
            addCriterion("base_duration <>", value, "baseDuration");
            return (Criteria) this;
        }

        public Criteria andBaseDurationGreaterThan(Integer value) {
            addCriterion("base_duration >", value, "baseDuration");
            return (Criteria) this;
        }

        public Criteria andBaseDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("base_duration >=", value, "baseDuration");
            return (Criteria) this;
        }

        public Criteria andBaseDurationLessThan(Integer value) {
            addCriterion("base_duration <", value, "baseDuration");
            return (Criteria) this;
        }

        public Criteria andBaseDurationLessThanOrEqualTo(Integer value) {
            addCriterion("base_duration <=", value, "baseDuration");
            return (Criteria) this;
        }

        public Criteria andBaseDurationIn(List<Integer> values) {
            addCriterion("base_duration in", values, "baseDuration");
            return (Criteria) this;
        }

        public Criteria andBaseDurationNotIn(List<Integer> values) {
            addCriterion("base_duration not in", values, "baseDuration");
            return (Criteria) this;
        }

        public Criteria andBaseDurationBetween(Integer value1, Integer value2) {
            addCriterion("base_duration between", value1, value2, "baseDuration");
            return (Criteria) this;
        }

        public Criteria andBaseDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("base_duration not between", value1, value2, "baseDuration");
            return (Criteria) this;
        }

        public Criteria andBaseCostIsNull() {
            addCriterion("base_cost is null");
            return (Criteria) this;
        }

        public Criteria andBaseCostIsNotNull() {
            addCriterion("base_cost is not null");
            return (Criteria) this;
        }

        public Criteria andBaseCostEqualTo(Double value) {
            addCriterion("base_cost =", value, "baseCost");
            return (Criteria) this;
        }

        public Criteria andBaseCostNotEqualTo(Double value) {
            addCriterion("base_cost <>", value, "baseCost");
            return (Criteria) this;
        }

        public Criteria andBaseCostGreaterThan(Double value) {
            addCriterion("base_cost >", value, "baseCost");
            return (Criteria) this;
        }

        public Criteria andBaseCostGreaterThanOrEqualTo(Double value) {
            addCriterion("base_cost >=", value, "baseCost");
            return (Criteria) this;
        }

        public Criteria andBaseCostLessThan(Double value) {
            addCriterion("base_cost <", value, "baseCost");
            return (Criteria) this;
        }

        public Criteria andBaseCostLessThanOrEqualTo(Double value) {
            addCriterion("base_cost <=", value, "baseCost");
            return (Criteria) this;
        }

        public Criteria andBaseCostIn(List<Double> values) {
            addCriterion("base_cost in", values, "baseCost");
            return (Criteria) this;
        }

        public Criteria andBaseCostNotIn(List<Double> values) {
            addCriterion("base_cost not in", values, "baseCost");
            return (Criteria) this;
        }

        public Criteria andBaseCostBetween(Double value1, Double value2) {
            addCriterion("base_cost between", value1, value2, "baseCost");
            return (Criteria) this;
        }

        public Criteria andBaseCostNotBetween(Double value1, Double value2) {
            addCriterion("base_cost not between", value1, value2, "baseCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostIsNull() {
            addCriterion("unit_cost is null");
            return (Criteria) this;
        }

        public Criteria andUnitCostIsNotNull() {
            addCriterion("unit_cost is not null");
            return (Criteria) this;
        }

        public Criteria andUnitCostEqualTo(Double value) {
            addCriterion("unit_cost =", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostNotEqualTo(Double value) {
            addCriterion("unit_cost <>", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostGreaterThan(Double value) {
            addCriterion("unit_cost >", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostGreaterThanOrEqualTo(Double value) {
            addCriterion("unit_cost >=", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostLessThan(Double value) {
            addCriterion("unit_cost <", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostLessThanOrEqualTo(Double value) {
            addCriterion("unit_cost <=", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostIn(List<Double> values) {
            addCriterion("unit_cost in", values, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostNotIn(List<Double> values) {
            addCriterion("unit_cost not in", values, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostBetween(Double value1, Double value2) {
            addCriterion("unit_cost between", value1, value2, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostNotBetween(Double value1, Double value2) {
            addCriterion("unit_cost not between", value1, value2, "unitCost");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDescrIsNull() {
            addCriterion("descr is null");
            return (Criteria) this;
        }

        public Criteria andDescrIsNotNull() {
            addCriterion("descr is not null");
            return (Criteria) this;
        }

        public Criteria andDescrEqualTo(String value) {
            addCriterion("descr =", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotEqualTo(String value) {
            addCriterion("descr <>", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrGreaterThan(String value) {
            addCriterion("descr >", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrGreaterThanOrEqualTo(String value) {
            addCriterion("descr >=", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrLessThan(String value) {
            addCriterion("descr <", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrLessThanOrEqualTo(String value) {
            addCriterion("descr <=", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrLike(String value) {
            addCriterion("descr like", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotLike(String value) {
            addCriterion("descr not like", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrIn(List<String> values) {
            addCriterion("descr in", values, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotIn(List<String> values) {
            addCriterion("descr not in", values, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrBetween(String value1, String value2) {
            addCriterion("descr between", value1, value2, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotBetween(String value1, String value2) {
            addCriterion("descr not between", value1, value2, "descr");
            return (Criteria) this;
        }

        public Criteria andCreatimeIsNull() {
            addCriterion("creatime is null");
            return (Criteria) this;
        }

        public Criteria andCreatimeIsNotNull() {
            addCriterion("creatime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatimeEqualTo(Date value) {
            addCriterion("creatime =", value, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeNotEqualTo(Date value) {
            addCriterion("creatime <>", value, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeGreaterThan(Date value) {
            addCriterion("creatime >", value, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creatime >=", value, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeLessThan(Date value) {
            addCriterion("creatime <", value, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeLessThanOrEqualTo(Date value) {
            addCriterion("creatime <=", value, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeIn(List<Date> values) {
            addCriterion("creatime in", values, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeNotIn(List<Date> values) {
            addCriterion("creatime not in", values, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeBetween(Date value1, Date value2) {
            addCriterion("creatime between", value1, value2, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeNotBetween(Date value1, Date value2) {
            addCriterion("creatime not between", value1, value2, "creatime");
            return (Criteria) this;
        }

        public Criteria andStartimeIsNull() {
            addCriterion("startime is null");
            return (Criteria) this;
        }

        public Criteria andStartimeIsNotNull() {
            addCriterion("startime is not null");
            return (Criteria) this;
        }

        public Criteria andStartimeEqualTo(Date value) {
            addCriterion("startime =", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeNotEqualTo(Date value) {
            addCriterion("startime <>", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeGreaterThan(Date value) {
            addCriterion("startime >", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startime >=", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeLessThan(Date value) {
            addCriterion("startime <", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeLessThanOrEqualTo(Date value) {
            addCriterion("startime <=", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeIn(List<Date> values) {
            addCriterion("startime in", values, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeNotIn(List<Date> values) {
            addCriterion("startime not in", values, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeBetween(Date value1, Date value2) {
            addCriterion("startime between", value1, value2, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeNotBetween(Date value1, Date value2) {
            addCriterion("startime not between", value1, value2, "startime");
            return (Criteria) this;
        }

        public Criteria andCostTypeIsNull() {
            addCriterion("cost_type is null");
            return (Criteria) this;
        }

        public Criteria andCostTypeIsNotNull() {
            addCriterion("cost_type is not null");
            return (Criteria) this;
        }

        public Criteria andCostTypeEqualTo(String value) {
            addCriterion("cost_type =", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeNotEqualTo(String value) {
            addCriterion("cost_type <>", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeGreaterThan(String value) {
            addCriterion("cost_type >", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cost_type >=", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeLessThan(String value) {
            addCriterion("cost_type <", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeLessThanOrEqualTo(String value) {
            addCriterion("cost_type <=", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeLike(String value) {
            addCriterion("cost_type like", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeNotLike(String value) {
            addCriterion("cost_type not like", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeIn(List<String> values) {
            addCriterion("cost_type in", values, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeNotIn(List<String> values) {
            addCriterion("cost_type not in", values, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeBetween(String value1, String value2) {
            addCriterion("cost_type between", value1, value2, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeNotBetween(String value1, String value2) {
            addCriterion("cost_type not between", value1, value2, "costType");
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