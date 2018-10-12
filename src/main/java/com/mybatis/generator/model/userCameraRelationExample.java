package com.mybatis.generator.model;

import java.util.ArrayList;
import java.util.List;

public class userCameraRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public userCameraRelationExample() {
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

        public Criteria andCamSnIsNull() {
            addCriterion("cam_sn is null");
            return (Criteria) this;
        }

        public Criteria andCamSnIsNotNull() {
            addCriterion("cam_sn is not null");
            return (Criteria) this;
        }

        public Criteria andCamSnEqualTo(String value) {
            addCriterion("cam_sn =", value, "camSn");
            return (Criteria) this;
        }

        public Criteria andCamSnNotEqualTo(String value) {
            addCriterion("cam_sn <>", value, "camSn");
            return (Criteria) this;
        }

        public Criteria andCamSnGreaterThan(String value) {
            addCriterion("cam_sn >", value, "camSn");
            return (Criteria) this;
        }

        public Criteria andCamSnGreaterThanOrEqualTo(String value) {
            addCriterion("cam_sn >=", value, "camSn");
            return (Criteria) this;
        }

        public Criteria andCamSnLessThan(String value) {
            addCriterion("cam_sn <", value, "camSn");
            return (Criteria) this;
        }

        public Criteria andCamSnLessThanOrEqualTo(String value) {
            addCriterion("cam_sn <=", value, "camSn");
            return (Criteria) this;
        }

        public Criteria andCamSnLike(String value) {
            addCriterion("cam_sn like", value, "camSn");
            return (Criteria) this;
        }

        public Criteria andCamSnNotLike(String value) {
            addCriterion("cam_sn not like", value, "camSn");
            return (Criteria) this;
        }

        public Criteria andCamSnIn(List<String> values) {
            addCriterion("cam_sn in", values, "camSn");
            return (Criteria) this;
        }

        public Criteria andCamSnNotIn(List<String> values) {
            addCriterion("cam_sn not in", values, "camSn");
            return (Criteria) this;
        }

        public Criteria andCamSnBetween(String value1, String value2) {
            addCriterion("cam_sn between", value1, value2, "camSn");
            return (Criteria) this;
        }

        public Criteria andCamSnNotBetween(String value1, String value2) {
            addCriterion("cam_sn not between", value1, value2, "camSn");
            return (Criteria) this;
        }

        public Criteria andCamChannelIsNull() {
            addCriterion("cam_channel is null");
            return (Criteria) this;
        }

        public Criteria andCamChannelIsNotNull() {
            addCriterion("cam_channel is not null");
            return (Criteria) this;
        }

        public Criteria andCamChannelEqualTo(String value) {
            addCriterion("cam_channel =", value, "camChannel");
            return (Criteria) this;
        }

        public Criteria andCamChannelNotEqualTo(String value) {
            addCriterion("cam_channel <>", value, "camChannel");
            return (Criteria) this;
        }

        public Criteria andCamChannelGreaterThan(String value) {
            addCriterion("cam_channel >", value, "camChannel");
            return (Criteria) this;
        }

        public Criteria andCamChannelGreaterThanOrEqualTo(String value) {
            addCriterion("cam_channel >=", value, "camChannel");
            return (Criteria) this;
        }

        public Criteria andCamChannelLessThan(String value) {
            addCriterion("cam_channel <", value, "camChannel");
            return (Criteria) this;
        }

        public Criteria andCamChannelLessThanOrEqualTo(String value) {
            addCriterion("cam_channel <=", value, "camChannel");
            return (Criteria) this;
        }

        public Criteria andCamChannelLike(String value) {
            addCriterion("cam_channel like", value, "camChannel");
            return (Criteria) this;
        }

        public Criteria andCamChannelNotLike(String value) {
            addCriterion("cam_channel not like", value, "camChannel");
            return (Criteria) this;
        }

        public Criteria andCamChannelIn(List<String> values) {
            addCriterion("cam_channel in", values, "camChannel");
            return (Criteria) this;
        }

        public Criteria andCamChannelNotIn(List<String> values) {
            addCriterion("cam_channel not in", values, "camChannel");
            return (Criteria) this;
        }

        public Criteria andCamChannelBetween(String value1, String value2) {
            addCriterion("cam_channel between", value1, value2, "camChannel");
            return (Criteria) this;
        }

        public Criteria andCamChannelNotBetween(String value1, String value2) {
            addCriterion("cam_channel not between", value1, value2, "camChannel");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andBindTimeIsNull() {
            addCriterion("bind_time is null");
            return (Criteria) this;
        }

        public Criteria andBindTimeIsNotNull() {
            addCriterion("bind_time is not null");
            return (Criteria) this;
        }

        public Criteria andBindTimeEqualTo(Integer value) {
            addCriterion("bind_time =", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeNotEqualTo(Integer value) {
            addCriterion("bind_time <>", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeGreaterThan(Integer value) {
            addCriterion("bind_time >", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bind_time >=", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeLessThan(Integer value) {
            addCriterion("bind_time <", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeLessThanOrEqualTo(Integer value) {
            addCriterion("bind_time <=", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeIn(List<Integer> values) {
            addCriterion("bind_time in", values, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeNotIn(List<Integer> values) {
            addCriterion("bind_time not in", values, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeBetween(Integer value1, Integer value2) {
            addCriterion("bind_time between", value1, value2, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("bind_time not between", value1, value2, "bindTime");
            return (Criteria) this;
        }

        public Criteria andCarouselStatusIsNull() {
            addCriterion("carousel_status is null");
            return (Criteria) this;
        }

        public Criteria andCarouselStatusIsNotNull() {
            addCriterion("carousel_status is not null");
            return (Criteria) this;
        }

        public Criteria andCarouselStatusEqualTo(Integer value) {
            addCriterion("carousel_status =", value, "carouselStatus");
            return (Criteria) this;
        }

        public Criteria andCarouselStatusNotEqualTo(Integer value) {
            addCriterion("carousel_status <>", value, "carouselStatus");
            return (Criteria) this;
        }

        public Criteria andCarouselStatusGreaterThan(Integer value) {
            addCriterion("carousel_status >", value, "carouselStatus");
            return (Criteria) this;
        }

        public Criteria andCarouselStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("carousel_status >=", value, "carouselStatus");
            return (Criteria) this;
        }

        public Criteria andCarouselStatusLessThan(Integer value) {
            addCriterion("carousel_status <", value, "carouselStatus");
            return (Criteria) this;
        }

        public Criteria andCarouselStatusLessThanOrEqualTo(Integer value) {
            addCriterion("carousel_status <=", value, "carouselStatus");
            return (Criteria) this;
        }

        public Criteria andCarouselStatusIn(List<Integer> values) {
            addCriterion("carousel_status in", values, "carouselStatus");
            return (Criteria) this;
        }

        public Criteria andCarouselStatusNotIn(List<Integer> values) {
            addCriterion("carousel_status not in", values, "carouselStatus");
            return (Criteria) this;
        }

        public Criteria andCarouselStatusBetween(Integer value1, Integer value2) {
            addCriterion("carousel_status between", value1, value2, "carouselStatus");
            return (Criteria) this;
        }

        public Criteria andCarouselStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("carousel_status not between", value1, value2, "carouselStatus");
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