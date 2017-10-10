package com.ultrapower.bomc.pojo;

import java.util.ArrayList;
import java.util.List;

public class RedisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RedisExample() {
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

        public Criteria andRedisidIsNull() {
            addCriterion("redisid is null");
            return (Criteria) this;
        }

        public Criteria andRedisidIsNotNull() {
            addCriterion("redisid is not null");
            return (Criteria) this;
        }

        public Criteria andRedisidEqualTo(Integer value) {
            addCriterion("redisid =", value, "redisid");
            return (Criteria) this;
        }

        public Criteria andRedisidNotEqualTo(Integer value) {
            addCriterion("redisid <>", value, "redisid");
            return (Criteria) this;
        }

        public Criteria andRedisidGreaterThan(Integer value) {
            addCriterion("redisid >", value, "redisid");
            return (Criteria) this;
        }

        public Criteria andRedisidGreaterThanOrEqualTo(Integer value) {
            addCriterion("redisid >=", value, "redisid");
            return (Criteria) this;
        }

        public Criteria andRedisidLessThan(Integer value) {
            addCriterion("redisid <", value, "redisid");
            return (Criteria) this;
        }

        public Criteria andRedisidLessThanOrEqualTo(Integer value) {
            addCriterion("redisid <=", value, "redisid");
            return (Criteria) this;
        }

        public Criteria andRedisidIn(List<Integer> values) {
            addCriterion("redisid in", values, "redisid");
            return (Criteria) this;
        }

        public Criteria andRedisidNotIn(List<Integer> values) {
            addCriterion("redisid not in", values, "redisid");
            return (Criteria) this;
        }

        public Criteria andRedisidBetween(Integer value1, Integer value2) {
            addCriterion("redisid between", value1, value2, "redisid");
            return (Criteria) this;
        }

        public Criteria andRedisidNotBetween(Integer value1, Integer value2) {
            addCriterion("redisid not between", value1, value2, "redisid");
            return (Criteria) this;
        }

        public Criteria andSysCpuRateIsNull() {
            addCriterion("sys_cpu_rate is null");
            return (Criteria) this;
        }

        public Criteria andSysCpuRateIsNotNull() {
            addCriterion("sys_cpu_rate is not null");
            return (Criteria) this;
        }

        public Criteria andSysCpuRateEqualTo(Float value) {
            addCriterion("sys_cpu_rate =", value, "sysCpuRate");
            return (Criteria) this;
        }

        public Criteria andSysCpuRateNotEqualTo(Float value) {
            addCriterion("sys_cpu_rate <>", value, "sysCpuRate");
            return (Criteria) this;
        }

        public Criteria andSysCpuRateGreaterThan(Float value) {
            addCriterion("sys_cpu_rate >", value, "sysCpuRate");
            return (Criteria) this;
        }

        public Criteria andSysCpuRateGreaterThanOrEqualTo(Float value) {
            addCriterion("sys_cpu_rate >=", value, "sysCpuRate");
            return (Criteria) this;
        }

        public Criteria andSysCpuRateLessThan(Float value) {
            addCriterion("sys_cpu_rate <", value, "sysCpuRate");
            return (Criteria) this;
        }

        public Criteria andSysCpuRateLessThanOrEqualTo(Float value) {
            addCriterion("sys_cpu_rate <=", value, "sysCpuRate");
            return (Criteria) this;
        }

        public Criteria andSysCpuRateIn(List<Float> values) {
            addCriterion("sys_cpu_rate in", values, "sysCpuRate");
            return (Criteria) this;
        }

        public Criteria andSysCpuRateNotIn(List<Float> values) {
            addCriterion("sys_cpu_rate not in", values, "sysCpuRate");
            return (Criteria) this;
        }

        public Criteria andSysCpuRateBetween(Float value1, Float value2) {
            addCriterion("sys_cpu_rate between", value1, value2, "sysCpuRate");
            return (Criteria) this;
        }

        public Criteria andSysCpuRateNotBetween(Float value1, Float value2) {
            addCriterion("sys_cpu_rate not between", value1, value2, "sysCpuRate");
            return (Criteria) this;
        }

