package cn.itcast.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table student
     *
     * @mbg.generated Sun Nov 05 14:33:54 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table student
     *
     * @mbg.generated Sun Nov 05 14:33:54 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table student
     *
     * @mbg.generated Sun Nov 05 14:33:54 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun Nov 05 14:33:54 CST 2017
     */
    public StudentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun Nov 05 14:33:54 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun Nov 05 14:33:54 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun Nov 05 14:33:54 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun Nov 05 14:33:54 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun Nov 05 14:33:54 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun Nov 05 14:33:54 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun Nov 05 14:33:54 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun Nov 05 14:33:54 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun Nov 05 14:33:54 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun Nov 05 14:33:54 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table student
     *
     * @mbg.generated Sun Nov 05 14:33:54 CST 2017
     */
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNull() {
            addCriterion("className is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNotNull() {
            addCriterion("className is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameEqualTo(Integer value) {
            addCriterion("className =", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotEqualTo(Integer value) {
            addCriterion("className <>", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThan(Integer value) {
            addCriterion("className >", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThanOrEqualTo(Integer value) {
            addCriterion("className >=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThan(Integer value) {
            addCriterion("className <", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThanOrEqualTo(Integer value) {
            addCriterion("className <=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIn(List<Integer> values) {
            addCriterion("className in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotIn(List<Integer> values) {
            addCriterion("className not in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameBetween(Integer value1, Integer value2) {
            addCriterion("className between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotBetween(Integer value1, Integer value2) {
            addCriterion("className not between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassidIsNull() {
            addCriterion("classId is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("classId is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(Integer value) {
            addCriterion("classId =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(Integer value) {
            addCriterion("classId <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(Integer value) {
            addCriterion("classId >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("classId >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(Integer value) {
            addCriterion("classId <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(Integer value) {
            addCriterion("classId <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<Integer> values) {
            addCriterion("classId in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<Integer> values) {
            addCriterion("classId not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(Integer value1, Integer value2) {
            addCriterion("classId between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(Integer value1, Integer value2) {
            addCriterion("classId not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andGroudIsNull() {
            addCriterion("groud is null");
            return (Criteria) this;
        }

        public Criteria andGroudIsNotNull() {
            addCriterion("groud is not null");
            return (Criteria) this;
        }

        public Criteria andGroudEqualTo(Float value) {
            addCriterion("groud =", value, "groud");
            return (Criteria) this;
        }

        public Criteria andGroudNotEqualTo(Float value) {
            addCriterion("groud <>", value, "groud");
            return (Criteria) this;
        }

        public Criteria andGroudGreaterThan(Float value) {
            addCriterion("groud >", value, "groud");
            return (Criteria) this;
        }

        public Criteria andGroudGreaterThanOrEqualTo(Float value) {
            addCriterion("groud >=", value, "groud");
            return (Criteria) this;
        }

        public Criteria andGroudLessThan(Float value) {
            addCriterion("groud <", value, "groud");
            return (Criteria) this;
        }

        public Criteria andGroudLessThanOrEqualTo(Float value) {
            addCriterion("groud <=", value, "groud");
            return (Criteria) this;
        }

        public Criteria andGroudIn(List<Float> values) {
            addCriterion("groud in", values, "groud");
            return (Criteria) this;
        }

        public Criteria andGroudNotIn(List<Float> values) {
            addCriterion("groud not in", values, "groud");
            return (Criteria) this;
        }

        public Criteria andGroudBetween(Float value1, Float value2) {
            addCriterion("groud between", value1, value2, "groud");
            return (Criteria) this;
        }

        public Criteria andGroudNotBetween(Float value1, Float value2) {
            addCriterion("groud not between", value1, value2, "groud");
            return (Criteria) this;
        }

        public Criteria andExamidIsNull() {
            addCriterion("examId is null");
            return (Criteria) this;
        }

        public Criteria andExamidIsNotNull() {
            addCriterion("examId is not null");
            return (Criteria) this;
        }

        public Criteria andExamidEqualTo(Integer value) {
            addCriterion("examId =", value, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidNotEqualTo(Integer value) {
            addCriterion("examId <>", value, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidGreaterThan(Integer value) {
            addCriterion("examId >", value, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("examId >=", value, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidLessThan(Integer value) {
            addCriterion("examId <", value, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidLessThanOrEqualTo(Integer value) {
            addCriterion("examId <=", value, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidIn(List<Integer> values) {
            addCriterion("examId in", values, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidNotIn(List<Integer> values) {
            addCriterion("examId not in", values, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidBetween(Integer value1, Integer value2) {
            addCriterion("examId between", value1, value2, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidNotBetween(Integer value1, Integer value2) {
            addCriterion("examId not between", value1, value2, "examid");
            return (Criteria) this;
        }

        public Criteria andExamidnumIsNull() {
            addCriterion("examIdNum is null");
            return (Criteria) this;
        }

        public Criteria andExamidnumIsNotNull() {
            addCriterion("examIdNum is not null");
            return (Criteria) this;
        }

        public Criteria andExamidnumEqualTo(Integer value) {
            addCriterion("examIdNum =", value, "examidnum");
            return (Criteria) this;
        }

        public Criteria andExamidnumNotEqualTo(Integer value) {
            addCriterion("examIdNum <>", value, "examidnum");
            return (Criteria) this;
        }

        public Criteria andExamidnumGreaterThan(Integer value) {
            addCriterion("examIdNum >", value, "examidnum");
            return (Criteria) this;
        }

        public Criteria andExamidnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("examIdNum >=", value, "examidnum");
            return (Criteria) this;
        }

        public Criteria andExamidnumLessThan(Integer value) {
            addCriterion("examIdNum <", value, "examidnum");
            return (Criteria) this;
        }

        public Criteria andExamidnumLessThanOrEqualTo(Integer value) {
            addCriterion("examIdNum <=", value, "examidnum");
            return (Criteria) this;
        }

        public Criteria andExamidnumIn(List<Integer> values) {
            addCriterion("examIdNum in", values, "examidnum");
            return (Criteria) this;
        }

        public Criteria andExamidnumNotIn(List<Integer> values) {
            addCriterion("examIdNum not in", values, "examidnum");
            return (Criteria) this;
        }

        public Criteria andExamidnumBetween(Integer value1, Integer value2) {
            addCriterion("examIdNum between", value1, value2, "examidnum");
            return (Criteria) this;
        }

        public Criteria andExamidnumNotBetween(Integer value1, Integer value2) {
            addCriterion("examIdNum not between", value1, value2, "examidnum");
            return (Criteria) this;
        }

        public Criteria andExamdateIsNull() {
            addCriterion("examDate is null");
            return (Criteria) this;
        }

        public Criteria andExamdateIsNotNull() {
            addCriterion("examDate is not null");
            return (Criteria) this;
        }

        public Criteria andExamdateEqualTo(String value) {
            addCriterion("examDate =", value, "examdate");
            return (Criteria) this;
        }

        public Criteria andExamdateNotEqualTo(String value) {
            addCriterion("examDate <>", value, "examdate");
            return (Criteria) this;
        }

        public Criteria andExamdateGreaterThan(String value) {
            addCriterion("examDate >", value, "examdate");
            return (Criteria) this;
        }

        public Criteria andExamdateGreaterThanOrEqualTo(String value) {
            addCriterion("examDate >=", value, "examdate");
            return (Criteria) this;
        }

        public Criteria andExamdateLessThan(String value) {
            addCriterion("examDate <", value, "examdate");
            return (Criteria) this;
        }

        public Criteria andExamdateLessThanOrEqualTo(String value) {
            addCriterion("examDate <=", value, "examdate");
            return (Criteria) this;
        }

        public Criteria andExamdateLike(String value) {
            addCriterion("examDate like", value, "examdate");
            return (Criteria) this;
        }

        public Criteria andExamdateNotLike(String value) {
            addCriterion("examDate not like", value, "examdate");
            return (Criteria) this;
        }

        public Criteria andExamdateIn(List<String> values) {
            addCriterion("examDate in", values, "examdate");
            return (Criteria) this;
        }

        public Criteria andExamdateNotIn(List<String> values) {
            addCriterion("examDate not in", values, "examdate");
            return (Criteria) this;
        }

        public Criteria andExamdateBetween(String value1, String value2) {
            addCriterion("examDate between", value1, value2, "examdate");
            return (Criteria) this;
        }

        public Criteria andExamdateNotBetween(String value1, String value2) {
            addCriterion("examDate not between", value1, value2, "examdate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table student
     *
     * @mbg.generated do_not_delete_during_merge Sun Nov 05 14:33:54 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table student
     *
     * @mbg.generated Sun Nov 05 14:33:54 CST 2017
     */
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