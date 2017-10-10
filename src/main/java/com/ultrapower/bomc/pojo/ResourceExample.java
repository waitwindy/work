package com.ultrapower.bomc.pojo;

import java.util.ArrayList;
import java.util.List;

public class ResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResourceExample() {
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

        public Criteria andResIdIsNull() {
            addCriterion("RES_ID is null");
            return (Criteria) this;
        }

        public Criteria andResIdIsNotNull() {
            addCriterion("RES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andResIdEqualTo(Integer value) {
            addCriterion("RES_ID =", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotEqualTo(Integer value) {
            addCriterion("RES_ID <>", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThan(Integer value) {
            addCriterion("RES_ID >", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RES_ID >=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThan(Integer value) {
            addCriterion("RES_ID <", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThanOrEqualTo(Integer value) {
            addCriterion("RES_ID <=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdIn(List<Integer> values) {
            addCriterion("RES_ID in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotIn(List<Integer> values) {
            addCriterion("RES_ID not in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdBetween(Integer value1, Integer value2) {
            addCriterion("RES_ID between", value1, value2, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RES_ID not between", value1, value2, "resId");
            return (Criteria) this;
        }

        public Criteria andResNameIsNull() {
            addCriterion("RES_NAME is null");
            return (Criteria) this;
        }

        public Criteria andResNameIsNotNull() {
            addCriterion("RES_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andResNameEqualTo(String value) {
            addCriterion("RES_NAME =", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotEqualTo(String value) {
            addCriterion("RES_NAME <>", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameGreaterThan(String value) {
            addCriterion("RES_NAME >", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameGreaterThanOrEqualTo(String value) {
            addCriterion("RES_NAME >=", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLessThan(String value) {
            addCriterion("RES_NAME <", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLessThanOrEqualTo(String value) {
            addCriterion("RES_NAME <=", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLike(String value) {
            addCriterion("RES_NAME like", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotLike(String value) {
            addCriterion("RES_NAME not like", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameIn(List<String> values) {
            addCriterion("RES_NAME in", values, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotIn(List<String> values) {
            addCriterion("RES_NAME not in", values, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameBetween(String value1, String value2) {
            addCriterion("RES_NAME between", value1, value2, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotBetween(String value1, String value2) {
            addCriterion("RES_NAME not between", value1, value2, "resName");
            return (Criteria) this;
        }

        public Criteria andMoNameIsNull() {
            addCriterion("MO_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMoNameIsNotNull() {
            addCriterion("MO_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMoNameEqualTo(String value) {
            addCriterion("MO_NAME =", value, "moName");
            return (Criteria) this;
        }

        public Criteria andMoNameNotEqualTo(String value) {
            addCriterion("MO_NAME <>", value, "moName");
            return (Criteria) this;
        }

        public Criteria andMoNameGreaterThan(String value) {
            addCriterion("MO_NAME >", value, "moName");
            return (Criteria) this;
        }

        public Criteria andMoNameGreaterThanOrEqualTo(String value) {
            addCriterion("MO_NAME >=", value, "moName");
            return (Criteria) this;
        }

        public Criteria andMoNameLessThan(String value) {
            addCriterion("MO_NAME <", value, "moName");
            return (Criteria) this;
        }

        public Criteria andMoNameLessThanOrEqualTo(String value) {
            addCriterion("MO_NAME <=", value, "moName");
            return (Criteria) this;
        }

        public Criteria andMoNameLike(String value) {
            addCriterion("MO_NAME like", value, "moName");
            return (Criteria) this;
        }

        public Criteria andMoNameNotLike(String value) {
            addCriterion("MO_NAME not like", value, "moName");
            return (Criteria) this;
        }

        public Criteria andMoNameIn(List<String> values) {
            addCriterion("MO_NAME in", values, "moName");
            return (Criteria) this;
        }

        public Criteria andMoNameNotIn(List<String> values) {
            addCriterion("MO_NAME not in", values, "moName");
            return (Criteria) this;
        }

        public Criteria andMoNameBetween(String value1, String value2) {
            addCriterion("MO_NAME between", value1, value2, "moName");
            return (Criteria) this;
        }

        public Criteria andMoNameNotBetween(String value1, String value2) {
            addCriterion("MO_NAME not between", value1, value2, "moName");
            return (Criteria) this;
        }

        public Criteria andClassnamwIsNull() {
            addCriterion("CLASSNAMW is null");
            return (Criteria) this;
        }

        public Criteria andClassnamwIsNotNull() {
            addCriterion("CLASSNAMW is not null");
            return (Criteria) this;
        }

        public Criteria andClassnamwEqualTo(String value) {
            addCriterion("CLASSNAMW =", value, "classnamw");
            return (Criteria) this;
        }

        public Criteria andClassnamwNotEqualTo(String value) {
            addCriterion("CLASSNAMW <>", value, "classnamw");
            return (Criteria) this;
        }

        public Criteria andClassnamwGreaterThan(String value) {
            addCriterion("CLASSNAMW >", value, "classnamw");
            return (Criteria) this;
        }

        public Criteria andClassnamwGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSNAMW >=", value, "classnamw");
            return (Criteria) this;
        }

        public Criteria andClassnamwLessThan(String value) {
            addCriterion("CLASSNAMW <", value, "classnamw");
            return (Criteria) this;
        }

        public Criteria andClassnamwLessThanOrEqualTo(String value) {
            addCriterion("CLASSNAMW <=", value, "classnamw");
            return (Criteria) this;
        }

        public Criteria andClassnamwLike(String value) {
            addCriterion("CLASSNAMW like", value, "classnamw");
            return (Criteria) this;
        }

        public Criteria andClassnamwNotLike(String value) {
            addCriterion("CLASSNAMW not like", value, "classnamw");
            return (Criteria) this;
        }

        public Criteria andClassnamwIn(List<String> values) {
            addCriterion("CLASSNAMW in", values, "classnamw");
            return (Criteria) this;
        }

        public Criteria andClassnamwNotIn(List<String> values) {
            addCriterion("CLASSNAMW not in", values, "classnamw");
            return (Criteria) this;
        }

        public Criteria andClassnamwBetween(String value1, String value2) {
            addCriterion("CLASSNAMW between", value1, value2, "classnamw");
            return (Criteria) this;
        }

        public Criteria andClassnamwNotBetween(String value1, String value2) {
            addCriterion("CLASSNAMW not between", value1, value2, "classnamw");
            return (Criteria) this;
        }

        public Criteria andResIsinuseIsNull() {
            addCriterion("RES_ISINUSE is null");
            return (Criteria) this;
        }

        public Criteria andResIsinuseIsNotNull() {
            addCriterion("RES_ISINUSE is not null");
            return (Criteria) this;
        }

        public Criteria andResIsinuseEqualTo(Integer value) {
            addCriterion("RES_ISINUSE =", value, "resIsinuse");
            return (Criteria) this;
        }

        public Criteria andResIsinuseNotEqualTo(Integer value) {
            addCriterion("RES_ISINUSE <>", value, "resIsinuse");
            return (Criteria) this;
        }

        public Criteria andResIsinuseGreaterThan(Integer value) {
            addCriterion("RES_ISINUSE >", value, "resIsinuse");
            return (Criteria) this;
        }

        public Criteria andResIsinuseGreaterThanOrEqualTo(Integer value) {
            addCriterion("RES_ISINUSE >=", value, "resIsinuse");
            return (Criteria) this;
        }

        public Criteria andResIsinuseLessThan(Integer value) {
            addCriterion("RES_ISINUSE <", value, "resIsinuse");
            return (Criteria) this;
        }

        public Criteria andResIsinuseLessThanOrEqualTo(Integer value) {
            addCriterion("RES_ISINUSE <=", value, "resIsinuse");
            return (Criteria) this;
        }

        public Criteria andResIsinuseIn(List<Integer> values) {
            addCriterion("RES_ISINUSE in", values, "resIsinuse");
            return (Criteria) this;
        }

        public Criteria andResIsinuseNotIn(List<Integer> values) {
            addCriterion("RES_ISINUSE not in", values, "resIsinuse");
            return (Criteria) this;
        }

        public Criteria andResIsinuseBetween(Integer value1, Integer value2) {
            addCriterion("RES_ISINUSE between", value1, value2, "resIsinuse");
            return (Criteria) this;
        }

        public Criteria andResIsinuseNotBetween(Integer value1, Integer value2) {
            addCriterion("RES_ISINUSE not between", value1, value2, "resIsinuse");
            return (Criteria) this;
        }

        public Criteria andResIsdeletedIsNull() {
            addCriterion("RES_ISDELETED is null");
            return (Criteria) this;
        }

        public Criteria andResIsdeletedIsNotNull() {
            addCriterion("RES_ISDELETED is not null");
            return (Criteria) this;
        }

        public Criteria andResIsdeletedEqualTo(Integer value) {
            addCriterion("RES_ISDELETED =", value, "resIsdeleted");
            return (Criteria) this;
        }

        public Criteria andResIsdeletedNotEqualTo(Integer value) {
            addCriterion("RES_ISDELETED <>", value, "resIsdeleted");
            return (Criteria) this;
        }

        public Criteria andResIsdeletedGreaterThan(Integer value) {
            addCriterion("RES_ISDELETED >", value, "resIsdeleted");
            return (Criteria) this;
        }

        public Criteria andResIsdeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("RES_ISDELETED >=", value, "resIsdeleted");
            return (Criteria) this;
        }

        public Criteria andResIsdeletedLessThan(Integer value) {
            addCriterion("RES_ISDELETED <", value, "resIsdeleted");
            return (Criteria) this;
        }

        public Criteria andResIsdeletedLessThanOrEqualTo(Integer value) {
            addCriterion("RES_ISDELETED <=", value, "resIsdeleted");
            return (Criteria) this;
        }

        public Criteria andResIsdeletedIn(List<Integer> values) {
            addCriterion("RES_ISDELETED in", values, "resIsdeleted");
            return (Criteria) this;
        }

        public Criteria andResIsdeletedNotIn(List<Integer> values) {
            addCriterion("RES_ISDELETED not in", values, "resIsdeleted");
            return (Criteria) this;
        }

        public Criteria andResIsdeletedBetween(Integer value1, Integer value2) {
            addCriterion("RES_ISDELETED between", value1, value2, "resIsdeleted");
            return (Criteria) this;
        }

        public Criteria andResIsdeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("RES_ISDELETED not between", value1, value2, "resIsdeleted");
            return (Criteria) this;
        }

        public Criteria andResDescrIsNull() {
            addCriterion("RES_DESCR is null");
            return (Criteria) this;
        }

        public Criteria andResDescrIsNotNull() {
            addCriterion("RES_DESCR is not null");
            return (Criteria) this;
        }

        public Criteria andResDescrEqualTo(String value) {
            addCriterion("RES_DESCR =", value, "resDescr");
            return (Criteria) this;
        }

        public Criteria andResDescrNotEqualTo(String value) {
            addCriterion("RES_DESCR <>", value, "resDescr");
            return (Criteria) this;
        }

        public Criteria andResDescrGreaterThan(String value) {
            addCriterion("RES_DESCR >", value, "resDescr");
            return (Criteria) this;
        }

        public Criteria andResDescrGreaterThanOrEqualTo(String value) {
            addCriterion("RES_DESCR >=", value, "resDescr");
            return (Criteria) this;
        }

        public Criteria andResDescrLessThan(String value) {
            addCriterion("RES_DESCR <", value, "resDescr");
            return (Criteria) this;
        }

        public Criteria andResDescrLessThanOrEqualTo(String value) {
            addCriterion("RES_DESCR <=", value, "resDescr");
            return (Criteria) this;
        }

        public Criteria andResDescrLike(String value) {
            addCriterion("RES_DESCR like", value, "resDescr");
            return (Criteria) this;
        }

        public Criteria andResDescrNotLike(String value) {
            addCriterion("RES_DESCR not like", value, "resDescr");
            return (Criteria) this;
        }

        public Criteria andResDescrIn(List<String> values) {
            addCriterion("RES_DESCR in", values, "resDescr");
            return (Criteria) this;
        }

        public Criteria andResDescrNotIn(List<String> values) {
            addCriterion("RES_DESCR not in", values, "resDescr");
            return (Criteria) this;
        }

        public Criteria andResDescrBetween(String value1, String value2) {
            addCriterion("RES_DESCR between", value1, value2, "resDescr");
            return (Criteria) this;
        }

        public Criteria andResDescrNotBetween(String value1, String value2) {
            addCriterion("RES_DESCR not between", value1, value2, "resDescr");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("NOTE is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("NOTE =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("NOTE <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("NOTE >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("NOTE <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("NOTE <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("NOTE like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("NOTE not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("NOTE in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("NOTE not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("NOTE between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("NOTE not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andParentNodeResIdIsNull() {
            addCriterion("PARENT_NODE_RES_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentNodeResIdIsNotNull() {
            addCriterion("PARENT_NODE_RES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentNodeResIdEqualTo(Float value) {
            addCriterion("PARENT_NODE_RES_ID =", value, "parentNodeResId");
            return (Criteria) this;
        }

        public Criteria andParentNodeResIdNotEqualTo(Float value) {
            addCriterion("PARENT_NODE_RES_ID <>", value, "parentNodeResId");
            return (Criteria) this;
        }

        public Criteria andParentNodeResIdGreaterThan(Float value) {
            addCriterion("PARENT_NODE_RES_ID >", value, "parentNodeResId");
            return (Criteria) this;
        }

        public Criteria andParentNodeResIdGreaterThanOrEqualTo(Float value) {
            addCriterion("PARENT_NODE_RES_ID >=", value, "parentNodeResId");
            return (Criteria) this;
        }

        public Criteria andParentNodeResIdLessThan(Float value) {
            addCriterion("PARENT_NODE_RES_ID <", value, "parentNodeResId");
            return (Criteria) this;
        }

        public Criteria andParentNodeResIdLessThanOrEqualTo(Float value) {
            addCriterion("PARENT_NODE_RES_ID <=", value, "parentNodeResId");
            return (Criteria) this;
        }

        public Criteria andParentNodeResIdIn(List<Float> values) {
            addCriterion("PARENT_NODE_RES_ID in", values, "parentNodeResId");
            return (Criteria) this;
        }

        public Criteria andParentNodeResIdNotIn(List<Float> values) {
            addCriterion("PARENT_NODE_RES_ID not in", values, "parentNodeResId");
            return (Criteria) this;
        }

        public Criteria andParentNodeResIdBetween(Float value1, Float value2) {
            addCriterion("PARENT_NODE_RES_ID between", value1, value2, "parentNodeResId");
            return (Criteria) this;
        }

        public Criteria andParentNodeResIdNotBetween(Float value1, Float value2) {
            addCriterion("PARENT_NODE_RES_ID not between", value1, value2, "parentNodeResId");
            return (Criteria) this;
        }

        public Criteria andParentResIdIsNull() {
            addCriterion("PARENT_RES_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentResIdIsNotNull() {
            addCriterion("PARENT_RES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentResIdEqualTo(Float value) {
            addCriterion("PARENT_RES_ID =", value, "parentResId");
            return (Criteria) this;
        }

        public Criteria andParentResIdNotEqualTo(Float value) {
            addCriterion("PARENT_RES_ID <>", value, "parentResId");
            return (Criteria) this;
        }

        public Criteria andParentResIdGreaterThan(Float value) {
            addCriterion("PARENT_RES_ID >", value, "parentResId");
            return (Criteria) this;
        }

        public Criteria andParentResIdGreaterThanOrEqualTo(Float value) {
            addCriterion("PARENT_RES_ID >=", value, "parentResId");
            return (Criteria) this;
        }

        public Criteria andParentResIdLessThan(Float value) {
            addCriterion("PARENT_RES_ID <", value, "parentResId");
            return (Criteria) this;
        }

        public Criteria andParentResIdLessThanOrEqualTo(Float value) {
            addCriterion("PARENT_RES_ID <=", value, "parentResId");
            return (Criteria) this;
        }

        public Criteria andParentResIdIn(List<Float> values) {
            addCriterion("PARENT_RES_ID in", values, "parentResId");
            return (Criteria) this;
        }

        public Criteria andParentResIdNotIn(List<Float> values) {
            addCriterion("PARENT_RES_ID not in", values, "parentResId");
            return (Criteria) this;
        }

        public Criteria andParentResIdBetween(Float value1, Float value2) {
            addCriterion("PARENT_RES_ID between", value1, value2, "parentResId");
            return (Criteria) this;
        }

        public Criteria andParentResIdNotBetween(Float value1, Float value2) {
            addCriterion("PARENT_RES_ID not between", value1, value2, "parentResId");
            return (Criteria) this;
        }

        public Criteria andPhaseIsNull() {
            addCriterion("PHASE is null");
            return (Criteria) this;
        }

        public Criteria andPhaseIsNotNull() {
            addCriterion("PHASE is not null");
            return (Criteria) this;
        }

        public Criteria andPhaseEqualTo(Float value) {
            addCriterion("PHASE =", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseNotEqualTo(Float value) {
            addCriterion("PHASE <>", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseGreaterThan(Float value) {
            addCriterion("PHASE >", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseGreaterThanOrEqualTo(Float value) {
            addCriterion("PHASE >=", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseLessThan(Float value) {
            addCriterion("PHASE <", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseLessThanOrEqualTo(Float value) {
            addCriterion("PHASE <=", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseIn(List<Float> values) {
            addCriterion("PHASE in", values, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseNotIn(List<Float> values) {
            addCriterion("PHASE not in", values, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseBetween(Float value1, Float value2) {
            addCriterion("PHASE between", value1, value2, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseNotBetween(Float value1, Float value2) {
            addCriterion("PHASE not between", value1, value2, "phase");
            return (Criteria) this;
        }

        public Criteria andSearchcodeIsNull() {
            addCriterion("SEARCHCODE is null");
            return (Criteria) this;
        }

        public Criteria andSearchcodeIsNotNull() {
            addCriterion("SEARCHCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSearchcodeEqualTo(String value) {
            addCriterion("SEARCHCODE =", value, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeNotEqualTo(String value) {
            addCriterion("SEARCHCODE <>", value, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeGreaterThan(String value) {
            addCriterion("SEARCHCODE >", value, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeGreaterThanOrEqualTo(String value) {
            addCriterion("SEARCHCODE >=", value, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeLessThan(String value) {
            addCriterion("SEARCHCODE <", value, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeLessThanOrEqualTo(String value) {
            addCriterion("SEARCHCODE <=", value, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeLike(String value) {
            addCriterion("SEARCHCODE like", value, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeNotLike(String value) {
            addCriterion("SEARCHCODE not like", value, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeIn(List<String> values) {
            addCriterion("SEARCHCODE in", values, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeNotIn(List<String> values) {
            addCriterion("SEARCHCODE not in", values, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeBetween(String value1, String value2) {
            addCriterion("SEARCHCODE between", value1, value2, "searchcode");
            return (Criteria) this;
        }

        public Criteria andSearchcodeNotBetween(String value1, String value2) {
            addCriterion("SEARCHCODE not between", value1, value2, "searchcode");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Float value) {
            addCriterion("PRIORITY =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Float value) {
            addCriterion("PRIORITY <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Float value) {
            addCriterion("PRIORITY >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Float value) {
            addCriterion("PRIORITY >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Float value) {
            addCriterion("PRIORITY <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Float value) {
            addCriterion("PRIORITY <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Float> values) {
            addCriterion("PRIORITY in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Float> values) {
            addCriterion("PRIORITY not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Float value1, Float value2) {
            addCriterion("PRIORITY between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Float value1, Float value2) {
            addCriterion("PRIORITY not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andMainstatusIsNull() {
            addCriterion("MAINSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andMainstatusIsNotNull() {
            addCriterion("MAINSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMainstatusEqualTo(Float value) {
            addCriterion("MAINSTATUS =", value, "mainstatus");
            return (Criteria) this;
        }

        public Criteria andMainstatusNotEqualTo(Float value) {
            addCriterion("MAINSTATUS <>", value, "mainstatus");
            return (Criteria) this;
        }

        public Criteria andMainstatusGreaterThan(Float value) {
            addCriterion("MAINSTATUS >", value, "mainstatus");
            return (Criteria) this;
        }

        public Criteria andMainstatusGreaterThanOrEqualTo(Float value) {
            addCriterion("MAINSTATUS >=", value, "mainstatus");
            return (Criteria) this;
        }

        public Criteria andMainstatusLessThan(Float value) {
            addCriterion("MAINSTATUS <", value, "mainstatus");
            return (Criteria) this;
        }

        public Criteria andMainstatusLessThanOrEqualTo(Float value) {
            addCriterion("MAINSTATUS <=", value, "mainstatus");
            return (Criteria) this;
        }

        public Criteria andMainstatusIn(List<Float> values) {
            addCriterion("MAINSTATUS in", values, "mainstatus");
            return (Criteria) this;
        }

        public Criteria andMainstatusNotIn(List<Float> values) {
            addCriterion("MAINSTATUS not in", values, "mainstatus");
            return (Criteria) this;
        }

        public Criteria andMainstatusBetween(Float value1, Float value2) {
            addCriterion("MAINSTATUS between", value1, value2, "mainstatus");
            return (Criteria) this;
        }

        public Criteria andMainstatusNotBetween(Float value1, Float value2) {
            addCriterion("MAINSTATUS not between", value1, value2, "mainstatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusIsNull() {
            addCriterion("SUBSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andSubstatusIsNotNull() {
            addCriterion("SUBSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSubstatusEqualTo(Float value) {
            addCriterion("SUBSTATUS =", value, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusNotEqualTo(Float value) {
            addCriterion("SUBSTATUS <>", value, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusGreaterThan(Float value) {
            addCriterion("SUBSTATUS >", value, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusGreaterThanOrEqualTo(Float value) {
            addCriterion("SUBSTATUS >=", value, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusLessThan(Float value) {
            addCriterion("SUBSTATUS <", value, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusLessThanOrEqualTo(Float value) {
            addCriterion("SUBSTATUS <=", value, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusIn(List<Float> values) {
            addCriterion("SUBSTATUS in", values, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusNotIn(List<Float> values) {
            addCriterion("SUBSTATUS not in", values, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusBetween(Float value1, Float value2) {
            addCriterion("SUBSTATUS between", value1, value2, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusNotBetween(Float value1, Float value2) {
            addCriterion("SUBSTATUS not between", value1, value2, "substatus");
            return (Criteria) this;
        }

        public Criteria andSelfstatusIsNull() {
            addCriterion("SELFSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andSelfstatusIsNotNull() {
            addCriterion("SELFSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSelfstatusEqualTo(Float value) {
            addCriterion("SELFSTATUS =", value, "selfstatus");
            return (Criteria) this;
        }

        public Criteria andSelfstatusNotEqualTo(Float value) {
            addCriterion("SELFSTATUS <>", value, "selfstatus");
            return (Criteria) this;
        }

        public Criteria andSelfstatusGreaterThan(Float value) {
            addCriterion("SELFSTATUS >", value, "selfstatus");
            return (Criteria) this;
        }

        public Criteria andSelfstatusGreaterThanOrEqualTo(Float value) {
            addCriterion("SELFSTATUS >=", value, "selfstatus");
            return (Criteria) this;
        }

        public Criteria andSelfstatusLessThan(Float value) {
            addCriterion("SELFSTATUS <", value, "selfstatus");
            return (Criteria) this;
        }

        public Criteria andSelfstatusLessThanOrEqualTo(Float value) {
            addCriterion("SELFSTATUS <=", value, "selfstatus");
            return (Criteria) this;
        }

        public Criteria andSelfstatusIn(List<Float> values) {
            addCriterion("SELFSTATUS in", values, "selfstatus");
            return (Criteria) this;
        }

        public Criteria andSelfstatusNotIn(List<Float> values) {
            addCriterion("SELFSTATUS not in", values, "selfstatus");
            return (Criteria) this;
        }

        public Criteria andSelfstatusBetween(Float value1, Float value2) {
            addCriterion("SELFSTATUS between", value1, value2, "selfstatus");
            return (Criteria) this;
        }

        public Criteria andSelfstatusNotBetween(Float value1, Float value2) {
            addCriterion("SELFSTATUS not between", value1, value2, "selfstatus");
            return (Criteria) this;
        }

        public Criteria andMonitortaskIsNull() {
            addCriterion("MONITORTASK is null");
            return (Criteria) this;
        }

        public Criteria andMonitortaskIsNotNull() {
            addCriterion("MONITORTASK is not null");
            return (Criteria) this;
        }

        public Criteria andMonitortaskEqualTo(String value) {
            addCriterion("MONITORTASK =", value, "monitortask");
            return (Criteria) this;
        }

        public Criteria andMonitortaskNotEqualTo(String value) {
            addCriterion("MONITORTASK <>", value, "monitortask");
            return (Criteria) this;
        }

        public Criteria andMonitortaskGreaterThan(String value) {
            addCriterion("MONITORTASK >", value, "monitortask");
            return (Criteria) this;
        }

        public Criteria andMonitortaskGreaterThanOrEqualTo(String value) {
            addCriterion("MONITORTASK >=", value, "monitortask");
            return (Criteria) this;
        }

        public Criteria andMonitortaskLessThan(String value) {
            addCriterion("MONITORTASK <", value, "monitortask");
            return (Criteria) this;
        }

        public Criteria andMonitortaskLessThanOrEqualTo(String value) {
            addCriterion("MONITORTASK <=", value, "monitortask");
            return (Criteria) this;
        }

        public Criteria andMonitortaskLike(String value) {
            addCriterion("MONITORTASK like", value, "monitortask");
            return (Criteria) this;
        }

        public Criteria andMonitortaskNotLike(String value) {
            addCriterion("MONITORTASK not like", value, "monitortask");
            return (Criteria) this;
        }

        public Criteria andMonitortaskIn(List<String> values) {
            addCriterion("MONITORTASK in", values, "monitortask");
            return (Criteria) this;
        }

        public Criteria andMonitortaskNotIn(List<String> values) {
            addCriterion("MONITORTASK not in", values, "monitortask");
            return (Criteria) this;
        }

        public Criteria andMonitortaskBetween(String value1, String value2) {
            addCriterion("MONITORTASK between", value1, value2, "monitortask");
            return (Criteria) this;
        }

        public Criteria andMonitortaskNotBetween(String value1, String value2) {
            addCriterion("MONITORTASK not between", value1, value2, "monitortask");
            return (Criteria) this;
        }

        public Criteria andDistractionfreetimeIsNull() {
            addCriterion("DISTRACTIONFREETIME is null");
            return (Criteria) this;
        }

        public Criteria andDistractionfreetimeIsNotNull() {
            addCriterion("DISTRACTIONFREETIME is not null");
            return (Criteria) this;
        }

        public Criteria andDistractionfreetimeEqualTo(String value) {
            addCriterion("DISTRACTIONFREETIME =", value, "distractionfreetime");
            return (Criteria) this;
        }

        public Criteria andDistractionfreetimeNotEqualTo(String value) {
            addCriterion("DISTRACTIONFREETIME <>", value, "distractionfreetime");
            return (Criteria) this;
        }

        public Criteria andDistractionfreetimeGreaterThan(String value) {
            addCriterion("DISTRACTIONFREETIME >", value, "distractionfreetime");
            return (Criteria) this;
        }

        public Criteria andDistractionfreetimeGreaterThanOrEqualTo(String value) {
            addCriterion("DISTRACTIONFREETIME >=", value, "distractionfreetime");
            return (Criteria) this;
        }

        public Criteria andDistractionfreetimeLessThan(String value) {
            addCriterion("DISTRACTIONFREETIME <", value, "distractionfreetime");
            return (Criteria) this;
        }

        public Criteria andDistractionfreetimeLessThanOrEqualTo(String value) {
            addCriterion("DISTRACTIONFREETIME <=", value, "distractionfreetime");
            return (Criteria) this;
        }

        public Criteria andDistractionfreetimeLike(String value) {
            addCriterion("DISTRACTIONFREETIME like", value, "distractionfreetime");
            return (Criteria) this;
        }

        public Criteria andDistractionfreetimeNotLike(String value) {
            addCriterion("DISTRACTIONFREETIME not like", value, "distractionfreetime");
            return (Criteria) this;
        }

        public Criteria andDistractionfreetimeIn(List<String> values) {
            addCriterion("DISTRACTIONFREETIME in", values, "distractionfreetime");
            return (Criteria) this;
        }

        public Criteria andDistractionfreetimeNotIn(List<String> values) {
            addCriterion("DISTRACTIONFREETIME not in", values, "distractionfreetime");
            return (Criteria) this;
        }

        public Criteria andDistractionfreetimeBetween(String value1, String value2) {
            addCriterion("DISTRACTIONFREETIME between", value1, value2, "distractionfreetime");
            return (Criteria) this;
        }

        public Criteria andDistractionfreetimeNotBetween(String value1, String value2) {
            addCriterion("DISTRACTIONFREETIME not between", value1, value2, "distractionfreetime");
            return (Criteria) this;
        }

        public Criteria andArealocationIdIsNull() {
            addCriterion("AREALOCATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andArealocationIdIsNotNull() {
            addCriterion("AREALOCATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andArealocationIdEqualTo(Float value) {
            addCriterion("AREALOCATION_ID =", value, "arealocationId");
            return (Criteria) this;
        }

        public Criteria andArealocationIdNotEqualTo(Float value) {
            addCriterion("AREALOCATION_ID <>", value, "arealocationId");
            return (Criteria) this;
        }

        public Criteria andArealocationIdGreaterThan(Float value) {
            addCriterion("AREALOCATION_ID >", value, "arealocationId");
            return (Criteria) this;
        }

        public Criteria andArealocationIdGreaterThanOrEqualTo(Float value) {
            addCriterion("AREALOCATION_ID >=", value, "arealocationId");
            return (Criteria) this;
        }

        public Criteria andArealocationIdLessThan(Float value) {
            addCriterion("AREALOCATION_ID <", value, "arealocationId");
            return (Criteria) this;
        }

        public Criteria andArealocationIdLessThanOrEqualTo(Float value) {
            addCriterion("AREALOCATION_ID <=", value, "arealocationId");
            return (Criteria) this;
        }

        public Criteria andArealocationIdIn(List<Float> values) {
            addCriterion("AREALOCATION_ID in", values, "arealocationId");
            return (Criteria) this;
        }

        public Criteria andArealocationIdNotIn(List<Float> values) {
            addCriterion("AREALOCATION_ID not in", values, "arealocationId");
            return (Criteria) this;
        }

        public Criteria andArealocationIdBetween(Float value1, Float value2) {
            addCriterion("AREALOCATION_ID between", value1, value2, "arealocationId");
            return (Criteria) this;
        }

        public Criteria andArealocationIdNotBetween(Float value1, Float value2) {
            addCriterion("AREALOCATION_ID not between", value1, value2, "arealocationId");
            return (Criteria) this;
        }

        public Criteria andTenantIsNull() {
            addCriterion("TENANT is null");
            return (Criteria) this;
        }

        public Criteria andTenantIsNotNull() {
            addCriterion("TENANT is not null");
            return (Criteria) this;
        }

        public Criteria andTenantEqualTo(Float value) {
            addCriterion("TENANT =", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantNotEqualTo(Float value) {
            addCriterion("TENANT <>", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantGreaterThan(Float value) {
            addCriterion("TENANT >", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantGreaterThanOrEqualTo(Float value) {
            addCriterion("TENANT >=", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantLessThan(Float value) {
            addCriterion("TENANT <", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantLessThanOrEqualTo(Float value) {
            addCriterion("TENANT <=", value, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantIn(List<Float> values) {
            addCriterion("TENANT in", values, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantNotIn(List<Float> values) {
            addCriterion("TENANT not in", values, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantBetween(Float value1, Float value2) {
            addCriterion("TENANT between", value1, value2, "tenant");
            return (Criteria) this;
        }

        public Criteria andTenantNotBetween(Float value1, Float value2) {
            addCriterion("TENANT not between", value1, value2, "tenant");
            return (Criteria) this;
        }

        public Criteria andIsmanagedIsNull() {
            addCriterion("ISMANAGED is null");
            return (Criteria) this;
        }

        public Criteria andIsmanagedIsNotNull() {
            addCriterion("ISMANAGED is not null");
            return (Criteria) this;
        }

        public Criteria andIsmanagedEqualTo(Float value) {
            addCriterion("ISMANAGED =", value, "ismanaged");
            return (Criteria) this;
        }

        public Criteria andIsmanagedNotEqualTo(Float value) {
            addCriterion("ISMANAGED <>", value, "ismanaged");
            return (Criteria) this;
        }

        public Criteria andIsmanagedGreaterThan(Float value) {
            addCriterion("ISMANAGED >", value, "ismanaged");
            return (Criteria) this;
        }

        public Criteria andIsmanagedGreaterThanOrEqualTo(Float value) {
            addCriterion("ISMANAGED >=", value, "ismanaged");
            return (Criteria) this;
        }

        public Criteria andIsmanagedLessThan(Float value) {
            addCriterion("ISMANAGED <", value, "ismanaged");
            return (Criteria) this;
        }

        public Criteria andIsmanagedLessThanOrEqualTo(Float value) {
            addCriterion("ISMANAGED <=", value, "ismanaged");
            return (Criteria) this;
        }

        public Criteria andIsmanagedIn(List<Float> values) {
            addCriterion("ISMANAGED in", values, "ismanaged");
            return (Criteria) this;
        }

        public Criteria andIsmanagedNotIn(List<Float> values) {
            addCriterion("ISMANAGED not in", values, "ismanaged");
            return (Criteria) this;
        }

        public Criteria andIsmanagedBetween(Float value1, Float value2) {
            addCriterion("ISMANAGED between", value1, value2, "ismanaged");
            return (Criteria) this;
        }

        public Criteria andIsmanagedNotBetween(Float value1, Float value2) {
            addCriterion("ISMANAGED not between", value1, value2, "ismanaged");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Float value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Float value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Float value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Float value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Float value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Float value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Float> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Float> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Float value1, Float value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Float value1, Float value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andRetownIdIsNull() {
            addCriterion("RETOWN_ID is null");
            return (Criteria) this;
        }

        public Criteria andRetownIdIsNotNull() {
            addCriterion("RETOWN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRetownIdEqualTo(Float value) {
            addCriterion("RETOWN_ID =", value, "retownId");
            return (Criteria) this;
        }

        public Criteria andRetownIdNotEqualTo(Float value) {
            addCriterion("RETOWN_ID <>", value, "retownId");
            return (Criteria) this;
        }

        public Criteria andRetownIdGreaterThan(Float value) {
            addCriterion("RETOWN_ID >", value, "retownId");
            return (Criteria) this;
        }

        public Criteria andRetownIdGreaterThanOrEqualTo(Float value) {
            addCriterion("RETOWN_ID >=", value, "retownId");
            return (Criteria) this;
        }

        public Criteria andRetownIdLessThan(Float value) {
            addCriterion("RETOWN_ID <", value, "retownId");
            return (Criteria) this;
        }

        public Criteria andRetownIdLessThanOrEqualTo(Float value) {
            addCriterion("RETOWN_ID <=", value, "retownId");
            return (Criteria) this;
        }

        public Criteria andRetownIdIn(List<Float> values) {
            addCriterion("RETOWN_ID in", values, "retownId");
            return (Criteria) this;
        }

        public Criteria andRetownIdNotIn(List<Float> values) {
            addCriterion("RETOWN_ID not in", values, "retownId");
            return (Criteria) this;
        }

        public Criteria andRetownIdBetween(Float value1, Float value2) {
            addCriterion("RETOWN_ID between", value1, value2, "retownId");
            return (Criteria) this;
        }

        public Criteria andRetownIdNotBetween(Float value1, Float value2) {
            addCriterion("RETOWN_ID not between", value1, value2, "retownId");
            return (Criteria) this;
        }

        public Criteria andParentnodeclassIsNull() {
            addCriterion("PARENTNODECLASS is null");
            return (Criteria) this;
        }

        public Criteria andParentnodeclassIsNotNull() {
            addCriterion("PARENTNODECLASS is not null");
            return (Criteria) this;
        }

        public Criteria andParentnodeclassEqualTo(String value) {
            addCriterion("PARENTNODECLASS =", value, "parentnodeclass");
            return (Criteria) this;
        }

        public Criteria andParentnodeclassNotEqualTo(String value) {
            addCriterion("PARENTNODECLASS <>", value, "parentnodeclass");
            return (Criteria) this;
        }

        public Criteria andParentnodeclassGreaterThan(String value) {
            addCriterion("PARENTNODECLASS >", value, "parentnodeclass");
            return (Criteria) this;
        }

        public Criteria andParentnodeclassGreaterThanOrEqualTo(String value) {
            addCriterion("PARENTNODECLASS >=", value, "parentnodeclass");
            return (Criteria) this;
        }

        public Criteria andParentnodeclassLessThan(String value) {
            addCriterion("PARENTNODECLASS <", value, "parentnodeclass");
            return (Criteria) this;
        }

        public Criteria andParentnodeclassLessThanOrEqualTo(String value) {
            addCriterion("PARENTNODECLASS <=", value, "parentnodeclass");
            return (Criteria) this;
        }

        public Criteria andParentnodeclassLike(String value) {
            addCriterion("PARENTNODECLASS like", value, "parentnodeclass");
            return (Criteria) this;
        }

        public Criteria andParentnodeclassNotLike(String value) {
            addCriterion("PARENTNODECLASS not like", value, "parentnodeclass");
            return (Criteria) this;
        }

        public Criteria andParentnodeclassIn(List<String> values) {
            addCriterion("PARENTNODECLASS in", values, "parentnodeclass");
            return (Criteria) this;
        }

        public Criteria andParentnodeclassNotIn(List<String> values) {
            addCriterion("PARENTNODECLASS not in", values, "parentnodeclass");
            return (Criteria) this;
        }

        public Criteria andParentnodeclassBetween(String value1, String value2) {
            addCriterion("PARENTNODECLASS between", value1, value2, "parentnodeclass");
            return (Criteria) this;
        }

        public Criteria andParentnodeclassNotBetween(String value1, String value2) {
            addCriterion("PARENTNODECLASS not between", value1, value2, "parentnodeclass");
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