        public Criteria andUsrCpuRateIsNull() {
            addCriterion("usr_cpu_rate is null");
            return (Criteria) this;
        }

        public Criteria andUsrCpuRateIsNotNull() {
            addCriterion("usr_cpu_rate is not null");
            return (Criteria) this;
        }

        public Criteria andUsrCpuRateEqualTo(Float value) {
            addCriterion("usr_cpu_rate =", value, "usrCpuRate");
            return (Criteria) this;
        }

        public Criteria andUsrCpuRateNotEqualTo(Float value) {
            addCriterion("usr_cpu_rate <>", value, "usrCpuRate");
            return (Criteria) this;
        }

        public Criteria andUsrCpuRateGreaterThan(Float value) {
            addCriterion("usr_cpu_rate >", value, "usrCpuRate");
            return (Criteria) this;
        }

        public Criteria andUsrCpuRateGreaterThanOrEqualTo(Float value) {
            addCriterion("usr_cpu_rate >=", value, "usrCpuRate");
            return (Criteria) this;
        }

        public Criteria andUsrCpuRateLessThan(Float value) {
            addCriterion("usr_cpu_rate <", value, "usrCpuRate");
            return (Criteria) this;
        }

        public Criteria andUsrCpuRateLessThanOrEqualTo(Float value) {
            addCriterion("usr_cpu_rate <=", value, "usrCpuRate");
            return (Criteria) this;
        }

        public Criteria andUsrCpuRateIn(List<Float> values) {
            addCriterion("usr_cpu_rate in", values, "usrCpuRate");
            return (Criteria) this;
        }

        public Criteria andUsrCpuRateNotIn(List<Float> values) {
            addCriterion("usr_cpu_rate not in", values, "usrCpuRate");
            return (Criteria) this;
        }

        public Criteria andUsrCpuRateBetween(Float value1, Float value2) {
            addCriterion("usr_cpu_rate between", value1, value2, "usrCpuRate");
            return (Criteria) this;
        }

        public Criteria andUsrCpuRateNotBetween(Float value1, Float value2) {
            addCriterion("usr_cpu_rate not between", value1, value2, "usrCpuRate");
            return (Criteria) this;
        }

        public Criteria andRedisNameIsNull() {
            addCriterion("redis_name is null");
            return (Criteria) this;
        }

        public Criteria andRedisNameIsNotNull() {
            addCriterion("redis_name is not null");
            return (Criteria) this;
        }

        public Criteria andRedisNameEqualTo(String value) {
            addCriterion("redis_name =", value, "redisName");
            return (Criteria) this;
        }

        public Criteria andRedisNameNotEqualTo(String value) {
            addCriterion("redis_name <>", value, "redisName");
            return (Criteria) this;
        }

        public Criteria andRedisNameGreaterThan(String value) {
            addCriterion("redis_name >", value, "redisName");
            return (Criteria) this;
        }

        public Criteria andRedisNameGreaterThanOrEqualTo(String value) {
            addCriterion("redis_name >=", value, "redisName");
            return (Criteria) this;
        }

        public Criteria andRedisNameLessThan(String value) {
            addCriterion("redis_name <", value, "redisName");
            return (Criteria) this;
        }

        public Criteria andRedisNameLessThanOrEqualTo(String value) {
            addCriterion("redis_name <=", value, "redisName");
            return (Criteria) this;
        }

        public Criteria andRedisNameLike(String value) {
            addCriterion("redis_name like", value, "redisName");
            return (Criteria) this;
        }

        public Criteria andRedisNameNotLike(String value) {
            addCriterion("redis_name not like", value, "redisName");
            return (Criteria) this;
        }

        public Criteria andRedisNameIn(List<String> values) {
            addCriterion("redis_name in", values, "redisName");
            return (Criteria) this;
        }

        public Criteria andRedisNameNotIn(List<String> values) {
            addCriterion("redis_name not in", values, "redisName");
            return (Criteria) this;
        }

        public Criteria andRedisNameBetween(String value1, String value2) {
            addCriterion("redis_name between", value1, value2, "redisName");
            return (Criteria) this;
        }

        public Criteria andRedisNameNotBetween(String value1, String value2) {
            addCriterion("redis_name not between", value1, value2, "redisName");
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