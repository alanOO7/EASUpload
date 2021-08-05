package com.el.easupload.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class F550911zExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public F550911zExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andGLUKIDIsNull() {
            addCriterion("GLUKID is null");
            return (Criteria) this;
        }

        public Criteria andGLUKIDIsNotNull() {
            addCriterion("GLUKID is not null");
            return (Criteria) this;
        }

        public Criteria andGLUKIDEqualTo(BigDecimal value) {
            addCriterion("GLUKID =", value, "GLUKID");
            return (Criteria) this;
        }

        public Criteria andGLUKIDNotEqualTo(BigDecimal value) {
            addCriterion("GLUKID <>", value, "GLUKID");
            return (Criteria) this;
        }

        public Criteria andGLUKIDGreaterThan(BigDecimal value) {
            addCriterion("GLUKID >", value, "GLUKID");
            return (Criteria) this;
        }

        public Criteria andGLUKIDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLUKID >=", value, "GLUKID");
            return (Criteria) this;
        }

        public Criteria andGLUKIDLessThan(BigDecimal value) {
            addCriterion("GLUKID <", value, "GLUKID");
            return (Criteria) this;
        }

        public Criteria andGLUKIDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLUKID <=", value, "GLUKID");
            return (Criteria) this;
        }

        public Criteria andGLUKIDIn(List<BigDecimal> values) {
            addCriterion("GLUKID in", values, "GLUKID");
            return (Criteria) this;
        }

        public Criteria andGLUKIDNotIn(List<BigDecimal> values) {
            addCriterion("GLUKID not in", values, "GLUKID");
            return (Criteria) this;
        }

        public Criteria andGLUKIDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLUKID between", value1, value2, "GLUKID");
            return (Criteria) this;
        }

        public Criteria andGLUKIDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLUKID not between", value1, value2, "GLUKID");
            return (Criteria) this;
        }

        public Criteria andGLKCOIsNull() {
            addCriterion("GLKCO is null");
            return (Criteria) this;
        }

        public Criteria andGLKCOIsNotNull() {
            addCriterion("GLKCO is not null");
            return (Criteria) this;
        }

        public Criteria andGLKCOEqualTo(String value) {
            addCriterion("GLKCO =", value, "GLKCO");
            return (Criteria) this;
        }

        public Criteria andGLKCONotEqualTo(String value) {
            addCriterion("GLKCO <>", value, "GLKCO");
            return (Criteria) this;
        }

        public Criteria andGLKCOGreaterThan(String value) {
            addCriterion("GLKCO >", value, "GLKCO");
            return (Criteria) this;
        }

        public Criteria andGLKCOGreaterThanOrEqualTo(String value) {
            addCriterion("GLKCO >=", value, "GLKCO");
            return (Criteria) this;
        }

        public Criteria andGLKCOLessThan(String value) {
            addCriterion("GLKCO <", value, "GLKCO");
            return (Criteria) this;
        }

        public Criteria andGLKCOLessThanOrEqualTo(String value) {
            addCriterion("GLKCO <=", value, "GLKCO");
            return (Criteria) this;
        }

        public Criteria andGLKCOLike(String value) {
            addCriterion("GLKCO like", value, "GLKCO");
            return (Criteria) this;
        }

        public Criteria andGLKCONotLike(String value) {
            addCriterion("GLKCO not like", value, "GLKCO");
            return (Criteria) this;
        }

        public Criteria andGLKCOIn(List<String> values) {
            addCriterion("GLKCO in", values, "GLKCO");
            return (Criteria) this;
        }

        public Criteria andGLKCONotIn(List<String> values) {
            addCriterion("GLKCO not in", values, "GLKCO");
            return (Criteria) this;
        }

        public Criteria andGLKCOBetween(String value1, String value2) {
            addCriterion("GLKCO between", value1, value2, "GLKCO");
            return (Criteria) this;
        }

        public Criteria andGLKCONotBetween(String value1, String value2) {
            addCriterion("GLKCO not between", value1, value2, "GLKCO");
            return (Criteria) this;
        }

        public Criteria andGLDCTIsNull() {
            addCriterion("GLDCT is null");
            return (Criteria) this;
        }

        public Criteria andGLDCTIsNotNull() {
            addCriterion("GLDCT is not null");
            return (Criteria) this;
        }

        public Criteria andGLDCTEqualTo(String value) {
            addCriterion("GLDCT =", value, "GLDCT");
            return (Criteria) this;
        }

        public Criteria andGLDCTNotEqualTo(String value) {
            addCriterion("GLDCT <>", value, "GLDCT");
            return (Criteria) this;
        }

        public Criteria andGLDCTGreaterThan(String value) {
            addCriterion("GLDCT >", value, "GLDCT");
            return (Criteria) this;
        }

        public Criteria andGLDCTGreaterThanOrEqualTo(String value) {
            addCriterion("GLDCT >=", value, "GLDCT");
            return (Criteria) this;
        }

        public Criteria andGLDCTLessThan(String value) {
            addCriterion("GLDCT <", value, "GLDCT");
            return (Criteria) this;
        }

        public Criteria andGLDCTLessThanOrEqualTo(String value) {
            addCriterion("GLDCT <=", value, "GLDCT");
            return (Criteria) this;
        }

        public Criteria andGLDCTLike(String value) {
            addCriterion("GLDCT like", value, "GLDCT");
            return (Criteria) this;
        }

        public Criteria andGLDCTNotLike(String value) {
            addCriterion("GLDCT not like", value, "GLDCT");
            return (Criteria) this;
        }

        public Criteria andGLDCTIn(List<String> values) {
            addCriterion("GLDCT in", values, "GLDCT");
            return (Criteria) this;
        }

        public Criteria andGLDCTNotIn(List<String> values) {
            addCriterion("GLDCT not in", values, "GLDCT");
            return (Criteria) this;
        }

        public Criteria andGLDCTBetween(String value1, String value2) {
            addCriterion("GLDCT between", value1, value2, "GLDCT");
            return (Criteria) this;
        }

        public Criteria andGLDCTNotBetween(String value1, String value2) {
            addCriterion("GLDCT not between", value1, value2, "GLDCT");
            return (Criteria) this;
        }

        public Criteria andGLDOCIsNull() {
            addCriterion("GLDOC is null");
            return (Criteria) this;
        }

        public Criteria andGLDOCIsNotNull() {
            addCriterion("GLDOC is not null");
            return (Criteria) this;
        }

        public Criteria andGLDOCEqualTo(BigDecimal value) {
            addCriterion("GLDOC =", value, "GLDOC");
            return (Criteria) this;
        }

        public Criteria andGLDOCNotEqualTo(BigDecimal value) {
            addCriterion("GLDOC <>", value, "GLDOC");
            return (Criteria) this;
        }

        public Criteria andGLDOCGreaterThan(BigDecimal value) {
            addCriterion("GLDOC >", value, "GLDOC");
            return (Criteria) this;
        }

        public Criteria andGLDOCGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLDOC >=", value, "GLDOC");
            return (Criteria) this;
        }

        public Criteria andGLDOCLessThan(BigDecimal value) {
            addCriterion("GLDOC <", value, "GLDOC");
            return (Criteria) this;
        }

        public Criteria andGLDOCLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLDOC <=", value, "GLDOC");
            return (Criteria) this;
        }

        public Criteria andGLDOCIn(List<BigDecimal> values) {
            addCriterion("GLDOC in", values, "GLDOC");
            return (Criteria) this;
        }

        public Criteria andGLDOCNotIn(List<BigDecimal> values) {
            addCriterion("GLDOC not in", values, "GLDOC");
            return (Criteria) this;
        }

        public Criteria andGLDOCBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLDOC between", value1, value2, "GLDOC");
            return (Criteria) this;
        }

        public Criteria andGLDOCNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLDOC not between", value1, value2, "GLDOC");
            return (Criteria) this;
        }

        public Criteria andGLDGJIsNull() {
            addCriterion("GLDGJ is null");
            return (Criteria) this;
        }

        public Criteria andGLDGJIsNotNull() {
            addCriterion("GLDGJ is not null");
            return (Criteria) this;
        }

        public Criteria andGLDGJEqualTo(Integer value) {
            addCriterion("GLDGJ =", value, "GLDGJ");
            return (Criteria) this;
        }

        public Criteria andGLDGJNotEqualTo(Integer value) {
            addCriterion("GLDGJ <>", value, "GLDGJ");
            return (Criteria) this;
        }

        public Criteria andGLDGJGreaterThan(Integer value) {
            addCriterion("GLDGJ >", value, "GLDGJ");
            return (Criteria) this;
        }

        public Criteria andGLDGJGreaterThanOrEqualTo(Integer value) {
            addCriterion("GLDGJ >=", value, "GLDGJ");
            return (Criteria) this;
        }

        public Criteria andGLDGJLessThan(Integer value) {
            addCriterion("GLDGJ <", value, "GLDGJ");
            return (Criteria) this;
        }

        public Criteria andGLDGJLessThanOrEqualTo(Integer value) {
            addCriterion("GLDGJ <=", value, "GLDGJ");
            return (Criteria) this;
        }

        public Criteria andGLDGJIn(List<Integer> values) {
            addCriterion("GLDGJ in", values, "GLDGJ");
            return (Criteria) this;
        }

        public Criteria andGLDGJNotIn(List<Integer> values) {
            addCriterion("GLDGJ not in", values, "GLDGJ");
            return (Criteria) this;
        }

        public Criteria andGLDGJBetween(Integer value1, Integer value2) {
            addCriterion("GLDGJ between", value1, value2, "GLDGJ");
            return (Criteria) this;
        }

        public Criteria andGLDGJNotBetween(Integer value1, Integer value2) {
            addCriterion("GLDGJ not between", value1, value2, "GLDGJ");
            return (Criteria) this;
        }

        public Criteria andGLJELNIsNull() {
            addCriterion("GLJELN is null");
            return (Criteria) this;
        }

        public Criteria andGLJELNIsNotNull() {
            addCriterion("GLJELN is not null");
            return (Criteria) this;
        }

        public Criteria andGLJELNEqualTo(BigDecimal value) {
            addCriterion("GLJELN =", value, "GLJELN");
            return (Criteria) this;
        }

        public Criteria andGLJELNNotEqualTo(BigDecimal value) {
            addCriterion("GLJELN <>", value, "GLJELN");
            return (Criteria) this;
        }

        public Criteria andGLJELNGreaterThan(BigDecimal value) {
            addCriterion("GLJELN >", value, "GLJELN");
            return (Criteria) this;
        }

        public Criteria andGLJELNGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLJELN >=", value, "GLJELN");
            return (Criteria) this;
        }

        public Criteria andGLJELNLessThan(BigDecimal value) {
            addCriterion("GLJELN <", value, "GLJELN");
            return (Criteria) this;
        }

        public Criteria andGLJELNLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLJELN <=", value, "GLJELN");
            return (Criteria) this;
        }

        public Criteria andGLJELNIn(List<BigDecimal> values) {
            addCriterion("GLJELN in", values, "GLJELN");
            return (Criteria) this;
        }

        public Criteria andGLJELNNotIn(List<BigDecimal> values) {
            addCriterion("GLJELN not in", values, "GLJELN");
            return (Criteria) this;
        }

        public Criteria andGLJELNBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLJELN between", value1, value2, "GLJELN");
            return (Criteria) this;
        }

        public Criteria andGLJELNNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLJELN not between", value1, value2, "GLJELN");
            return (Criteria) this;
        }

        public Criteria andGLEXTLIsNull() {
            addCriterion("GLEXTL is null");
            return (Criteria) this;
        }

        public Criteria andGLEXTLIsNotNull() {
            addCriterion("GLEXTL is not null");
            return (Criteria) this;
        }

        public Criteria andGLEXTLEqualTo(String value) {
            addCriterion("GLEXTL =", value, "GLEXTL");
            return (Criteria) this;
        }

        public Criteria andGLEXTLNotEqualTo(String value) {
            addCriterion("GLEXTL <>", value, "GLEXTL");
            return (Criteria) this;
        }

        public Criteria andGLEXTLGreaterThan(String value) {
            addCriterion("GLEXTL >", value, "GLEXTL");
            return (Criteria) this;
        }

        public Criteria andGLEXTLGreaterThanOrEqualTo(String value) {
            addCriterion("GLEXTL >=", value, "GLEXTL");
            return (Criteria) this;
        }

        public Criteria andGLEXTLLessThan(String value) {
            addCriterion("GLEXTL <", value, "GLEXTL");
            return (Criteria) this;
        }

        public Criteria andGLEXTLLessThanOrEqualTo(String value) {
            addCriterion("GLEXTL <=", value, "GLEXTL");
            return (Criteria) this;
        }

        public Criteria andGLEXTLLike(String value) {
            addCriterion("GLEXTL like", value, "GLEXTL");
            return (Criteria) this;
        }

        public Criteria andGLEXTLNotLike(String value) {
            addCriterion("GLEXTL not like", value, "GLEXTL");
            return (Criteria) this;
        }

        public Criteria andGLEXTLIn(List<String> values) {
            addCriterion("GLEXTL in", values, "GLEXTL");
            return (Criteria) this;
        }

        public Criteria andGLEXTLNotIn(List<String> values) {
            addCriterion("GLEXTL not in", values, "GLEXTL");
            return (Criteria) this;
        }

        public Criteria andGLEXTLBetween(String value1, String value2) {
            addCriterion("GLEXTL between", value1, value2, "GLEXTL");
            return (Criteria) this;
        }

        public Criteria andGLEXTLNotBetween(String value1, String value2) {
            addCriterion("GLEXTL not between", value1, value2, "GLEXTL");
            return (Criteria) this;
        }

        public Criteria andGLPOSTIsNull() {
            addCriterion("GLPOST is null");
            return (Criteria) this;
        }

        public Criteria andGLPOSTIsNotNull() {
            addCriterion("GLPOST is not null");
            return (Criteria) this;
        }

        public Criteria andGLPOSTEqualTo(String value) {
            addCriterion("GLPOST =", value, "GLPOST");
            return (Criteria) this;
        }

        public Criteria andGLPOSTNotEqualTo(String value) {
            addCriterion("GLPOST <>", value, "GLPOST");
            return (Criteria) this;
        }

        public Criteria andGLPOSTGreaterThan(String value) {
            addCriterion("GLPOST >", value, "GLPOST");
            return (Criteria) this;
        }

        public Criteria andGLPOSTGreaterThanOrEqualTo(String value) {
            addCriterion("GLPOST >=", value, "GLPOST");
            return (Criteria) this;
        }

        public Criteria andGLPOSTLessThan(String value) {
            addCriterion("GLPOST <", value, "GLPOST");
            return (Criteria) this;
        }

        public Criteria andGLPOSTLessThanOrEqualTo(String value) {
            addCriterion("GLPOST <=", value, "GLPOST");
            return (Criteria) this;
        }

        public Criteria andGLPOSTLike(String value) {
            addCriterion("GLPOST like", value, "GLPOST");
            return (Criteria) this;
        }

        public Criteria andGLPOSTNotLike(String value) {
            addCriterion("GLPOST not like", value, "GLPOST");
            return (Criteria) this;
        }

        public Criteria andGLPOSTIn(List<String> values) {
            addCriterion("GLPOST in", values, "GLPOST");
            return (Criteria) this;
        }

        public Criteria andGLPOSTNotIn(List<String> values) {
            addCriterion("GLPOST not in", values, "GLPOST");
            return (Criteria) this;
        }

        public Criteria andGLPOSTBetween(String value1, String value2) {
            addCriterion("GLPOST between", value1, value2, "GLPOST");
            return (Criteria) this;
        }

        public Criteria andGLPOSTNotBetween(String value1, String value2) {
            addCriterion("GLPOST not between", value1, value2, "GLPOST");
            return (Criteria) this;
        }

        public Criteria andGLICUIsNull() {
            addCriterion("GLICU is null");
            return (Criteria) this;
        }

        public Criteria andGLICUIsNotNull() {
            addCriterion("GLICU is not null");
            return (Criteria) this;
        }

        public Criteria andGLICUEqualTo(BigDecimal value) {
            addCriterion("GLICU =", value, "GLICU");
            return (Criteria) this;
        }

        public Criteria andGLICUNotEqualTo(BigDecimal value) {
            addCriterion("GLICU <>", value, "GLICU");
            return (Criteria) this;
        }

        public Criteria andGLICUGreaterThan(BigDecimal value) {
            addCriterion("GLICU >", value, "GLICU");
            return (Criteria) this;
        }

        public Criteria andGLICUGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLICU >=", value, "GLICU");
            return (Criteria) this;
        }

        public Criteria andGLICULessThan(BigDecimal value) {
            addCriterion("GLICU <", value, "GLICU");
            return (Criteria) this;
        }

        public Criteria andGLICULessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLICU <=", value, "GLICU");
            return (Criteria) this;
        }

        public Criteria andGLICUIn(List<BigDecimal> values) {
            addCriterion("GLICU in", values, "GLICU");
            return (Criteria) this;
        }

        public Criteria andGLICUNotIn(List<BigDecimal> values) {
            addCriterion("GLICU not in", values, "GLICU");
            return (Criteria) this;
        }

        public Criteria andGLICUBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLICU between", value1, value2, "GLICU");
            return (Criteria) this;
        }

        public Criteria andGLICUNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLICU not between", value1, value2, "GLICU");
            return (Criteria) this;
        }

        public Criteria andGLICUTIsNull() {
            addCriterion("GLICUT is null");
            return (Criteria) this;
        }

        public Criteria andGLICUTIsNotNull() {
            addCriterion("GLICUT is not null");
            return (Criteria) this;
        }

        public Criteria andGLICUTEqualTo(String value) {
            addCriterion("GLICUT =", value, "GLICUT");
            return (Criteria) this;
        }

        public Criteria andGLICUTNotEqualTo(String value) {
            addCriterion("GLICUT <>", value, "GLICUT");
            return (Criteria) this;
        }

        public Criteria andGLICUTGreaterThan(String value) {
            addCriterion("GLICUT >", value, "GLICUT");
            return (Criteria) this;
        }

        public Criteria andGLICUTGreaterThanOrEqualTo(String value) {
            addCriterion("GLICUT >=", value, "GLICUT");
            return (Criteria) this;
        }

        public Criteria andGLICUTLessThan(String value) {
            addCriterion("GLICUT <", value, "GLICUT");
            return (Criteria) this;
        }

        public Criteria andGLICUTLessThanOrEqualTo(String value) {
            addCriterion("GLICUT <=", value, "GLICUT");
            return (Criteria) this;
        }

        public Criteria andGLICUTLike(String value) {
            addCriterion("GLICUT like", value, "GLICUT");
            return (Criteria) this;
        }

        public Criteria andGLICUTNotLike(String value) {
            addCriterion("GLICUT not like", value, "GLICUT");
            return (Criteria) this;
        }

        public Criteria andGLICUTIn(List<String> values) {
            addCriterion("GLICUT in", values, "GLICUT");
            return (Criteria) this;
        }

        public Criteria andGLICUTNotIn(List<String> values) {
            addCriterion("GLICUT not in", values, "GLICUT");
            return (Criteria) this;
        }

        public Criteria andGLICUTBetween(String value1, String value2) {
            addCriterion("GLICUT between", value1, value2, "GLICUT");
            return (Criteria) this;
        }

        public Criteria andGLICUTNotBetween(String value1, String value2) {
            addCriterion("GLICUT not between", value1, value2, "GLICUT");
            return (Criteria) this;
        }

        public Criteria andGLDICJIsNull() {
            addCriterion("GLDICJ is null");
            return (Criteria) this;
        }

        public Criteria andGLDICJIsNotNull() {
            addCriterion("GLDICJ is not null");
            return (Criteria) this;
        }

        public Criteria andGLDICJEqualTo(Integer value) {
            addCriterion("GLDICJ =", value, "GLDICJ");
            return (Criteria) this;
        }

        public Criteria andGLDICJNotEqualTo(Integer value) {
            addCriterion("GLDICJ <>", value, "GLDICJ");
            return (Criteria) this;
        }

        public Criteria andGLDICJGreaterThan(Integer value) {
            addCriterion("GLDICJ >", value, "GLDICJ");
            return (Criteria) this;
        }

        public Criteria andGLDICJGreaterThanOrEqualTo(Integer value) {
            addCriterion("GLDICJ >=", value, "GLDICJ");
            return (Criteria) this;
        }

        public Criteria andGLDICJLessThan(Integer value) {
            addCriterion("GLDICJ <", value, "GLDICJ");
            return (Criteria) this;
        }

        public Criteria andGLDICJLessThanOrEqualTo(Integer value) {
            addCriterion("GLDICJ <=", value, "GLDICJ");
            return (Criteria) this;
        }

        public Criteria andGLDICJIn(List<Integer> values) {
            addCriterion("GLDICJ in", values, "GLDICJ");
            return (Criteria) this;
        }

        public Criteria andGLDICJNotIn(List<Integer> values) {
            addCriterion("GLDICJ not in", values, "GLDICJ");
            return (Criteria) this;
        }

        public Criteria andGLDICJBetween(Integer value1, Integer value2) {
            addCriterion("GLDICJ between", value1, value2, "GLDICJ");
            return (Criteria) this;
        }

        public Criteria andGLDICJNotBetween(Integer value1, Integer value2) {
            addCriterion("GLDICJ not between", value1, value2, "GLDICJ");
            return (Criteria) this;
        }

        public Criteria andGLDSYJIsNull() {
            addCriterion("GLDSYJ is null");
            return (Criteria) this;
        }

        public Criteria andGLDSYJIsNotNull() {
            addCriterion("GLDSYJ is not null");
            return (Criteria) this;
        }

        public Criteria andGLDSYJEqualTo(Integer value) {
            addCriterion("GLDSYJ =", value, "GLDSYJ");
            return (Criteria) this;
        }

        public Criteria andGLDSYJNotEqualTo(Integer value) {
            addCriterion("GLDSYJ <>", value, "GLDSYJ");
            return (Criteria) this;
        }

        public Criteria andGLDSYJGreaterThan(Integer value) {
            addCriterion("GLDSYJ >", value, "GLDSYJ");
            return (Criteria) this;
        }

        public Criteria andGLDSYJGreaterThanOrEqualTo(Integer value) {
            addCriterion("GLDSYJ >=", value, "GLDSYJ");
            return (Criteria) this;
        }

        public Criteria andGLDSYJLessThan(Integer value) {
            addCriterion("GLDSYJ <", value, "GLDSYJ");
            return (Criteria) this;
        }

        public Criteria andGLDSYJLessThanOrEqualTo(Integer value) {
            addCriterion("GLDSYJ <=", value, "GLDSYJ");
            return (Criteria) this;
        }

        public Criteria andGLDSYJIn(List<Integer> values) {
            addCriterion("GLDSYJ in", values, "GLDSYJ");
            return (Criteria) this;
        }

        public Criteria andGLDSYJNotIn(List<Integer> values) {
            addCriterion("GLDSYJ not in", values, "GLDSYJ");
            return (Criteria) this;
        }

        public Criteria andGLDSYJBetween(Integer value1, Integer value2) {
            addCriterion("GLDSYJ between", value1, value2, "GLDSYJ");
            return (Criteria) this;
        }

        public Criteria andGLDSYJNotBetween(Integer value1, Integer value2) {
            addCriterion("GLDSYJ not between", value1, value2, "GLDSYJ");
            return (Criteria) this;
        }

        public Criteria andGLTICUIsNull() {
            addCriterion("GLTICU is null");
            return (Criteria) this;
        }

        public Criteria andGLTICUIsNotNull() {
            addCriterion("GLTICU is not null");
            return (Criteria) this;
        }

        public Criteria andGLTICUEqualTo(BigDecimal value) {
            addCriterion("GLTICU =", value, "GLTICU");
            return (Criteria) this;
        }

        public Criteria andGLTICUNotEqualTo(BigDecimal value) {
            addCriterion("GLTICU <>", value, "GLTICU");
            return (Criteria) this;
        }

        public Criteria andGLTICUGreaterThan(BigDecimal value) {
            addCriterion("GLTICU >", value, "GLTICU");
            return (Criteria) this;
        }

        public Criteria andGLTICUGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLTICU >=", value, "GLTICU");
            return (Criteria) this;
        }

        public Criteria andGLTICULessThan(BigDecimal value) {
            addCriterion("GLTICU <", value, "GLTICU");
            return (Criteria) this;
        }

        public Criteria andGLTICULessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLTICU <=", value, "GLTICU");
            return (Criteria) this;
        }

        public Criteria andGLTICUIn(List<BigDecimal> values) {
            addCriterion("GLTICU in", values, "GLTICU");
            return (Criteria) this;
        }

        public Criteria andGLTICUNotIn(List<BigDecimal> values) {
            addCriterion("GLTICU not in", values, "GLTICU");
            return (Criteria) this;
        }

        public Criteria andGLTICUBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLTICU between", value1, value2, "GLTICU");
            return (Criteria) this;
        }

        public Criteria andGLTICUNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLTICU not between", value1, value2, "GLTICU");
            return (Criteria) this;
        }

        public Criteria andGLCOIsNull() {
            addCriterion("GLCO is null");
            return (Criteria) this;
        }

        public Criteria andGLCOIsNotNull() {
            addCriterion("GLCO is not null");
            return (Criteria) this;
        }

        public Criteria andGLCOEqualTo(String value) {
            addCriterion("GLCO =", value, "GLCO");
            return (Criteria) this;
        }

        public Criteria andGLCONotEqualTo(String value) {
            addCriterion("GLCO <>", value, "GLCO");
            return (Criteria) this;
        }

        public Criteria andGLCOGreaterThan(String value) {
            addCriterion("GLCO >", value, "GLCO");
            return (Criteria) this;
        }

        public Criteria andGLCOGreaterThanOrEqualTo(String value) {
            addCriterion("GLCO >=", value, "GLCO");
            return (Criteria) this;
        }

        public Criteria andGLCOLessThan(String value) {
            addCriterion("GLCO <", value, "GLCO");
            return (Criteria) this;
        }

        public Criteria andGLCOLessThanOrEqualTo(String value) {
            addCriterion("GLCO <=", value, "GLCO");
            return (Criteria) this;
        }

        public Criteria andGLCOLike(String value) {
            addCriterion("GLCO like", value, "GLCO");
            return (Criteria) this;
        }

        public Criteria andGLCONotLike(String value) {
            addCriterion("GLCO not like", value, "GLCO");
            return (Criteria) this;
        }

        public Criteria andGLCOIn(List<String> values) {
            addCriterion("GLCO in", values, "GLCO");
            return (Criteria) this;
        }

        public Criteria andGLCONotIn(List<String> values) {
            addCriterion("GLCO not in", values, "GLCO");
            return (Criteria) this;
        }

        public Criteria andGLCOBetween(String value1, String value2) {
            addCriterion("GLCO between", value1, value2, "GLCO");
            return (Criteria) this;
        }

        public Criteria andGLCONotBetween(String value1, String value2) {
            addCriterion("GLCO not between", value1, value2, "GLCO");
            return (Criteria) this;
        }

        public Criteria andGLANIIsNull() {
            addCriterion("GLANI is null");
            return (Criteria) this;
        }

        public Criteria andGLANIIsNotNull() {
            addCriterion("GLANI is not null");
            return (Criteria) this;
        }

        public Criteria andGLANIEqualTo(String value) {
            addCriterion("GLANI =", value, "GLANI");
            return (Criteria) this;
        }

        public Criteria andGLANINotEqualTo(String value) {
            addCriterion("GLANI <>", value, "GLANI");
            return (Criteria) this;
        }

        public Criteria andGLANIGreaterThan(String value) {
            addCriterion("GLANI >", value, "GLANI");
            return (Criteria) this;
        }

        public Criteria andGLANIGreaterThanOrEqualTo(String value) {
            addCriterion("GLANI >=", value, "GLANI");
            return (Criteria) this;
        }

        public Criteria andGLANILessThan(String value) {
            addCriterion("GLANI <", value, "GLANI");
            return (Criteria) this;
        }

        public Criteria andGLANILessThanOrEqualTo(String value) {
            addCriterion("GLANI <=", value, "GLANI");
            return (Criteria) this;
        }

        public Criteria andGLANILike(String value) {
            addCriterion("GLANI like", value, "GLANI");
            return (Criteria) this;
        }

        public Criteria andGLANINotLike(String value) {
            addCriterion("GLANI not like", value, "GLANI");
            return (Criteria) this;
        }

        public Criteria andGLANIIn(List<String> values) {
            addCriterion("GLANI in", values, "GLANI");
            return (Criteria) this;
        }

        public Criteria andGLANINotIn(List<String> values) {
            addCriterion("GLANI not in", values, "GLANI");
            return (Criteria) this;
        }

        public Criteria andGLANIBetween(String value1, String value2) {
            addCriterion("GLANI between", value1, value2, "GLANI");
            return (Criteria) this;
        }

        public Criteria andGLANINotBetween(String value1, String value2) {
            addCriterion("GLANI not between", value1, value2, "GLANI");
            return (Criteria) this;
        }

        public Criteria andGLAMIsNull() {
            addCriterion("GLAM is null");
            return (Criteria) this;
        }

        public Criteria andGLAMIsNotNull() {
            addCriterion("GLAM is not null");
            return (Criteria) this;
        }

        public Criteria andGLAMEqualTo(String value) {
            addCriterion("GLAM =", value, "GLAM");
            return (Criteria) this;
        }

        public Criteria andGLAMNotEqualTo(String value) {
            addCriterion("GLAM <>", value, "GLAM");
            return (Criteria) this;
        }

        public Criteria andGLAMGreaterThan(String value) {
            addCriterion("GLAM >", value, "GLAM");
            return (Criteria) this;
        }

        public Criteria andGLAMGreaterThanOrEqualTo(String value) {
            addCriterion("GLAM >=", value, "GLAM");
            return (Criteria) this;
        }

        public Criteria andGLAMLessThan(String value) {
            addCriterion("GLAM <", value, "GLAM");
            return (Criteria) this;
        }

        public Criteria andGLAMLessThanOrEqualTo(String value) {
            addCriterion("GLAM <=", value, "GLAM");
            return (Criteria) this;
        }

        public Criteria andGLAMLike(String value) {
            addCriterion("GLAM like", value, "GLAM");
            return (Criteria) this;
        }

        public Criteria andGLAMNotLike(String value) {
            addCriterion("GLAM not like", value, "GLAM");
            return (Criteria) this;
        }

        public Criteria andGLAMIn(List<String> values) {
            addCriterion("GLAM in", values, "GLAM");
            return (Criteria) this;
        }

        public Criteria andGLAMNotIn(List<String> values) {
            addCriterion("GLAM not in", values, "GLAM");
            return (Criteria) this;
        }

        public Criteria andGLAMBetween(String value1, String value2) {
            addCriterion("GLAM between", value1, value2, "GLAM");
            return (Criteria) this;
        }

        public Criteria andGLAMNotBetween(String value1, String value2) {
            addCriterion("GLAM not between", value1, value2, "GLAM");
            return (Criteria) this;
        }

        public Criteria andGLAIDIsNull() {
            addCriterion("GLAID is null");
            return (Criteria) this;
        }

        public Criteria andGLAIDIsNotNull() {
            addCriterion("GLAID is not null");
            return (Criteria) this;
        }

        public Criteria andGLAIDEqualTo(String value) {
            addCriterion("GLAID =", value, "GLAID");
            return (Criteria) this;
        }

        public Criteria andGLAIDNotEqualTo(String value) {
            addCriterion("GLAID <>", value, "GLAID");
            return (Criteria) this;
        }

        public Criteria andGLAIDGreaterThan(String value) {
            addCriterion("GLAID >", value, "GLAID");
            return (Criteria) this;
        }

        public Criteria andGLAIDGreaterThanOrEqualTo(String value) {
            addCriterion("GLAID >=", value, "GLAID");
            return (Criteria) this;
        }

        public Criteria andGLAIDLessThan(String value) {
            addCriterion("GLAID <", value, "GLAID");
            return (Criteria) this;
        }

        public Criteria andGLAIDLessThanOrEqualTo(String value) {
            addCriterion("GLAID <=", value, "GLAID");
            return (Criteria) this;
        }

        public Criteria andGLAIDLike(String value) {
            addCriterion("GLAID like", value, "GLAID");
            return (Criteria) this;
        }

        public Criteria andGLAIDNotLike(String value) {
            addCriterion("GLAID not like", value, "GLAID");
            return (Criteria) this;
        }

        public Criteria andGLAIDIn(List<String> values) {
            addCriterion("GLAID in", values, "GLAID");
            return (Criteria) this;
        }

        public Criteria andGLAIDNotIn(List<String> values) {
            addCriterion("GLAID not in", values, "GLAID");
            return (Criteria) this;
        }

        public Criteria andGLAIDBetween(String value1, String value2) {
            addCriterion("GLAID between", value1, value2, "GLAID");
            return (Criteria) this;
        }

        public Criteria andGLAIDNotBetween(String value1, String value2) {
            addCriterion("GLAID not between", value1, value2, "GLAID");
            return (Criteria) this;
        }

        public Criteria andGLMCUIsNull() {
            addCriterion("GLMCU is null");
            return (Criteria) this;
        }

        public Criteria andGLMCUIsNotNull() {
            addCriterion("GLMCU is not null");
            return (Criteria) this;
        }

        public Criteria andGLMCUEqualTo(String value) {
            addCriterion("GLMCU =", value, "GLMCU");
            return (Criteria) this;
        }

        public Criteria andGLMCUNotEqualTo(String value) {
            addCriterion("GLMCU <>", value, "GLMCU");
            return (Criteria) this;
        }

        public Criteria andGLMCUGreaterThan(String value) {
            addCriterion("GLMCU >", value, "GLMCU");
            return (Criteria) this;
        }

        public Criteria andGLMCUGreaterThanOrEqualTo(String value) {
            addCriterion("GLMCU >=", value, "GLMCU");
            return (Criteria) this;
        }

        public Criteria andGLMCULessThan(String value) {
            addCriterion("GLMCU <", value, "GLMCU");
            return (Criteria) this;
        }

        public Criteria andGLMCULessThanOrEqualTo(String value) {
            addCriterion("GLMCU <=", value, "GLMCU");
            return (Criteria) this;
        }

        public Criteria andGLMCULike(String value) {
            addCriterion("GLMCU like", value, "GLMCU");
            return (Criteria) this;
        }

        public Criteria andGLMCUNotLike(String value) {
            addCriterion("GLMCU not like", value, "GLMCU");
            return (Criteria) this;
        }

        public Criteria andGLMCUIn(List<String> values) {
            addCriterion("GLMCU in", values, "GLMCU");
            return (Criteria) this;
        }

        public Criteria andGLMCUNotIn(List<String> values) {
            addCriterion("GLMCU not in", values, "GLMCU");
            return (Criteria) this;
        }

        public Criteria andGLMCUBetween(String value1, String value2) {
            addCriterion("GLMCU between", value1, value2, "GLMCU");
            return (Criteria) this;
        }

        public Criteria andGLMCUNotBetween(String value1, String value2) {
            addCriterion("GLMCU not between", value1, value2, "GLMCU");
            return (Criteria) this;
        }

        public Criteria andGLOBJIsNull() {
            addCriterion("GLOBJ is null");
            return (Criteria) this;
        }

        public Criteria andGLOBJIsNotNull() {
            addCriterion("GLOBJ is not null");
            return (Criteria) this;
        }

        public Criteria andGLOBJEqualTo(String value) {
            addCriterion("GLOBJ =", value, "GLOBJ");
            return (Criteria) this;
        }

        public Criteria andGLOBJNotEqualTo(String value) {
            addCriterion("GLOBJ <>", value, "GLOBJ");
            return (Criteria) this;
        }

        public Criteria andGLOBJGreaterThan(String value) {
            addCriterion("GLOBJ >", value, "GLOBJ");
            return (Criteria) this;
        }

        public Criteria andGLOBJGreaterThanOrEqualTo(String value) {
            addCriterion("GLOBJ >=", value, "GLOBJ");
            return (Criteria) this;
        }

        public Criteria andGLOBJLessThan(String value) {
            addCriterion("GLOBJ <", value, "GLOBJ");
            return (Criteria) this;
        }

        public Criteria andGLOBJLessThanOrEqualTo(String value) {
            addCriterion("GLOBJ <=", value, "GLOBJ");
            return (Criteria) this;
        }

        public Criteria andGLOBJLike(String value) {
            addCriterion("GLOBJ like", value, "GLOBJ");
            return (Criteria) this;
        }

        public Criteria andGLOBJNotLike(String value) {
            addCriterion("GLOBJ not like", value, "GLOBJ");
            return (Criteria) this;
        }

        public Criteria andGLOBJIn(List<String> values) {
            addCriterion("GLOBJ in", values, "GLOBJ");
            return (Criteria) this;
        }

        public Criteria andGLOBJNotIn(List<String> values) {
            addCriterion("GLOBJ not in", values, "GLOBJ");
            return (Criteria) this;
        }

        public Criteria andGLOBJBetween(String value1, String value2) {
            addCriterion("GLOBJ between", value1, value2, "GLOBJ");
            return (Criteria) this;
        }

        public Criteria andGLOBJNotBetween(String value1, String value2) {
            addCriterion("GLOBJ not between", value1, value2, "GLOBJ");
            return (Criteria) this;
        }

        public Criteria andGLSUBIsNull() {
            addCriterion("GLSUB is null");
            return (Criteria) this;
        }

        public Criteria andGLSUBIsNotNull() {
            addCriterion("GLSUB is not null");
            return (Criteria) this;
        }

        public Criteria andGLSUBEqualTo(String value) {
            addCriterion("GLSUB =", value, "GLSUB");
            return (Criteria) this;
        }

        public Criteria andGLSUBNotEqualTo(String value) {
            addCriterion("GLSUB <>", value, "GLSUB");
            return (Criteria) this;
        }

        public Criteria andGLSUBGreaterThan(String value) {
            addCriterion("GLSUB >", value, "GLSUB");
            return (Criteria) this;
        }

        public Criteria andGLSUBGreaterThanOrEqualTo(String value) {
            addCriterion("GLSUB >=", value, "GLSUB");
            return (Criteria) this;
        }

        public Criteria andGLSUBLessThan(String value) {
            addCriterion("GLSUB <", value, "GLSUB");
            return (Criteria) this;
        }

        public Criteria andGLSUBLessThanOrEqualTo(String value) {
            addCriterion("GLSUB <=", value, "GLSUB");
            return (Criteria) this;
        }

        public Criteria andGLSUBLike(String value) {
            addCriterion("GLSUB like", value, "GLSUB");
            return (Criteria) this;
        }

        public Criteria andGLSUBNotLike(String value) {
            addCriterion("GLSUB not like", value, "GLSUB");
            return (Criteria) this;
        }

        public Criteria andGLSUBIn(List<String> values) {
            addCriterion("GLSUB in", values, "GLSUB");
            return (Criteria) this;
        }

        public Criteria andGLSUBNotIn(List<String> values) {
            addCriterion("GLSUB not in", values, "GLSUB");
            return (Criteria) this;
        }

        public Criteria andGLSUBBetween(String value1, String value2) {
            addCriterion("GLSUB between", value1, value2, "GLSUB");
            return (Criteria) this;
        }

        public Criteria andGLSUBNotBetween(String value1, String value2) {
            addCriterion("GLSUB not between", value1, value2, "GLSUB");
            return (Criteria) this;
        }

        public Criteria andGLSBLIsNull() {
            addCriterion("GLSBL is null");
            return (Criteria) this;
        }

        public Criteria andGLSBLIsNotNull() {
            addCriterion("GLSBL is not null");
            return (Criteria) this;
        }

        public Criteria andGLSBLEqualTo(String value) {
            addCriterion("GLSBL =", value, "GLSBL");
            return (Criteria) this;
        }

        public Criteria andGLSBLNotEqualTo(String value) {
            addCriterion("GLSBL <>", value, "GLSBL");
            return (Criteria) this;
        }

        public Criteria andGLSBLGreaterThan(String value) {
            addCriterion("GLSBL >", value, "GLSBL");
            return (Criteria) this;
        }

        public Criteria andGLSBLGreaterThanOrEqualTo(String value) {
            addCriterion("GLSBL >=", value, "GLSBL");
            return (Criteria) this;
        }

        public Criteria andGLSBLLessThan(String value) {
            addCriterion("GLSBL <", value, "GLSBL");
            return (Criteria) this;
        }

        public Criteria andGLSBLLessThanOrEqualTo(String value) {
            addCriterion("GLSBL <=", value, "GLSBL");
            return (Criteria) this;
        }

        public Criteria andGLSBLLike(String value) {
            addCriterion("GLSBL like", value, "GLSBL");
            return (Criteria) this;
        }

        public Criteria andGLSBLNotLike(String value) {
            addCriterion("GLSBL not like", value, "GLSBL");
            return (Criteria) this;
        }

        public Criteria andGLSBLIn(List<String> values) {
            addCriterion("GLSBL in", values, "GLSBL");
            return (Criteria) this;
        }

        public Criteria andGLSBLNotIn(List<String> values) {
            addCriterion("GLSBL not in", values, "GLSBL");
            return (Criteria) this;
        }

        public Criteria andGLSBLBetween(String value1, String value2) {
            addCriterion("GLSBL between", value1, value2, "GLSBL");
            return (Criteria) this;
        }

        public Criteria andGLSBLNotBetween(String value1, String value2) {
            addCriterion("GLSBL not between", value1, value2, "GLSBL");
            return (Criteria) this;
        }

        public Criteria andGLSBLTIsNull() {
            addCriterion("GLSBLT is null");
            return (Criteria) this;
        }

        public Criteria andGLSBLTIsNotNull() {
            addCriterion("GLSBLT is not null");
            return (Criteria) this;
        }

        public Criteria andGLSBLTEqualTo(String value) {
            addCriterion("GLSBLT =", value, "GLSBLT");
            return (Criteria) this;
        }

        public Criteria andGLSBLTNotEqualTo(String value) {
            addCriterion("GLSBLT <>", value, "GLSBLT");
            return (Criteria) this;
        }

        public Criteria andGLSBLTGreaterThan(String value) {
            addCriterion("GLSBLT >", value, "GLSBLT");
            return (Criteria) this;
        }

        public Criteria andGLSBLTGreaterThanOrEqualTo(String value) {
            addCriterion("GLSBLT >=", value, "GLSBLT");
            return (Criteria) this;
        }

        public Criteria andGLSBLTLessThan(String value) {
            addCriterion("GLSBLT <", value, "GLSBLT");
            return (Criteria) this;
        }

        public Criteria andGLSBLTLessThanOrEqualTo(String value) {
            addCriterion("GLSBLT <=", value, "GLSBLT");
            return (Criteria) this;
        }

        public Criteria andGLSBLTLike(String value) {
            addCriterion("GLSBLT like", value, "GLSBLT");
            return (Criteria) this;
        }

        public Criteria andGLSBLTNotLike(String value) {
            addCriterion("GLSBLT not like", value, "GLSBLT");
            return (Criteria) this;
        }

        public Criteria andGLSBLTIn(List<String> values) {
            addCriterion("GLSBLT in", values, "GLSBLT");
            return (Criteria) this;
        }

        public Criteria andGLSBLTNotIn(List<String> values) {
            addCriterion("GLSBLT not in", values, "GLSBLT");
            return (Criteria) this;
        }

        public Criteria andGLSBLTBetween(String value1, String value2) {
            addCriterion("GLSBLT between", value1, value2, "GLSBLT");
            return (Criteria) this;
        }

        public Criteria andGLSBLTNotBetween(String value1, String value2) {
            addCriterion("GLSBLT not between", value1, value2, "GLSBLT");
            return (Criteria) this;
        }

        public Criteria andGLLTIsNull() {
            addCriterion("GLLT is null");
            return (Criteria) this;
        }

        public Criteria andGLLTIsNotNull() {
            addCriterion("GLLT is not null");
            return (Criteria) this;
        }

        public Criteria andGLLTEqualTo(String value) {
            addCriterion("GLLT =", value, "GLLT");
            return (Criteria) this;
        }

        public Criteria andGLLTNotEqualTo(String value) {
            addCriterion("GLLT <>", value, "GLLT");
            return (Criteria) this;
        }

        public Criteria andGLLTGreaterThan(String value) {
            addCriterion("GLLT >", value, "GLLT");
            return (Criteria) this;
        }

        public Criteria andGLLTGreaterThanOrEqualTo(String value) {
            addCriterion("GLLT >=", value, "GLLT");
            return (Criteria) this;
        }

        public Criteria andGLLTLessThan(String value) {
            addCriterion("GLLT <", value, "GLLT");
            return (Criteria) this;
        }

        public Criteria andGLLTLessThanOrEqualTo(String value) {
            addCriterion("GLLT <=", value, "GLLT");
            return (Criteria) this;
        }

        public Criteria andGLLTLike(String value) {
            addCriterion("GLLT like", value, "GLLT");
            return (Criteria) this;
        }

        public Criteria andGLLTNotLike(String value) {
            addCriterion("GLLT not like", value, "GLLT");
            return (Criteria) this;
        }

        public Criteria andGLLTIn(List<String> values) {
            addCriterion("GLLT in", values, "GLLT");
            return (Criteria) this;
        }

        public Criteria andGLLTNotIn(List<String> values) {
            addCriterion("GLLT not in", values, "GLLT");
            return (Criteria) this;
        }

        public Criteria andGLLTBetween(String value1, String value2) {
            addCriterion("GLLT between", value1, value2, "GLLT");
            return (Criteria) this;
        }

        public Criteria andGLLTNotBetween(String value1, String value2) {
            addCriterion("GLLT not between", value1, value2, "GLLT");
            return (Criteria) this;
        }

        public Criteria andGLPNIsNull() {
            addCriterion("GLPN is null");
            return (Criteria) this;
        }

        public Criteria andGLPNIsNotNull() {
            addCriterion("GLPN is not null");
            return (Criteria) this;
        }

        public Criteria andGLPNEqualTo(BigDecimal value) {
            addCriterion("GLPN =", value, "GLPN");
            return (Criteria) this;
        }

        public Criteria andGLPNNotEqualTo(BigDecimal value) {
            addCriterion("GLPN <>", value, "GLPN");
            return (Criteria) this;
        }

        public Criteria andGLPNGreaterThan(BigDecimal value) {
            addCriterion("GLPN >", value, "GLPN");
            return (Criteria) this;
        }

        public Criteria andGLPNGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLPN >=", value, "GLPN");
            return (Criteria) this;
        }

        public Criteria andGLPNLessThan(BigDecimal value) {
            addCriterion("GLPN <", value, "GLPN");
            return (Criteria) this;
        }

        public Criteria andGLPNLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLPN <=", value, "GLPN");
            return (Criteria) this;
        }

        public Criteria andGLPNIn(List<BigDecimal> values) {
            addCriterion("GLPN in", values, "GLPN");
            return (Criteria) this;
        }

        public Criteria andGLPNNotIn(List<BigDecimal> values) {
            addCriterion("GLPN not in", values, "GLPN");
            return (Criteria) this;
        }

        public Criteria andGLPNBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLPN between", value1, value2, "GLPN");
            return (Criteria) this;
        }

        public Criteria andGLPNNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLPN not between", value1, value2, "GLPN");
            return (Criteria) this;
        }

        public Criteria andGLCTRYIsNull() {
            addCriterion("GLCTRY is null");
            return (Criteria) this;
        }

        public Criteria andGLCTRYIsNotNull() {
            addCriterion("GLCTRY is not null");
            return (Criteria) this;
        }

        public Criteria andGLCTRYEqualTo(BigDecimal value) {
            addCriterion("GLCTRY =", value, "GLCTRY");
            return (Criteria) this;
        }

        public Criteria andGLCTRYNotEqualTo(BigDecimal value) {
            addCriterion("GLCTRY <>", value, "GLCTRY");
            return (Criteria) this;
        }

        public Criteria andGLCTRYGreaterThan(BigDecimal value) {
            addCriterion("GLCTRY >", value, "GLCTRY");
            return (Criteria) this;
        }

        public Criteria andGLCTRYGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLCTRY >=", value, "GLCTRY");
            return (Criteria) this;
        }

        public Criteria andGLCTRYLessThan(BigDecimal value) {
            addCriterion("GLCTRY <", value, "GLCTRY");
            return (Criteria) this;
        }

        public Criteria andGLCTRYLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLCTRY <=", value, "GLCTRY");
            return (Criteria) this;
        }

        public Criteria andGLCTRYIn(List<BigDecimal> values) {
            addCriterion("GLCTRY in", values, "GLCTRY");
            return (Criteria) this;
        }

        public Criteria andGLCTRYNotIn(List<BigDecimal> values) {
            addCriterion("GLCTRY not in", values, "GLCTRY");
            return (Criteria) this;
        }

        public Criteria andGLCTRYBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLCTRY between", value1, value2, "GLCTRY");
            return (Criteria) this;
        }

        public Criteria andGLCTRYNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLCTRY not between", value1, value2, "GLCTRY");
            return (Criteria) this;
        }

        public Criteria andGLFYIsNull() {
            addCriterion("GLFY is null");
            return (Criteria) this;
        }

        public Criteria andGLFYIsNotNull() {
            addCriterion("GLFY is not null");
            return (Criteria) this;
        }

        public Criteria andGLFYEqualTo(BigDecimal value) {
            addCriterion("GLFY =", value, "GLFY");
            return (Criteria) this;
        }

        public Criteria andGLFYNotEqualTo(BigDecimal value) {
            addCriterion("GLFY <>", value, "GLFY");
            return (Criteria) this;
        }

        public Criteria andGLFYGreaterThan(BigDecimal value) {
            addCriterion("GLFY >", value, "GLFY");
            return (Criteria) this;
        }

        public Criteria andGLFYGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLFY >=", value, "GLFY");
            return (Criteria) this;
        }

        public Criteria andGLFYLessThan(BigDecimal value) {
            addCriterion("GLFY <", value, "GLFY");
            return (Criteria) this;
        }

        public Criteria andGLFYLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLFY <=", value, "GLFY");
            return (Criteria) this;
        }

        public Criteria andGLFYIn(List<BigDecimal> values) {
            addCriterion("GLFY in", values, "GLFY");
            return (Criteria) this;
        }

        public Criteria andGLFYNotIn(List<BigDecimal> values) {
            addCriterion("GLFY not in", values, "GLFY");
            return (Criteria) this;
        }

        public Criteria andGLFYBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLFY between", value1, value2, "GLFY");
            return (Criteria) this;
        }

        public Criteria andGLFYNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLFY not between", value1, value2, "GLFY");
            return (Criteria) this;
        }

        public Criteria andGLFQIsNull() {
            addCriterion("GLFQ is null");
            return (Criteria) this;
        }

        public Criteria andGLFQIsNotNull() {
            addCriterion("GLFQ is not null");
            return (Criteria) this;
        }

        public Criteria andGLFQEqualTo(String value) {
            addCriterion("GLFQ =", value, "GLFQ");
            return (Criteria) this;
        }

        public Criteria andGLFQNotEqualTo(String value) {
            addCriterion("GLFQ <>", value, "GLFQ");
            return (Criteria) this;
        }

        public Criteria andGLFQGreaterThan(String value) {
            addCriterion("GLFQ >", value, "GLFQ");
            return (Criteria) this;
        }

        public Criteria andGLFQGreaterThanOrEqualTo(String value) {
            addCriterion("GLFQ >=", value, "GLFQ");
            return (Criteria) this;
        }

        public Criteria andGLFQLessThan(String value) {
            addCriterion("GLFQ <", value, "GLFQ");
            return (Criteria) this;
        }

        public Criteria andGLFQLessThanOrEqualTo(String value) {
            addCriterion("GLFQ <=", value, "GLFQ");
            return (Criteria) this;
        }

        public Criteria andGLFQLike(String value) {
            addCriterion("GLFQ like", value, "GLFQ");
            return (Criteria) this;
        }

        public Criteria andGLFQNotLike(String value) {
            addCriterion("GLFQ not like", value, "GLFQ");
            return (Criteria) this;
        }

        public Criteria andGLFQIn(List<String> values) {
            addCriterion("GLFQ in", values, "GLFQ");
            return (Criteria) this;
        }

        public Criteria andGLFQNotIn(List<String> values) {
            addCriterion("GLFQ not in", values, "GLFQ");
            return (Criteria) this;
        }

        public Criteria andGLFQBetween(String value1, String value2) {
            addCriterion("GLFQ between", value1, value2, "GLFQ");
            return (Criteria) this;
        }

        public Criteria andGLFQNotBetween(String value1, String value2) {
            addCriterion("GLFQ not between", value1, value2, "GLFQ");
            return (Criteria) this;
        }

        public Criteria andGLCRCDIsNull() {
            addCriterion("GLCRCD is null");
            return (Criteria) this;
        }

        public Criteria andGLCRCDIsNotNull() {
            addCriterion("GLCRCD is not null");
            return (Criteria) this;
        }

        public Criteria andGLCRCDEqualTo(String value) {
            addCriterion("GLCRCD =", value, "GLCRCD");
            return (Criteria) this;
        }

        public Criteria andGLCRCDNotEqualTo(String value) {
            addCriterion("GLCRCD <>", value, "GLCRCD");
            return (Criteria) this;
        }

        public Criteria andGLCRCDGreaterThan(String value) {
            addCriterion("GLCRCD >", value, "GLCRCD");
            return (Criteria) this;
        }

        public Criteria andGLCRCDGreaterThanOrEqualTo(String value) {
            addCriterion("GLCRCD >=", value, "GLCRCD");
            return (Criteria) this;
        }

        public Criteria andGLCRCDLessThan(String value) {
            addCriterion("GLCRCD <", value, "GLCRCD");
            return (Criteria) this;
        }

        public Criteria andGLCRCDLessThanOrEqualTo(String value) {
            addCriterion("GLCRCD <=", value, "GLCRCD");
            return (Criteria) this;
        }

        public Criteria andGLCRCDLike(String value) {
            addCriterion("GLCRCD like", value, "GLCRCD");
            return (Criteria) this;
        }

        public Criteria andGLCRCDNotLike(String value) {
            addCriterion("GLCRCD not like", value, "GLCRCD");
            return (Criteria) this;
        }

        public Criteria andGLCRCDIn(List<String> values) {
            addCriterion("GLCRCD in", values, "GLCRCD");
            return (Criteria) this;
        }

        public Criteria andGLCRCDNotIn(List<String> values) {
            addCriterion("GLCRCD not in", values, "GLCRCD");
            return (Criteria) this;
        }

        public Criteria andGLCRCDBetween(String value1, String value2) {
            addCriterion("GLCRCD between", value1, value2, "GLCRCD");
            return (Criteria) this;
        }

        public Criteria andGLCRCDNotBetween(String value1, String value2) {
            addCriterion("GLCRCD not between", value1, value2, "GLCRCD");
            return (Criteria) this;
        }

        public Criteria andGLCRRIsNull() {
            addCriterion("GLCRR is null");
            return (Criteria) this;
        }

        public Criteria andGLCRRIsNotNull() {
            addCriterion("GLCRR is not null");
            return (Criteria) this;
        }

        public Criteria andGLCRREqualTo(BigDecimal value) {
            addCriterion("GLCRR =", value, "GLCRR");
            return (Criteria) this;
        }

        public Criteria andGLCRRNotEqualTo(BigDecimal value) {
            addCriterion("GLCRR <>", value, "GLCRR");
            return (Criteria) this;
        }

        public Criteria andGLCRRGreaterThan(BigDecimal value) {
            addCriterion("GLCRR >", value, "GLCRR");
            return (Criteria) this;
        }

        public Criteria andGLCRRGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLCRR >=", value, "GLCRR");
            return (Criteria) this;
        }

        public Criteria andGLCRRLessThan(BigDecimal value) {
            addCriterion("GLCRR <", value, "GLCRR");
            return (Criteria) this;
        }

        public Criteria andGLCRRLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLCRR <=", value, "GLCRR");
            return (Criteria) this;
        }

        public Criteria andGLCRRIn(List<BigDecimal> values) {
            addCriterion("GLCRR in", values, "GLCRR");
            return (Criteria) this;
        }

        public Criteria andGLCRRNotIn(List<BigDecimal> values) {
            addCriterion("GLCRR not in", values, "GLCRR");
            return (Criteria) this;
        }

        public Criteria andGLCRRBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLCRR between", value1, value2, "GLCRR");
            return (Criteria) this;
        }

        public Criteria andGLCRRNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLCRR not between", value1, value2, "GLCRR");
            return (Criteria) this;
        }

        public Criteria andGLHCRRIsNull() {
            addCriterion("GLHCRR is null");
            return (Criteria) this;
        }

        public Criteria andGLHCRRIsNotNull() {
            addCriterion("GLHCRR is not null");
            return (Criteria) this;
        }

        public Criteria andGLHCRREqualTo(BigDecimal value) {
            addCriterion("GLHCRR =", value, "GLHCRR");
            return (Criteria) this;
        }

        public Criteria andGLHCRRNotEqualTo(BigDecimal value) {
            addCriterion("GLHCRR <>", value, "GLHCRR");
            return (Criteria) this;
        }

        public Criteria andGLHCRRGreaterThan(BigDecimal value) {
            addCriterion("GLHCRR >", value, "GLHCRR");
            return (Criteria) this;
        }

        public Criteria andGLHCRRGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLHCRR >=", value, "GLHCRR");
            return (Criteria) this;
        }

        public Criteria andGLHCRRLessThan(BigDecimal value) {
            addCriterion("GLHCRR <", value, "GLHCRR");
            return (Criteria) this;
        }

        public Criteria andGLHCRRLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLHCRR <=", value, "GLHCRR");
            return (Criteria) this;
        }

        public Criteria andGLHCRRIn(List<BigDecimal> values) {
            addCriterion("GLHCRR in", values, "GLHCRR");
            return (Criteria) this;
        }

        public Criteria andGLHCRRNotIn(List<BigDecimal> values) {
            addCriterion("GLHCRR not in", values, "GLHCRR");
            return (Criteria) this;
        }

        public Criteria andGLHCRRBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLHCRR between", value1, value2, "GLHCRR");
            return (Criteria) this;
        }

        public Criteria andGLHCRRNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLHCRR not between", value1, value2, "GLHCRR");
            return (Criteria) this;
        }

        public Criteria andGLHDGJIsNull() {
            addCriterion("GLHDGJ is null");
            return (Criteria) this;
        }

        public Criteria andGLHDGJIsNotNull() {
            addCriterion("GLHDGJ is not null");
            return (Criteria) this;
        }

        public Criteria andGLHDGJEqualTo(Integer value) {
            addCriterion("GLHDGJ =", value, "GLHDGJ");
            return (Criteria) this;
        }

        public Criteria andGLHDGJNotEqualTo(Integer value) {
            addCriterion("GLHDGJ <>", value, "GLHDGJ");
            return (Criteria) this;
        }

        public Criteria andGLHDGJGreaterThan(Integer value) {
            addCriterion("GLHDGJ >", value, "GLHDGJ");
            return (Criteria) this;
        }

        public Criteria andGLHDGJGreaterThanOrEqualTo(Integer value) {
            addCriterion("GLHDGJ >=", value, "GLHDGJ");
            return (Criteria) this;
        }

        public Criteria andGLHDGJLessThan(Integer value) {
            addCriterion("GLHDGJ <", value, "GLHDGJ");
            return (Criteria) this;
        }

        public Criteria andGLHDGJLessThanOrEqualTo(Integer value) {
            addCriterion("GLHDGJ <=", value, "GLHDGJ");
            return (Criteria) this;
        }

        public Criteria andGLHDGJIn(List<Integer> values) {
            addCriterion("GLHDGJ in", values, "GLHDGJ");
            return (Criteria) this;
        }

        public Criteria andGLHDGJNotIn(List<Integer> values) {
            addCriterion("GLHDGJ not in", values, "GLHDGJ");
            return (Criteria) this;
        }

        public Criteria andGLHDGJBetween(Integer value1, Integer value2) {
            addCriterion("GLHDGJ between", value1, value2, "GLHDGJ");
            return (Criteria) this;
        }

        public Criteria andGLHDGJNotBetween(Integer value1, Integer value2) {
            addCriterion("GLHDGJ not between", value1, value2, "GLHDGJ");
            return (Criteria) this;
        }

        public Criteria andGLAAIsNull() {
            addCriterion("GLAA is null");
            return (Criteria) this;
        }

        public Criteria andGLAAIsNotNull() {
            addCriterion("GLAA is not null");
            return (Criteria) this;
        }

        public Criteria andGLAAEqualTo(BigDecimal value) {
            addCriterion("GLAA =", value, "GLAA");
            return (Criteria) this;
        }

        public Criteria andGLAANotEqualTo(BigDecimal value) {
            addCriterion("GLAA <>", value, "GLAA");
            return (Criteria) this;
        }

        public Criteria andGLAAGreaterThan(BigDecimal value) {
            addCriterion("GLAA >", value, "GLAA");
            return (Criteria) this;
        }

        public Criteria andGLAAGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLAA >=", value, "GLAA");
            return (Criteria) this;
        }

        public Criteria andGLAALessThan(BigDecimal value) {
            addCriterion("GLAA <", value, "GLAA");
            return (Criteria) this;
        }

        public Criteria andGLAALessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLAA <=", value, "GLAA");
            return (Criteria) this;
        }

        public Criteria andGLAAIn(List<BigDecimal> values) {
            addCriterion("GLAA in", values, "GLAA");
            return (Criteria) this;
        }

        public Criteria andGLAANotIn(List<BigDecimal> values) {
            addCriterion("GLAA not in", values, "GLAA");
            return (Criteria) this;
        }

        public Criteria andGLAABetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLAA between", value1, value2, "GLAA");
            return (Criteria) this;
        }

        public Criteria andGLAANotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLAA not between", value1, value2, "GLAA");
            return (Criteria) this;
        }

        public Criteria andGLUIsNull() {
            addCriterion("GLU is null");
            return (Criteria) this;
        }

        public Criteria andGLUIsNotNull() {
            addCriterion("GLU is not null");
            return (Criteria) this;
        }

        public Criteria andGLUEqualTo(BigDecimal value) {
            addCriterion("GLU =", value, "GLU");
            return (Criteria) this;
        }

        public Criteria andGLUNotEqualTo(BigDecimal value) {
            addCriterion("GLU <>", value, "GLU");
            return (Criteria) this;
        }

        public Criteria andGLUGreaterThan(BigDecimal value) {
            addCriterion("GLU >", value, "GLU");
            return (Criteria) this;
        }

        public Criteria andGLUGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLU >=", value, "GLU");
            return (Criteria) this;
        }

        public Criteria andGLULessThan(BigDecimal value) {
            addCriterion("GLU <", value, "GLU");
            return (Criteria) this;
        }

        public Criteria andGLULessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLU <=", value, "GLU");
            return (Criteria) this;
        }

        public Criteria andGLUIn(List<BigDecimal> values) {
            addCriterion("GLU in", values, "GLU");
            return (Criteria) this;
        }

        public Criteria andGLUNotIn(List<BigDecimal> values) {
            addCriterion("GLU not in", values, "GLU");
            return (Criteria) this;
        }

        public Criteria andGLUBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLU between", value1, value2, "GLU");
            return (Criteria) this;
        }

        public Criteria andGLUNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLU not between", value1, value2, "GLU");
            return (Criteria) this;
        }

        public Criteria andGLUMIsNull() {
            addCriterion("GLUM is null");
            return (Criteria) this;
        }

        public Criteria andGLUMIsNotNull() {
            addCriterion("GLUM is not null");
            return (Criteria) this;
        }

        public Criteria andGLUMEqualTo(String value) {
            addCriterion("GLUM =", value, "GLUM");
            return (Criteria) this;
        }

        public Criteria andGLUMNotEqualTo(String value) {
            addCriterion("GLUM <>", value, "GLUM");
            return (Criteria) this;
        }

        public Criteria andGLUMGreaterThan(String value) {
            addCriterion("GLUM >", value, "GLUM");
            return (Criteria) this;
        }

        public Criteria andGLUMGreaterThanOrEqualTo(String value) {
            addCriterion("GLUM >=", value, "GLUM");
            return (Criteria) this;
        }

        public Criteria andGLUMLessThan(String value) {
            addCriterion("GLUM <", value, "GLUM");
            return (Criteria) this;
        }

        public Criteria andGLUMLessThanOrEqualTo(String value) {
            addCriterion("GLUM <=", value, "GLUM");
            return (Criteria) this;
        }

        public Criteria andGLUMLike(String value) {
            addCriterion("GLUM like", value, "GLUM");
            return (Criteria) this;
        }

        public Criteria andGLUMNotLike(String value) {
            addCriterion("GLUM not like", value, "GLUM");
            return (Criteria) this;
        }

        public Criteria andGLUMIn(List<String> values) {
            addCriterion("GLUM in", values, "GLUM");
            return (Criteria) this;
        }

        public Criteria andGLUMNotIn(List<String> values) {
            addCriterion("GLUM not in", values, "GLUM");
            return (Criteria) this;
        }

        public Criteria andGLUMBetween(String value1, String value2) {
            addCriterion("GLUM between", value1, value2, "GLUM");
            return (Criteria) this;
        }

        public Criteria andGLUMNotBetween(String value1, String value2) {
            addCriterion("GLUM not between", value1, value2, "GLUM");
            return (Criteria) this;
        }

        public Criteria andGLGLCIsNull() {
            addCriterion("GLGLC is null");
            return (Criteria) this;
        }

        public Criteria andGLGLCIsNotNull() {
            addCriterion("GLGLC is not null");
            return (Criteria) this;
        }

        public Criteria andGLGLCEqualTo(String value) {
            addCriterion("GLGLC =", value, "GLGLC");
            return (Criteria) this;
        }

        public Criteria andGLGLCNotEqualTo(String value) {
            addCriterion("GLGLC <>", value, "GLGLC");
            return (Criteria) this;
        }

        public Criteria andGLGLCGreaterThan(String value) {
            addCriterion("GLGLC >", value, "GLGLC");
            return (Criteria) this;
        }

        public Criteria andGLGLCGreaterThanOrEqualTo(String value) {
            addCriterion("GLGLC >=", value, "GLGLC");
            return (Criteria) this;
        }

        public Criteria andGLGLCLessThan(String value) {
            addCriterion("GLGLC <", value, "GLGLC");
            return (Criteria) this;
        }

        public Criteria andGLGLCLessThanOrEqualTo(String value) {
            addCriterion("GLGLC <=", value, "GLGLC");
            return (Criteria) this;
        }

        public Criteria andGLGLCLike(String value) {
            addCriterion("GLGLC like", value, "GLGLC");
            return (Criteria) this;
        }

        public Criteria andGLGLCNotLike(String value) {
            addCriterion("GLGLC not like", value, "GLGLC");
            return (Criteria) this;
        }

        public Criteria andGLGLCIn(List<String> values) {
            addCriterion("GLGLC in", values, "GLGLC");
            return (Criteria) this;
        }

        public Criteria andGLGLCNotIn(List<String> values) {
            addCriterion("GLGLC not in", values, "GLGLC");
            return (Criteria) this;
        }

        public Criteria andGLGLCBetween(String value1, String value2) {
            addCriterion("GLGLC between", value1, value2, "GLGLC");
            return (Criteria) this;
        }

        public Criteria andGLGLCNotBetween(String value1, String value2) {
            addCriterion("GLGLC not between", value1, value2, "GLGLC");
            return (Criteria) this;
        }

        public Criteria andGLREIsNull() {
            addCriterion("GLRE is null");
            return (Criteria) this;
        }

        public Criteria andGLREIsNotNull() {
            addCriterion("GLRE is not null");
            return (Criteria) this;
        }

        public Criteria andGLREEqualTo(String value) {
            addCriterion("GLRE =", value, "GLRE");
            return (Criteria) this;
        }

        public Criteria andGLRENotEqualTo(String value) {
            addCriterion("GLRE <>", value, "GLRE");
            return (Criteria) this;
        }

        public Criteria andGLREGreaterThan(String value) {
            addCriterion("GLRE >", value, "GLRE");
            return (Criteria) this;
        }

        public Criteria andGLREGreaterThanOrEqualTo(String value) {
            addCriterion("GLRE >=", value, "GLRE");
            return (Criteria) this;
        }

        public Criteria andGLRELessThan(String value) {
            addCriterion("GLRE <", value, "GLRE");
            return (Criteria) this;
        }

        public Criteria andGLRELessThanOrEqualTo(String value) {
            addCriterion("GLRE <=", value, "GLRE");
            return (Criteria) this;
        }

        public Criteria andGLRELike(String value) {
            addCriterion("GLRE like", value, "GLRE");
            return (Criteria) this;
        }

        public Criteria andGLRENotLike(String value) {
            addCriterion("GLRE not like", value, "GLRE");
            return (Criteria) this;
        }

        public Criteria andGLREIn(List<String> values) {
            addCriterion("GLRE in", values, "GLRE");
            return (Criteria) this;
        }

        public Criteria andGLRENotIn(List<String> values) {
            addCriterion("GLRE not in", values, "GLRE");
            return (Criteria) this;
        }

        public Criteria andGLREBetween(String value1, String value2) {
            addCriterion("GLRE between", value1, value2, "GLRE");
            return (Criteria) this;
        }

        public Criteria andGLRENotBetween(String value1, String value2) {
            addCriterion("GLRE not between", value1, value2, "GLRE");
            return (Criteria) this;
        }

        public Criteria andGLEXAIsNull() {
            addCriterion("GLEXA is null");
            return (Criteria) this;
        }

        public Criteria andGLEXAIsNotNull() {
            addCriterion("GLEXA is not null");
            return (Criteria) this;
        }

        public Criteria andGLEXAEqualTo(String value) {
            addCriterion("GLEXA =", value, "GLEXA");
            return (Criteria) this;
        }

        public Criteria andGLEXANotEqualTo(String value) {
            addCriterion("GLEXA <>", value, "GLEXA");
            return (Criteria) this;
        }

        public Criteria andGLEXAGreaterThan(String value) {
            addCriterion("GLEXA >", value, "GLEXA");
            return (Criteria) this;
        }

        public Criteria andGLEXAGreaterThanOrEqualTo(String value) {
            addCriterion("GLEXA >=", value, "GLEXA");
            return (Criteria) this;
        }

        public Criteria andGLEXALessThan(String value) {
            addCriterion("GLEXA <", value, "GLEXA");
            return (Criteria) this;
        }

        public Criteria andGLEXALessThanOrEqualTo(String value) {
            addCriterion("GLEXA <=", value, "GLEXA");
            return (Criteria) this;
        }

        public Criteria andGLEXALike(String value) {
            addCriterion("GLEXA like", value, "GLEXA");
            return (Criteria) this;
        }

        public Criteria andGLEXANotLike(String value) {
            addCriterion("GLEXA not like", value, "GLEXA");
            return (Criteria) this;
        }

        public Criteria andGLEXAIn(List<String> values) {
            addCriterion("GLEXA in", values, "GLEXA");
            return (Criteria) this;
        }

        public Criteria andGLEXANotIn(List<String> values) {
            addCriterion("GLEXA not in", values, "GLEXA");
            return (Criteria) this;
        }

        public Criteria andGLEXABetween(String value1, String value2) {
            addCriterion("GLEXA between", value1, value2, "GLEXA");
            return (Criteria) this;
        }

        public Criteria andGLEXANotBetween(String value1, String value2) {
            addCriterion("GLEXA not between", value1, value2, "GLEXA");
            return (Criteria) this;
        }

        public Criteria andGLEXRIsNull() {
            addCriterion("GLEXR is null");
            return (Criteria) this;
        }

        public Criteria andGLEXRIsNotNull() {
            addCriterion("GLEXR is not null");
            return (Criteria) this;
        }

        public Criteria andGLEXREqualTo(String value) {
            addCriterion("GLEXR =", value, "GLEXR");
            return (Criteria) this;
        }

        public Criteria andGLEXRNotEqualTo(String value) {
            addCriterion("GLEXR <>", value, "GLEXR");
            return (Criteria) this;
        }

        public Criteria andGLEXRGreaterThan(String value) {
            addCriterion("GLEXR >", value, "GLEXR");
            return (Criteria) this;
        }

        public Criteria andGLEXRGreaterThanOrEqualTo(String value) {
            addCriterion("GLEXR >=", value, "GLEXR");
            return (Criteria) this;
        }

        public Criteria andGLEXRLessThan(String value) {
            addCriterion("GLEXR <", value, "GLEXR");
            return (Criteria) this;
        }

        public Criteria andGLEXRLessThanOrEqualTo(String value) {
            addCriterion("GLEXR <=", value, "GLEXR");
            return (Criteria) this;
        }

        public Criteria andGLEXRLike(String value) {
            addCriterion("GLEXR like", value, "GLEXR");
            return (Criteria) this;
        }

        public Criteria andGLEXRNotLike(String value) {
            addCriterion("GLEXR not like", value, "GLEXR");
            return (Criteria) this;
        }

        public Criteria andGLEXRIn(List<String> values) {
            addCriterion("GLEXR in", values, "GLEXR");
            return (Criteria) this;
        }

        public Criteria andGLEXRNotIn(List<String> values) {
            addCriterion("GLEXR not in", values, "GLEXR");
            return (Criteria) this;
        }

        public Criteria andGLEXRBetween(String value1, String value2) {
            addCriterion("GLEXR between", value1, value2, "GLEXR");
            return (Criteria) this;
        }

        public Criteria andGLEXRNotBetween(String value1, String value2) {
            addCriterion("GLEXR not between", value1, value2, "GLEXR");
            return (Criteria) this;
        }

        public Criteria andGLR1IsNull() {
            addCriterion("GLR1 is null");
            return (Criteria) this;
        }

        public Criteria andGLR1IsNotNull() {
            addCriterion("GLR1 is not null");
            return (Criteria) this;
        }

        public Criteria andGLR1EqualTo(String value) {
            addCriterion("GLR1 =", value, "GLR1");
            return (Criteria) this;
        }

        public Criteria andGLR1NotEqualTo(String value) {
            addCriterion("GLR1 <>", value, "GLR1");
            return (Criteria) this;
        }

        public Criteria andGLR1GreaterThan(String value) {
            addCriterion("GLR1 >", value, "GLR1");
            return (Criteria) this;
        }

        public Criteria andGLR1GreaterThanOrEqualTo(String value) {
            addCriterion("GLR1 >=", value, "GLR1");
            return (Criteria) this;
        }

        public Criteria andGLR1LessThan(String value) {
            addCriterion("GLR1 <", value, "GLR1");
            return (Criteria) this;
        }

        public Criteria andGLR1LessThanOrEqualTo(String value) {
            addCriterion("GLR1 <=", value, "GLR1");
            return (Criteria) this;
        }

        public Criteria andGLR1Like(String value) {
            addCriterion("GLR1 like", value, "GLR1");
            return (Criteria) this;
        }

        public Criteria andGLR1NotLike(String value) {
            addCriterion("GLR1 not like", value, "GLR1");
            return (Criteria) this;
        }

        public Criteria andGLR1In(List<String> values) {
            addCriterion("GLR1 in", values, "GLR1");
            return (Criteria) this;
        }

        public Criteria andGLR1NotIn(List<String> values) {
            addCriterion("GLR1 not in", values, "GLR1");
            return (Criteria) this;
        }

        public Criteria andGLR1Between(String value1, String value2) {
            addCriterion("GLR1 between", value1, value2, "GLR1");
            return (Criteria) this;
        }

        public Criteria andGLR1NotBetween(String value1, String value2) {
            addCriterion("GLR1 not between", value1, value2, "GLR1");
            return (Criteria) this;
        }

        public Criteria andGLR2IsNull() {
            addCriterion("GLR2 is null");
            return (Criteria) this;
        }

        public Criteria andGLR2IsNotNull() {
            addCriterion("GLR2 is not null");
            return (Criteria) this;
        }

        public Criteria andGLR2EqualTo(String value) {
            addCriterion("GLR2 =", value, "GLR2");
            return (Criteria) this;
        }

        public Criteria andGLR2NotEqualTo(String value) {
            addCriterion("GLR2 <>", value, "GLR2");
            return (Criteria) this;
        }

        public Criteria andGLR2GreaterThan(String value) {
            addCriterion("GLR2 >", value, "GLR2");
            return (Criteria) this;
        }

        public Criteria andGLR2GreaterThanOrEqualTo(String value) {
            addCriterion("GLR2 >=", value, "GLR2");
            return (Criteria) this;
        }

        public Criteria andGLR2LessThan(String value) {
            addCriterion("GLR2 <", value, "GLR2");
            return (Criteria) this;
        }

        public Criteria andGLR2LessThanOrEqualTo(String value) {
            addCriterion("GLR2 <=", value, "GLR2");
            return (Criteria) this;
        }

        public Criteria andGLR2Like(String value) {
            addCriterion("GLR2 like", value, "GLR2");
            return (Criteria) this;
        }

        public Criteria andGLR2NotLike(String value) {
            addCriterion("GLR2 not like", value, "GLR2");
            return (Criteria) this;
        }

        public Criteria andGLR2In(List<String> values) {
            addCriterion("GLR2 in", values, "GLR2");
            return (Criteria) this;
        }

        public Criteria andGLR2NotIn(List<String> values) {
            addCriterion("GLR2 not in", values, "GLR2");
            return (Criteria) this;
        }

        public Criteria andGLR2Between(String value1, String value2) {
            addCriterion("GLR2 between", value1, value2, "GLR2");
            return (Criteria) this;
        }

        public Criteria andGLR2NotBetween(String value1, String value2) {
            addCriterion("GLR2 not between", value1, value2, "GLR2");
            return (Criteria) this;
        }

        public Criteria andGLR3IsNull() {
            addCriterion("GLR3 is null");
            return (Criteria) this;
        }

        public Criteria andGLR3IsNotNull() {
            addCriterion("GLR3 is not null");
            return (Criteria) this;
        }

        public Criteria andGLR3EqualTo(String value) {
            addCriterion("GLR3 =", value, "GLR3");
            return (Criteria) this;
        }

        public Criteria andGLR3NotEqualTo(String value) {
            addCriterion("GLR3 <>", value, "GLR3");
            return (Criteria) this;
        }

        public Criteria andGLR3GreaterThan(String value) {
            addCriterion("GLR3 >", value, "GLR3");
            return (Criteria) this;
        }

        public Criteria andGLR3GreaterThanOrEqualTo(String value) {
            addCriterion("GLR3 >=", value, "GLR3");
            return (Criteria) this;
        }

        public Criteria andGLR3LessThan(String value) {
            addCriterion("GLR3 <", value, "GLR3");
            return (Criteria) this;
        }

        public Criteria andGLR3LessThanOrEqualTo(String value) {
            addCriterion("GLR3 <=", value, "GLR3");
            return (Criteria) this;
        }

        public Criteria andGLR3Like(String value) {
            addCriterion("GLR3 like", value, "GLR3");
            return (Criteria) this;
        }

        public Criteria andGLR3NotLike(String value) {
            addCriterion("GLR3 not like", value, "GLR3");
            return (Criteria) this;
        }

        public Criteria andGLR3In(List<String> values) {
            addCriterion("GLR3 in", values, "GLR3");
            return (Criteria) this;
        }

        public Criteria andGLR3NotIn(List<String> values) {
            addCriterion("GLR3 not in", values, "GLR3");
            return (Criteria) this;
        }

        public Criteria andGLR3Between(String value1, String value2) {
            addCriterion("GLR3 between", value1, value2, "GLR3");
            return (Criteria) this;
        }

        public Criteria andGLR3NotBetween(String value1, String value2) {
            addCriterion("GLR3 not between", value1, value2, "GLR3");
            return (Criteria) this;
        }

        public Criteria andGLSFXIsNull() {
            addCriterion("GLSFX is null");
            return (Criteria) this;
        }

        public Criteria andGLSFXIsNotNull() {
            addCriterion("GLSFX is not null");
            return (Criteria) this;
        }

        public Criteria andGLSFXEqualTo(String value) {
            addCriterion("GLSFX =", value, "GLSFX");
            return (Criteria) this;
        }

        public Criteria andGLSFXNotEqualTo(String value) {
            addCriterion("GLSFX <>", value, "GLSFX");
            return (Criteria) this;
        }

        public Criteria andGLSFXGreaterThan(String value) {
            addCriterion("GLSFX >", value, "GLSFX");
            return (Criteria) this;
        }

        public Criteria andGLSFXGreaterThanOrEqualTo(String value) {
            addCriterion("GLSFX >=", value, "GLSFX");
            return (Criteria) this;
        }

        public Criteria andGLSFXLessThan(String value) {
            addCriterion("GLSFX <", value, "GLSFX");
            return (Criteria) this;
        }

        public Criteria andGLSFXLessThanOrEqualTo(String value) {
            addCriterion("GLSFX <=", value, "GLSFX");
            return (Criteria) this;
        }

        public Criteria andGLSFXLike(String value) {
            addCriterion("GLSFX like", value, "GLSFX");
            return (Criteria) this;
        }

        public Criteria andGLSFXNotLike(String value) {
            addCriterion("GLSFX not like", value, "GLSFX");
            return (Criteria) this;
        }

        public Criteria andGLSFXIn(List<String> values) {
            addCriterion("GLSFX in", values, "GLSFX");
            return (Criteria) this;
        }

        public Criteria andGLSFXNotIn(List<String> values) {
            addCriterion("GLSFX not in", values, "GLSFX");
            return (Criteria) this;
        }

        public Criteria andGLSFXBetween(String value1, String value2) {
            addCriterion("GLSFX between", value1, value2, "GLSFX");
            return (Criteria) this;
        }

        public Criteria andGLSFXNotBetween(String value1, String value2) {
            addCriterion("GLSFX not between", value1, value2, "GLSFX");
            return (Criteria) this;
        }

        public Criteria andGLODOCIsNull() {
            addCriterion("GLODOC is null");
            return (Criteria) this;
        }

        public Criteria andGLODOCIsNotNull() {
            addCriterion("GLODOC is not null");
            return (Criteria) this;
        }

        public Criteria andGLODOCEqualTo(BigDecimal value) {
            addCriterion("GLODOC =", value, "GLODOC");
            return (Criteria) this;
        }

        public Criteria andGLODOCNotEqualTo(BigDecimal value) {
            addCriterion("GLODOC <>", value, "GLODOC");
            return (Criteria) this;
        }

        public Criteria andGLODOCGreaterThan(BigDecimal value) {
            addCriterion("GLODOC >", value, "GLODOC");
            return (Criteria) this;
        }

        public Criteria andGLODOCGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLODOC >=", value, "GLODOC");
            return (Criteria) this;
        }

        public Criteria andGLODOCLessThan(BigDecimal value) {
            addCriterion("GLODOC <", value, "GLODOC");
            return (Criteria) this;
        }

        public Criteria andGLODOCLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLODOC <=", value, "GLODOC");
            return (Criteria) this;
        }

        public Criteria andGLODOCIn(List<BigDecimal> values) {
            addCriterion("GLODOC in", values, "GLODOC");
            return (Criteria) this;
        }

        public Criteria andGLODOCNotIn(List<BigDecimal> values) {
            addCriterion("GLODOC not in", values, "GLODOC");
            return (Criteria) this;
        }

        public Criteria andGLODOCBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLODOC between", value1, value2, "GLODOC");
            return (Criteria) this;
        }

        public Criteria andGLODOCNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLODOC not between", value1, value2, "GLODOC");
            return (Criteria) this;
        }

        public Criteria andGLODCTIsNull() {
            addCriterion("GLODCT is null");
            return (Criteria) this;
        }

        public Criteria andGLODCTIsNotNull() {
            addCriterion("GLODCT is not null");
            return (Criteria) this;
        }

        public Criteria andGLODCTEqualTo(String value) {
            addCriterion("GLODCT =", value, "GLODCT");
            return (Criteria) this;
        }

        public Criteria andGLODCTNotEqualTo(String value) {
            addCriterion("GLODCT <>", value, "GLODCT");
            return (Criteria) this;
        }

        public Criteria andGLODCTGreaterThan(String value) {
            addCriterion("GLODCT >", value, "GLODCT");
            return (Criteria) this;
        }

        public Criteria andGLODCTGreaterThanOrEqualTo(String value) {
            addCriterion("GLODCT >=", value, "GLODCT");
            return (Criteria) this;
        }

        public Criteria andGLODCTLessThan(String value) {
            addCriterion("GLODCT <", value, "GLODCT");
            return (Criteria) this;
        }

        public Criteria andGLODCTLessThanOrEqualTo(String value) {
            addCriterion("GLODCT <=", value, "GLODCT");
            return (Criteria) this;
        }

        public Criteria andGLODCTLike(String value) {
            addCriterion("GLODCT like", value, "GLODCT");
            return (Criteria) this;
        }

        public Criteria andGLODCTNotLike(String value) {
            addCriterion("GLODCT not like", value, "GLODCT");
            return (Criteria) this;
        }

        public Criteria andGLODCTIn(List<String> values) {
            addCriterion("GLODCT in", values, "GLODCT");
            return (Criteria) this;
        }

        public Criteria andGLODCTNotIn(List<String> values) {
            addCriterion("GLODCT not in", values, "GLODCT");
            return (Criteria) this;
        }

        public Criteria andGLODCTBetween(String value1, String value2) {
            addCriterion("GLODCT between", value1, value2, "GLODCT");
            return (Criteria) this;
        }

        public Criteria andGLODCTNotBetween(String value1, String value2) {
            addCriterion("GLODCT not between", value1, value2, "GLODCT");
            return (Criteria) this;
        }

        public Criteria andGLOSFXIsNull() {
            addCriterion("GLOSFX is null");
            return (Criteria) this;
        }

        public Criteria andGLOSFXIsNotNull() {
            addCriterion("GLOSFX is not null");
            return (Criteria) this;
        }

        public Criteria andGLOSFXEqualTo(String value) {
            addCriterion("GLOSFX =", value, "GLOSFX");
            return (Criteria) this;
        }

        public Criteria andGLOSFXNotEqualTo(String value) {
            addCriterion("GLOSFX <>", value, "GLOSFX");
            return (Criteria) this;
        }

        public Criteria andGLOSFXGreaterThan(String value) {
            addCriterion("GLOSFX >", value, "GLOSFX");
            return (Criteria) this;
        }

        public Criteria andGLOSFXGreaterThanOrEqualTo(String value) {
            addCriterion("GLOSFX >=", value, "GLOSFX");
            return (Criteria) this;
        }

        public Criteria andGLOSFXLessThan(String value) {
            addCriterion("GLOSFX <", value, "GLOSFX");
            return (Criteria) this;
        }

        public Criteria andGLOSFXLessThanOrEqualTo(String value) {
            addCriterion("GLOSFX <=", value, "GLOSFX");
            return (Criteria) this;
        }

        public Criteria andGLOSFXLike(String value) {
            addCriterion("GLOSFX like", value, "GLOSFX");
            return (Criteria) this;
        }

        public Criteria andGLOSFXNotLike(String value) {
            addCriterion("GLOSFX not like", value, "GLOSFX");
            return (Criteria) this;
        }

        public Criteria andGLOSFXIn(List<String> values) {
            addCriterion("GLOSFX in", values, "GLOSFX");
            return (Criteria) this;
        }

        public Criteria andGLOSFXNotIn(List<String> values) {
            addCriterion("GLOSFX not in", values, "GLOSFX");
            return (Criteria) this;
        }

        public Criteria andGLOSFXBetween(String value1, String value2) {
            addCriterion("GLOSFX between", value1, value2, "GLOSFX");
            return (Criteria) this;
        }

        public Criteria andGLOSFXNotBetween(String value1, String value2) {
            addCriterion("GLOSFX not between", value1, value2, "GLOSFX");
            return (Criteria) this;
        }

        public Criteria andGLPKCOIsNull() {
            addCriterion("GLPKCO is null");
            return (Criteria) this;
        }

        public Criteria andGLPKCOIsNotNull() {
            addCriterion("GLPKCO is not null");
            return (Criteria) this;
        }

        public Criteria andGLPKCOEqualTo(String value) {
            addCriterion("GLPKCO =", value, "GLPKCO");
            return (Criteria) this;
        }

        public Criteria andGLPKCONotEqualTo(String value) {
            addCriterion("GLPKCO <>", value, "GLPKCO");
            return (Criteria) this;
        }

        public Criteria andGLPKCOGreaterThan(String value) {
            addCriterion("GLPKCO >", value, "GLPKCO");
            return (Criteria) this;
        }

        public Criteria andGLPKCOGreaterThanOrEqualTo(String value) {
            addCriterion("GLPKCO >=", value, "GLPKCO");
            return (Criteria) this;
        }

        public Criteria andGLPKCOLessThan(String value) {
            addCriterion("GLPKCO <", value, "GLPKCO");
            return (Criteria) this;
        }

        public Criteria andGLPKCOLessThanOrEqualTo(String value) {
            addCriterion("GLPKCO <=", value, "GLPKCO");
            return (Criteria) this;
        }

        public Criteria andGLPKCOLike(String value) {
            addCriterion("GLPKCO like", value, "GLPKCO");
            return (Criteria) this;
        }

        public Criteria andGLPKCONotLike(String value) {
            addCriterion("GLPKCO not like", value, "GLPKCO");
            return (Criteria) this;
        }

        public Criteria andGLPKCOIn(List<String> values) {
            addCriterion("GLPKCO in", values, "GLPKCO");
            return (Criteria) this;
        }

        public Criteria andGLPKCONotIn(List<String> values) {
            addCriterion("GLPKCO not in", values, "GLPKCO");
            return (Criteria) this;
        }

        public Criteria andGLPKCOBetween(String value1, String value2) {
            addCriterion("GLPKCO between", value1, value2, "GLPKCO");
            return (Criteria) this;
        }

        public Criteria andGLPKCONotBetween(String value1, String value2) {
            addCriterion("GLPKCO not between", value1, value2, "GLPKCO");
            return (Criteria) this;
        }

        public Criteria andGLOKCOIsNull() {
            addCriterion("GLOKCO is null");
            return (Criteria) this;
        }

        public Criteria andGLOKCOIsNotNull() {
            addCriterion("GLOKCO is not null");
            return (Criteria) this;
        }

        public Criteria andGLOKCOEqualTo(String value) {
            addCriterion("GLOKCO =", value, "GLOKCO");
            return (Criteria) this;
        }

        public Criteria andGLOKCONotEqualTo(String value) {
            addCriterion("GLOKCO <>", value, "GLOKCO");
            return (Criteria) this;
        }

        public Criteria andGLOKCOGreaterThan(String value) {
            addCriterion("GLOKCO >", value, "GLOKCO");
            return (Criteria) this;
        }

        public Criteria andGLOKCOGreaterThanOrEqualTo(String value) {
            addCriterion("GLOKCO >=", value, "GLOKCO");
            return (Criteria) this;
        }

        public Criteria andGLOKCOLessThan(String value) {
            addCriterion("GLOKCO <", value, "GLOKCO");
            return (Criteria) this;
        }

        public Criteria andGLOKCOLessThanOrEqualTo(String value) {
            addCriterion("GLOKCO <=", value, "GLOKCO");
            return (Criteria) this;
        }

        public Criteria andGLOKCOLike(String value) {
            addCriterion("GLOKCO like", value, "GLOKCO");
            return (Criteria) this;
        }

        public Criteria andGLOKCONotLike(String value) {
            addCriterion("GLOKCO not like", value, "GLOKCO");
            return (Criteria) this;
        }

        public Criteria andGLOKCOIn(List<String> values) {
            addCriterion("GLOKCO in", values, "GLOKCO");
            return (Criteria) this;
        }

        public Criteria andGLOKCONotIn(List<String> values) {
            addCriterion("GLOKCO not in", values, "GLOKCO");
            return (Criteria) this;
        }

        public Criteria andGLOKCOBetween(String value1, String value2) {
            addCriterion("GLOKCO between", value1, value2, "GLOKCO");
            return (Criteria) this;
        }

        public Criteria andGLOKCONotBetween(String value1, String value2) {
            addCriterion("GLOKCO not between", value1, value2, "GLOKCO");
            return (Criteria) this;
        }

        public Criteria andGLPDCTIsNull() {
            addCriterion("GLPDCT is null");
            return (Criteria) this;
        }

        public Criteria andGLPDCTIsNotNull() {
            addCriterion("GLPDCT is not null");
            return (Criteria) this;
        }

        public Criteria andGLPDCTEqualTo(String value) {
            addCriterion("GLPDCT =", value, "GLPDCT");
            return (Criteria) this;
        }

        public Criteria andGLPDCTNotEqualTo(String value) {
            addCriterion("GLPDCT <>", value, "GLPDCT");
            return (Criteria) this;
        }

        public Criteria andGLPDCTGreaterThan(String value) {
            addCriterion("GLPDCT >", value, "GLPDCT");
            return (Criteria) this;
        }

        public Criteria andGLPDCTGreaterThanOrEqualTo(String value) {
            addCriterion("GLPDCT >=", value, "GLPDCT");
            return (Criteria) this;
        }

        public Criteria andGLPDCTLessThan(String value) {
            addCriterion("GLPDCT <", value, "GLPDCT");
            return (Criteria) this;
        }

        public Criteria andGLPDCTLessThanOrEqualTo(String value) {
            addCriterion("GLPDCT <=", value, "GLPDCT");
            return (Criteria) this;
        }

        public Criteria andGLPDCTLike(String value) {
            addCriterion("GLPDCT like", value, "GLPDCT");
            return (Criteria) this;
        }

        public Criteria andGLPDCTNotLike(String value) {
            addCriterion("GLPDCT not like", value, "GLPDCT");
            return (Criteria) this;
        }

        public Criteria andGLPDCTIn(List<String> values) {
            addCriterion("GLPDCT in", values, "GLPDCT");
            return (Criteria) this;
        }

        public Criteria andGLPDCTNotIn(List<String> values) {
            addCriterion("GLPDCT not in", values, "GLPDCT");
            return (Criteria) this;
        }

        public Criteria andGLPDCTBetween(String value1, String value2) {
            addCriterion("GLPDCT between", value1, value2, "GLPDCT");
            return (Criteria) this;
        }

        public Criteria andGLPDCTNotBetween(String value1, String value2) {
            addCriterion("GLPDCT not between", value1, value2, "GLPDCT");
            return (Criteria) this;
        }

        public Criteria andGLAN8IsNull() {
            addCriterion("GLAN8 is null");
            return (Criteria) this;
        }

        public Criteria andGLAN8IsNotNull() {
            addCriterion("GLAN8 is not null");
            return (Criteria) this;
        }

        public Criteria andGLAN8EqualTo(BigDecimal value) {
            addCriterion("GLAN8 =", value, "GLAN8");
            return (Criteria) this;
        }

        public Criteria andGLAN8NotEqualTo(BigDecimal value) {
            addCriterion("GLAN8 <>", value, "GLAN8");
            return (Criteria) this;
        }

        public Criteria andGLAN8GreaterThan(BigDecimal value) {
            addCriterion("GLAN8 >", value, "GLAN8");
            return (Criteria) this;
        }

        public Criteria andGLAN8GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLAN8 >=", value, "GLAN8");
            return (Criteria) this;
        }

        public Criteria andGLAN8LessThan(BigDecimal value) {
            addCriterion("GLAN8 <", value, "GLAN8");
            return (Criteria) this;
        }

        public Criteria andGLAN8LessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLAN8 <=", value, "GLAN8");
            return (Criteria) this;
        }

        public Criteria andGLAN8In(List<BigDecimal> values) {
            addCriterion("GLAN8 in", values, "GLAN8");
            return (Criteria) this;
        }

        public Criteria andGLAN8NotIn(List<BigDecimal> values) {
            addCriterion("GLAN8 not in", values, "GLAN8");
            return (Criteria) this;
        }

        public Criteria andGLAN8Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLAN8 between", value1, value2, "GLAN8");
            return (Criteria) this;
        }

        public Criteria andGLAN8NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLAN8 not between", value1, value2, "GLAN8");
            return (Criteria) this;
        }

        public Criteria andGLCNIsNull() {
            addCriterion("GLCN is null");
            return (Criteria) this;
        }

        public Criteria andGLCNIsNotNull() {
            addCriterion("GLCN is not null");
            return (Criteria) this;
        }

        public Criteria andGLCNEqualTo(String value) {
            addCriterion("GLCN =", value, "GLCN");
            return (Criteria) this;
        }

        public Criteria andGLCNNotEqualTo(String value) {
            addCriterion("GLCN <>", value, "GLCN");
            return (Criteria) this;
        }

        public Criteria andGLCNGreaterThan(String value) {
            addCriterion("GLCN >", value, "GLCN");
            return (Criteria) this;
        }

        public Criteria andGLCNGreaterThanOrEqualTo(String value) {
            addCriterion("GLCN >=", value, "GLCN");
            return (Criteria) this;
        }

        public Criteria andGLCNLessThan(String value) {
            addCriterion("GLCN <", value, "GLCN");
            return (Criteria) this;
        }

        public Criteria andGLCNLessThanOrEqualTo(String value) {
            addCriterion("GLCN <=", value, "GLCN");
            return (Criteria) this;
        }

        public Criteria andGLCNLike(String value) {
            addCriterion("GLCN like", value, "GLCN");
            return (Criteria) this;
        }

        public Criteria andGLCNNotLike(String value) {
            addCriterion("GLCN not like", value, "GLCN");
            return (Criteria) this;
        }

        public Criteria andGLCNIn(List<String> values) {
            addCriterion("GLCN in", values, "GLCN");
            return (Criteria) this;
        }

        public Criteria andGLCNNotIn(List<String> values) {
            addCriterion("GLCN not in", values, "GLCN");
            return (Criteria) this;
        }

        public Criteria andGLCNBetween(String value1, String value2) {
            addCriterion("GLCN between", value1, value2, "GLCN");
            return (Criteria) this;
        }

        public Criteria andGLCNNotBetween(String value1, String value2) {
            addCriterion("GLCN not between", value1, value2, "GLCN");
            return (Criteria) this;
        }

        public Criteria andGLDKJIsNull() {
            addCriterion("GLDKJ is null");
            return (Criteria) this;
        }

        public Criteria andGLDKJIsNotNull() {
            addCriterion("GLDKJ is not null");
            return (Criteria) this;
        }

        public Criteria andGLDKJEqualTo(Integer value) {
            addCriterion("GLDKJ =", value, "GLDKJ");
            return (Criteria) this;
        }

        public Criteria andGLDKJNotEqualTo(Integer value) {
            addCriterion("GLDKJ <>", value, "GLDKJ");
            return (Criteria) this;
        }

        public Criteria andGLDKJGreaterThan(Integer value) {
            addCriterion("GLDKJ >", value, "GLDKJ");
            return (Criteria) this;
        }

        public Criteria andGLDKJGreaterThanOrEqualTo(Integer value) {
            addCriterion("GLDKJ >=", value, "GLDKJ");
            return (Criteria) this;
        }

        public Criteria andGLDKJLessThan(Integer value) {
            addCriterion("GLDKJ <", value, "GLDKJ");
            return (Criteria) this;
        }

        public Criteria andGLDKJLessThanOrEqualTo(Integer value) {
            addCriterion("GLDKJ <=", value, "GLDKJ");
            return (Criteria) this;
        }

        public Criteria andGLDKJIn(List<Integer> values) {
            addCriterion("GLDKJ in", values, "GLDKJ");
            return (Criteria) this;
        }

        public Criteria andGLDKJNotIn(List<Integer> values) {
            addCriterion("GLDKJ not in", values, "GLDKJ");
            return (Criteria) this;
        }

        public Criteria andGLDKJBetween(Integer value1, Integer value2) {
            addCriterion("GLDKJ between", value1, value2, "GLDKJ");
            return (Criteria) this;
        }

        public Criteria andGLDKJNotBetween(Integer value1, Integer value2) {
            addCriterion("GLDKJ not between", value1, value2, "GLDKJ");
            return (Criteria) this;
        }

        public Criteria andGLDKCIsNull() {
            addCriterion("GLDKC is null");
            return (Criteria) this;
        }

        public Criteria andGLDKCIsNotNull() {
            addCriterion("GLDKC is not null");
            return (Criteria) this;
        }

        public Criteria andGLDKCEqualTo(Integer value) {
            addCriterion("GLDKC =", value, "GLDKC");
            return (Criteria) this;
        }

        public Criteria andGLDKCNotEqualTo(Integer value) {
            addCriterion("GLDKC <>", value, "GLDKC");
            return (Criteria) this;
        }

        public Criteria andGLDKCGreaterThan(Integer value) {
            addCriterion("GLDKC >", value, "GLDKC");
            return (Criteria) this;
        }

        public Criteria andGLDKCGreaterThanOrEqualTo(Integer value) {
            addCriterion("GLDKC >=", value, "GLDKC");
            return (Criteria) this;
        }

        public Criteria andGLDKCLessThan(Integer value) {
            addCriterion("GLDKC <", value, "GLDKC");
            return (Criteria) this;
        }

        public Criteria andGLDKCLessThanOrEqualTo(Integer value) {
            addCriterion("GLDKC <=", value, "GLDKC");
            return (Criteria) this;
        }

        public Criteria andGLDKCIn(List<Integer> values) {
            addCriterion("GLDKC in", values, "GLDKC");
            return (Criteria) this;
        }

        public Criteria andGLDKCNotIn(List<Integer> values) {
            addCriterion("GLDKC not in", values, "GLDKC");
            return (Criteria) this;
        }

        public Criteria andGLDKCBetween(Integer value1, Integer value2) {
            addCriterion("GLDKC between", value1, value2, "GLDKC");
            return (Criteria) this;
        }

        public Criteria andGLDKCNotBetween(Integer value1, Integer value2) {
            addCriterion("GLDKC not between", value1, value2, "GLDKC");
            return (Criteria) this;
        }

        public Criteria andGLASIDIsNull() {
            addCriterion("GLASID is null");
            return (Criteria) this;
        }

        public Criteria andGLASIDIsNotNull() {
            addCriterion("GLASID is not null");
            return (Criteria) this;
        }

        public Criteria andGLASIDEqualTo(String value) {
            addCriterion("GLASID =", value, "GLASID");
            return (Criteria) this;
        }

        public Criteria andGLASIDNotEqualTo(String value) {
            addCriterion("GLASID <>", value, "GLASID");
            return (Criteria) this;
        }

        public Criteria andGLASIDGreaterThan(String value) {
            addCriterion("GLASID >", value, "GLASID");
            return (Criteria) this;
        }

        public Criteria andGLASIDGreaterThanOrEqualTo(String value) {
            addCriterion("GLASID >=", value, "GLASID");
            return (Criteria) this;
        }

        public Criteria andGLASIDLessThan(String value) {
            addCriterion("GLASID <", value, "GLASID");
            return (Criteria) this;
        }

        public Criteria andGLASIDLessThanOrEqualTo(String value) {
            addCriterion("GLASID <=", value, "GLASID");
            return (Criteria) this;
        }

        public Criteria andGLASIDLike(String value) {
            addCriterion("GLASID like", value, "GLASID");
            return (Criteria) this;
        }

        public Criteria andGLASIDNotLike(String value) {
            addCriterion("GLASID not like", value, "GLASID");
            return (Criteria) this;
        }

        public Criteria andGLASIDIn(List<String> values) {
            addCriterion("GLASID in", values, "GLASID");
            return (Criteria) this;
        }

        public Criteria andGLASIDNotIn(List<String> values) {
            addCriterion("GLASID not in", values, "GLASID");
            return (Criteria) this;
        }

        public Criteria andGLASIDBetween(String value1, String value2) {
            addCriterion("GLASID between", value1, value2, "GLASID");
            return (Criteria) this;
        }

        public Criteria andGLASIDNotBetween(String value1, String value2) {
            addCriterion("GLASID not between", value1, value2, "GLASID");
            return (Criteria) this;
        }

        public Criteria andGLBREIsNull() {
            addCriterion("GLBRE is null");
            return (Criteria) this;
        }

        public Criteria andGLBREIsNotNull() {
            addCriterion("GLBRE is not null");
            return (Criteria) this;
        }

        public Criteria andGLBREEqualTo(String value) {
            addCriterion("GLBRE =", value, "GLBRE");
            return (Criteria) this;
        }

        public Criteria andGLBRENotEqualTo(String value) {
            addCriterion("GLBRE <>", value, "GLBRE");
            return (Criteria) this;
        }

        public Criteria andGLBREGreaterThan(String value) {
            addCriterion("GLBRE >", value, "GLBRE");
            return (Criteria) this;
        }

        public Criteria andGLBREGreaterThanOrEqualTo(String value) {
            addCriterion("GLBRE >=", value, "GLBRE");
            return (Criteria) this;
        }

        public Criteria andGLBRELessThan(String value) {
            addCriterion("GLBRE <", value, "GLBRE");
            return (Criteria) this;
        }

        public Criteria andGLBRELessThanOrEqualTo(String value) {
            addCriterion("GLBRE <=", value, "GLBRE");
            return (Criteria) this;
        }

        public Criteria andGLBRELike(String value) {
            addCriterion("GLBRE like", value, "GLBRE");
            return (Criteria) this;
        }

        public Criteria andGLBRENotLike(String value) {
            addCriterion("GLBRE not like", value, "GLBRE");
            return (Criteria) this;
        }

        public Criteria andGLBREIn(List<String> values) {
            addCriterion("GLBRE in", values, "GLBRE");
            return (Criteria) this;
        }

        public Criteria andGLBRENotIn(List<String> values) {
            addCriterion("GLBRE not in", values, "GLBRE");
            return (Criteria) this;
        }

        public Criteria andGLBREBetween(String value1, String value2) {
            addCriterion("GLBRE between", value1, value2, "GLBRE");
            return (Criteria) this;
        }

        public Criteria andGLBRENotBetween(String value1, String value2) {
            addCriterion("GLBRE not between", value1, value2, "GLBRE");
            return (Criteria) this;
        }

        public Criteria andGLRCNDIsNull() {
            addCriterion("GLRCND is null");
            return (Criteria) this;
        }

        public Criteria andGLRCNDIsNotNull() {
            addCriterion("GLRCND is not null");
            return (Criteria) this;
        }

        public Criteria andGLRCNDEqualTo(String value) {
            addCriterion("GLRCND =", value, "GLRCND");
            return (Criteria) this;
        }

        public Criteria andGLRCNDNotEqualTo(String value) {
            addCriterion("GLRCND <>", value, "GLRCND");
            return (Criteria) this;
        }

        public Criteria andGLRCNDGreaterThan(String value) {
            addCriterion("GLRCND >", value, "GLRCND");
            return (Criteria) this;
        }

        public Criteria andGLRCNDGreaterThanOrEqualTo(String value) {
            addCriterion("GLRCND >=", value, "GLRCND");
            return (Criteria) this;
        }

        public Criteria andGLRCNDLessThan(String value) {
            addCriterion("GLRCND <", value, "GLRCND");
            return (Criteria) this;
        }

        public Criteria andGLRCNDLessThanOrEqualTo(String value) {
            addCriterion("GLRCND <=", value, "GLRCND");
            return (Criteria) this;
        }

        public Criteria andGLRCNDLike(String value) {
            addCriterion("GLRCND like", value, "GLRCND");
            return (Criteria) this;
        }

        public Criteria andGLRCNDNotLike(String value) {
            addCriterion("GLRCND not like", value, "GLRCND");
            return (Criteria) this;
        }

        public Criteria andGLRCNDIn(List<String> values) {
            addCriterion("GLRCND in", values, "GLRCND");
            return (Criteria) this;
        }

        public Criteria andGLRCNDNotIn(List<String> values) {
            addCriterion("GLRCND not in", values, "GLRCND");
            return (Criteria) this;
        }

        public Criteria andGLRCNDBetween(String value1, String value2) {
            addCriterion("GLRCND between", value1, value2, "GLRCND");
            return (Criteria) this;
        }

        public Criteria andGLRCNDNotBetween(String value1, String value2) {
            addCriterion("GLRCND not between", value1, value2, "GLRCND");
            return (Criteria) this;
        }

        public Criteria andGLSUMMIsNull() {
            addCriterion("GLSUMM is null");
            return (Criteria) this;
        }

        public Criteria andGLSUMMIsNotNull() {
            addCriterion("GLSUMM is not null");
            return (Criteria) this;
        }

        public Criteria andGLSUMMEqualTo(String value) {
            addCriterion("GLSUMM =", value, "GLSUMM");
            return (Criteria) this;
        }

        public Criteria andGLSUMMNotEqualTo(String value) {
            addCriterion("GLSUMM <>", value, "GLSUMM");
            return (Criteria) this;
        }

        public Criteria andGLSUMMGreaterThan(String value) {
            addCriterion("GLSUMM >", value, "GLSUMM");
            return (Criteria) this;
        }

        public Criteria andGLSUMMGreaterThanOrEqualTo(String value) {
            addCriterion("GLSUMM >=", value, "GLSUMM");
            return (Criteria) this;
        }

        public Criteria andGLSUMMLessThan(String value) {
            addCriterion("GLSUMM <", value, "GLSUMM");
            return (Criteria) this;
        }

        public Criteria andGLSUMMLessThanOrEqualTo(String value) {
            addCriterion("GLSUMM <=", value, "GLSUMM");
            return (Criteria) this;
        }

        public Criteria andGLSUMMLike(String value) {
            addCriterion("GLSUMM like", value, "GLSUMM");
            return (Criteria) this;
        }

        public Criteria andGLSUMMNotLike(String value) {
            addCriterion("GLSUMM not like", value, "GLSUMM");
            return (Criteria) this;
        }

        public Criteria andGLSUMMIn(List<String> values) {
            addCriterion("GLSUMM in", values, "GLSUMM");
            return (Criteria) this;
        }

        public Criteria andGLSUMMNotIn(List<String> values) {
            addCriterion("GLSUMM not in", values, "GLSUMM");
            return (Criteria) this;
        }

        public Criteria andGLSUMMBetween(String value1, String value2) {
            addCriterion("GLSUMM between", value1, value2, "GLSUMM");
            return (Criteria) this;
        }

        public Criteria andGLSUMMNotBetween(String value1, String value2) {
            addCriterion("GLSUMM not between", value1, value2, "GLSUMM");
            return (Criteria) this;
        }

        public Criteria andGLPRGEIsNull() {
            addCriterion("GLPRGE is null");
            return (Criteria) this;
        }

        public Criteria andGLPRGEIsNotNull() {
            addCriterion("GLPRGE is not null");
            return (Criteria) this;
        }

        public Criteria andGLPRGEEqualTo(String value) {
            addCriterion("GLPRGE =", value, "GLPRGE");
            return (Criteria) this;
        }

        public Criteria andGLPRGENotEqualTo(String value) {
            addCriterion("GLPRGE <>", value, "GLPRGE");
            return (Criteria) this;
        }

        public Criteria andGLPRGEGreaterThan(String value) {
            addCriterion("GLPRGE >", value, "GLPRGE");
            return (Criteria) this;
        }

        public Criteria andGLPRGEGreaterThanOrEqualTo(String value) {
            addCriterion("GLPRGE >=", value, "GLPRGE");
            return (Criteria) this;
        }

        public Criteria andGLPRGELessThan(String value) {
            addCriterion("GLPRGE <", value, "GLPRGE");
            return (Criteria) this;
        }

        public Criteria andGLPRGELessThanOrEqualTo(String value) {
            addCriterion("GLPRGE <=", value, "GLPRGE");
            return (Criteria) this;
        }

        public Criteria andGLPRGELike(String value) {
            addCriterion("GLPRGE like", value, "GLPRGE");
            return (Criteria) this;
        }

        public Criteria andGLPRGENotLike(String value) {
            addCriterion("GLPRGE not like", value, "GLPRGE");
            return (Criteria) this;
        }

        public Criteria andGLPRGEIn(List<String> values) {
            addCriterion("GLPRGE in", values, "GLPRGE");
            return (Criteria) this;
        }

        public Criteria andGLPRGENotIn(List<String> values) {
            addCriterion("GLPRGE not in", values, "GLPRGE");
            return (Criteria) this;
        }

        public Criteria andGLPRGEBetween(String value1, String value2) {
            addCriterion("GLPRGE between", value1, value2, "GLPRGE");
            return (Criteria) this;
        }

        public Criteria andGLPRGENotBetween(String value1, String value2) {
            addCriterion("GLPRGE not between", value1, value2, "GLPRGE");
            return (Criteria) this;
        }

        public Criteria andGLTNNIsNull() {
            addCriterion("GLTNN is null");
            return (Criteria) this;
        }

        public Criteria andGLTNNIsNotNull() {
            addCriterion("GLTNN is not null");
            return (Criteria) this;
        }

        public Criteria andGLTNNEqualTo(String value) {
            addCriterion("GLTNN =", value, "GLTNN");
            return (Criteria) this;
        }

        public Criteria andGLTNNNotEqualTo(String value) {
            addCriterion("GLTNN <>", value, "GLTNN");
            return (Criteria) this;
        }

        public Criteria andGLTNNGreaterThan(String value) {
            addCriterion("GLTNN >", value, "GLTNN");
            return (Criteria) this;
        }

        public Criteria andGLTNNGreaterThanOrEqualTo(String value) {
            addCriterion("GLTNN >=", value, "GLTNN");
            return (Criteria) this;
        }

        public Criteria andGLTNNLessThan(String value) {
            addCriterion("GLTNN <", value, "GLTNN");
            return (Criteria) this;
        }

        public Criteria andGLTNNLessThanOrEqualTo(String value) {
            addCriterion("GLTNN <=", value, "GLTNN");
            return (Criteria) this;
        }

        public Criteria andGLTNNLike(String value) {
            addCriterion("GLTNN like", value, "GLTNN");
            return (Criteria) this;
        }

        public Criteria andGLTNNNotLike(String value) {
            addCriterion("GLTNN not like", value, "GLTNN");
            return (Criteria) this;
        }

        public Criteria andGLTNNIn(List<String> values) {
            addCriterion("GLTNN in", values, "GLTNN");
            return (Criteria) this;
        }

        public Criteria andGLTNNNotIn(List<String> values) {
            addCriterion("GLTNN not in", values, "GLTNN");
            return (Criteria) this;
        }

        public Criteria andGLTNNBetween(String value1, String value2) {
            addCriterion("GLTNN between", value1, value2, "GLTNN");
            return (Criteria) this;
        }

        public Criteria andGLTNNNotBetween(String value1, String value2) {
            addCriterion("GLTNN not between", value1, value2, "GLTNN");
            return (Criteria) this;
        }

        public Criteria andGLALT1IsNull() {
            addCriterion("GLALT1 is null");
            return (Criteria) this;
        }

        public Criteria andGLALT1IsNotNull() {
            addCriterion("GLALT1 is not null");
            return (Criteria) this;
        }

        public Criteria andGLALT1EqualTo(String value) {
            addCriterion("GLALT1 =", value, "GLALT1");
            return (Criteria) this;
        }

        public Criteria andGLALT1NotEqualTo(String value) {
            addCriterion("GLALT1 <>", value, "GLALT1");
            return (Criteria) this;
        }

        public Criteria andGLALT1GreaterThan(String value) {
            addCriterion("GLALT1 >", value, "GLALT1");
            return (Criteria) this;
        }

        public Criteria andGLALT1GreaterThanOrEqualTo(String value) {
            addCriterion("GLALT1 >=", value, "GLALT1");
            return (Criteria) this;
        }

        public Criteria andGLALT1LessThan(String value) {
            addCriterion("GLALT1 <", value, "GLALT1");
            return (Criteria) this;
        }

        public Criteria andGLALT1LessThanOrEqualTo(String value) {
            addCriterion("GLALT1 <=", value, "GLALT1");
            return (Criteria) this;
        }

        public Criteria andGLALT1Like(String value) {
            addCriterion("GLALT1 like", value, "GLALT1");
            return (Criteria) this;
        }

        public Criteria andGLALT1NotLike(String value) {
            addCriterion("GLALT1 not like", value, "GLALT1");
            return (Criteria) this;
        }

        public Criteria andGLALT1In(List<String> values) {
            addCriterion("GLALT1 in", values, "GLALT1");
            return (Criteria) this;
        }

        public Criteria andGLALT1NotIn(List<String> values) {
            addCriterion("GLALT1 not in", values, "GLALT1");
            return (Criteria) this;
        }

        public Criteria andGLALT1Between(String value1, String value2) {
            addCriterion("GLALT1 between", value1, value2, "GLALT1");
            return (Criteria) this;
        }

        public Criteria andGLALT1NotBetween(String value1, String value2) {
            addCriterion("GLALT1 not between", value1, value2, "GLALT1");
            return (Criteria) this;
        }

        public Criteria andGLALT2IsNull() {
            addCriterion("GLALT2 is null");
            return (Criteria) this;
        }

        public Criteria andGLALT2IsNotNull() {
            addCriterion("GLALT2 is not null");
            return (Criteria) this;
        }

        public Criteria andGLALT2EqualTo(String value) {
            addCriterion("GLALT2 =", value, "GLALT2");
            return (Criteria) this;
        }

        public Criteria andGLALT2NotEqualTo(String value) {
            addCriterion("GLALT2 <>", value, "GLALT2");
            return (Criteria) this;
        }

        public Criteria andGLALT2GreaterThan(String value) {
            addCriterion("GLALT2 >", value, "GLALT2");
            return (Criteria) this;
        }

        public Criteria andGLALT2GreaterThanOrEqualTo(String value) {
            addCriterion("GLALT2 >=", value, "GLALT2");
            return (Criteria) this;
        }

        public Criteria andGLALT2LessThan(String value) {
            addCriterion("GLALT2 <", value, "GLALT2");
            return (Criteria) this;
        }

        public Criteria andGLALT2LessThanOrEqualTo(String value) {
            addCriterion("GLALT2 <=", value, "GLALT2");
            return (Criteria) this;
        }

        public Criteria andGLALT2Like(String value) {
            addCriterion("GLALT2 like", value, "GLALT2");
            return (Criteria) this;
        }

        public Criteria andGLALT2NotLike(String value) {
            addCriterion("GLALT2 not like", value, "GLALT2");
            return (Criteria) this;
        }

        public Criteria andGLALT2In(List<String> values) {
            addCriterion("GLALT2 in", values, "GLALT2");
            return (Criteria) this;
        }

        public Criteria andGLALT2NotIn(List<String> values) {
            addCriterion("GLALT2 not in", values, "GLALT2");
            return (Criteria) this;
        }

        public Criteria andGLALT2Between(String value1, String value2) {
            addCriterion("GLALT2 between", value1, value2, "GLALT2");
            return (Criteria) this;
        }

        public Criteria andGLALT2NotBetween(String value1, String value2) {
            addCriterion("GLALT2 not between", value1, value2, "GLALT2");
            return (Criteria) this;
        }

        public Criteria andGLALT3IsNull() {
            addCriterion("GLALT3 is null");
            return (Criteria) this;
        }

        public Criteria andGLALT3IsNotNull() {
            addCriterion("GLALT3 is not null");
            return (Criteria) this;
        }

        public Criteria andGLALT3EqualTo(String value) {
            addCriterion("GLALT3 =", value, "GLALT3");
            return (Criteria) this;
        }

        public Criteria andGLALT3NotEqualTo(String value) {
            addCriterion("GLALT3 <>", value, "GLALT3");
            return (Criteria) this;
        }

        public Criteria andGLALT3GreaterThan(String value) {
            addCriterion("GLALT3 >", value, "GLALT3");
            return (Criteria) this;
        }

        public Criteria andGLALT3GreaterThanOrEqualTo(String value) {
            addCriterion("GLALT3 >=", value, "GLALT3");
            return (Criteria) this;
        }

        public Criteria andGLALT3LessThan(String value) {
            addCriterion("GLALT3 <", value, "GLALT3");
            return (Criteria) this;
        }

        public Criteria andGLALT3LessThanOrEqualTo(String value) {
            addCriterion("GLALT3 <=", value, "GLALT3");
            return (Criteria) this;
        }

        public Criteria andGLALT3Like(String value) {
            addCriterion("GLALT3 like", value, "GLALT3");
            return (Criteria) this;
        }

        public Criteria andGLALT3NotLike(String value) {
            addCriterion("GLALT3 not like", value, "GLALT3");
            return (Criteria) this;
        }

        public Criteria andGLALT3In(List<String> values) {
            addCriterion("GLALT3 in", values, "GLALT3");
            return (Criteria) this;
        }

        public Criteria andGLALT3NotIn(List<String> values) {
            addCriterion("GLALT3 not in", values, "GLALT3");
            return (Criteria) this;
        }

        public Criteria andGLALT3Between(String value1, String value2) {
            addCriterion("GLALT3 between", value1, value2, "GLALT3");
            return (Criteria) this;
        }

        public Criteria andGLALT3NotBetween(String value1, String value2) {
            addCriterion("GLALT3 not between", value1, value2, "GLALT3");
            return (Criteria) this;
        }

        public Criteria andGLALT4IsNull() {
            addCriterion("GLALT4 is null");
            return (Criteria) this;
        }

        public Criteria andGLALT4IsNotNull() {
            addCriterion("GLALT4 is not null");
            return (Criteria) this;
        }

        public Criteria andGLALT4EqualTo(String value) {
            addCriterion("GLALT4 =", value, "GLALT4");
            return (Criteria) this;
        }

        public Criteria andGLALT4NotEqualTo(String value) {
            addCriterion("GLALT4 <>", value, "GLALT4");
            return (Criteria) this;
        }

        public Criteria andGLALT4GreaterThan(String value) {
            addCriterion("GLALT4 >", value, "GLALT4");
            return (Criteria) this;
        }

        public Criteria andGLALT4GreaterThanOrEqualTo(String value) {
            addCriterion("GLALT4 >=", value, "GLALT4");
            return (Criteria) this;
        }

        public Criteria andGLALT4LessThan(String value) {
            addCriterion("GLALT4 <", value, "GLALT4");
            return (Criteria) this;
        }

        public Criteria andGLALT4LessThanOrEqualTo(String value) {
            addCriterion("GLALT4 <=", value, "GLALT4");
            return (Criteria) this;
        }

        public Criteria andGLALT4Like(String value) {
            addCriterion("GLALT4 like", value, "GLALT4");
            return (Criteria) this;
        }

        public Criteria andGLALT4NotLike(String value) {
            addCriterion("GLALT4 not like", value, "GLALT4");
            return (Criteria) this;
        }

        public Criteria andGLALT4In(List<String> values) {
            addCriterion("GLALT4 in", values, "GLALT4");
            return (Criteria) this;
        }

        public Criteria andGLALT4NotIn(List<String> values) {
            addCriterion("GLALT4 not in", values, "GLALT4");
            return (Criteria) this;
        }

        public Criteria andGLALT4Between(String value1, String value2) {
            addCriterion("GLALT4 between", value1, value2, "GLALT4");
            return (Criteria) this;
        }

        public Criteria andGLALT4NotBetween(String value1, String value2) {
            addCriterion("GLALT4 not between", value1, value2, "GLALT4");
            return (Criteria) this;
        }

        public Criteria andGLALT5IsNull() {
            addCriterion("GLALT5 is null");
            return (Criteria) this;
        }

        public Criteria andGLALT5IsNotNull() {
            addCriterion("GLALT5 is not null");
            return (Criteria) this;
        }

        public Criteria andGLALT5EqualTo(String value) {
            addCriterion("GLALT5 =", value, "GLALT5");
            return (Criteria) this;
        }

        public Criteria andGLALT5NotEqualTo(String value) {
            addCriterion("GLALT5 <>", value, "GLALT5");
            return (Criteria) this;
        }

        public Criteria andGLALT5GreaterThan(String value) {
            addCriterion("GLALT5 >", value, "GLALT5");
            return (Criteria) this;
        }

        public Criteria andGLALT5GreaterThanOrEqualTo(String value) {
            addCriterion("GLALT5 >=", value, "GLALT5");
            return (Criteria) this;
        }

        public Criteria andGLALT5LessThan(String value) {
            addCriterion("GLALT5 <", value, "GLALT5");
            return (Criteria) this;
        }

        public Criteria andGLALT5LessThanOrEqualTo(String value) {
            addCriterion("GLALT5 <=", value, "GLALT5");
            return (Criteria) this;
        }

        public Criteria andGLALT5Like(String value) {
            addCriterion("GLALT5 like", value, "GLALT5");
            return (Criteria) this;
        }

        public Criteria andGLALT5NotLike(String value) {
            addCriterion("GLALT5 not like", value, "GLALT5");
            return (Criteria) this;
        }

        public Criteria andGLALT5In(List<String> values) {
            addCriterion("GLALT5 in", values, "GLALT5");
            return (Criteria) this;
        }

        public Criteria andGLALT5NotIn(List<String> values) {
            addCriterion("GLALT5 not in", values, "GLALT5");
            return (Criteria) this;
        }

        public Criteria andGLALT5Between(String value1, String value2) {
            addCriterion("GLALT5 between", value1, value2, "GLALT5");
            return (Criteria) this;
        }

        public Criteria andGLALT5NotBetween(String value1, String value2) {
            addCriterion("GLALT5 not between", value1, value2, "GLALT5");
            return (Criteria) this;
        }

        public Criteria andGLALT6IsNull() {
            addCriterion("GLALT6 is null");
            return (Criteria) this;
        }

        public Criteria andGLALT6IsNotNull() {
            addCriterion("GLALT6 is not null");
            return (Criteria) this;
        }

        public Criteria andGLALT6EqualTo(String value) {
            addCriterion("GLALT6 =", value, "GLALT6");
            return (Criteria) this;
        }

        public Criteria andGLALT6NotEqualTo(String value) {
            addCriterion("GLALT6 <>", value, "GLALT6");
            return (Criteria) this;
        }

        public Criteria andGLALT6GreaterThan(String value) {
            addCriterion("GLALT6 >", value, "GLALT6");
            return (Criteria) this;
        }

        public Criteria andGLALT6GreaterThanOrEqualTo(String value) {
            addCriterion("GLALT6 >=", value, "GLALT6");
            return (Criteria) this;
        }

        public Criteria andGLALT6LessThan(String value) {
            addCriterion("GLALT6 <", value, "GLALT6");
            return (Criteria) this;
        }

        public Criteria andGLALT6LessThanOrEqualTo(String value) {
            addCriterion("GLALT6 <=", value, "GLALT6");
            return (Criteria) this;
        }

        public Criteria andGLALT6Like(String value) {
            addCriterion("GLALT6 like", value, "GLALT6");
            return (Criteria) this;
        }

        public Criteria andGLALT6NotLike(String value) {
            addCriterion("GLALT6 not like", value, "GLALT6");
            return (Criteria) this;
        }

        public Criteria andGLALT6In(List<String> values) {
            addCriterion("GLALT6 in", values, "GLALT6");
            return (Criteria) this;
        }

        public Criteria andGLALT6NotIn(List<String> values) {
            addCriterion("GLALT6 not in", values, "GLALT6");
            return (Criteria) this;
        }

        public Criteria andGLALT6Between(String value1, String value2) {
            addCriterion("GLALT6 between", value1, value2, "GLALT6");
            return (Criteria) this;
        }

        public Criteria andGLALT6NotBetween(String value1, String value2) {
            addCriterion("GLALT6 not between", value1, value2, "GLALT6");
            return (Criteria) this;
        }

        public Criteria andGLALT7IsNull() {
            addCriterion("GLALT7 is null");
            return (Criteria) this;
        }

        public Criteria andGLALT7IsNotNull() {
            addCriterion("GLALT7 is not null");
            return (Criteria) this;
        }

        public Criteria andGLALT7EqualTo(String value) {
            addCriterion("GLALT7 =", value, "GLALT7");
            return (Criteria) this;
        }

        public Criteria andGLALT7NotEqualTo(String value) {
            addCriterion("GLALT7 <>", value, "GLALT7");
            return (Criteria) this;
        }

        public Criteria andGLALT7GreaterThan(String value) {
            addCriterion("GLALT7 >", value, "GLALT7");
            return (Criteria) this;
        }

        public Criteria andGLALT7GreaterThanOrEqualTo(String value) {
            addCriterion("GLALT7 >=", value, "GLALT7");
            return (Criteria) this;
        }

        public Criteria andGLALT7LessThan(String value) {
            addCriterion("GLALT7 <", value, "GLALT7");
            return (Criteria) this;
        }

        public Criteria andGLALT7LessThanOrEqualTo(String value) {
            addCriterion("GLALT7 <=", value, "GLALT7");
            return (Criteria) this;
        }

        public Criteria andGLALT7Like(String value) {
            addCriterion("GLALT7 like", value, "GLALT7");
            return (Criteria) this;
        }

        public Criteria andGLALT7NotLike(String value) {
            addCriterion("GLALT7 not like", value, "GLALT7");
            return (Criteria) this;
        }

        public Criteria andGLALT7In(List<String> values) {
            addCriterion("GLALT7 in", values, "GLALT7");
            return (Criteria) this;
        }

        public Criteria andGLALT7NotIn(List<String> values) {
            addCriterion("GLALT7 not in", values, "GLALT7");
            return (Criteria) this;
        }

        public Criteria andGLALT7Between(String value1, String value2) {
            addCriterion("GLALT7 between", value1, value2, "GLALT7");
            return (Criteria) this;
        }

        public Criteria andGLALT7NotBetween(String value1, String value2) {
            addCriterion("GLALT7 not between", value1, value2, "GLALT7");
            return (Criteria) this;
        }

        public Criteria andGLALT8IsNull() {
            addCriterion("GLALT8 is null");
            return (Criteria) this;
        }

        public Criteria andGLALT8IsNotNull() {
            addCriterion("GLALT8 is not null");
            return (Criteria) this;
        }

        public Criteria andGLALT8EqualTo(String value) {
            addCriterion("GLALT8 =", value, "GLALT8");
            return (Criteria) this;
        }

        public Criteria andGLALT8NotEqualTo(String value) {
            addCriterion("GLALT8 <>", value, "GLALT8");
            return (Criteria) this;
        }

        public Criteria andGLALT8GreaterThan(String value) {
            addCriterion("GLALT8 >", value, "GLALT8");
            return (Criteria) this;
        }

        public Criteria andGLALT8GreaterThanOrEqualTo(String value) {
            addCriterion("GLALT8 >=", value, "GLALT8");
            return (Criteria) this;
        }

        public Criteria andGLALT8LessThan(String value) {
            addCriterion("GLALT8 <", value, "GLALT8");
            return (Criteria) this;
        }

        public Criteria andGLALT8LessThanOrEqualTo(String value) {
            addCriterion("GLALT8 <=", value, "GLALT8");
            return (Criteria) this;
        }

        public Criteria andGLALT8Like(String value) {
            addCriterion("GLALT8 like", value, "GLALT8");
            return (Criteria) this;
        }

        public Criteria andGLALT8NotLike(String value) {
            addCriterion("GLALT8 not like", value, "GLALT8");
            return (Criteria) this;
        }

        public Criteria andGLALT8In(List<String> values) {
            addCriterion("GLALT8 in", values, "GLALT8");
            return (Criteria) this;
        }

        public Criteria andGLALT8NotIn(List<String> values) {
            addCriterion("GLALT8 not in", values, "GLALT8");
            return (Criteria) this;
        }

        public Criteria andGLALT8Between(String value1, String value2) {
            addCriterion("GLALT8 between", value1, value2, "GLALT8");
            return (Criteria) this;
        }

        public Criteria andGLALT8NotBetween(String value1, String value2) {
            addCriterion("GLALT8 not between", value1, value2, "GLALT8");
            return (Criteria) this;
        }

        public Criteria andGLALT9IsNull() {
            addCriterion("GLALT9 is null");
            return (Criteria) this;
        }

        public Criteria andGLALT9IsNotNull() {
            addCriterion("GLALT9 is not null");
            return (Criteria) this;
        }

        public Criteria andGLALT9EqualTo(String value) {
            addCriterion("GLALT9 =", value, "GLALT9");
            return (Criteria) this;
        }

        public Criteria andGLALT9NotEqualTo(String value) {
            addCriterion("GLALT9 <>", value, "GLALT9");
            return (Criteria) this;
        }

        public Criteria andGLALT9GreaterThan(String value) {
            addCriterion("GLALT9 >", value, "GLALT9");
            return (Criteria) this;
        }

        public Criteria andGLALT9GreaterThanOrEqualTo(String value) {
            addCriterion("GLALT9 >=", value, "GLALT9");
            return (Criteria) this;
        }

        public Criteria andGLALT9LessThan(String value) {
            addCriterion("GLALT9 <", value, "GLALT9");
            return (Criteria) this;
        }

        public Criteria andGLALT9LessThanOrEqualTo(String value) {
            addCriterion("GLALT9 <=", value, "GLALT9");
            return (Criteria) this;
        }

        public Criteria andGLALT9Like(String value) {
            addCriterion("GLALT9 like", value, "GLALT9");
            return (Criteria) this;
        }

        public Criteria andGLALT9NotLike(String value) {
            addCriterion("GLALT9 not like", value, "GLALT9");
            return (Criteria) this;
        }

        public Criteria andGLALT9In(List<String> values) {
            addCriterion("GLALT9 in", values, "GLALT9");
            return (Criteria) this;
        }

        public Criteria andGLALT9NotIn(List<String> values) {
            addCriterion("GLALT9 not in", values, "GLALT9");
            return (Criteria) this;
        }

        public Criteria andGLALT9Between(String value1, String value2) {
            addCriterion("GLALT9 between", value1, value2, "GLALT9");
            return (Criteria) this;
        }

        public Criteria andGLALT9NotBetween(String value1, String value2) {
            addCriterion("GLALT9 not between", value1, value2, "GLALT9");
            return (Criteria) this;
        }

        public Criteria andGLALT0IsNull() {
            addCriterion("GLALT0 is null");
            return (Criteria) this;
        }

        public Criteria andGLALT0IsNotNull() {
            addCriterion("GLALT0 is not null");
            return (Criteria) this;
        }

        public Criteria andGLALT0EqualTo(String value) {
            addCriterion("GLALT0 =", value, "GLALT0");
            return (Criteria) this;
        }

        public Criteria andGLALT0NotEqualTo(String value) {
            addCriterion("GLALT0 <>", value, "GLALT0");
            return (Criteria) this;
        }

        public Criteria andGLALT0GreaterThan(String value) {
            addCriterion("GLALT0 >", value, "GLALT0");
            return (Criteria) this;
        }

        public Criteria andGLALT0GreaterThanOrEqualTo(String value) {
            addCriterion("GLALT0 >=", value, "GLALT0");
            return (Criteria) this;
        }

        public Criteria andGLALT0LessThan(String value) {
            addCriterion("GLALT0 <", value, "GLALT0");
            return (Criteria) this;
        }

        public Criteria andGLALT0LessThanOrEqualTo(String value) {
            addCriterion("GLALT0 <=", value, "GLALT0");
            return (Criteria) this;
        }

        public Criteria andGLALT0Like(String value) {
            addCriterion("GLALT0 like", value, "GLALT0");
            return (Criteria) this;
        }

        public Criteria andGLALT0NotLike(String value) {
            addCriterion("GLALT0 not like", value, "GLALT0");
            return (Criteria) this;
        }

        public Criteria andGLALT0In(List<String> values) {
            addCriterion("GLALT0 in", values, "GLALT0");
            return (Criteria) this;
        }

        public Criteria andGLALT0NotIn(List<String> values) {
            addCriterion("GLALT0 not in", values, "GLALT0");
            return (Criteria) this;
        }

        public Criteria andGLALT0Between(String value1, String value2) {
            addCriterion("GLALT0 between", value1, value2, "GLALT0");
            return (Criteria) this;
        }

        public Criteria andGLALT0NotBetween(String value1, String value2) {
            addCriterion("GLALT0 not between", value1, value2, "GLALT0");
            return (Criteria) this;
        }

        public Criteria andGLALTTIsNull() {
            addCriterion("GLALTT is null");
            return (Criteria) this;
        }

        public Criteria andGLALTTIsNotNull() {
            addCriterion("GLALTT is not null");
            return (Criteria) this;
        }

        public Criteria andGLALTTEqualTo(String value) {
            addCriterion("GLALTT =", value, "GLALTT");
            return (Criteria) this;
        }

        public Criteria andGLALTTNotEqualTo(String value) {
            addCriterion("GLALTT <>", value, "GLALTT");
            return (Criteria) this;
        }

        public Criteria andGLALTTGreaterThan(String value) {
            addCriterion("GLALTT >", value, "GLALTT");
            return (Criteria) this;
        }

        public Criteria andGLALTTGreaterThanOrEqualTo(String value) {
            addCriterion("GLALTT >=", value, "GLALTT");
            return (Criteria) this;
        }

        public Criteria andGLALTTLessThan(String value) {
            addCriterion("GLALTT <", value, "GLALTT");
            return (Criteria) this;
        }

        public Criteria andGLALTTLessThanOrEqualTo(String value) {
            addCriterion("GLALTT <=", value, "GLALTT");
            return (Criteria) this;
        }

        public Criteria andGLALTTLike(String value) {
            addCriterion("GLALTT like", value, "GLALTT");
            return (Criteria) this;
        }

        public Criteria andGLALTTNotLike(String value) {
            addCriterion("GLALTT not like", value, "GLALTT");
            return (Criteria) this;
        }

        public Criteria andGLALTTIn(List<String> values) {
            addCriterion("GLALTT in", values, "GLALTT");
            return (Criteria) this;
        }

        public Criteria andGLALTTNotIn(List<String> values) {
            addCriterion("GLALTT not in", values, "GLALTT");
            return (Criteria) this;
        }

        public Criteria andGLALTTBetween(String value1, String value2) {
            addCriterion("GLALTT between", value1, value2, "GLALTT");
            return (Criteria) this;
        }

        public Criteria andGLALTTNotBetween(String value1, String value2) {
            addCriterion("GLALTT not between", value1, value2, "GLALTT");
            return (Criteria) this;
        }

        public Criteria andGLALTUIsNull() {
            addCriterion("GLALTU is null");
            return (Criteria) this;
        }

        public Criteria andGLALTUIsNotNull() {
            addCriterion("GLALTU is not null");
            return (Criteria) this;
        }

        public Criteria andGLALTUEqualTo(String value) {
            addCriterion("GLALTU =", value, "GLALTU");
            return (Criteria) this;
        }

        public Criteria andGLALTUNotEqualTo(String value) {
            addCriterion("GLALTU <>", value, "GLALTU");
            return (Criteria) this;
        }

        public Criteria andGLALTUGreaterThan(String value) {
            addCriterion("GLALTU >", value, "GLALTU");
            return (Criteria) this;
        }

        public Criteria andGLALTUGreaterThanOrEqualTo(String value) {
            addCriterion("GLALTU >=", value, "GLALTU");
            return (Criteria) this;
        }

        public Criteria andGLALTULessThan(String value) {
            addCriterion("GLALTU <", value, "GLALTU");
            return (Criteria) this;
        }

        public Criteria andGLALTULessThanOrEqualTo(String value) {
            addCriterion("GLALTU <=", value, "GLALTU");
            return (Criteria) this;
        }

        public Criteria andGLALTULike(String value) {
            addCriterion("GLALTU like", value, "GLALTU");
            return (Criteria) this;
        }

        public Criteria andGLALTUNotLike(String value) {
            addCriterion("GLALTU not like", value, "GLALTU");
            return (Criteria) this;
        }

        public Criteria andGLALTUIn(List<String> values) {
            addCriterion("GLALTU in", values, "GLALTU");
            return (Criteria) this;
        }

        public Criteria andGLALTUNotIn(List<String> values) {
            addCriterion("GLALTU not in", values, "GLALTU");
            return (Criteria) this;
        }

        public Criteria andGLALTUBetween(String value1, String value2) {
            addCriterion("GLALTU between", value1, value2, "GLALTU");
            return (Criteria) this;
        }

        public Criteria andGLALTUNotBetween(String value1, String value2) {
            addCriterion("GLALTU not between", value1, value2, "GLALTU");
            return (Criteria) this;
        }

        public Criteria andGLALTVIsNull() {
            addCriterion("GLALTV is null");
            return (Criteria) this;
        }

        public Criteria andGLALTVIsNotNull() {
            addCriterion("GLALTV is not null");
            return (Criteria) this;
        }

        public Criteria andGLALTVEqualTo(String value) {
            addCriterion("GLALTV =", value, "GLALTV");
            return (Criteria) this;
        }

        public Criteria andGLALTVNotEqualTo(String value) {
            addCriterion("GLALTV <>", value, "GLALTV");
            return (Criteria) this;
        }

        public Criteria andGLALTVGreaterThan(String value) {
            addCriterion("GLALTV >", value, "GLALTV");
            return (Criteria) this;
        }

        public Criteria andGLALTVGreaterThanOrEqualTo(String value) {
            addCriterion("GLALTV >=", value, "GLALTV");
            return (Criteria) this;
        }

        public Criteria andGLALTVLessThan(String value) {
            addCriterion("GLALTV <", value, "GLALTV");
            return (Criteria) this;
        }

        public Criteria andGLALTVLessThanOrEqualTo(String value) {
            addCriterion("GLALTV <=", value, "GLALTV");
            return (Criteria) this;
        }

        public Criteria andGLALTVLike(String value) {
            addCriterion("GLALTV like", value, "GLALTV");
            return (Criteria) this;
        }

        public Criteria andGLALTVNotLike(String value) {
            addCriterion("GLALTV not like", value, "GLALTV");
            return (Criteria) this;
        }

        public Criteria andGLALTVIn(List<String> values) {
            addCriterion("GLALTV in", values, "GLALTV");
            return (Criteria) this;
        }

        public Criteria andGLALTVNotIn(List<String> values) {
            addCriterion("GLALTV not in", values, "GLALTV");
            return (Criteria) this;
        }

        public Criteria andGLALTVBetween(String value1, String value2) {
            addCriterion("GLALTV between", value1, value2, "GLALTV");
            return (Criteria) this;
        }

        public Criteria andGLALTVNotBetween(String value1, String value2) {
            addCriterion("GLALTV not between", value1, value2, "GLALTV");
            return (Criteria) this;
        }

        public Criteria andGLALTWIsNull() {
            addCriterion("GLALTW is null");
            return (Criteria) this;
        }

        public Criteria andGLALTWIsNotNull() {
            addCriterion("GLALTW is not null");
            return (Criteria) this;
        }

        public Criteria andGLALTWEqualTo(String value) {
            addCriterion("GLALTW =", value, "GLALTW");
            return (Criteria) this;
        }

        public Criteria andGLALTWNotEqualTo(String value) {
            addCriterion("GLALTW <>", value, "GLALTW");
            return (Criteria) this;
        }

        public Criteria andGLALTWGreaterThan(String value) {
            addCriterion("GLALTW >", value, "GLALTW");
            return (Criteria) this;
        }

        public Criteria andGLALTWGreaterThanOrEqualTo(String value) {
            addCriterion("GLALTW >=", value, "GLALTW");
            return (Criteria) this;
        }

        public Criteria andGLALTWLessThan(String value) {
            addCriterion("GLALTW <", value, "GLALTW");
            return (Criteria) this;
        }

        public Criteria andGLALTWLessThanOrEqualTo(String value) {
            addCriterion("GLALTW <=", value, "GLALTW");
            return (Criteria) this;
        }

        public Criteria andGLALTWLike(String value) {
            addCriterion("GLALTW like", value, "GLALTW");
            return (Criteria) this;
        }

        public Criteria andGLALTWNotLike(String value) {
            addCriterion("GLALTW not like", value, "GLALTW");
            return (Criteria) this;
        }

        public Criteria andGLALTWIn(List<String> values) {
            addCriterion("GLALTW in", values, "GLALTW");
            return (Criteria) this;
        }

        public Criteria andGLALTWNotIn(List<String> values) {
            addCriterion("GLALTW not in", values, "GLALTW");
            return (Criteria) this;
        }

        public Criteria andGLALTWBetween(String value1, String value2) {
            addCriterion("GLALTW between", value1, value2, "GLALTW");
            return (Criteria) this;
        }

        public Criteria andGLALTWNotBetween(String value1, String value2) {
            addCriterion("GLALTW not between", value1, value2, "GLALTW");
            return (Criteria) this;
        }

        public Criteria andGLALTXIsNull() {
            addCriterion("GLALTX is null");
            return (Criteria) this;
        }

        public Criteria andGLALTXIsNotNull() {
            addCriterion("GLALTX is not null");
            return (Criteria) this;
        }

        public Criteria andGLALTXEqualTo(String value) {
            addCriterion("GLALTX =", value, "GLALTX");
            return (Criteria) this;
        }

        public Criteria andGLALTXNotEqualTo(String value) {
            addCriterion("GLALTX <>", value, "GLALTX");
            return (Criteria) this;
        }

        public Criteria andGLALTXGreaterThan(String value) {
            addCriterion("GLALTX >", value, "GLALTX");
            return (Criteria) this;
        }

        public Criteria andGLALTXGreaterThanOrEqualTo(String value) {
            addCriterion("GLALTX >=", value, "GLALTX");
            return (Criteria) this;
        }

        public Criteria andGLALTXLessThan(String value) {
            addCriterion("GLALTX <", value, "GLALTX");
            return (Criteria) this;
        }

        public Criteria andGLALTXLessThanOrEqualTo(String value) {
            addCriterion("GLALTX <=", value, "GLALTX");
            return (Criteria) this;
        }

        public Criteria andGLALTXLike(String value) {
            addCriterion("GLALTX like", value, "GLALTX");
            return (Criteria) this;
        }

        public Criteria andGLALTXNotLike(String value) {
            addCriterion("GLALTX not like", value, "GLALTX");
            return (Criteria) this;
        }

        public Criteria andGLALTXIn(List<String> values) {
            addCriterion("GLALTX in", values, "GLALTX");
            return (Criteria) this;
        }

        public Criteria andGLALTXNotIn(List<String> values) {
            addCriterion("GLALTX not in", values, "GLALTX");
            return (Criteria) this;
        }

        public Criteria andGLALTXBetween(String value1, String value2) {
            addCriterion("GLALTX between", value1, value2, "GLALTX");
            return (Criteria) this;
        }

        public Criteria andGLALTXNotBetween(String value1, String value2) {
            addCriterion("GLALTX not between", value1, value2, "GLALTX");
            return (Criteria) this;
        }

        public Criteria andGLALTZIsNull() {
            addCriterion("GLALTZ is null");
            return (Criteria) this;
        }

        public Criteria andGLALTZIsNotNull() {
            addCriterion("GLALTZ is not null");
            return (Criteria) this;
        }

        public Criteria andGLALTZEqualTo(String value) {
            addCriterion("GLALTZ =", value, "GLALTZ");
            return (Criteria) this;
        }

        public Criteria andGLALTZNotEqualTo(String value) {
            addCriterion("GLALTZ <>", value, "GLALTZ");
            return (Criteria) this;
        }

        public Criteria andGLALTZGreaterThan(String value) {
            addCriterion("GLALTZ >", value, "GLALTZ");
            return (Criteria) this;
        }

        public Criteria andGLALTZGreaterThanOrEqualTo(String value) {
            addCriterion("GLALTZ >=", value, "GLALTZ");
            return (Criteria) this;
        }

        public Criteria andGLALTZLessThan(String value) {
            addCriterion("GLALTZ <", value, "GLALTZ");
            return (Criteria) this;
        }

        public Criteria andGLALTZLessThanOrEqualTo(String value) {
            addCriterion("GLALTZ <=", value, "GLALTZ");
            return (Criteria) this;
        }

        public Criteria andGLALTZLike(String value) {
            addCriterion("GLALTZ like", value, "GLALTZ");
            return (Criteria) this;
        }

        public Criteria andGLALTZNotLike(String value) {
            addCriterion("GLALTZ not like", value, "GLALTZ");
            return (Criteria) this;
        }

        public Criteria andGLALTZIn(List<String> values) {
            addCriterion("GLALTZ in", values, "GLALTZ");
            return (Criteria) this;
        }

        public Criteria andGLALTZNotIn(List<String> values) {
            addCriterion("GLALTZ not in", values, "GLALTZ");
            return (Criteria) this;
        }

        public Criteria andGLALTZBetween(String value1, String value2) {
            addCriterion("GLALTZ between", value1, value2, "GLALTZ");
            return (Criteria) this;
        }

        public Criteria andGLALTZNotBetween(String value1, String value2) {
            addCriterion("GLALTZ not between", value1, value2, "GLALTZ");
            return (Criteria) this;
        }

        public Criteria andGLDLNAIsNull() {
            addCriterion("GLDLNA is null");
            return (Criteria) this;
        }

        public Criteria andGLDLNAIsNotNull() {
            addCriterion("GLDLNA is not null");
            return (Criteria) this;
        }

        public Criteria andGLDLNAEqualTo(String value) {
            addCriterion("GLDLNA =", value, "GLDLNA");
            return (Criteria) this;
        }

        public Criteria andGLDLNANotEqualTo(String value) {
            addCriterion("GLDLNA <>", value, "GLDLNA");
            return (Criteria) this;
        }

        public Criteria andGLDLNAGreaterThan(String value) {
            addCriterion("GLDLNA >", value, "GLDLNA");
            return (Criteria) this;
        }

        public Criteria andGLDLNAGreaterThanOrEqualTo(String value) {
            addCriterion("GLDLNA >=", value, "GLDLNA");
            return (Criteria) this;
        }

        public Criteria andGLDLNALessThan(String value) {
            addCriterion("GLDLNA <", value, "GLDLNA");
            return (Criteria) this;
        }

        public Criteria andGLDLNALessThanOrEqualTo(String value) {
            addCriterion("GLDLNA <=", value, "GLDLNA");
            return (Criteria) this;
        }

        public Criteria andGLDLNALike(String value) {
            addCriterion("GLDLNA like", value, "GLDLNA");
            return (Criteria) this;
        }

        public Criteria andGLDLNANotLike(String value) {
            addCriterion("GLDLNA not like", value, "GLDLNA");
            return (Criteria) this;
        }

        public Criteria andGLDLNAIn(List<String> values) {
            addCriterion("GLDLNA in", values, "GLDLNA");
            return (Criteria) this;
        }

        public Criteria andGLDLNANotIn(List<String> values) {
            addCriterion("GLDLNA not in", values, "GLDLNA");
            return (Criteria) this;
        }

        public Criteria andGLDLNABetween(String value1, String value2) {
            addCriterion("GLDLNA between", value1, value2, "GLDLNA");
            return (Criteria) this;
        }

        public Criteria andGLDLNANotBetween(String value1, String value2) {
            addCriterion("GLDLNA not between", value1, value2, "GLDLNA");
            return (Criteria) this;
        }

        public Criteria andGLCFF1IsNull() {
            addCriterion("GLCFF1 is null");
            return (Criteria) this;
        }

        public Criteria andGLCFF1IsNotNull() {
            addCriterion("GLCFF1 is not null");
            return (Criteria) this;
        }

        public Criteria andGLCFF1EqualTo(String value) {
            addCriterion("GLCFF1 =", value, "GLCFF1");
            return (Criteria) this;
        }

        public Criteria andGLCFF1NotEqualTo(String value) {
            addCriterion("GLCFF1 <>", value, "GLCFF1");
            return (Criteria) this;
        }

        public Criteria andGLCFF1GreaterThan(String value) {
            addCriterion("GLCFF1 >", value, "GLCFF1");
            return (Criteria) this;
        }

        public Criteria andGLCFF1GreaterThanOrEqualTo(String value) {
            addCriterion("GLCFF1 >=", value, "GLCFF1");
            return (Criteria) this;
        }

        public Criteria andGLCFF1LessThan(String value) {
            addCriterion("GLCFF1 <", value, "GLCFF1");
            return (Criteria) this;
        }

        public Criteria andGLCFF1LessThanOrEqualTo(String value) {
            addCriterion("GLCFF1 <=", value, "GLCFF1");
            return (Criteria) this;
        }

        public Criteria andGLCFF1Like(String value) {
            addCriterion("GLCFF1 like", value, "GLCFF1");
            return (Criteria) this;
        }

        public Criteria andGLCFF1NotLike(String value) {
            addCriterion("GLCFF1 not like", value, "GLCFF1");
            return (Criteria) this;
        }

        public Criteria andGLCFF1In(List<String> values) {
            addCriterion("GLCFF1 in", values, "GLCFF1");
            return (Criteria) this;
        }

        public Criteria andGLCFF1NotIn(List<String> values) {
            addCriterion("GLCFF1 not in", values, "GLCFF1");
            return (Criteria) this;
        }

        public Criteria andGLCFF1Between(String value1, String value2) {
            addCriterion("GLCFF1 between", value1, value2, "GLCFF1");
            return (Criteria) this;
        }

        public Criteria andGLCFF1NotBetween(String value1, String value2) {
            addCriterion("GLCFF1 not between", value1, value2, "GLCFF1");
            return (Criteria) this;
        }

        public Criteria andGLCFF2IsNull() {
            addCriterion("GLCFF2 is null");
            return (Criteria) this;
        }

        public Criteria andGLCFF2IsNotNull() {
            addCriterion("GLCFF2 is not null");
            return (Criteria) this;
        }

        public Criteria andGLCFF2EqualTo(String value) {
            addCriterion("GLCFF2 =", value, "GLCFF2");
            return (Criteria) this;
        }

        public Criteria andGLCFF2NotEqualTo(String value) {
            addCriterion("GLCFF2 <>", value, "GLCFF2");
            return (Criteria) this;
        }

        public Criteria andGLCFF2GreaterThan(String value) {
            addCriterion("GLCFF2 >", value, "GLCFF2");
            return (Criteria) this;
        }

        public Criteria andGLCFF2GreaterThanOrEqualTo(String value) {
            addCriterion("GLCFF2 >=", value, "GLCFF2");
            return (Criteria) this;
        }

        public Criteria andGLCFF2LessThan(String value) {
            addCriterion("GLCFF2 <", value, "GLCFF2");
            return (Criteria) this;
        }

        public Criteria andGLCFF2LessThanOrEqualTo(String value) {
            addCriterion("GLCFF2 <=", value, "GLCFF2");
            return (Criteria) this;
        }

        public Criteria andGLCFF2Like(String value) {
            addCriterion("GLCFF2 like", value, "GLCFF2");
            return (Criteria) this;
        }

        public Criteria andGLCFF2NotLike(String value) {
            addCriterion("GLCFF2 not like", value, "GLCFF2");
            return (Criteria) this;
        }

        public Criteria andGLCFF2In(List<String> values) {
            addCriterion("GLCFF2 in", values, "GLCFF2");
            return (Criteria) this;
        }

        public Criteria andGLCFF2NotIn(List<String> values) {
            addCriterion("GLCFF2 not in", values, "GLCFF2");
            return (Criteria) this;
        }

        public Criteria andGLCFF2Between(String value1, String value2) {
            addCriterion("GLCFF2 between", value1, value2, "GLCFF2");
            return (Criteria) this;
        }

        public Criteria andGLCFF2NotBetween(String value1, String value2) {
            addCriterion("GLCFF2 not between", value1, value2, "GLCFF2");
            return (Criteria) this;
        }

        public Criteria andGLASMIsNull() {
            addCriterion("GLASM is null");
            return (Criteria) this;
        }

        public Criteria andGLASMIsNotNull() {
            addCriterion("GLASM is not null");
            return (Criteria) this;
        }

        public Criteria andGLASMEqualTo(String value) {
            addCriterion("GLASM =", value, "GLASM");
            return (Criteria) this;
        }

        public Criteria andGLASMNotEqualTo(String value) {
            addCriterion("GLASM <>", value, "GLASM");
            return (Criteria) this;
        }

        public Criteria andGLASMGreaterThan(String value) {
            addCriterion("GLASM >", value, "GLASM");
            return (Criteria) this;
        }

        public Criteria andGLASMGreaterThanOrEqualTo(String value) {
            addCriterion("GLASM >=", value, "GLASM");
            return (Criteria) this;
        }

        public Criteria andGLASMLessThan(String value) {
            addCriterion("GLASM <", value, "GLASM");
            return (Criteria) this;
        }

        public Criteria andGLASMLessThanOrEqualTo(String value) {
            addCriterion("GLASM <=", value, "GLASM");
            return (Criteria) this;
        }

        public Criteria andGLASMLike(String value) {
            addCriterion("GLASM like", value, "GLASM");
            return (Criteria) this;
        }

        public Criteria andGLASMNotLike(String value) {
            addCriterion("GLASM not like", value, "GLASM");
            return (Criteria) this;
        }

        public Criteria andGLASMIn(List<String> values) {
            addCriterion("GLASM in", values, "GLASM");
            return (Criteria) this;
        }

        public Criteria andGLASMNotIn(List<String> values) {
            addCriterion("GLASM not in", values, "GLASM");
            return (Criteria) this;
        }

        public Criteria andGLASMBetween(String value1, String value2) {
            addCriterion("GLASM between", value1, value2, "GLASM");
            return (Criteria) this;
        }

        public Criteria andGLASMNotBetween(String value1, String value2) {
            addCriterion("GLASM not between", value1, value2, "GLASM");
            return (Criteria) this;
        }

        public Criteria andGLBCIsNull() {
            addCriterion("GLBC is null");
            return (Criteria) this;
        }

        public Criteria andGLBCIsNotNull() {
            addCriterion("GLBC is not null");
            return (Criteria) this;
        }

        public Criteria andGLBCEqualTo(String value) {
            addCriterion("GLBC =", value, "GLBC");
            return (Criteria) this;
        }

        public Criteria andGLBCNotEqualTo(String value) {
            addCriterion("GLBC <>", value, "GLBC");
            return (Criteria) this;
        }

        public Criteria andGLBCGreaterThan(String value) {
            addCriterion("GLBC >", value, "GLBC");
            return (Criteria) this;
        }

        public Criteria andGLBCGreaterThanOrEqualTo(String value) {
            addCriterion("GLBC >=", value, "GLBC");
            return (Criteria) this;
        }

        public Criteria andGLBCLessThan(String value) {
            addCriterion("GLBC <", value, "GLBC");
            return (Criteria) this;
        }

        public Criteria andGLBCLessThanOrEqualTo(String value) {
            addCriterion("GLBC <=", value, "GLBC");
            return (Criteria) this;
        }

        public Criteria andGLBCLike(String value) {
            addCriterion("GLBC like", value, "GLBC");
            return (Criteria) this;
        }

        public Criteria andGLBCNotLike(String value) {
            addCriterion("GLBC not like", value, "GLBC");
            return (Criteria) this;
        }

        public Criteria andGLBCIn(List<String> values) {
            addCriterion("GLBC in", values, "GLBC");
            return (Criteria) this;
        }

        public Criteria andGLBCNotIn(List<String> values) {
            addCriterion("GLBC not in", values, "GLBC");
            return (Criteria) this;
        }

        public Criteria andGLBCBetween(String value1, String value2) {
            addCriterion("GLBC between", value1, value2, "GLBC");
            return (Criteria) this;
        }

        public Criteria andGLBCNotBetween(String value1, String value2) {
            addCriterion("GLBC not between", value1, value2, "GLBC");
            return (Criteria) this;
        }

        public Criteria andGLVINVIsNull() {
            addCriterion("GLVINV is null");
            return (Criteria) this;
        }

        public Criteria andGLVINVIsNotNull() {
            addCriterion("GLVINV is not null");
            return (Criteria) this;
        }

        public Criteria andGLVINVEqualTo(String value) {
            addCriterion("GLVINV =", value, "GLVINV");
            return (Criteria) this;
        }

        public Criteria andGLVINVNotEqualTo(String value) {
            addCriterion("GLVINV <>", value, "GLVINV");
            return (Criteria) this;
        }

        public Criteria andGLVINVGreaterThan(String value) {
            addCriterion("GLVINV >", value, "GLVINV");
            return (Criteria) this;
        }

        public Criteria andGLVINVGreaterThanOrEqualTo(String value) {
            addCriterion("GLVINV >=", value, "GLVINV");
            return (Criteria) this;
        }

        public Criteria andGLVINVLessThan(String value) {
            addCriterion("GLVINV <", value, "GLVINV");
            return (Criteria) this;
        }

        public Criteria andGLVINVLessThanOrEqualTo(String value) {
            addCriterion("GLVINV <=", value, "GLVINV");
            return (Criteria) this;
        }

        public Criteria andGLVINVLike(String value) {
            addCriterion("GLVINV like", value, "GLVINV");
            return (Criteria) this;
        }

        public Criteria andGLVINVNotLike(String value) {
            addCriterion("GLVINV not like", value, "GLVINV");
            return (Criteria) this;
        }

        public Criteria andGLVINVIn(List<String> values) {
            addCriterion("GLVINV in", values, "GLVINV");
            return (Criteria) this;
        }

        public Criteria andGLVINVNotIn(List<String> values) {
            addCriterion("GLVINV not in", values, "GLVINV");
            return (Criteria) this;
        }

        public Criteria andGLVINVBetween(String value1, String value2) {
            addCriterion("GLVINV between", value1, value2, "GLVINV");
            return (Criteria) this;
        }

        public Criteria andGLVINVNotBetween(String value1, String value2) {
            addCriterion("GLVINV not between", value1, value2, "GLVINV");
            return (Criteria) this;
        }

        public Criteria andGLIVDIsNull() {
            addCriterion("GLIVD is null");
            return (Criteria) this;
        }

        public Criteria andGLIVDIsNotNull() {
            addCriterion("GLIVD is not null");
            return (Criteria) this;
        }

        public Criteria andGLIVDEqualTo(Integer value) {
            addCriterion("GLIVD =", value, "GLIVD");
            return (Criteria) this;
        }

        public Criteria andGLIVDNotEqualTo(Integer value) {
            addCriterion("GLIVD <>", value, "GLIVD");
            return (Criteria) this;
        }

        public Criteria andGLIVDGreaterThan(Integer value) {
            addCriterion("GLIVD >", value, "GLIVD");
            return (Criteria) this;
        }

        public Criteria andGLIVDGreaterThanOrEqualTo(Integer value) {
            addCriterion("GLIVD >=", value, "GLIVD");
            return (Criteria) this;
        }

        public Criteria andGLIVDLessThan(Integer value) {
            addCriterion("GLIVD <", value, "GLIVD");
            return (Criteria) this;
        }

        public Criteria andGLIVDLessThanOrEqualTo(Integer value) {
            addCriterion("GLIVD <=", value, "GLIVD");
            return (Criteria) this;
        }

        public Criteria andGLIVDIn(List<Integer> values) {
            addCriterion("GLIVD in", values, "GLIVD");
            return (Criteria) this;
        }

        public Criteria andGLIVDNotIn(List<Integer> values) {
            addCriterion("GLIVD not in", values, "GLIVD");
            return (Criteria) this;
        }

        public Criteria andGLIVDBetween(Integer value1, Integer value2) {
            addCriterion("GLIVD between", value1, value2, "GLIVD");
            return (Criteria) this;
        }

        public Criteria andGLIVDNotBetween(Integer value1, Integer value2) {
            addCriterion("GLIVD not between", value1, value2, "GLIVD");
            return (Criteria) this;
        }

        public Criteria andGLWR01IsNull() {
            addCriterion("GLWR01 is null");
            return (Criteria) this;
        }

        public Criteria andGLWR01IsNotNull() {
            addCriterion("GLWR01 is not null");
            return (Criteria) this;
        }

        public Criteria andGLWR01EqualTo(String value) {
            addCriterion("GLWR01 =", value, "GLWR01");
            return (Criteria) this;
        }

        public Criteria andGLWR01NotEqualTo(String value) {
            addCriterion("GLWR01 <>", value, "GLWR01");
            return (Criteria) this;
        }

        public Criteria andGLWR01GreaterThan(String value) {
            addCriterion("GLWR01 >", value, "GLWR01");
            return (Criteria) this;
        }

        public Criteria andGLWR01GreaterThanOrEqualTo(String value) {
            addCriterion("GLWR01 >=", value, "GLWR01");
            return (Criteria) this;
        }

        public Criteria andGLWR01LessThan(String value) {
            addCriterion("GLWR01 <", value, "GLWR01");
            return (Criteria) this;
        }

        public Criteria andGLWR01LessThanOrEqualTo(String value) {
            addCriterion("GLWR01 <=", value, "GLWR01");
            return (Criteria) this;
        }

        public Criteria andGLWR01Like(String value) {
            addCriterion("GLWR01 like", value, "GLWR01");
            return (Criteria) this;
        }

        public Criteria andGLWR01NotLike(String value) {
            addCriterion("GLWR01 not like", value, "GLWR01");
            return (Criteria) this;
        }

        public Criteria andGLWR01In(List<String> values) {
            addCriterion("GLWR01 in", values, "GLWR01");
            return (Criteria) this;
        }

        public Criteria andGLWR01NotIn(List<String> values) {
            addCriterion("GLWR01 not in", values, "GLWR01");
            return (Criteria) this;
        }

        public Criteria andGLWR01Between(String value1, String value2) {
            addCriterion("GLWR01 between", value1, value2, "GLWR01");
            return (Criteria) this;
        }

        public Criteria andGLWR01NotBetween(String value1, String value2) {
            addCriterion("GLWR01 not between", value1, value2, "GLWR01");
            return (Criteria) this;
        }

        public Criteria andGLPOIsNull() {
            addCriterion("GLPO is null");
            return (Criteria) this;
        }

        public Criteria andGLPOIsNotNull() {
            addCriterion("GLPO is not null");
            return (Criteria) this;
        }

        public Criteria andGLPOEqualTo(String value) {
            addCriterion("GLPO =", value, "GLPO");
            return (Criteria) this;
        }

        public Criteria andGLPONotEqualTo(String value) {
            addCriterion("GLPO <>", value, "GLPO");
            return (Criteria) this;
        }

        public Criteria andGLPOGreaterThan(String value) {
            addCriterion("GLPO >", value, "GLPO");
            return (Criteria) this;
        }

        public Criteria andGLPOGreaterThanOrEqualTo(String value) {
            addCriterion("GLPO >=", value, "GLPO");
            return (Criteria) this;
        }

        public Criteria andGLPOLessThan(String value) {
            addCriterion("GLPO <", value, "GLPO");
            return (Criteria) this;
        }

        public Criteria andGLPOLessThanOrEqualTo(String value) {
            addCriterion("GLPO <=", value, "GLPO");
            return (Criteria) this;
        }

        public Criteria andGLPOLike(String value) {
            addCriterion("GLPO like", value, "GLPO");
            return (Criteria) this;
        }

        public Criteria andGLPONotLike(String value) {
            addCriterion("GLPO not like", value, "GLPO");
            return (Criteria) this;
        }

        public Criteria andGLPOIn(List<String> values) {
            addCriterion("GLPO in", values, "GLPO");
            return (Criteria) this;
        }

        public Criteria andGLPONotIn(List<String> values) {
            addCriterion("GLPO not in", values, "GLPO");
            return (Criteria) this;
        }

        public Criteria andGLPOBetween(String value1, String value2) {
            addCriterion("GLPO between", value1, value2, "GLPO");
            return (Criteria) this;
        }

        public Criteria andGLPONotBetween(String value1, String value2) {
            addCriterion("GLPO not between", value1, value2, "GLPO");
            return (Criteria) this;
        }

        public Criteria andGLPSFXIsNull() {
            addCriterion("GLPSFX is null");
            return (Criteria) this;
        }

        public Criteria andGLPSFXIsNotNull() {
            addCriterion("GLPSFX is not null");
            return (Criteria) this;
        }

        public Criteria andGLPSFXEqualTo(String value) {
            addCriterion("GLPSFX =", value, "GLPSFX");
            return (Criteria) this;
        }

        public Criteria andGLPSFXNotEqualTo(String value) {
            addCriterion("GLPSFX <>", value, "GLPSFX");
            return (Criteria) this;
        }

        public Criteria andGLPSFXGreaterThan(String value) {
            addCriterion("GLPSFX >", value, "GLPSFX");
            return (Criteria) this;
        }

        public Criteria andGLPSFXGreaterThanOrEqualTo(String value) {
            addCriterion("GLPSFX >=", value, "GLPSFX");
            return (Criteria) this;
        }

        public Criteria andGLPSFXLessThan(String value) {
            addCriterion("GLPSFX <", value, "GLPSFX");
            return (Criteria) this;
        }

        public Criteria andGLPSFXLessThanOrEqualTo(String value) {
            addCriterion("GLPSFX <=", value, "GLPSFX");
            return (Criteria) this;
        }

        public Criteria andGLPSFXLike(String value) {
            addCriterion("GLPSFX like", value, "GLPSFX");
            return (Criteria) this;
        }

        public Criteria andGLPSFXNotLike(String value) {
            addCriterion("GLPSFX not like", value, "GLPSFX");
            return (Criteria) this;
        }

        public Criteria andGLPSFXIn(List<String> values) {
            addCriterion("GLPSFX in", values, "GLPSFX");
            return (Criteria) this;
        }

        public Criteria andGLPSFXNotIn(List<String> values) {
            addCriterion("GLPSFX not in", values, "GLPSFX");
            return (Criteria) this;
        }

        public Criteria andGLPSFXBetween(String value1, String value2) {
            addCriterion("GLPSFX between", value1, value2, "GLPSFX");
            return (Criteria) this;
        }

        public Criteria andGLPSFXNotBetween(String value1, String value2) {
            addCriterion("GLPSFX not between", value1, value2, "GLPSFX");
            return (Criteria) this;
        }

        public Criteria andGLDCTOIsNull() {
            addCriterion("GLDCTO is null");
            return (Criteria) this;
        }

        public Criteria andGLDCTOIsNotNull() {
            addCriterion("GLDCTO is not null");
            return (Criteria) this;
        }

        public Criteria andGLDCTOEqualTo(String value) {
            addCriterion("GLDCTO =", value, "GLDCTO");
            return (Criteria) this;
        }

        public Criteria andGLDCTONotEqualTo(String value) {
            addCriterion("GLDCTO <>", value, "GLDCTO");
            return (Criteria) this;
        }

        public Criteria andGLDCTOGreaterThan(String value) {
            addCriterion("GLDCTO >", value, "GLDCTO");
            return (Criteria) this;
        }

        public Criteria andGLDCTOGreaterThanOrEqualTo(String value) {
            addCriterion("GLDCTO >=", value, "GLDCTO");
            return (Criteria) this;
        }

        public Criteria andGLDCTOLessThan(String value) {
            addCriterion("GLDCTO <", value, "GLDCTO");
            return (Criteria) this;
        }

        public Criteria andGLDCTOLessThanOrEqualTo(String value) {
            addCriterion("GLDCTO <=", value, "GLDCTO");
            return (Criteria) this;
        }

        public Criteria andGLDCTOLike(String value) {
            addCriterion("GLDCTO like", value, "GLDCTO");
            return (Criteria) this;
        }

        public Criteria andGLDCTONotLike(String value) {
            addCriterion("GLDCTO not like", value, "GLDCTO");
            return (Criteria) this;
        }

        public Criteria andGLDCTOIn(List<String> values) {
            addCriterion("GLDCTO in", values, "GLDCTO");
            return (Criteria) this;
        }

        public Criteria andGLDCTONotIn(List<String> values) {
            addCriterion("GLDCTO not in", values, "GLDCTO");
            return (Criteria) this;
        }

        public Criteria andGLDCTOBetween(String value1, String value2) {
            addCriterion("GLDCTO between", value1, value2, "GLDCTO");
            return (Criteria) this;
        }

        public Criteria andGLDCTONotBetween(String value1, String value2) {
            addCriterion("GLDCTO not between", value1, value2, "GLDCTO");
            return (Criteria) this;
        }

        public Criteria andGLLNIDIsNull() {
            addCriterion("GLLNID is null");
            return (Criteria) this;
        }

        public Criteria andGLLNIDIsNotNull() {
            addCriterion("GLLNID is not null");
            return (Criteria) this;
        }

        public Criteria andGLLNIDEqualTo(BigDecimal value) {
            addCriterion("GLLNID =", value, "GLLNID");
            return (Criteria) this;
        }

        public Criteria andGLLNIDNotEqualTo(BigDecimal value) {
            addCriterion("GLLNID <>", value, "GLLNID");
            return (Criteria) this;
        }

        public Criteria andGLLNIDGreaterThan(BigDecimal value) {
            addCriterion("GLLNID >", value, "GLLNID");
            return (Criteria) this;
        }

        public Criteria andGLLNIDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLLNID >=", value, "GLLNID");
            return (Criteria) this;
        }

        public Criteria andGLLNIDLessThan(BigDecimal value) {
            addCriterion("GLLNID <", value, "GLLNID");
            return (Criteria) this;
        }

        public Criteria andGLLNIDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLLNID <=", value, "GLLNID");
            return (Criteria) this;
        }

        public Criteria andGLLNIDIn(List<BigDecimal> values) {
            addCriterion("GLLNID in", values, "GLLNID");
            return (Criteria) this;
        }

        public Criteria andGLLNIDNotIn(List<BigDecimal> values) {
            addCriterion("GLLNID not in", values, "GLLNID");
            return (Criteria) this;
        }

        public Criteria andGLLNIDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLLNID between", value1, value2, "GLLNID");
            return (Criteria) this;
        }

        public Criteria andGLLNIDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLLNID not between", value1, value2, "GLLNID");
            return (Criteria) this;
        }

        public Criteria andGLWYIsNull() {
            addCriterion("GLWY is null");
            return (Criteria) this;
        }

        public Criteria andGLWYIsNotNull() {
            addCriterion("GLWY is not null");
            return (Criteria) this;
        }

        public Criteria andGLWYEqualTo(BigDecimal value) {
            addCriterion("GLWY =", value, "GLWY");
            return (Criteria) this;
        }

        public Criteria andGLWYNotEqualTo(BigDecimal value) {
            addCriterion("GLWY <>", value, "GLWY");
            return (Criteria) this;
        }

        public Criteria andGLWYGreaterThan(BigDecimal value) {
            addCriterion("GLWY >", value, "GLWY");
            return (Criteria) this;
        }

        public Criteria andGLWYGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLWY >=", value, "GLWY");
            return (Criteria) this;
        }

        public Criteria andGLWYLessThan(BigDecimal value) {
            addCriterion("GLWY <", value, "GLWY");
            return (Criteria) this;
        }

        public Criteria andGLWYLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLWY <=", value, "GLWY");
            return (Criteria) this;
        }

        public Criteria andGLWYIn(List<BigDecimal> values) {
            addCriterion("GLWY in", values, "GLWY");
            return (Criteria) this;
        }

        public Criteria andGLWYNotIn(List<BigDecimal> values) {
            addCriterion("GLWY not in", values, "GLWY");
            return (Criteria) this;
        }

        public Criteria andGLWYBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLWY between", value1, value2, "GLWY");
            return (Criteria) this;
        }

        public Criteria andGLWYNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLWY not between", value1, value2, "GLWY");
            return (Criteria) this;
        }

        public Criteria andGLWNIsNull() {
            addCriterion("GLWN is null");
            return (Criteria) this;
        }

        public Criteria andGLWNIsNotNull() {
            addCriterion("GLWN is not null");
            return (Criteria) this;
        }

        public Criteria andGLWNEqualTo(BigDecimal value) {
            addCriterion("GLWN =", value, "GLWN");
            return (Criteria) this;
        }

        public Criteria andGLWNNotEqualTo(BigDecimal value) {
            addCriterion("GLWN <>", value, "GLWN");
            return (Criteria) this;
        }

        public Criteria andGLWNGreaterThan(BigDecimal value) {
            addCriterion("GLWN >", value, "GLWN");
            return (Criteria) this;
        }

        public Criteria andGLWNGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLWN >=", value, "GLWN");
            return (Criteria) this;
        }

        public Criteria andGLWNLessThan(BigDecimal value) {
            addCriterion("GLWN <", value, "GLWN");
            return (Criteria) this;
        }

        public Criteria andGLWNLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLWN <=", value, "GLWN");
            return (Criteria) this;
        }

        public Criteria andGLWNIn(List<BigDecimal> values) {
            addCriterion("GLWN in", values, "GLWN");
            return (Criteria) this;
        }

        public Criteria andGLWNNotIn(List<BigDecimal> values) {
            addCriterion("GLWN not in", values, "GLWN");
            return (Criteria) this;
        }

        public Criteria andGLWNBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLWN between", value1, value2, "GLWN");
            return (Criteria) this;
        }

        public Criteria andGLWNNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLWN not between", value1, value2, "GLWN");
            return (Criteria) this;
        }

        public Criteria andGLFNLPIsNull() {
            addCriterion("GLFNLP is null");
            return (Criteria) this;
        }

        public Criteria andGLFNLPIsNotNull() {
            addCriterion("GLFNLP is not null");
            return (Criteria) this;
        }

        public Criteria andGLFNLPEqualTo(String value) {
            addCriterion("GLFNLP =", value, "GLFNLP");
            return (Criteria) this;
        }

        public Criteria andGLFNLPNotEqualTo(String value) {
            addCriterion("GLFNLP <>", value, "GLFNLP");
            return (Criteria) this;
        }

        public Criteria andGLFNLPGreaterThan(String value) {
            addCriterion("GLFNLP >", value, "GLFNLP");
            return (Criteria) this;
        }

        public Criteria andGLFNLPGreaterThanOrEqualTo(String value) {
            addCriterion("GLFNLP >=", value, "GLFNLP");
            return (Criteria) this;
        }

        public Criteria andGLFNLPLessThan(String value) {
            addCriterion("GLFNLP <", value, "GLFNLP");
            return (Criteria) this;
        }

        public Criteria andGLFNLPLessThanOrEqualTo(String value) {
            addCriterion("GLFNLP <=", value, "GLFNLP");
            return (Criteria) this;
        }

        public Criteria andGLFNLPLike(String value) {
            addCriterion("GLFNLP like", value, "GLFNLP");
            return (Criteria) this;
        }

        public Criteria andGLFNLPNotLike(String value) {
            addCriterion("GLFNLP not like", value, "GLFNLP");
            return (Criteria) this;
        }

        public Criteria andGLFNLPIn(List<String> values) {
            addCriterion("GLFNLP in", values, "GLFNLP");
            return (Criteria) this;
        }

        public Criteria andGLFNLPNotIn(List<String> values) {
            addCriterion("GLFNLP not in", values, "GLFNLP");
            return (Criteria) this;
        }

        public Criteria andGLFNLPBetween(String value1, String value2) {
            addCriterion("GLFNLP between", value1, value2, "GLFNLP");
            return (Criteria) this;
        }

        public Criteria andGLFNLPNotBetween(String value1, String value2) {
            addCriterion("GLFNLP not between", value1, value2, "GLFNLP");
            return (Criteria) this;
        }

        public Criteria andGLOPSQIsNull() {
            addCriterion("GLOPSQ is null");
            return (Criteria) this;
        }

        public Criteria andGLOPSQIsNotNull() {
            addCriterion("GLOPSQ is not null");
            return (Criteria) this;
        }

        public Criteria andGLOPSQEqualTo(BigDecimal value) {
            addCriterion("GLOPSQ =", value, "GLOPSQ");
            return (Criteria) this;
        }

        public Criteria andGLOPSQNotEqualTo(BigDecimal value) {
            addCriterion("GLOPSQ <>", value, "GLOPSQ");
            return (Criteria) this;
        }

        public Criteria andGLOPSQGreaterThan(BigDecimal value) {
            addCriterion("GLOPSQ >", value, "GLOPSQ");
            return (Criteria) this;
        }

        public Criteria andGLOPSQGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLOPSQ >=", value, "GLOPSQ");
            return (Criteria) this;
        }

        public Criteria andGLOPSQLessThan(BigDecimal value) {
            addCriterion("GLOPSQ <", value, "GLOPSQ");
            return (Criteria) this;
        }

        public Criteria andGLOPSQLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLOPSQ <=", value, "GLOPSQ");
            return (Criteria) this;
        }

        public Criteria andGLOPSQIn(List<BigDecimal> values) {
            addCriterion("GLOPSQ in", values, "GLOPSQ");
            return (Criteria) this;
        }

        public Criteria andGLOPSQNotIn(List<BigDecimal> values) {
            addCriterion("GLOPSQ not in", values, "GLOPSQ");
            return (Criteria) this;
        }

        public Criteria andGLOPSQBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLOPSQ between", value1, value2, "GLOPSQ");
            return (Criteria) this;
        }

        public Criteria andGLOPSQNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLOPSQ not between", value1, value2, "GLOPSQ");
            return (Criteria) this;
        }

        public Criteria andGLJBCDIsNull() {
            addCriterion("GLJBCD is null");
            return (Criteria) this;
        }

        public Criteria andGLJBCDIsNotNull() {
            addCriterion("GLJBCD is not null");
            return (Criteria) this;
        }

        public Criteria andGLJBCDEqualTo(String value) {
            addCriterion("GLJBCD =", value, "GLJBCD");
            return (Criteria) this;
        }

        public Criteria andGLJBCDNotEqualTo(String value) {
            addCriterion("GLJBCD <>", value, "GLJBCD");
            return (Criteria) this;
        }

        public Criteria andGLJBCDGreaterThan(String value) {
            addCriterion("GLJBCD >", value, "GLJBCD");
            return (Criteria) this;
        }

        public Criteria andGLJBCDGreaterThanOrEqualTo(String value) {
            addCriterion("GLJBCD >=", value, "GLJBCD");
            return (Criteria) this;
        }

        public Criteria andGLJBCDLessThan(String value) {
            addCriterion("GLJBCD <", value, "GLJBCD");
            return (Criteria) this;
        }

        public Criteria andGLJBCDLessThanOrEqualTo(String value) {
            addCriterion("GLJBCD <=", value, "GLJBCD");
            return (Criteria) this;
        }

        public Criteria andGLJBCDLike(String value) {
            addCriterion("GLJBCD like", value, "GLJBCD");
            return (Criteria) this;
        }

        public Criteria andGLJBCDNotLike(String value) {
            addCriterion("GLJBCD not like", value, "GLJBCD");
            return (Criteria) this;
        }

        public Criteria andGLJBCDIn(List<String> values) {
            addCriterion("GLJBCD in", values, "GLJBCD");
            return (Criteria) this;
        }

        public Criteria andGLJBCDNotIn(List<String> values) {
            addCriterion("GLJBCD not in", values, "GLJBCD");
            return (Criteria) this;
        }

        public Criteria andGLJBCDBetween(String value1, String value2) {
            addCriterion("GLJBCD between", value1, value2, "GLJBCD");
            return (Criteria) this;
        }

        public Criteria andGLJBCDNotBetween(String value1, String value2) {
            addCriterion("GLJBCD not between", value1, value2, "GLJBCD");
            return (Criteria) this;
        }

        public Criteria andGLJBSTIsNull() {
            addCriterion("GLJBST is null");
            return (Criteria) this;
        }

        public Criteria andGLJBSTIsNotNull() {
            addCriterion("GLJBST is not null");
            return (Criteria) this;
        }

        public Criteria andGLJBSTEqualTo(String value) {
            addCriterion("GLJBST =", value, "GLJBST");
            return (Criteria) this;
        }

        public Criteria andGLJBSTNotEqualTo(String value) {
            addCriterion("GLJBST <>", value, "GLJBST");
            return (Criteria) this;
        }

        public Criteria andGLJBSTGreaterThan(String value) {
            addCriterion("GLJBST >", value, "GLJBST");
            return (Criteria) this;
        }

        public Criteria andGLJBSTGreaterThanOrEqualTo(String value) {
            addCriterion("GLJBST >=", value, "GLJBST");
            return (Criteria) this;
        }

        public Criteria andGLJBSTLessThan(String value) {
            addCriterion("GLJBST <", value, "GLJBST");
            return (Criteria) this;
        }

        public Criteria andGLJBSTLessThanOrEqualTo(String value) {
            addCriterion("GLJBST <=", value, "GLJBST");
            return (Criteria) this;
        }

        public Criteria andGLJBSTLike(String value) {
            addCriterion("GLJBST like", value, "GLJBST");
            return (Criteria) this;
        }

        public Criteria andGLJBSTNotLike(String value) {
            addCriterion("GLJBST not like", value, "GLJBST");
            return (Criteria) this;
        }

        public Criteria andGLJBSTIn(List<String> values) {
            addCriterion("GLJBST in", values, "GLJBST");
            return (Criteria) this;
        }

        public Criteria andGLJBSTNotIn(List<String> values) {
            addCriterion("GLJBST not in", values, "GLJBST");
            return (Criteria) this;
        }

        public Criteria andGLJBSTBetween(String value1, String value2) {
            addCriterion("GLJBST between", value1, value2, "GLJBST");
            return (Criteria) this;
        }

        public Criteria andGLJBSTNotBetween(String value1, String value2) {
            addCriterion("GLJBST not between", value1, value2, "GLJBST");
            return (Criteria) this;
        }

        public Criteria andGLHMCUIsNull() {
            addCriterion("GLHMCU is null");
            return (Criteria) this;
        }

        public Criteria andGLHMCUIsNotNull() {
            addCriterion("GLHMCU is not null");
            return (Criteria) this;
        }

        public Criteria andGLHMCUEqualTo(String value) {
            addCriterion("GLHMCU =", value, "GLHMCU");
            return (Criteria) this;
        }

        public Criteria andGLHMCUNotEqualTo(String value) {
            addCriterion("GLHMCU <>", value, "GLHMCU");
            return (Criteria) this;
        }

        public Criteria andGLHMCUGreaterThan(String value) {
            addCriterion("GLHMCU >", value, "GLHMCU");
            return (Criteria) this;
        }

        public Criteria andGLHMCUGreaterThanOrEqualTo(String value) {
            addCriterion("GLHMCU >=", value, "GLHMCU");
            return (Criteria) this;
        }

        public Criteria andGLHMCULessThan(String value) {
            addCriterion("GLHMCU <", value, "GLHMCU");
            return (Criteria) this;
        }

        public Criteria andGLHMCULessThanOrEqualTo(String value) {
            addCriterion("GLHMCU <=", value, "GLHMCU");
            return (Criteria) this;
        }

        public Criteria andGLHMCULike(String value) {
            addCriterion("GLHMCU like", value, "GLHMCU");
            return (Criteria) this;
        }

        public Criteria andGLHMCUNotLike(String value) {
            addCriterion("GLHMCU not like", value, "GLHMCU");
            return (Criteria) this;
        }

        public Criteria andGLHMCUIn(List<String> values) {
            addCriterion("GLHMCU in", values, "GLHMCU");
            return (Criteria) this;
        }

        public Criteria andGLHMCUNotIn(List<String> values) {
            addCriterion("GLHMCU not in", values, "GLHMCU");
            return (Criteria) this;
        }

        public Criteria andGLHMCUBetween(String value1, String value2) {
            addCriterion("GLHMCU between", value1, value2, "GLHMCU");
            return (Criteria) this;
        }

        public Criteria andGLHMCUNotBetween(String value1, String value2) {
            addCriterion("GLHMCU not between", value1, value2, "GLHMCU");
            return (Criteria) this;
        }

        public Criteria andGLDOIIsNull() {
            addCriterion("GLDOI is null");
            return (Criteria) this;
        }

        public Criteria andGLDOIIsNotNull() {
            addCriterion("GLDOI is not null");
            return (Criteria) this;
        }

        public Criteria andGLDOIEqualTo(BigDecimal value) {
            addCriterion("GLDOI =", value, "GLDOI");
            return (Criteria) this;
        }

        public Criteria andGLDOINotEqualTo(BigDecimal value) {
            addCriterion("GLDOI <>", value, "GLDOI");
            return (Criteria) this;
        }

        public Criteria andGLDOIGreaterThan(BigDecimal value) {
            addCriterion("GLDOI >", value, "GLDOI");
            return (Criteria) this;
        }

        public Criteria andGLDOIGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLDOI >=", value, "GLDOI");
            return (Criteria) this;
        }

        public Criteria andGLDOILessThan(BigDecimal value) {
            addCriterion("GLDOI <", value, "GLDOI");
            return (Criteria) this;
        }

        public Criteria andGLDOILessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLDOI <=", value, "GLDOI");
            return (Criteria) this;
        }

        public Criteria andGLDOIIn(List<BigDecimal> values) {
            addCriterion("GLDOI in", values, "GLDOI");
            return (Criteria) this;
        }

        public Criteria andGLDOINotIn(List<BigDecimal> values) {
            addCriterion("GLDOI not in", values, "GLDOI");
            return (Criteria) this;
        }

        public Criteria andGLDOIBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLDOI between", value1, value2, "GLDOI");
            return (Criteria) this;
        }

        public Criteria andGLDOINotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLDOI not between", value1, value2, "GLDOI");
            return (Criteria) this;
        }

        public Criteria andGLALIDIsNull() {
            addCriterion("GLALID is null");
            return (Criteria) this;
        }

        public Criteria andGLALIDIsNotNull() {
            addCriterion("GLALID is not null");
            return (Criteria) this;
        }

        public Criteria andGLALIDEqualTo(String value) {
            addCriterion("GLALID =", value, "GLALID");
            return (Criteria) this;
        }

        public Criteria andGLALIDNotEqualTo(String value) {
            addCriterion("GLALID <>", value, "GLALID");
            return (Criteria) this;
        }

        public Criteria andGLALIDGreaterThan(String value) {
            addCriterion("GLALID >", value, "GLALID");
            return (Criteria) this;
        }

        public Criteria andGLALIDGreaterThanOrEqualTo(String value) {
            addCriterion("GLALID >=", value, "GLALID");
            return (Criteria) this;
        }

        public Criteria andGLALIDLessThan(String value) {
            addCriterion("GLALID <", value, "GLALID");
            return (Criteria) this;
        }

        public Criteria andGLALIDLessThanOrEqualTo(String value) {
            addCriterion("GLALID <=", value, "GLALID");
            return (Criteria) this;
        }

        public Criteria andGLALIDLike(String value) {
            addCriterion("GLALID like", value, "GLALID");
            return (Criteria) this;
        }

        public Criteria andGLALIDNotLike(String value) {
            addCriterion("GLALID not like", value, "GLALID");
            return (Criteria) this;
        }

        public Criteria andGLALIDIn(List<String> values) {
            addCriterion("GLALID in", values, "GLALID");
            return (Criteria) this;
        }

        public Criteria andGLALIDNotIn(List<String> values) {
            addCriterion("GLALID not in", values, "GLALID");
            return (Criteria) this;
        }

        public Criteria andGLALIDBetween(String value1, String value2) {
            addCriterion("GLALID between", value1, value2, "GLALID");
            return (Criteria) this;
        }

        public Criteria andGLALIDNotBetween(String value1, String value2) {
            addCriterion("GLALID not between", value1, value2, "GLALID");
            return (Criteria) this;
        }

        public Criteria andGLALTYIsNull() {
            addCriterion("GLALTY is null");
            return (Criteria) this;
        }

        public Criteria andGLALTYIsNotNull() {
            addCriterion("GLALTY is not null");
            return (Criteria) this;
        }

        public Criteria andGLALTYEqualTo(String value) {
            addCriterion("GLALTY =", value, "GLALTY");
            return (Criteria) this;
        }

        public Criteria andGLALTYNotEqualTo(String value) {
            addCriterion("GLALTY <>", value, "GLALTY");
            return (Criteria) this;
        }

        public Criteria andGLALTYGreaterThan(String value) {
            addCriterion("GLALTY >", value, "GLALTY");
            return (Criteria) this;
        }

        public Criteria andGLALTYGreaterThanOrEqualTo(String value) {
            addCriterion("GLALTY >=", value, "GLALTY");
            return (Criteria) this;
        }

        public Criteria andGLALTYLessThan(String value) {
            addCriterion("GLALTY <", value, "GLALTY");
            return (Criteria) this;
        }

        public Criteria andGLALTYLessThanOrEqualTo(String value) {
            addCriterion("GLALTY <=", value, "GLALTY");
            return (Criteria) this;
        }

        public Criteria andGLALTYLike(String value) {
            addCriterion("GLALTY like", value, "GLALTY");
            return (Criteria) this;
        }

        public Criteria andGLALTYNotLike(String value) {
            addCriterion("GLALTY not like", value, "GLALTY");
            return (Criteria) this;
        }

        public Criteria andGLALTYIn(List<String> values) {
            addCriterion("GLALTY in", values, "GLALTY");
            return (Criteria) this;
        }

        public Criteria andGLALTYNotIn(List<String> values) {
            addCriterion("GLALTY not in", values, "GLALTY");
            return (Criteria) this;
        }

        public Criteria andGLALTYBetween(String value1, String value2) {
            addCriterion("GLALTY between", value1, value2, "GLALTY");
            return (Criteria) this;
        }

        public Criteria andGLALTYNotBetween(String value1, String value2) {
            addCriterion("GLALTY not between", value1, value2, "GLALTY");
            return (Criteria) this;
        }

        public Criteria andGLDSVJIsNull() {
            addCriterion("GLDSVJ is null");
            return (Criteria) this;
        }

        public Criteria andGLDSVJIsNotNull() {
            addCriterion("GLDSVJ is not null");
            return (Criteria) this;
        }

        public Criteria andGLDSVJEqualTo(Integer value) {
            addCriterion("GLDSVJ =", value, "GLDSVJ");
            return (Criteria) this;
        }

        public Criteria andGLDSVJNotEqualTo(Integer value) {
            addCriterion("GLDSVJ <>", value, "GLDSVJ");
            return (Criteria) this;
        }

        public Criteria andGLDSVJGreaterThan(Integer value) {
            addCriterion("GLDSVJ >", value, "GLDSVJ");
            return (Criteria) this;
        }

        public Criteria andGLDSVJGreaterThanOrEqualTo(Integer value) {
            addCriterion("GLDSVJ >=", value, "GLDSVJ");
            return (Criteria) this;
        }

        public Criteria andGLDSVJLessThan(Integer value) {
            addCriterion("GLDSVJ <", value, "GLDSVJ");
            return (Criteria) this;
        }

        public Criteria andGLDSVJLessThanOrEqualTo(Integer value) {
            addCriterion("GLDSVJ <=", value, "GLDSVJ");
            return (Criteria) this;
        }

        public Criteria andGLDSVJIn(List<Integer> values) {
            addCriterion("GLDSVJ in", values, "GLDSVJ");
            return (Criteria) this;
        }

        public Criteria andGLDSVJNotIn(List<Integer> values) {
            addCriterion("GLDSVJ not in", values, "GLDSVJ");
            return (Criteria) this;
        }

        public Criteria andGLDSVJBetween(Integer value1, Integer value2) {
            addCriterion("GLDSVJ between", value1, value2, "GLDSVJ");
            return (Criteria) this;
        }

        public Criteria andGLDSVJNotBetween(Integer value1, Integer value2) {
            addCriterion("GLDSVJ not between", value1, value2, "GLDSVJ");
            return (Criteria) this;
        }

        public Criteria andGLTORGIsNull() {
            addCriterion("GLTORG is null");
            return (Criteria) this;
        }

        public Criteria andGLTORGIsNotNull() {
            addCriterion("GLTORG is not null");
            return (Criteria) this;
        }

        public Criteria andGLTORGEqualTo(String value) {
            addCriterion("GLTORG =", value, "GLTORG");
            return (Criteria) this;
        }

        public Criteria andGLTORGNotEqualTo(String value) {
            addCriterion("GLTORG <>", value, "GLTORG");
            return (Criteria) this;
        }

        public Criteria andGLTORGGreaterThan(String value) {
            addCriterion("GLTORG >", value, "GLTORG");
            return (Criteria) this;
        }

        public Criteria andGLTORGGreaterThanOrEqualTo(String value) {
            addCriterion("GLTORG >=", value, "GLTORG");
            return (Criteria) this;
        }

        public Criteria andGLTORGLessThan(String value) {
            addCriterion("GLTORG <", value, "GLTORG");
            return (Criteria) this;
        }

        public Criteria andGLTORGLessThanOrEqualTo(String value) {
            addCriterion("GLTORG <=", value, "GLTORG");
            return (Criteria) this;
        }

        public Criteria andGLTORGLike(String value) {
            addCriterion("GLTORG like", value, "GLTORG");
            return (Criteria) this;
        }

        public Criteria andGLTORGNotLike(String value) {
            addCriterion("GLTORG not like", value, "GLTORG");
            return (Criteria) this;
        }

        public Criteria andGLTORGIn(List<String> values) {
            addCriterion("GLTORG in", values, "GLTORG");
            return (Criteria) this;
        }

        public Criteria andGLTORGNotIn(List<String> values) {
            addCriterion("GLTORG not in", values, "GLTORG");
            return (Criteria) this;
        }

        public Criteria andGLTORGBetween(String value1, String value2) {
            addCriterion("GLTORG between", value1, value2, "GLTORG");
            return (Criteria) this;
        }

        public Criteria andGLTORGNotBetween(String value1, String value2) {
            addCriterion("GLTORG not between", value1, value2, "GLTORG");
            return (Criteria) this;
        }

        public Criteria andGLREGIsNull() {
            addCriterion("GLREG is null");
            return (Criteria) this;
        }

        public Criteria andGLREGIsNotNull() {
            addCriterion("GLREG is not null");
            return (Criteria) this;
        }

        public Criteria andGLREGEqualTo(BigDecimal value) {
            addCriterion("GLREG =", value, "GLREG");
            return (Criteria) this;
        }

        public Criteria andGLREGNotEqualTo(BigDecimal value) {
            addCriterion("GLREG <>", value, "GLREG");
            return (Criteria) this;
        }

        public Criteria andGLREGGreaterThan(BigDecimal value) {
            addCriterion("GLREG >", value, "GLREG");
            return (Criteria) this;
        }

        public Criteria andGLREGGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLREG >=", value, "GLREG");
            return (Criteria) this;
        }

        public Criteria andGLREGLessThan(BigDecimal value) {
            addCriterion("GLREG <", value, "GLREG");
            return (Criteria) this;
        }

        public Criteria andGLREGLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLREG <=", value, "GLREG");
            return (Criteria) this;
        }

        public Criteria andGLREGIn(List<BigDecimal> values) {
            addCriterion("GLREG in", values, "GLREG");
            return (Criteria) this;
        }

        public Criteria andGLREGNotIn(List<BigDecimal> values) {
            addCriterion("GLREG not in", values, "GLREG");
            return (Criteria) this;
        }

        public Criteria andGLREGBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLREG between", value1, value2, "GLREG");
            return (Criteria) this;
        }

        public Criteria andGLREGNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLREG not between", value1, value2, "GLREG");
            return (Criteria) this;
        }

        public Criteria andGLPYIDIsNull() {
            addCriterion("GLPYID is null");
            return (Criteria) this;
        }

        public Criteria andGLPYIDIsNotNull() {
            addCriterion("GLPYID is not null");
            return (Criteria) this;
        }

        public Criteria andGLPYIDEqualTo(BigDecimal value) {
            addCriterion("GLPYID =", value, "GLPYID");
            return (Criteria) this;
        }

        public Criteria andGLPYIDNotEqualTo(BigDecimal value) {
            addCriterion("GLPYID <>", value, "GLPYID");
            return (Criteria) this;
        }

        public Criteria andGLPYIDGreaterThan(BigDecimal value) {
            addCriterion("GLPYID >", value, "GLPYID");
            return (Criteria) this;
        }

        public Criteria andGLPYIDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLPYID >=", value, "GLPYID");
            return (Criteria) this;
        }

        public Criteria andGLPYIDLessThan(BigDecimal value) {
            addCriterion("GLPYID <", value, "GLPYID");
            return (Criteria) this;
        }

        public Criteria andGLPYIDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLPYID <=", value, "GLPYID");
            return (Criteria) this;
        }

        public Criteria andGLPYIDIn(List<BigDecimal> values) {
            addCriterion("GLPYID in", values, "GLPYID");
            return (Criteria) this;
        }

        public Criteria andGLPYIDNotIn(List<BigDecimal> values) {
            addCriterion("GLPYID not in", values, "GLPYID");
            return (Criteria) this;
        }

        public Criteria andGLPYIDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLPYID between", value1, value2, "GLPYID");
            return (Criteria) this;
        }

        public Criteria andGLPYIDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLPYID not between", value1, value2, "GLPYID");
            return (Criteria) this;
        }

        public Criteria andGLUSERIsNull() {
            addCriterion("GLUSER is null");
            return (Criteria) this;
        }

        public Criteria andGLUSERIsNotNull() {
            addCriterion("GLUSER is not null");
            return (Criteria) this;
        }

        public Criteria andGLUSEREqualTo(String value) {
            addCriterion("GLUSER =", value, "GLUSER");
            return (Criteria) this;
        }

        public Criteria andGLUSERNotEqualTo(String value) {
            addCriterion("GLUSER <>", value, "GLUSER");
            return (Criteria) this;
        }

        public Criteria andGLUSERGreaterThan(String value) {
            addCriterion("GLUSER >", value, "GLUSER");
            return (Criteria) this;
        }

        public Criteria andGLUSERGreaterThanOrEqualTo(String value) {
            addCriterion("GLUSER >=", value, "GLUSER");
            return (Criteria) this;
        }

        public Criteria andGLUSERLessThan(String value) {
            addCriterion("GLUSER <", value, "GLUSER");
            return (Criteria) this;
        }

        public Criteria andGLUSERLessThanOrEqualTo(String value) {
            addCriterion("GLUSER <=", value, "GLUSER");
            return (Criteria) this;
        }

        public Criteria andGLUSERLike(String value) {
            addCriterion("GLUSER like", value, "GLUSER");
            return (Criteria) this;
        }

        public Criteria andGLUSERNotLike(String value) {
            addCriterion("GLUSER not like", value, "GLUSER");
            return (Criteria) this;
        }

        public Criteria andGLUSERIn(List<String> values) {
            addCriterion("GLUSER in", values, "GLUSER");
            return (Criteria) this;
        }

        public Criteria andGLUSERNotIn(List<String> values) {
            addCriterion("GLUSER not in", values, "GLUSER");
            return (Criteria) this;
        }

        public Criteria andGLUSERBetween(String value1, String value2) {
            addCriterion("GLUSER between", value1, value2, "GLUSER");
            return (Criteria) this;
        }

        public Criteria andGLUSERNotBetween(String value1, String value2) {
            addCriterion("GLUSER not between", value1, value2, "GLUSER");
            return (Criteria) this;
        }

        public Criteria andGLPIDIsNull() {
            addCriterion("GLPID is null");
            return (Criteria) this;
        }

        public Criteria andGLPIDIsNotNull() {
            addCriterion("GLPID is not null");
            return (Criteria) this;
        }

        public Criteria andGLPIDEqualTo(String value) {
            addCriterion("GLPID =", value, "GLPID");
            return (Criteria) this;
        }

        public Criteria andGLPIDNotEqualTo(String value) {
            addCriterion("GLPID <>", value, "GLPID");
            return (Criteria) this;
        }

        public Criteria andGLPIDGreaterThan(String value) {
            addCriterion("GLPID >", value, "GLPID");
            return (Criteria) this;
        }

        public Criteria andGLPIDGreaterThanOrEqualTo(String value) {
            addCriterion("GLPID >=", value, "GLPID");
            return (Criteria) this;
        }

        public Criteria andGLPIDLessThan(String value) {
            addCriterion("GLPID <", value, "GLPID");
            return (Criteria) this;
        }

        public Criteria andGLPIDLessThanOrEqualTo(String value) {
            addCriterion("GLPID <=", value, "GLPID");
            return (Criteria) this;
        }

        public Criteria andGLPIDLike(String value) {
            addCriterion("GLPID like", value, "GLPID");
            return (Criteria) this;
        }

        public Criteria andGLPIDNotLike(String value) {
            addCriterion("GLPID not like", value, "GLPID");
            return (Criteria) this;
        }

        public Criteria andGLPIDIn(List<String> values) {
            addCriterion("GLPID in", values, "GLPID");
            return (Criteria) this;
        }

        public Criteria andGLPIDNotIn(List<String> values) {
            addCriterion("GLPID not in", values, "GLPID");
            return (Criteria) this;
        }

        public Criteria andGLPIDBetween(String value1, String value2) {
            addCriterion("GLPID between", value1, value2, "GLPID");
            return (Criteria) this;
        }

        public Criteria andGLPIDNotBetween(String value1, String value2) {
            addCriterion("GLPID not between", value1, value2, "GLPID");
            return (Criteria) this;
        }

        public Criteria andGLJOBNIsNull() {
            addCriterion("GLJOBN is null");
            return (Criteria) this;
        }

        public Criteria andGLJOBNIsNotNull() {
            addCriterion("GLJOBN is not null");
            return (Criteria) this;
        }

        public Criteria andGLJOBNEqualTo(String value) {
            addCriterion("GLJOBN =", value, "GLJOBN");
            return (Criteria) this;
        }

        public Criteria andGLJOBNNotEqualTo(String value) {
            addCriterion("GLJOBN <>", value, "GLJOBN");
            return (Criteria) this;
        }

        public Criteria andGLJOBNGreaterThan(String value) {
            addCriterion("GLJOBN >", value, "GLJOBN");
            return (Criteria) this;
        }

        public Criteria andGLJOBNGreaterThanOrEqualTo(String value) {
            addCriterion("GLJOBN >=", value, "GLJOBN");
            return (Criteria) this;
        }

        public Criteria andGLJOBNLessThan(String value) {
            addCriterion("GLJOBN <", value, "GLJOBN");
            return (Criteria) this;
        }

        public Criteria andGLJOBNLessThanOrEqualTo(String value) {
            addCriterion("GLJOBN <=", value, "GLJOBN");
            return (Criteria) this;
        }

        public Criteria andGLJOBNLike(String value) {
            addCriterion("GLJOBN like", value, "GLJOBN");
            return (Criteria) this;
        }

        public Criteria andGLJOBNNotLike(String value) {
            addCriterion("GLJOBN not like", value, "GLJOBN");
            return (Criteria) this;
        }

        public Criteria andGLJOBNIn(List<String> values) {
            addCriterion("GLJOBN in", values, "GLJOBN");
            return (Criteria) this;
        }

        public Criteria andGLJOBNNotIn(List<String> values) {
            addCriterion("GLJOBN not in", values, "GLJOBN");
            return (Criteria) this;
        }

        public Criteria andGLJOBNBetween(String value1, String value2) {
            addCriterion("GLJOBN between", value1, value2, "GLJOBN");
            return (Criteria) this;
        }

        public Criteria andGLJOBNNotBetween(String value1, String value2) {
            addCriterion("GLJOBN not between", value1, value2, "GLJOBN");
            return (Criteria) this;
        }

        public Criteria andGLUPMJIsNull() {
            addCriterion("GLUPMJ is null");
            return (Criteria) this;
        }

        public Criteria andGLUPMJIsNotNull() {
            addCriterion("GLUPMJ is not null");
            return (Criteria) this;
        }

        public Criteria andGLUPMJEqualTo(Integer value) {
            addCriterion("GLUPMJ =", value, "GLUPMJ");
            return (Criteria) this;
        }

        public Criteria andGLUPMJNotEqualTo(Integer value) {
            addCriterion("GLUPMJ <>", value, "GLUPMJ");
            return (Criteria) this;
        }

        public Criteria andGLUPMJGreaterThan(Integer value) {
            addCriterion("GLUPMJ >", value, "GLUPMJ");
            return (Criteria) this;
        }

        public Criteria andGLUPMJGreaterThanOrEqualTo(Integer value) {
            addCriterion("GLUPMJ >=", value, "GLUPMJ");
            return (Criteria) this;
        }

        public Criteria andGLUPMJLessThan(Integer value) {
            addCriterion("GLUPMJ <", value, "GLUPMJ");
            return (Criteria) this;
        }

        public Criteria andGLUPMJLessThanOrEqualTo(Integer value) {
            addCriterion("GLUPMJ <=", value, "GLUPMJ");
            return (Criteria) this;
        }

        public Criteria andGLUPMJIn(List<Integer> values) {
            addCriterion("GLUPMJ in", values, "GLUPMJ");
            return (Criteria) this;
        }

        public Criteria andGLUPMJNotIn(List<Integer> values) {
            addCriterion("GLUPMJ not in", values, "GLUPMJ");
            return (Criteria) this;
        }

        public Criteria andGLUPMJBetween(Integer value1, Integer value2) {
            addCriterion("GLUPMJ between", value1, value2, "GLUPMJ");
            return (Criteria) this;
        }

        public Criteria andGLUPMJNotBetween(Integer value1, Integer value2) {
            addCriterion("GLUPMJ not between", value1, value2, "GLUPMJ");
            return (Criteria) this;
        }

        public Criteria andGLUPMTIsNull() {
            addCriterion("GLUPMT is null");
            return (Criteria) this;
        }

        public Criteria andGLUPMTIsNotNull() {
            addCriterion("GLUPMT is not null");
            return (Criteria) this;
        }

        public Criteria andGLUPMTEqualTo(BigDecimal value) {
            addCriterion("GLUPMT =", value, "GLUPMT");
            return (Criteria) this;
        }

        public Criteria andGLUPMTNotEqualTo(BigDecimal value) {
            addCriterion("GLUPMT <>", value, "GLUPMT");
            return (Criteria) this;
        }

        public Criteria andGLUPMTGreaterThan(BigDecimal value) {
            addCriterion("GLUPMT >", value, "GLUPMT");
            return (Criteria) this;
        }

        public Criteria andGLUPMTGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLUPMT >=", value, "GLUPMT");
            return (Criteria) this;
        }

        public Criteria andGLUPMTLessThan(BigDecimal value) {
            addCriterion("GLUPMT <", value, "GLUPMT");
            return (Criteria) this;
        }

        public Criteria andGLUPMTLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLUPMT <=", value, "GLUPMT");
            return (Criteria) this;
        }

        public Criteria andGLUPMTIn(List<BigDecimal> values) {
            addCriterion("GLUPMT in", values, "GLUPMT");
            return (Criteria) this;
        }

        public Criteria andGLUPMTNotIn(List<BigDecimal> values) {
            addCriterion("GLUPMT not in", values, "GLUPMT");
            return (Criteria) this;
        }

        public Criteria andGLUPMTBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLUPMT between", value1, value2, "GLUPMT");
            return (Criteria) this;
        }

        public Criteria andGLUPMTNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLUPMT not between", value1, value2, "GLUPMT");
            return (Criteria) this;
        }

        public Criteria andGLABR1IsNull() {
            addCriterion("GLABR1 is null");
            return (Criteria) this;
        }

        public Criteria andGLABR1IsNotNull() {
            addCriterion("GLABR1 is not null");
            return (Criteria) this;
        }

        public Criteria andGLABR1EqualTo(String value) {
            addCriterion("GLABR1 =", value, "GLABR1");
            return (Criteria) this;
        }

        public Criteria andGLABR1NotEqualTo(String value) {
            addCriterion("GLABR1 <>", value, "GLABR1");
            return (Criteria) this;
        }

        public Criteria andGLABR1GreaterThan(String value) {
            addCriterion("GLABR1 >", value, "GLABR1");
            return (Criteria) this;
        }

        public Criteria andGLABR1GreaterThanOrEqualTo(String value) {
            addCriterion("GLABR1 >=", value, "GLABR1");
            return (Criteria) this;
        }

        public Criteria andGLABR1LessThan(String value) {
            addCriterion("GLABR1 <", value, "GLABR1");
            return (Criteria) this;
        }

        public Criteria andGLABR1LessThanOrEqualTo(String value) {
            addCriterion("GLABR1 <=", value, "GLABR1");
            return (Criteria) this;
        }

        public Criteria andGLABR1Like(String value) {
            addCriterion("GLABR1 like", value, "GLABR1");
            return (Criteria) this;
        }

        public Criteria andGLABR1NotLike(String value) {
            addCriterion("GLABR1 not like", value, "GLABR1");
            return (Criteria) this;
        }

        public Criteria andGLABR1In(List<String> values) {
            addCriterion("GLABR1 in", values, "GLABR1");
            return (Criteria) this;
        }

        public Criteria andGLABR1NotIn(List<String> values) {
            addCriterion("GLABR1 not in", values, "GLABR1");
            return (Criteria) this;
        }

        public Criteria andGLABR1Between(String value1, String value2) {
            addCriterion("GLABR1 between", value1, value2, "GLABR1");
            return (Criteria) this;
        }

        public Criteria andGLABR1NotBetween(String value1, String value2) {
            addCriterion("GLABR1 not between", value1, value2, "GLABR1");
            return (Criteria) this;
        }

        public Criteria andGLABR2IsNull() {
            addCriterion("GLABR2 is null");
            return (Criteria) this;
        }

        public Criteria andGLABR2IsNotNull() {
            addCriterion("GLABR2 is not null");
            return (Criteria) this;
        }

        public Criteria andGLABR2EqualTo(String value) {
            addCriterion("GLABR2 =", value, "GLABR2");
            return (Criteria) this;
        }

        public Criteria andGLABR2NotEqualTo(String value) {
            addCriterion("GLABR2 <>", value, "GLABR2");
            return (Criteria) this;
        }

        public Criteria andGLABR2GreaterThan(String value) {
            addCriterion("GLABR2 >", value, "GLABR2");
            return (Criteria) this;
        }

        public Criteria andGLABR2GreaterThanOrEqualTo(String value) {
            addCriterion("GLABR2 >=", value, "GLABR2");
            return (Criteria) this;
        }

        public Criteria andGLABR2LessThan(String value) {
            addCriterion("GLABR2 <", value, "GLABR2");
            return (Criteria) this;
        }

        public Criteria andGLABR2LessThanOrEqualTo(String value) {
            addCriterion("GLABR2 <=", value, "GLABR2");
            return (Criteria) this;
        }

        public Criteria andGLABR2Like(String value) {
            addCriterion("GLABR2 like", value, "GLABR2");
            return (Criteria) this;
        }

        public Criteria andGLABR2NotLike(String value) {
            addCriterion("GLABR2 not like", value, "GLABR2");
            return (Criteria) this;
        }

        public Criteria andGLABR2In(List<String> values) {
            addCriterion("GLABR2 in", values, "GLABR2");
            return (Criteria) this;
        }

        public Criteria andGLABR2NotIn(List<String> values) {
            addCriterion("GLABR2 not in", values, "GLABR2");
            return (Criteria) this;
        }

        public Criteria andGLABR2Between(String value1, String value2) {
            addCriterion("GLABR2 between", value1, value2, "GLABR2");
            return (Criteria) this;
        }

        public Criteria andGLABR2NotBetween(String value1, String value2) {
            addCriterion("GLABR2 not between", value1, value2, "GLABR2");
            return (Criteria) this;
        }

        public Criteria andGLABR3IsNull() {
            addCriterion("GLABR3 is null");
            return (Criteria) this;
        }

        public Criteria andGLABR3IsNotNull() {
            addCriterion("GLABR3 is not null");
            return (Criteria) this;
        }

        public Criteria andGLABR3EqualTo(String value) {
            addCriterion("GLABR3 =", value, "GLABR3");
            return (Criteria) this;
        }

        public Criteria andGLABR3NotEqualTo(String value) {
            addCriterion("GLABR3 <>", value, "GLABR3");
            return (Criteria) this;
        }

        public Criteria andGLABR3GreaterThan(String value) {
            addCriterion("GLABR3 >", value, "GLABR3");
            return (Criteria) this;
        }

        public Criteria andGLABR3GreaterThanOrEqualTo(String value) {
            addCriterion("GLABR3 >=", value, "GLABR3");
            return (Criteria) this;
        }

        public Criteria andGLABR3LessThan(String value) {
            addCriterion("GLABR3 <", value, "GLABR3");
            return (Criteria) this;
        }

        public Criteria andGLABR3LessThanOrEqualTo(String value) {
            addCriterion("GLABR3 <=", value, "GLABR3");
            return (Criteria) this;
        }

        public Criteria andGLABR3Like(String value) {
            addCriterion("GLABR3 like", value, "GLABR3");
            return (Criteria) this;
        }

        public Criteria andGLABR3NotLike(String value) {
            addCriterion("GLABR3 not like", value, "GLABR3");
            return (Criteria) this;
        }

        public Criteria andGLABR3In(List<String> values) {
            addCriterion("GLABR3 in", values, "GLABR3");
            return (Criteria) this;
        }

        public Criteria andGLABR3NotIn(List<String> values) {
            addCriterion("GLABR3 not in", values, "GLABR3");
            return (Criteria) this;
        }

        public Criteria andGLABR3Between(String value1, String value2) {
            addCriterion("GLABR3 between", value1, value2, "GLABR3");
            return (Criteria) this;
        }

        public Criteria andGLABR3NotBetween(String value1, String value2) {
            addCriterion("GLABR3 not between", value1, value2, "GLABR3");
            return (Criteria) this;
        }

        public Criteria andGLABR4IsNull() {
            addCriterion("GLABR4 is null");
            return (Criteria) this;
        }

        public Criteria andGLABR4IsNotNull() {
            addCriterion("GLABR4 is not null");
            return (Criteria) this;
        }

        public Criteria andGLABR4EqualTo(String value) {
            addCriterion("GLABR4 =", value, "GLABR4");
            return (Criteria) this;
        }

        public Criteria andGLABR4NotEqualTo(String value) {
            addCriterion("GLABR4 <>", value, "GLABR4");
            return (Criteria) this;
        }

        public Criteria andGLABR4GreaterThan(String value) {
            addCriterion("GLABR4 >", value, "GLABR4");
            return (Criteria) this;
        }

        public Criteria andGLABR4GreaterThanOrEqualTo(String value) {
            addCriterion("GLABR4 >=", value, "GLABR4");
            return (Criteria) this;
        }

        public Criteria andGLABR4LessThan(String value) {
            addCriterion("GLABR4 <", value, "GLABR4");
            return (Criteria) this;
        }

        public Criteria andGLABR4LessThanOrEqualTo(String value) {
            addCriterion("GLABR4 <=", value, "GLABR4");
            return (Criteria) this;
        }

        public Criteria andGLABR4Like(String value) {
            addCriterion("GLABR4 like", value, "GLABR4");
            return (Criteria) this;
        }

        public Criteria andGLABR4NotLike(String value) {
            addCriterion("GLABR4 not like", value, "GLABR4");
            return (Criteria) this;
        }

        public Criteria andGLABR4In(List<String> values) {
            addCriterion("GLABR4 in", values, "GLABR4");
            return (Criteria) this;
        }

        public Criteria andGLABR4NotIn(List<String> values) {
            addCriterion("GLABR4 not in", values, "GLABR4");
            return (Criteria) this;
        }

        public Criteria andGLABR4Between(String value1, String value2) {
            addCriterion("GLABR4 between", value1, value2, "GLABR4");
            return (Criteria) this;
        }

        public Criteria andGLABR4NotBetween(String value1, String value2) {
            addCriterion("GLABR4 not between", value1, value2, "GLABR4");
            return (Criteria) this;
        }

        public Criteria andGLABT1IsNull() {
            addCriterion("GLABT1 is null");
            return (Criteria) this;
        }

        public Criteria andGLABT1IsNotNull() {
            addCriterion("GLABT1 is not null");
            return (Criteria) this;
        }

        public Criteria andGLABT1EqualTo(String value) {
            addCriterion("GLABT1 =", value, "GLABT1");
            return (Criteria) this;
        }

        public Criteria andGLABT1NotEqualTo(String value) {
            addCriterion("GLABT1 <>", value, "GLABT1");
            return (Criteria) this;
        }

        public Criteria andGLABT1GreaterThan(String value) {
            addCriterion("GLABT1 >", value, "GLABT1");
            return (Criteria) this;
        }

        public Criteria andGLABT1GreaterThanOrEqualTo(String value) {
            addCriterion("GLABT1 >=", value, "GLABT1");
            return (Criteria) this;
        }

        public Criteria andGLABT1LessThan(String value) {
            addCriterion("GLABT1 <", value, "GLABT1");
            return (Criteria) this;
        }

        public Criteria andGLABT1LessThanOrEqualTo(String value) {
            addCriterion("GLABT1 <=", value, "GLABT1");
            return (Criteria) this;
        }

        public Criteria andGLABT1Like(String value) {
            addCriterion("GLABT1 like", value, "GLABT1");
            return (Criteria) this;
        }

        public Criteria andGLABT1NotLike(String value) {
            addCriterion("GLABT1 not like", value, "GLABT1");
            return (Criteria) this;
        }

        public Criteria andGLABT1In(List<String> values) {
            addCriterion("GLABT1 in", values, "GLABT1");
            return (Criteria) this;
        }

        public Criteria andGLABT1NotIn(List<String> values) {
            addCriterion("GLABT1 not in", values, "GLABT1");
            return (Criteria) this;
        }

        public Criteria andGLABT1Between(String value1, String value2) {
            addCriterion("GLABT1 between", value1, value2, "GLABT1");
            return (Criteria) this;
        }

        public Criteria andGLABT1NotBetween(String value1, String value2) {
            addCriterion("GLABT1 not between", value1, value2, "GLABT1");
            return (Criteria) this;
        }

        public Criteria andGLABT2IsNull() {
            addCriterion("GLABT2 is null");
            return (Criteria) this;
        }

        public Criteria andGLABT2IsNotNull() {
            addCriterion("GLABT2 is not null");
            return (Criteria) this;
        }

        public Criteria andGLABT2EqualTo(String value) {
            addCriterion("GLABT2 =", value, "GLABT2");
            return (Criteria) this;
        }

        public Criteria andGLABT2NotEqualTo(String value) {
            addCriterion("GLABT2 <>", value, "GLABT2");
            return (Criteria) this;
        }

        public Criteria andGLABT2GreaterThan(String value) {
            addCriterion("GLABT2 >", value, "GLABT2");
            return (Criteria) this;
        }

        public Criteria andGLABT2GreaterThanOrEqualTo(String value) {
            addCriterion("GLABT2 >=", value, "GLABT2");
            return (Criteria) this;
        }

        public Criteria andGLABT2LessThan(String value) {
            addCriterion("GLABT2 <", value, "GLABT2");
            return (Criteria) this;
        }

        public Criteria andGLABT2LessThanOrEqualTo(String value) {
            addCriterion("GLABT2 <=", value, "GLABT2");
            return (Criteria) this;
        }

        public Criteria andGLABT2Like(String value) {
            addCriterion("GLABT2 like", value, "GLABT2");
            return (Criteria) this;
        }

        public Criteria andGLABT2NotLike(String value) {
            addCriterion("GLABT2 not like", value, "GLABT2");
            return (Criteria) this;
        }

        public Criteria andGLABT2In(List<String> values) {
            addCriterion("GLABT2 in", values, "GLABT2");
            return (Criteria) this;
        }

        public Criteria andGLABT2NotIn(List<String> values) {
            addCriterion("GLABT2 not in", values, "GLABT2");
            return (Criteria) this;
        }

        public Criteria andGLABT2Between(String value1, String value2) {
            addCriterion("GLABT2 between", value1, value2, "GLABT2");
            return (Criteria) this;
        }

        public Criteria andGLABT2NotBetween(String value1, String value2) {
            addCriterion("GLABT2 not between", value1, value2, "GLABT2");
            return (Criteria) this;
        }

        public Criteria andGLABT3IsNull() {
            addCriterion("GLABT3 is null");
            return (Criteria) this;
        }

        public Criteria andGLABT3IsNotNull() {
            addCriterion("GLABT3 is not null");
            return (Criteria) this;
        }

        public Criteria andGLABT3EqualTo(String value) {
            addCriterion("GLABT3 =", value, "GLABT3");
            return (Criteria) this;
        }

        public Criteria andGLABT3NotEqualTo(String value) {
            addCriterion("GLABT3 <>", value, "GLABT3");
            return (Criteria) this;
        }

        public Criteria andGLABT3GreaterThan(String value) {
            addCriterion("GLABT3 >", value, "GLABT3");
            return (Criteria) this;
        }

        public Criteria andGLABT3GreaterThanOrEqualTo(String value) {
            addCriterion("GLABT3 >=", value, "GLABT3");
            return (Criteria) this;
        }

        public Criteria andGLABT3LessThan(String value) {
            addCriterion("GLABT3 <", value, "GLABT3");
            return (Criteria) this;
        }

        public Criteria andGLABT3LessThanOrEqualTo(String value) {
            addCriterion("GLABT3 <=", value, "GLABT3");
            return (Criteria) this;
        }

        public Criteria andGLABT3Like(String value) {
            addCriterion("GLABT3 like", value, "GLABT3");
            return (Criteria) this;
        }

        public Criteria andGLABT3NotLike(String value) {
            addCriterion("GLABT3 not like", value, "GLABT3");
            return (Criteria) this;
        }

        public Criteria andGLABT3In(List<String> values) {
            addCriterion("GLABT3 in", values, "GLABT3");
            return (Criteria) this;
        }

        public Criteria andGLABT3NotIn(List<String> values) {
            addCriterion("GLABT3 not in", values, "GLABT3");
            return (Criteria) this;
        }

        public Criteria andGLABT3Between(String value1, String value2) {
            addCriterion("GLABT3 between", value1, value2, "GLABT3");
            return (Criteria) this;
        }

        public Criteria andGLABT3NotBetween(String value1, String value2) {
            addCriterion("GLABT3 not between", value1, value2, "GLABT3");
            return (Criteria) this;
        }

        public Criteria andGLABT4IsNull() {
            addCriterion("GLABT4 is null");
            return (Criteria) this;
        }

        public Criteria andGLABT4IsNotNull() {
            addCriterion("GLABT4 is not null");
            return (Criteria) this;
        }

        public Criteria andGLABT4EqualTo(String value) {
            addCriterion("GLABT4 =", value, "GLABT4");
            return (Criteria) this;
        }

        public Criteria andGLABT4NotEqualTo(String value) {
            addCriterion("GLABT4 <>", value, "GLABT4");
            return (Criteria) this;
        }

        public Criteria andGLABT4GreaterThan(String value) {
            addCriterion("GLABT4 >", value, "GLABT4");
            return (Criteria) this;
        }

        public Criteria andGLABT4GreaterThanOrEqualTo(String value) {
            addCriterion("GLABT4 >=", value, "GLABT4");
            return (Criteria) this;
        }

        public Criteria andGLABT4LessThan(String value) {
            addCriterion("GLABT4 <", value, "GLABT4");
            return (Criteria) this;
        }

        public Criteria andGLABT4LessThanOrEqualTo(String value) {
            addCriterion("GLABT4 <=", value, "GLABT4");
            return (Criteria) this;
        }

        public Criteria andGLABT4Like(String value) {
            addCriterion("GLABT4 like", value, "GLABT4");
            return (Criteria) this;
        }

        public Criteria andGLABT4NotLike(String value) {
            addCriterion("GLABT4 not like", value, "GLABT4");
            return (Criteria) this;
        }

        public Criteria andGLABT4In(List<String> values) {
            addCriterion("GLABT4 in", values, "GLABT4");
            return (Criteria) this;
        }

        public Criteria andGLABT4NotIn(List<String> values) {
            addCriterion("GLABT4 not in", values, "GLABT4");
            return (Criteria) this;
        }

        public Criteria andGLABT4Between(String value1, String value2) {
            addCriterion("GLABT4 between", value1, value2, "GLABT4");
            return (Criteria) this;
        }

        public Criteria andGLABT4NotBetween(String value1, String value2) {
            addCriterion("GLABT4 not between", value1, value2, "GLABT4");
            return (Criteria) this;
        }

        public Criteria andGLITMIsNull() {
            addCriterion("GLITM is null");
            return (Criteria) this;
        }

        public Criteria andGLITMIsNotNull() {
            addCriterion("GLITM is not null");
            return (Criteria) this;
        }

        public Criteria andGLITMEqualTo(BigDecimal value) {
            addCriterion("GLITM =", value, "GLITM");
            return (Criteria) this;
        }

        public Criteria andGLITMNotEqualTo(BigDecimal value) {
            addCriterion("GLITM <>", value, "GLITM");
            return (Criteria) this;
        }

        public Criteria andGLITMGreaterThan(BigDecimal value) {
            addCriterion("GLITM >", value, "GLITM");
            return (Criteria) this;
        }

        public Criteria andGLITMGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLITM >=", value, "GLITM");
            return (Criteria) this;
        }

        public Criteria andGLITMLessThan(BigDecimal value) {
            addCriterion("GLITM <", value, "GLITM");
            return (Criteria) this;
        }

        public Criteria andGLITMLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLITM <=", value, "GLITM");
            return (Criteria) this;
        }

        public Criteria andGLITMIn(List<BigDecimal> values) {
            addCriterion("GLITM in", values, "GLITM");
            return (Criteria) this;
        }

        public Criteria andGLITMNotIn(List<BigDecimal> values) {
            addCriterion("GLITM not in", values, "GLITM");
            return (Criteria) this;
        }

        public Criteria andGLITMBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLITM between", value1, value2, "GLITM");
            return (Criteria) this;
        }

        public Criteria andGLITMNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLITM not between", value1, value2, "GLITM");
            return (Criteria) this;
        }

        public Criteria andGLPM01IsNull() {
            addCriterion("GLPM01 is null");
            return (Criteria) this;
        }

        public Criteria andGLPM01IsNotNull() {
            addCriterion("GLPM01 is not null");
            return (Criteria) this;
        }

        public Criteria andGLPM01EqualTo(String value) {
            addCriterion("GLPM01 =", value, "GLPM01");
            return (Criteria) this;
        }

        public Criteria andGLPM01NotEqualTo(String value) {
            addCriterion("GLPM01 <>", value, "GLPM01");
            return (Criteria) this;
        }

        public Criteria andGLPM01GreaterThan(String value) {
            addCriterion("GLPM01 >", value, "GLPM01");
            return (Criteria) this;
        }

        public Criteria andGLPM01GreaterThanOrEqualTo(String value) {
            addCriterion("GLPM01 >=", value, "GLPM01");
            return (Criteria) this;
        }

        public Criteria andGLPM01LessThan(String value) {
            addCriterion("GLPM01 <", value, "GLPM01");
            return (Criteria) this;
        }

        public Criteria andGLPM01LessThanOrEqualTo(String value) {
            addCriterion("GLPM01 <=", value, "GLPM01");
            return (Criteria) this;
        }

        public Criteria andGLPM01Like(String value) {
            addCriterion("GLPM01 like", value, "GLPM01");
            return (Criteria) this;
        }

        public Criteria andGLPM01NotLike(String value) {
            addCriterion("GLPM01 not like", value, "GLPM01");
            return (Criteria) this;
        }

        public Criteria andGLPM01In(List<String> values) {
            addCriterion("GLPM01 in", values, "GLPM01");
            return (Criteria) this;
        }

        public Criteria andGLPM01NotIn(List<String> values) {
            addCriterion("GLPM01 not in", values, "GLPM01");
            return (Criteria) this;
        }

        public Criteria andGLPM01Between(String value1, String value2) {
            addCriterion("GLPM01 between", value1, value2, "GLPM01");
            return (Criteria) this;
        }

        public Criteria andGLPM01NotBetween(String value1, String value2) {
            addCriterion("GLPM01 not between", value1, value2, "GLPM01");
            return (Criteria) this;
        }

        public Criteria andGLPM02IsNull() {
            addCriterion("GLPM02 is null");
            return (Criteria) this;
        }

        public Criteria andGLPM02IsNotNull() {
            addCriterion("GLPM02 is not null");
            return (Criteria) this;
        }

        public Criteria andGLPM02EqualTo(String value) {
            addCriterion("GLPM02 =", value, "GLPM02");
            return (Criteria) this;
        }

        public Criteria andGLPM02NotEqualTo(String value) {
            addCriterion("GLPM02 <>", value, "GLPM02");
            return (Criteria) this;
        }

        public Criteria andGLPM02GreaterThan(String value) {
            addCriterion("GLPM02 >", value, "GLPM02");
            return (Criteria) this;
        }

        public Criteria andGLPM02GreaterThanOrEqualTo(String value) {
            addCriterion("GLPM02 >=", value, "GLPM02");
            return (Criteria) this;
        }

        public Criteria andGLPM02LessThan(String value) {
            addCriterion("GLPM02 <", value, "GLPM02");
            return (Criteria) this;
        }

        public Criteria andGLPM02LessThanOrEqualTo(String value) {
            addCriterion("GLPM02 <=", value, "GLPM02");
            return (Criteria) this;
        }

        public Criteria andGLPM02Like(String value) {
            addCriterion("GLPM02 like", value, "GLPM02");
            return (Criteria) this;
        }

        public Criteria andGLPM02NotLike(String value) {
            addCriterion("GLPM02 not like", value, "GLPM02");
            return (Criteria) this;
        }

        public Criteria andGLPM02In(List<String> values) {
            addCriterion("GLPM02 in", values, "GLPM02");
            return (Criteria) this;
        }

        public Criteria andGLPM02NotIn(List<String> values) {
            addCriterion("GLPM02 not in", values, "GLPM02");
            return (Criteria) this;
        }

        public Criteria andGLPM02Between(String value1, String value2) {
            addCriterion("GLPM02 between", value1, value2, "GLPM02");
            return (Criteria) this;
        }

        public Criteria andGLPM02NotBetween(String value1, String value2) {
            addCriterion("GLPM02 not between", value1, value2, "GLPM02");
            return (Criteria) this;
        }

        public Criteria andGLPM03IsNull() {
            addCriterion("GLPM03 is null");
            return (Criteria) this;
        }

        public Criteria andGLPM03IsNotNull() {
            addCriterion("GLPM03 is not null");
            return (Criteria) this;
        }

        public Criteria andGLPM03EqualTo(String value) {
            addCriterion("GLPM03 =", value, "GLPM03");
            return (Criteria) this;
        }

        public Criteria andGLPM03NotEqualTo(String value) {
            addCriterion("GLPM03 <>", value, "GLPM03");
            return (Criteria) this;
        }

        public Criteria andGLPM03GreaterThan(String value) {
            addCriterion("GLPM03 >", value, "GLPM03");
            return (Criteria) this;
        }

        public Criteria andGLPM03GreaterThanOrEqualTo(String value) {
            addCriterion("GLPM03 >=", value, "GLPM03");
            return (Criteria) this;
        }

        public Criteria andGLPM03LessThan(String value) {
            addCriterion("GLPM03 <", value, "GLPM03");
            return (Criteria) this;
        }

        public Criteria andGLPM03LessThanOrEqualTo(String value) {
            addCriterion("GLPM03 <=", value, "GLPM03");
            return (Criteria) this;
        }

        public Criteria andGLPM03Like(String value) {
            addCriterion("GLPM03 like", value, "GLPM03");
            return (Criteria) this;
        }

        public Criteria andGLPM03NotLike(String value) {
            addCriterion("GLPM03 not like", value, "GLPM03");
            return (Criteria) this;
        }

        public Criteria andGLPM03In(List<String> values) {
            addCriterion("GLPM03 in", values, "GLPM03");
            return (Criteria) this;
        }

        public Criteria andGLPM03NotIn(List<String> values) {
            addCriterion("GLPM03 not in", values, "GLPM03");
            return (Criteria) this;
        }

        public Criteria andGLPM03Between(String value1, String value2) {
            addCriterion("GLPM03 between", value1, value2, "GLPM03");
            return (Criteria) this;
        }

        public Criteria andGLPM03NotBetween(String value1, String value2) {
            addCriterion("GLPM03 not between", value1, value2, "GLPM03");
            return (Criteria) this;
        }

        public Criteria andGLPM04IsNull() {
            addCriterion("GLPM04 is null");
            return (Criteria) this;
        }

        public Criteria andGLPM04IsNotNull() {
            addCriterion("GLPM04 is not null");
            return (Criteria) this;
        }

        public Criteria andGLPM04EqualTo(String value) {
            addCriterion("GLPM04 =", value, "GLPM04");
            return (Criteria) this;
        }

        public Criteria andGLPM04NotEqualTo(String value) {
            addCriterion("GLPM04 <>", value, "GLPM04");
            return (Criteria) this;
        }

        public Criteria andGLPM04GreaterThan(String value) {
            addCriterion("GLPM04 >", value, "GLPM04");
            return (Criteria) this;
        }

        public Criteria andGLPM04GreaterThanOrEqualTo(String value) {
            addCriterion("GLPM04 >=", value, "GLPM04");
            return (Criteria) this;
        }

        public Criteria andGLPM04LessThan(String value) {
            addCriterion("GLPM04 <", value, "GLPM04");
            return (Criteria) this;
        }

        public Criteria andGLPM04LessThanOrEqualTo(String value) {
            addCriterion("GLPM04 <=", value, "GLPM04");
            return (Criteria) this;
        }

        public Criteria andGLPM04Like(String value) {
            addCriterion("GLPM04 like", value, "GLPM04");
            return (Criteria) this;
        }

        public Criteria andGLPM04NotLike(String value) {
            addCriterion("GLPM04 not like", value, "GLPM04");
            return (Criteria) this;
        }

        public Criteria andGLPM04In(List<String> values) {
            addCriterion("GLPM04 in", values, "GLPM04");
            return (Criteria) this;
        }

        public Criteria andGLPM04NotIn(List<String> values) {
            addCriterion("GLPM04 not in", values, "GLPM04");
            return (Criteria) this;
        }

        public Criteria andGLPM04Between(String value1, String value2) {
            addCriterion("GLPM04 between", value1, value2, "GLPM04");
            return (Criteria) this;
        }

        public Criteria andGLPM04NotBetween(String value1, String value2) {
            addCriterion("GLPM04 not between", value1, value2, "GLPM04");
            return (Criteria) this;
        }

        public Criteria andGLPM05IsNull() {
            addCriterion("GLPM05 is null");
            return (Criteria) this;
        }

        public Criteria andGLPM05IsNotNull() {
            addCriterion("GLPM05 is not null");
            return (Criteria) this;
        }

        public Criteria andGLPM05EqualTo(String value) {
            addCriterion("GLPM05 =", value, "GLPM05");
            return (Criteria) this;
        }

        public Criteria andGLPM05NotEqualTo(String value) {
            addCriterion("GLPM05 <>", value, "GLPM05");
            return (Criteria) this;
        }

        public Criteria andGLPM05GreaterThan(String value) {
            addCriterion("GLPM05 >", value, "GLPM05");
            return (Criteria) this;
        }

        public Criteria andGLPM05GreaterThanOrEqualTo(String value) {
            addCriterion("GLPM05 >=", value, "GLPM05");
            return (Criteria) this;
        }

        public Criteria andGLPM05LessThan(String value) {
            addCriterion("GLPM05 <", value, "GLPM05");
            return (Criteria) this;
        }

        public Criteria andGLPM05LessThanOrEqualTo(String value) {
            addCriterion("GLPM05 <=", value, "GLPM05");
            return (Criteria) this;
        }

        public Criteria andGLPM05Like(String value) {
            addCriterion("GLPM05 like", value, "GLPM05");
            return (Criteria) this;
        }

        public Criteria andGLPM05NotLike(String value) {
            addCriterion("GLPM05 not like", value, "GLPM05");
            return (Criteria) this;
        }

        public Criteria andGLPM05In(List<String> values) {
            addCriterion("GLPM05 in", values, "GLPM05");
            return (Criteria) this;
        }

        public Criteria andGLPM05NotIn(List<String> values) {
            addCriterion("GLPM05 not in", values, "GLPM05");
            return (Criteria) this;
        }

        public Criteria andGLPM05Between(String value1, String value2) {
            addCriterion("GLPM05 between", value1, value2, "GLPM05");
            return (Criteria) this;
        }

        public Criteria andGLPM05NotBetween(String value1, String value2) {
            addCriterion("GLPM05 not between", value1, value2, "GLPM05");
            return (Criteria) this;
        }

        public Criteria andGLPM06IsNull() {
            addCriterion("GLPM06 is null");
            return (Criteria) this;
        }

        public Criteria andGLPM06IsNotNull() {
            addCriterion("GLPM06 is not null");
            return (Criteria) this;
        }

        public Criteria andGLPM06EqualTo(String value) {
            addCriterion("GLPM06 =", value, "GLPM06");
            return (Criteria) this;
        }

        public Criteria andGLPM06NotEqualTo(String value) {
            addCriterion("GLPM06 <>", value, "GLPM06");
            return (Criteria) this;
        }

        public Criteria andGLPM06GreaterThan(String value) {
            addCriterion("GLPM06 >", value, "GLPM06");
            return (Criteria) this;
        }

        public Criteria andGLPM06GreaterThanOrEqualTo(String value) {
            addCriterion("GLPM06 >=", value, "GLPM06");
            return (Criteria) this;
        }

        public Criteria andGLPM06LessThan(String value) {
            addCriterion("GLPM06 <", value, "GLPM06");
            return (Criteria) this;
        }

        public Criteria andGLPM06LessThanOrEqualTo(String value) {
            addCriterion("GLPM06 <=", value, "GLPM06");
            return (Criteria) this;
        }

        public Criteria andGLPM06Like(String value) {
            addCriterion("GLPM06 like", value, "GLPM06");
            return (Criteria) this;
        }

        public Criteria andGLPM06NotLike(String value) {
            addCriterion("GLPM06 not like", value, "GLPM06");
            return (Criteria) this;
        }

        public Criteria andGLPM06In(List<String> values) {
            addCriterion("GLPM06 in", values, "GLPM06");
            return (Criteria) this;
        }

        public Criteria andGLPM06NotIn(List<String> values) {
            addCriterion("GLPM06 not in", values, "GLPM06");
            return (Criteria) this;
        }

        public Criteria andGLPM06Between(String value1, String value2) {
            addCriterion("GLPM06 between", value1, value2, "GLPM06");
            return (Criteria) this;
        }

        public Criteria andGLPM06NotBetween(String value1, String value2) {
            addCriterion("GLPM06 not between", value1, value2, "GLPM06");
            return (Criteria) this;
        }

        public Criteria andGLPM07IsNull() {
            addCriterion("GLPM07 is null");
            return (Criteria) this;
        }

        public Criteria andGLPM07IsNotNull() {
            addCriterion("GLPM07 is not null");
            return (Criteria) this;
        }

        public Criteria andGLPM07EqualTo(String value) {
            addCriterion("GLPM07 =", value, "GLPM07");
            return (Criteria) this;
        }

        public Criteria andGLPM07NotEqualTo(String value) {
            addCriterion("GLPM07 <>", value, "GLPM07");
            return (Criteria) this;
        }

        public Criteria andGLPM07GreaterThan(String value) {
            addCriterion("GLPM07 >", value, "GLPM07");
            return (Criteria) this;
        }

        public Criteria andGLPM07GreaterThanOrEqualTo(String value) {
            addCriterion("GLPM07 >=", value, "GLPM07");
            return (Criteria) this;
        }

        public Criteria andGLPM07LessThan(String value) {
            addCriterion("GLPM07 <", value, "GLPM07");
            return (Criteria) this;
        }

        public Criteria andGLPM07LessThanOrEqualTo(String value) {
            addCriterion("GLPM07 <=", value, "GLPM07");
            return (Criteria) this;
        }

        public Criteria andGLPM07Like(String value) {
            addCriterion("GLPM07 like", value, "GLPM07");
            return (Criteria) this;
        }

        public Criteria andGLPM07NotLike(String value) {
            addCriterion("GLPM07 not like", value, "GLPM07");
            return (Criteria) this;
        }

        public Criteria andGLPM07In(List<String> values) {
            addCriterion("GLPM07 in", values, "GLPM07");
            return (Criteria) this;
        }

        public Criteria andGLPM07NotIn(List<String> values) {
            addCriterion("GLPM07 not in", values, "GLPM07");
            return (Criteria) this;
        }

        public Criteria andGLPM07Between(String value1, String value2) {
            addCriterion("GLPM07 between", value1, value2, "GLPM07");
            return (Criteria) this;
        }

        public Criteria andGLPM07NotBetween(String value1, String value2) {
            addCriterion("GLPM07 not between", value1, value2, "GLPM07");
            return (Criteria) this;
        }

        public Criteria andGLPM08IsNull() {
            addCriterion("GLPM08 is null");
            return (Criteria) this;
        }

        public Criteria andGLPM08IsNotNull() {
            addCriterion("GLPM08 is not null");
            return (Criteria) this;
        }

        public Criteria andGLPM08EqualTo(String value) {
            addCriterion("GLPM08 =", value, "GLPM08");
            return (Criteria) this;
        }

        public Criteria andGLPM08NotEqualTo(String value) {
            addCriterion("GLPM08 <>", value, "GLPM08");
            return (Criteria) this;
        }

        public Criteria andGLPM08GreaterThan(String value) {
            addCriterion("GLPM08 >", value, "GLPM08");
            return (Criteria) this;
        }

        public Criteria andGLPM08GreaterThanOrEqualTo(String value) {
            addCriterion("GLPM08 >=", value, "GLPM08");
            return (Criteria) this;
        }

        public Criteria andGLPM08LessThan(String value) {
            addCriterion("GLPM08 <", value, "GLPM08");
            return (Criteria) this;
        }

        public Criteria andGLPM08LessThanOrEqualTo(String value) {
            addCriterion("GLPM08 <=", value, "GLPM08");
            return (Criteria) this;
        }

        public Criteria andGLPM08Like(String value) {
            addCriterion("GLPM08 like", value, "GLPM08");
            return (Criteria) this;
        }

        public Criteria andGLPM08NotLike(String value) {
            addCriterion("GLPM08 not like", value, "GLPM08");
            return (Criteria) this;
        }

        public Criteria andGLPM08In(List<String> values) {
            addCriterion("GLPM08 in", values, "GLPM08");
            return (Criteria) this;
        }

        public Criteria andGLPM08NotIn(List<String> values) {
            addCriterion("GLPM08 not in", values, "GLPM08");
            return (Criteria) this;
        }

        public Criteria andGLPM08Between(String value1, String value2) {
            addCriterion("GLPM08 between", value1, value2, "GLPM08");
            return (Criteria) this;
        }

        public Criteria andGLPM08NotBetween(String value1, String value2) {
            addCriterion("GLPM08 not between", value1, value2, "GLPM08");
            return (Criteria) this;
        }

        public Criteria andGLPM09IsNull() {
            addCriterion("GLPM09 is null");
            return (Criteria) this;
        }

        public Criteria andGLPM09IsNotNull() {
            addCriterion("GLPM09 is not null");
            return (Criteria) this;
        }

        public Criteria andGLPM09EqualTo(String value) {
            addCriterion("GLPM09 =", value, "GLPM09");
            return (Criteria) this;
        }

        public Criteria andGLPM09NotEqualTo(String value) {
            addCriterion("GLPM09 <>", value, "GLPM09");
            return (Criteria) this;
        }

        public Criteria andGLPM09GreaterThan(String value) {
            addCriterion("GLPM09 >", value, "GLPM09");
            return (Criteria) this;
        }

        public Criteria andGLPM09GreaterThanOrEqualTo(String value) {
            addCriterion("GLPM09 >=", value, "GLPM09");
            return (Criteria) this;
        }

        public Criteria andGLPM09LessThan(String value) {
            addCriterion("GLPM09 <", value, "GLPM09");
            return (Criteria) this;
        }

        public Criteria andGLPM09LessThanOrEqualTo(String value) {
            addCriterion("GLPM09 <=", value, "GLPM09");
            return (Criteria) this;
        }

        public Criteria andGLPM09Like(String value) {
            addCriterion("GLPM09 like", value, "GLPM09");
            return (Criteria) this;
        }

        public Criteria andGLPM09NotLike(String value) {
            addCriterion("GLPM09 not like", value, "GLPM09");
            return (Criteria) this;
        }

        public Criteria andGLPM09In(List<String> values) {
            addCriterion("GLPM09 in", values, "GLPM09");
            return (Criteria) this;
        }

        public Criteria andGLPM09NotIn(List<String> values) {
            addCriterion("GLPM09 not in", values, "GLPM09");
            return (Criteria) this;
        }

        public Criteria andGLPM09Between(String value1, String value2) {
            addCriterion("GLPM09 between", value1, value2, "GLPM09");
            return (Criteria) this;
        }

        public Criteria andGLPM09NotBetween(String value1, String value2) {
            addCriterion("GLPM09 not between", value1, value2, "GLPM09");
            return (Criteria) this;
        }

        public Criteria andGLPM10IsNull() {
            addCriterion("GLPM10 is null");
            return (Criteria) this;
        }

        public Criteria andGLPM10IsNotNull() {
            addCriterion("GLPM10 is not null");
            return (Criteria) this;
        }

        public Criteria andGLPM10EqualTo(String value) {
            addCriterion("GLPM10 =", value, "GLPM10");
            return (Criteria) this;
        }

        public Criteria andGLPM10NotEqualTo(String value) {
            addCriterion("GLPM10 <>", value, "GLPM10");
            return (Criteria) this;
        }

        public Criteria andGLPM10GreaterThan(String value) {
            addCriterion("GLPM10 >", value, "GLPM10");
            return (Criteria) this;
        }

        public Criteria andGLPM10GreaterThanOrEqualTo(String value) {
            addCriterion("GLPM10 >=", value, "GLPM10");
            return (Criteria) this;
        }

        public Criteria andGLPM10LessThan(String value) {
            addCriterion("GLPM10 <", value, "GLPM10");
            return (Criteria) this;
        }

        public Criteria andGLPM10LessThanOrEqualTo(String value) {
            addCriterion("GLPM10 <=", value, "GLPM10");
            return (Criteria) this;
        }

        public Criteria andGLPM10Like(String value) {
            addCriterion("GLPM10 like", value, "GLPM10");
            return (Criteria) this;
        }

        public Criteria andGLPM10NotLike(String value) {
            addCriterion("GLPM10 not like", value, "GLPM10");
            return (Criteria) this;
        }

        public Criteria andGLPM10In(List<String> values) {
            addCriterion("GLPM10 in", values, "GLPM10");
            return (Criteria) this;
        }

        public Criteria andGLPM10NotIn(List<String> values) {
            addCriterion("GLPM10 not in", values, "GLPM10");
            return (Criteria) this;
        }

        public Criteria andGLPM10Between(String value1, String value2) {
            addCriterion("GLPM10 between", value1, value2, "GLPM10");
            return (Criteria) this;
        }

        public Criteria andGLPM10NotBetween(String value1, String value2) {
            addCriterion("GLPM10 not between", value1, value2, "GLPM10");
            return (Criteria) this;
        }

        public Criteria andGLBCRCIsNull() {
            addCriterion("GLBCRC is null");
            return (Criteria) this;
        }

        public Criteria andGLBCRCIsNotNull() {
            addCriterion("GLBCRC is not null");
            return (Criteria) this;
        }

        public Criteria andGLBCRCEqualTo(String value) {
            addCriterion("GLBCRC =", value, "GLBCRC");
            return (Criteria) this;
        }

        public Criteria andGLBCRCNotEqualTo(String value) {
            addCriterion("GLBCRC <>", value, "GLBCRC");
            return (Criteria) this;
        }

        public Criteria andGLBCRCGreaterThan(String value) {
            addCriterion("GLBCRC >", value, "GLBCRC");
            return (Criteria) this;
        }

        public Criteria andGLBCRCGreaterThanOrEqualTo(String value) {
            addCriterion("GLBCRC >=", value, "GLBCRC");
            return (Criteria) this;
        }

        public Criteria andGLBCRCLessThan(String value) {
            addCriterion("GLBCRC <", value, "GLBCRC");
            return (Criteria) this;
        }

        public Criteria andGLBCRCLessThanOrEqualTo(String value) {
            addCriterion("GLBCRC <=", value, "GLBCRC");
            return (Criteria) this;
        }

        public Criteria andGLBCRCLike(String value) {
            addCriterion("GLBCRC like", value, "GLBCRC");
            return (Criteria) this;
        }

        public Criteria andGLBCRCNotLike(String value) {
            addCriterion("GLBCRC not like", value, "GLBCRC");
            return (Criteria) this;
        }

        public Criteria andGLBCRCIn(List<String> values) {
            addCriterion("GLBCRC in", values, "GLBCRC");
            return (Criteria) this;
        }

        public Criteria andGLBCRCNotIn(List<String> values) {
            addCriterion("GLBCRC not in", values, "GLBCRC");
            return (Criteria) this;
        }

        public Criteria andGLBCRCBetween(String value1, String value2) {
            addCriterion("GLBCRC between", value1, value2, "GLBCRC");
            return (Criteria) this;
        }

        public Criteria andGLBCRCNotBetween(String value1, String value2) {
            addCriterion("GLBCRC not between", value1, value2, "GLBCRC");
            return (Criteria) this;
        }

        public Criteria andGLCRRMIsNull() {
            addCriterion("GLCRRM is null");
            return (Criteria) this;
        }

        public Criteria andGLCRRMIsNotNull() {
            addCriterion("GLCRRM is not null");
            return (Criteria) this;
        }

        public Criteria andGLCRRMEqualTo(String value) {
            addCriterion("GLCRRM =", value, "GLCRRM");
            return (Criteria) this;
        }

        public Criteria andGLCRRMNotEqualTo(String value) {
            addCriterion("GLCRRM <>", value, "GLCRRM");
            return (Criteria) this;
        }

        public Criteria andGLCRRMGreaterThan(String value) {
            addCriterion("GLCRRM >", value, "GLCRRM");
            return (Criteria) this;
        }

        public Criteria andGLCRRMGreaterThanOrEqualTo(String value) {
            addCriterion("GLCRRM >=", value, "GLCRRM");
            return (Criteria) this;
        }

        public Criteria andGLCRRMLessThan(String value) {
            addCriterion("GLCRRM <", value, "GLCRRM");
            return (Criteria) this;
        }

        public Criteria andGLCRRMLessThanOrEqualTo(String value) {
            addCriterion("GLCRRM <=", value, "GLCRRM");
            return (Criteria) this;
        }

        public Criteria andGLCRRMLike(String value) {
            addCriterion("GLCRRM like", value, "GLCRRM");
            return (Criteria) this;
        }

        public Criteria andGLCRRMNotLike(String value) {
            addCriterion("GLCRRM not like", value, "GLCRRM");
            return (Criteria) this;
        }

        public Criteria andGLCRRMIn(List<String> values) {
            addCriterion("GLCRRM in", values, "GLCRRM");
            return (Criteria) this;
        }

        public Criteria andGLCRRMNotIn(List<String> values) {
            addCriterion("GLCRRM not in", values, "GLCRRM");
            return (Criteria) this;
        }

        public Criteria andGLCRRMBetween(String value1, String value2) {
            addCriterion("GLCRRM between", value1, value2, "GLCRRM");
            return (Criteria) this;
        }

        public Criteria andGLCRRMNotBetween(String value1, String value2) {
            addCriterion("GLCRRM not between", value1, value2, "GLCRRM");
            return (Criteria) this;
        }

        public Criteria andGLPRGFIsNull() {
            addCriterion("GLPRGF is null");
            return (Criteria) this;
        }

        public Criteria andGLPRGFIsNotNull() {
            addCriterion("GLPRGF is not null");
            return (Criteria) this;
        }

        public Criteria andGLPRGFEqualTo(String value) {
            addCriterion("GLPRGF =", value, "GLPRGF");
            return (Criteria) this;
        }

        public Criteria andGLPRGFNotEqualTo(String value) {
            addCriterion("GLPRGF <>", value, "GLPRGF");
            return (Criteria) this;
        }

        public Criteria andGLPRGFGreaterThan(String value) {
            addCriterion("GLPRGF >", value, "GLPRGF");
            return (Criteria) this;
        }

        public Criteria andGLPRGFGreaterThanOrEqualTo(String value) {
            addCriterion("GLPRGF >=", value, "GLPRGF");
            return (Criteria) this;
        }

        public Criteria andGLPRGFLessThan(String value) {
            addCriterion("GLPRGF <", value, "GLPRGF");
            return (Criteria) this;
        }

        public Criteria andGLPRGFLessThanOrEqualTo(String value) {
            addCriterion("GLPRGF <=", value, "GLPRGF");
            return (Criteria) this;
        }

        public Criteria andGLPRGFLike(String value) {
            addCriterion("GLPRGF like", value, "GLPRGF");
            return (Criteria) this;
        }

        public Criteria andGLPRGFNotLike(String value) {
            addCriterion("GLPRGF not like", value, "GLPRGF");
            return (Criteria) this;
        }

        public Criteria andGLPRGFIn(List<String> values) {
            addCriterion("GLPRGF in", values, "GLPRGF");
            return (Criteria) this;
        }

        public Criteria andGLPRGFNotIn(List<String> values) {
            addCriterion("GLPRGF not in", values, "GLPRGF");
            return (Criteria) this;
        }

        public Criteria andGLPRGFBetween(String value1, String value2) {
            addCriterion("GLPRGF between", value1, value2, "GLPRGF");
            return (Criteria) this;
        }

        public Criteria andGLPRGFNotBetween(String value1, String value2) {
            addCriterion("GLPRGF not between", value1, value2, "GLPRGF");
            return (Criteria) this;
        }

        public Criteria andGLTXA1IsNull() {
            addCriterion("GLTXA1 is null");
            return (Criteria) this;
        }

        public Criteria andGLTXA1IsNotNull() {
            addCriterion("GLTXA1 is not null");
            return (Criteria) this;
        }

        public Criteria andGLTXA1EqualTo(String value) {
            addCriterion("GLTXA1 =", value, "GLTXA1");
            return (Criteria) this;
        }

        public Criteria andGLTXA1NotEqualTo(String value) {
            addCriterion("GLTXA1 <>", value, "GLTXA1");
            return (Criteria) this;
        }

        public Criteria andGLTXA1GreaterThan(String value) {
            addCriterion("GLTXA1 >", value, "GLTXA1");
            return (Criteria) this;
        }

        public Criteria andGLTXA1GreaterThanOrEqualTo(String value) {
            addCriterion("GLTXA1 >=", value, "GLTXA1");
            return (Criteria) this;
        }

        public Criteria andGLTXA1LessThan(String value) {
            addCriterion("GLTXA1 <", value, "GLTXA1");
            return (Criteria) this;
        }

        public Criteria andGLTXA1LessThanOrEqualTo(String value) {
            addCriterion("GLTXA1 <=", value, "GLTXA1");
            return (Criteria) this;
        }

        public Criteria andGLTXA1Like(String value) {
            addCriterion("GLTXA1 like", value, "GLTXA1");
            return (Criteria) this;
        }

        public Criteria andGLTXA1NotLike(String value) {
            addCriterion("GLTXA1 not like", value, "GLTXA1");
            return (Criteria) this;
        }

        public Criteria andGLTXA1In(List<String> values) {
            addCriterion("GLTXA1 in", values, "GLTXA1");
            return (Criteria) this;
        }

        public Criteria andGLTXA1NotIn(List<String> values) {
            addCriterion("GLTXA1 not in", values, "GLTXA1");
            return (Criteria) this;
        }

        public Criteria andGLTXA1Between(String value1, String value2) {
            addCriterion("GLTXA1 between", value1, value2, "GLTXA1");
            return (Criteria) this;
        }

        public Criteria andGLTXA1NotBetween(String value1, String value2) {
            addCriterion("GLTXA1 not between", value1, value2, "GLTXA1");
            return (Criteria) this;
        }

        public Criteria andGLEXR1IsNull() {
            addCriterion("GLEXR1 is null");
            return (Criteria) this;
        }

        public Criteria andGLEXR1IsNotNull() {
            addCriterion("GLEXR1 is not null");
            return (Criteria) this;
        }

        public Criteria andGLEXR1EqualTo(String value) {
            addCriterion("GLEXR1 =", value, "GLEXR1");
            return (Criteria) this;
        }

        public Criteria andGLEXR1NotEqualTo(String value) {
            addCriterion("GLEXR1 <>", value, "GLEXR1");
            return (Criteria) this;
        }

        public Criteria andGLEXR1GreaterThan(String value) {
            addCriterion("GLEXR1 >", value, "GLEXR1");
            return (Criteria) this;
        }

        public Criteria andGLEXR1GreaterThanOrEqualTo(String value) {
            addCriterion("GLEXR1 >=", value, "GLEXR1");
            return (Criteria) this;
        }

        public Criteria andGLEXR1LessThan(String value) {
            addCriterion("GLEXR1 <", value, "GLEXR1");
            return (Criteria) this;
        }

        public Criteria andGLEXR1LessThanOrEqualTo(String value) {
            addCriterion("GLEXR1 <=", value, "GLEXR1");
            return (Criteria) this;
        }

        public Criteria andGLEXR1Like(String value) {
            addCriterion("GLEXR1 like", value, "GLEXR1");
            return (Criteria) this;
        }

        public Criteria andGLEXR1NotLike(String value) {
            addCriterion("GLEXR1 not like", value, "GLEXR1");
            return (Criteria) this;
        }

        public Criteria andGLEXR1In(List<String> values) {
            addCriterion("GLEXR1 in", values, "GLEXR1");
            return (Criteria) this;
        }

        public Criteria andGLEXR1NotIn(List<String> values) {
            addCriterion("GLEXR1 not in", values, "GLEXR1");
            return (Criteria) this;
        }

        public Criteria andGLEXR1Between(String value1, String value2) {
            addCriterion("GLEXR1 between", value1, value2, "GLEXR1");
            return (Criteria) this;
        }

        public Criteria andGLEXR1NotBetween(String value1, String value2) {
            addCriterion("GLEXR1 not between", value1, value2, "GLEXR1");
            return (Criteria) this;
        }

        public Criteria andGLTXITMIsNull() {
            addCriterion("GLTXITM is null");
            return (Criteria) this;
        }

        public Criteria andGLTXITMIsNotNull() {
            addCriterion("GLTXITM is not null");
            return (Criteria) this;
        }

        public Criteria andGLTXITMEqualTo(BigDecimal value) {
            addCriterion("GLTXITM =", value, "GLTXITM");
            return (Criteria) this;
        }

        public Criteria andGLTXITMNotEqualTo(BigDecimal value) {
            addCriterion("GLTXITM <>", value, "GLTXITM");
            return (Criteria) this;
        }

        public Criteria andGLTXITMGreaterThan(BigDecimal value) {
            addCriterion("GLTXITM >", value, "GLTXITM");
            return (Criteria) this;
        }

        public Criteria andGLTXITMGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLTXITM >=", value, "GLTXITM");
            return (Criteria) this;
        }

        public Criteria andGLTXITMLessThan(BigDecimal value) {
            addCriterion("GLTXITM <", value, "GLTXITM");
            return (Criteria) this;
        }

        public Criteria andGLTXITMLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLTXITM <=", value, "GLTXITM");
            return (Criteria) this;
        }

        public Criteria andGLTXITMIn(List<BigDecimal> values) {
            addCriterion("GLTXITM in", values, "GLTXITM");
            return (Criteria) this;
        }

        public Criteria andGLTXITMNotIn(List<BigDecimal> values) {
            addCriterion("GLTXITM not in", values, "GLTXITM");
            return (Criteria) this;
        }

        public Criteria andGLTXITMBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLTXITM between", value1, value2, "GLTXITM");
            return (Criteria) this;
        }

        public Criteria andGLTXITMNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLTXITM not between", value1, value2, "GLTXITM");
            return (Criteria) this;
        }

        public Criteria andGLACTBIsNull() {
            addCriterion("GLACTB is null");
            return (Criteria) this;
        }

        public Criteria andGLACTBIsNotNull() {
            addCriterion("GLACTB is not null");
            return (Criteria) this;
        }

        public Criteria andGLACTBEqualTo(String value) {
            addCriterion("GLACTB =", value, "GLACTB");
            return (Criteria) this;
        }

        public Criteria andGLACTBNotEqualTo(String value) {
            addCriterion("GLACTB <>", value, "GLACTB");
            return (Criteria) this;
        }

        public Criteria andGLACTBGreaterThan(String value) {
            addCriterion("GLACTB >", value, "GLACTB");
            return (Criteria) this;
        }

        public Criteria andGLACTBGreaterThanOrEqualTo(String value) {
            addCriterion("GLACTB >=", value, "GLACTB");
            return (Criteria) this;
        }

        public Criteria andGLACTBLessThan(String value) {
            addCriterion("GLACTB <", value, "GLACTB");
            return (Criteria) this;
        }

        public Criteria andGLACTBLessThanOrEqualTo(String value) {
            addCriterion("GLACTB <=", value, "GLACTB");
            return (Criteria) this;
        }

        public Criteria andGLACTBLike(String value) {
            addCriterion("GLACTB like", value, "GLACTB");
            return (Criteria) this;
        }

        public Criteria andGLACTBNotLike(String value) {
            addCriterion("GLACTB not like", value, "GLACTB");
            return (Criteria) this;
        }

        public Criteria andGLACTBIn(List<String> values) {
            addCriterion("GLACTB in", values, "GLACTB");
            return (Criteria) this;
        }

        public Criteria andGLACTBNotIn(List<String> values) {
            addCriterion("GLACTB not in", values, "GLACTB");
            return (Criteria) this;
        }

        public Criteria andGLACTBBetween(String value1, String value2) {
            addCriterion("GLACTB between", value1, value2, "GLACTB");
            return (Criteria) this;
        }

        public Criteria andGLACTBNotBetween(String value1, String value2) {
            addCriterion("GLACTB not between", value1, value2, "GLACTB");
            return (Criteria) this;
        }

        public Criteria andGLGPF1IsNull() {
            addCriterion("GLGPF1 is null");
            return (Criteria) this;
        }

        public Criteria andGLGPF1IsNotNull() {
            addCriterion("GLGPF1 is not null");
            return (Criteria) this;
        }

        public Criteria andGLGPF1EqualTo(String value) {
            addCriterion("GLGPF1 =", value, "GLGPF1");
            return (Criteria) this;
        }

        public Criteria andGLGPF1NotEqualTo(String value) {
            addCriterion("GLGPF1 <>", value, "GLGPF1");
            return (Criteria) this;
        }

        public Criteria andGLGPF1GreaterThan(String value) {
            addCriterion("GLGPF1 >", value, "GLGPF1");
            return (Criteria) this;
        }

        public Criteria andGLGPF1GreaterThanOrEqualTo(String value) {
            addCriterion("GLGPF1 >=", value, "GLGPF1");
            return (Criteria) this;
        }

        public Criteria andGLGPF1LessThan(String value) {
            addCriterion("GLGPF1 <", value, "GLGPF1");
            return (Criteria) this;
        }

        public Criteria andGLGPF1LessThanOrEqualTo(String value) {
            addCriterion("GLGPF1 <=", value, "GLGPF1");
            return (Criteria) this;
        }

        public Criteria andGLGPF1Like(String value) {
            addCriterion("GLGPF1 like", value, "GLGPF1");
            return (Criteria) this;
        }

        public Criteria andGLGPF1NotLike(String value) {
            addCriterion("GLGPF1 not like", value, "GLGPF1");
            return (Criteria) this;
        }

        public Criteria andGLGPF1In(List<String> values) {
            addCriterion("GLGPF1 in", values, "GLGPF1");
            return (Criteria) this;
        }

        public Criteria andGLGPF1NotIn(List<String> values) {
            addCriterion("GLGPF1 not in", values, "GLGPF1");
            return (Criteria) this;
        }

        public Criteria andGLGPF1Between(String value1, String value2) {
            addCriterion("GLGPF1 between", value1, value2, "GLGPF1");
            return (Criteria) this;
        }

        public Criteria andGLGPF1NotBetween(String value1, String value2) {
            addCriterion("GLGPF1 not between", value1, value2, "GLGPF1");
            return (Criteria) this;
        }

        public Criteria andGLACRIsNull() {
            addCriterion("GLACR is null");
            return (Criteria) this;
        }

        public Criteria andGLACRIsNotNull() {
            addCriterion("GLACR is not null");
            return (Criteria) this;
        }

        public Criteria andGLACREqualTo(BigDecimal value) {
            addCriterion("GLACR =", value, "GLACR");
            return (Criteria) this;
        }

        public Criteria andGLACRNotEqualTo(BigDecimal value) {
            addCriterion("GLACR <>", value, "GLACR");
            return (Criteria) this;
        }

        public Criteria andGLACRGreaterThan(BigDecimal value) {
            addCriterion("GLACR >", value, "GLACR");
            return (Criteria) this;
        }

        public Criteria andGLACRGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLACR >=", value, "GLACR");
            return (Criteria) this;
        }

        public Criteria andGLACRLessThan(BigDecimal value) {
            addCriterion("GLACR <", value, "GLACR");
            return (Criteria) this;
        }

        public Criteria andGLACRLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLACR <=", value, "GLACR");
            return (Criteria) this;
        }

        public Criteria andGLACRIn(List<BigDecimal> values) {
            addCriterion("GLACR in", values, "GLACR");
            return (Criteria) this;
        }

        public Criteria andGLACRNotIn(List<BigDecimal> values) {
            addCriterion("GLACR not in", values, "GLACR");
            return (Criteria) this;
        }

        public Criteria andGLACRBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLACR between", value1, value2, "GLACR");
            return (Criteria) this;
        }

        public Criteria andGLACRNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLACR not between", value1, value2, "GLACR");
            return (Criteria) this;
        }

        public Criteria andGLDLNIDIsNull() {
            addCriterion("GLDLNID is null");
            return (Criteria) this;
        }

        public Criteria andGLDLNIDIsNotNull() {
            addCriterion("GLDLNID is not null");
            return (Criteria) this;
        }

        public Criteria andGLDLNIDEqualTo(BigDecimal value) {
            addCriterion("GLDLNID =", value, "GLDLNID");
            return (Criteria) this;
        }

        public Criteria andGLDLNIDNotEqualTo(BigDecimal value) {
            addCriterion("GLDLNID <>", value, "GLDLNID");
            return (Criteria) this;
        }

        public Criteria andGLDLNIDGreaterThan(BigDecimal value) {
            addCriterion("GLDLNID >", value, "GLDLNID");
            return (Criteria) this;
        }

        public Criteria andGLDLNIDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLDLNID >=", value, "GLDLNID");
            return (Criteria) this;
        }

        public Criteria andGLDLNIDLessThan(BigDecimal value) {
            addCriterion("GLDLNID <", value, "GLDLNID");
            return (Criteria) this;
        }

        public Criteria andGLDLNIDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLDLNID <=", value, "GLDLNID");
            return (Criteria) this;
        }

        public Criteria andGLDLNIDIn(List<BigDecimal> values) {
            addCriterion("GLDLNID in", values, "GLDLNID");
            return (Criteria) this;
        }

        public Criteria andGLDLNIDNotIn(List<BigDecimal> values) {
            addCriterion("GLDLNID not in", values, "GLDLNID");
            return (Criteria) this;
        }

        public Criteria andGLDLNIDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLDLNID between", value1, value2, "GLDLNID");
            return (Criteria) this;
        }

        public Criteria andGLDLNIDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLDLNID not between", value1, value2, "GLDLNID");
            return (Criteria) this;
        }

        public Criteria andGLCKNUIsNull() {
            addCriterion("GLCKNU is null");
            return (Criteria) this;
        }

        public Criteria andGLCKNUIsNotNull() {
            addCriterion("GLCKNU is not null");
            return (Criteria) this;
        }

        public Criteria andGLCKNUEqualTo(String value) {
            addCriterion("GLCKNU =", value, "GLCKNU");
            return (Criteria) this;
        }

        public Criteria andGLCKNUNotEqualTo(String value) {
            addCriterion("GLCKNU <>", value, "GLCKNU");
            return (Criteria) this;
        }

        public Criteria andGLCKNUGreaterThan(String value) {
            addCriterion("GLCKNU >", value, "GLCKNU");
            return (Criteria) this;
        }

        public Criteria andGLCKNUGreaterThanOrEqualTo(String value) {
            addCriterion("GLCKNU >=", value, "GLCKNU");
            return (Criteria) this;
        }

        public Criteria andGLCKNULessThan(String value) {
            addCriterion("GLCKNU <", value, "GLCKNU");
            return (Criteria) this;
        }

        public Criteria andGLCKNULessThanOrEqualTo(String value) {
            addCriterion("GLCKNU <=", value, "GLCKNU");
            return (Criteria) this;
        }

        public Criteria andGLCKNULike(String value) {
            addCriterion("GLCKNU like", value, "GLCKNU");
            return (Criteria) this;
        }

        public Criteria andGLCKNUNotLike(String value) {
            addCriterion("GLCKNU not like", value, "GLCKNU");
            return (Criteria) this;
        }

        public Criteria andGLCKNUIn(List<String> values) {
            addCriterion("GLCKNU in", values, "GLCKNU");
            return (Criteria) this;
        }

        public Criteria andGLCKNUNotIn(List<String> values) {
            addCriterion("GLCKNU not in", values, "GLCKNU");
            return (Criteria) this;
        }

        public Criteria andGLCKNUBetween(String value1, String value2) {
            addCriterion("GLCKNU between", value1, value2, "GLCKNU");
            return (Criteria) this;
        }

        public Criteria andGLCKNUNotBetween(String value1, String value2) {
            addCriterion("GLCKNU not between", value1, value2, "GLCKNU");
            return (Criteria) this;
        }

        public Criteria andGLBUPCIsNull() {
            addCriterion("GLBUPC is null");
            return (Criteria) this;
        }

        public Criteria andGLBUPCIsNotNull() {
            addCriterion("GLBUPC is not null");
            return (Criteria) this;
        }

        public Criteria andGLBUPCEqualTo(String value) {
            addCriterion("GLBUPC =", value, "GLBUPC");
            return (Criteria) this;
        }

        public Criteria andGLBUPCNotEqualTo(String value) {
            addCriterion("GLBUPC <>", value, "GLBUPC");
            return (Criteria) this;
        }

        public Criteria andGLBUPCGreaterThan(String value) {
            addCriterion("GLBUPC >", value, "GLBUPC");
            return (Criteria) this;
        }

        public Criteria andGLBUPCGreaterThanOrEqualTo(String value) {
            addCriterion("GLBUPC >=", value, "GLBUPC");
            return (Criteria) this;
        }

        public Criteria andGLBUPCLessThan(String value) {
            addCriterion("GLBUPC <", value, "GLBUPC");
            return (Criteria) this;
        }

        public Criteria andGLBUPCLessThanOrEqualTo(String value) {
            addCriterion("GLBUPC <=", value, "GLBUPC");
            return (Criteria) this;
        }

        public Criteria andGLBUPCLike(String value) {
            addCriterion("GLBUPC like", value, "GLBUPC");
            return (Criteria) this;
        }

        public Criteria andGLBUPCNotLike(String value) {
            addCriterion("GLBUPC not like", value, "GLBUPC");
            return (Criteria) this;
        }

        public Criteria andGLBUPCIn(List<String> values) {
            addCriterion("GLBUPC in", values, "GLBUPC");
            return (Criteria) this;
        }

        public Criteria andGLBUPCNotIn(List<String> values) {
            addCriterion("GLBUPC not in", values, "GLBUPC");
            return (Criteria) this;
        }

        public Criteria andGLBUPCBetween(String value1, String value2) {
            addCriterion("GLBUPC between", value1, value2, "GLBUPC");
            return (Criteria) this;
        }

        public Criteria andGLBUPCNotBetween(String value1, String value2) {
            addCriterion("GLBUPC not between", value1, value2, "GLBUPC");
            return (Criteria) this;
        }

        public Criteria andGLAHBUIsNull() {
            addCriterion("GLAHBU is null");
            return (Criteria) this;
        }

        public Criteria andGLAHBUIsNotNull() {
            addCriterion("GLAHBU is not null");
            return (Criteria) this;
        }

        public Criteria andGLAHBUEqualTo(String value) {
            addCriterion("GLAHBU =", value, "GLAHBU");
            return (Criteria) this;
        }

        public Criteria andGLAHBUNotEqualTo(String value) {
            addCriterion("GLAHBU <>", value, "GLAHBU");
            return (Criteria) this;
        }

        public Criteria andGLAHBUGreaterThan(String value) {
            addCriterion("GLAHBU >", value, "GLAHBU");
            return (Criteria) this;
        }

        public Criteria andGLAHBUGreaterThanOrEqualTo(String value) {
            addCriterion("GLAHBU >=", value, "GLAHBU");
            return (Criteria) this;
        }

        public Criteria andGLAHBULessThan(String value) {
            addCriterion("GLAHBU <", value, "GLAHBU");
            return (Criteria) this;
        }

        public Criteria andGLAHBULessThanOrEqualTo(String value) {
            addCriterion("GLAHBU <=", value, "GLAHBU");
            return (Criteria) this;
        }

        public Criteria andGLAHBULike(String value) {
            addCriterion("GLAHBU like", value, "GLAHBU");
            return (Criteria) this;
        }

        public Criteria andGLAHBUNotLike(String value) {
            addCriterion("GLAHBU not like", value, "GLAHBU");
            return (Criteria) this;
        }

        public Criteria andGLAHBUIn(List<String> values) {
            addCriterion("GLAHBU in", values, "GLAHBU");
            return (Criteria) this;
        }

        public Criteria andGLAHBUNotIn(List<String> values) {
            addCriterion("GLAHBU not in", values, "GLAHBU");
            return (Criteria) this;
        }

        public Criteria andGLAHBUBetween(String value1, String value2) {
            addCriterion("GLAHBU between", value1, value2, "GLAHBU");
            return (Criteria) this;
        }

        public Criteria andGLAHBUNotBetween(String value1, String value2) {
            addCriterion("GLAHBU not between", value1, value2, "GLAHBU");
            return (Criteria) this;
        }

        public Criteria andGLEPGCIsNull() {
            addCriterion("GLEPGC is null");
            return (Criteria) this;
        }

        public Criteria andGLEPGCIsNotNull() {
            addCriterion("GLEPGC is not null");
            return (Criteria) this;
        }

        public Criteria andGLEPGCEqualTo(String value) {
            addCriterion("GLEPGC =", value, "GLEPGC");
            return (Criteria) this;
        }

        public Criteria andGLEPGCNotEqualTo(String value) {
            addCriterion("GLEPGC <>", value, "GLEPGC");
            return (Criteria) this;
        }

        public Criteria andGLEPGCGreaterThan(String value) {
            addCriterion("GLEPGC >", value, "GLEPGC");
            return (Criteria) this;
        }

        public Criteria andGLEPGCGreaterThanOrEqualTo(String value) {
            addCriterion("GLEPGC >=", value, "GLEPGC");
            return (Criteria) this;
        }

        public Criteria andGLEPGCLessThan(String value) {
            addCriterion("GLEPGC <", value, "GLEPGC");
            return (Criteria) this;
        }

        public Criteria andGLEPGCLessThanOrEqualTo(String value) {
            addCriterion("GLEPGC <=", value, "GLEPGC");
            return (Criteria) this;
        }

        public Criteria andGLEPGCLike(String value) {
            addCriterion("GLEPGC like", value, "GLEPGC");
            return (Criteria) this;
        }

        public Criteria andGLEPGCNotLike(String value) {
            addCriterion("GLEPGC not like", value, "GLEPGC");
            return (Criteria) this;
        }

        public Criteria andGLEPGCIn(List<String> values) {
            addCriterion("GLEPGC in", values, "GLEPGC");
            return (Criteria) this;
        }

        public Criteria andGLEPGCNotIn(List<String> values) {
            addCriterion("GLEPGC not in", values, "GLEPGC");
            return (Criteria) this;
        }

        public Criteria andGLEPGCBetween(String value1, String value2) {
            addCriterion("GLEPGC between", value1, value2, "GLEPGC");
            return (Criteria) this;
        }

        public Criteria andGLEPGCNotBetween(String value1, String value2) {
            addCriterion("GLEPGC not between", value1, value2, "GLEPGC");
            return (Criteria) this;
        }

        public Criteria andGLJPGCIsNull() {
            addCriterion("GLJPGC is null");
            return (Criteria) this;
        }

        public Criteria andGLJPGCIsNotNull() {
            addCriterion("GLJPGC is not null");
            return (Criteria) this;
        }

        public Criteria andGLJPGCEqualTo(String value) {
            addCriterion("GLJPGC =", value, "GLJPGC");
            return (Criteria) this;
        }

        public Criteria andGLJPGCNotEqualTo(String value) {
            addCriterion("GLJPGC <>", value, "GLJPGC");
            return (Criteria) this;
        }

        public Criteria andGLJPGCGreaterThan(String value) {
            addCriterion("GLJPGC >", value, "GLJPGC");
            return (Criteria) this;
        }

        public Criteria andGLJPGCGreaterThanOrEqualTo(String value) {
            addCriterion("GLJPGC >=", value, "GLJPGC");
            return (Criteria) this;
        }

        public Criteria andGLJPGCLessThan(String value) {
            addCriterion("GLJPGC <", value, "GLJPGC");
            return (Criteria) this;
        }

        public Criteria andGLJPGCLessThanOrEqualTo(String value) {
            addCriterion("GLJPGC <=", value, "GLJPGC");
            return (Criteria) this;
        }

        public Criteria andGLJPGCLike(String value) {
            addCriterion("GLJPGC like", value, "GLJPGC");
            return (Criteria) this;
        }

        public Criteria andGLJPGCNotLike(String value) {
            addCriterion("GLJPGC not like", value, "GLJPGC");
            return (Criteria) this;
        }

        public Criteria andGLJPGCIn(List<String> values) {
            addCriterion("GLJPGC in", values, "GLJPGC");
            return (Criteria) this;
        }

        public Criteria andGLJPGCNotIn(List<String> values) {
            addCriterion("GLJPGC not in", values, "GLJPGC");
            return (Criteria) this;
        }

        public Criteria andGLJPGCBetween(String value1, String value2) {
            addCriterion("GLJPGC between", value1, value2, "GLJPGC");
            return (Criteria) this;
        }

        public Criteria andGLJPGCNotBetween(String value1, String value2) {
            addCriterion("GLJPGC not between", value1, value2, "GLJPGC");
            return (Criteria) this;
        }

        public Criteria andGLRC5IsNull() {
            addCriterion("GLRC5 is null");
            return (Criteria) this;
        }

        public Criteria andGLRC5IsNotNull() {
            addCriterion("GLRC5 is not null");
            return (Criteria) this;
        }

        public Criteria andGLRC5EqualTo(BigDecimal value) {
            addCriterion("GLRC5 =", value, "GLRC5");
            return (Criteria) this;
        }

        public Criteria andGLRC5NotEqualTo(BigDecimal value) {
            addCriterion("GLRC5 <>", value, "GLRC5");
            return (Criteria) this;
        }

        public Criteria andGLRC5GreaterThan(BigDecimal value) {
            addCriterion("GLRC5 >", value, "GLRC5");
            return (Criteria) this;
        }

        public Criteria andGLRC5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLRC5 >=", value, "GLRC5");
            return (Criteria) this;
        }

        public Criteria andGLRC5LessThan(BigDecimal value) {
            addCriterion("GLRC5 <", value, "GLRC5");
            return (Criteria) this;
        }

        public Criteria andGLRC5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLRC5 <=", value, "GLRC5");
            return (Criteria) this;
        }

        public Criteria andGLRC5In(List<BigDecimal> values) {
            addCriterion("GLRC5 in", values, "GLRC5");
            return (Criteria) this;
        }

        public Criteria andGLRC5NotIn(List<BigDecimal> values) {
            addCriterion("GLRC5 not in", values, "GLRC5");
            return (Criteria) this;
        }

        public Criteria andGLRC5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLRC5 between", value1, value2, "GLRC5");
            return (Criteria) this;
        }

        public Criteria andGLRC5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLRC5 not between", value1, value2, "GLRC5");
            return (Criteria) this;
        }

        public Criteria andGLSFXEIsNull() {
            addCriterion("GLSFXE is null");
            return (Criteria) this;
        }

        public Criteria andGLSFXEIsNotNull() {
            addCriterion("GLSFXE is not null");
            return (Criteria) this;
        }

        public Criteria andGLSFXEEqualTo(BigDecimal value) {
            addCriterion("GLSFXE =", value, "GLSFXE");
            return (Criteria) this;
        }

        public Criteria andGLSFXENotEqualTo(BigDecimal value) {
            addCriterion("GLSFXE <>", value, "GLSFXE");
            return (Criteria) this;
        }

        public Criteria andGLSFXEGreaterThan(BigDecimal value) {
            addCriterion("GLSFXE >", value, "GLSFXE");
            return (Criteria) this;
        }

        public Criteria andGLSFXEGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLSFXE >=", value, "GLSFXE");
            return (Criteria) this;
        }

        public Criteria andGLSFXELessThan(BigDecimal value) {
            addCriterion("GLSFXE <", value, "GLSFXE");
            return (Criteria) this;
        }

        public Criteria andGLSFXELessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLSFXE <=", value, "GLSFXE");
            return (Criteria) this;
        }

        public Criteria andGLSFXEIn(List<BigDecimal> values) {
            addCriterion("GLSFXE in", values, "GLSFXE");
            return (Criteria) this;
        }

        public Criteria andGLSFXENotIn(List<BigDecimal> values) {
            addCriterion("GLSFXE not in", values, "GLSFXE");
            return (Criteria) this;
        }

        public Criteria andGLSFXEBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLSFXE between", value1, value2, "GLSFXE");
            return (Criteria) this;
        }

        public Criteria andGLSFXENotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLSFXE not between", value1, value2, "GLSFXE");
            return (Criteria) this;
        }

        public Criteria andGLOFMIsNull() {
            addCriterion("GLOFM is null");
            return (Criteria) this;
        }

        public Criteria andGLOFMIsNotNull() {
            addCriterion("GLOFM is not null");
            return (Criteria) this;
        }

        public Criteria andGLOFMEqualTo(String value) {
            addCriterion("GLOFM =", value, "GLOFM");
            return (Criteria) this;
        }

        public Criteria andGLOFMNotEqualTo(String value) {
            addCriterion("GLOFM <>", value, "GLOFM");
            return (Criteria) this;
        }

        public Criteria andGLOFMGreaterThan(String value) {
            addCriterion("GLOFM >", value, "GLOFM");
            return (Criteria) this;
        }

        public Criteria andGLOFMGreaterThanOrEqualTo(String value) {
            addCriterion("GLOFM >=", value, "GLOFM");
            return (Criteria) this;
        }

        public Criteria andGLOFMLessThan(String value) {
            addCriterion("GLOFM <", value, "GLOFM");
            return (Criteria) this;
        }

        public Criteria andGLOFMLessThanOrEqualTo(String value) {
            addCriterion("GLOFM <=", value, "GLOFM");
            return (Criteria) this;
        }

        public Criteria andGLOFMLike(String value) {
            addCriterion("GLOFM like", value, "GLOFM");
            return (Criteria) this;
        }

        public Criteria andGLOFMNotLike(String value) {
            addCriterion("GLOFM not like", value, "GLOFM");
            return (Criteria) this;
        }

        public Criteria andGLOFMIn(List<String> values) {
            addCriterion("GLOFM in", values, "GLOFM");
            return (Criteria) this;
        }

        public Criteria andGLOFMNotIn(List<String> values) {
            addCriterion("GLOFM not in", values, "GLOFM");
            return (Criteria) this;
        }

        public Criteria andGLOFMBetween(String value1, String value2) {
            addCriterion("GLOFM between", value1, value2, "GLOFM");
            return (Criteria) this;
        }

        public Criteria andGLOFMNotBetween(String value1, String value2) {
            addCriterion("GLOFM not between", value1, value2, "GLOFM");
            return (Criteria) this;
        }

        public Criteria andGLD200IsNull() {
            addCriterion("GLD200 is null");
            return (Criteria) this;
        }

        public Criteria andGLD200IsNotNull() {
            addCriterion("GLD200 is not null");
            return (Criteria) this;
        }

        public Criteria andGLD200EqualTo(String value) {
            addCriterion("GLD200 =", value, "GLD200");
            return (Criteria) this;
        }

        public Criteria andGLD200NotEqualTo(String value) {
            addCriterion("GLD200 <>", value, "GLD200");
            return (Criteria) this;
        }

        public Criteria andGLD200GreaterThan(String value) {
            addCriterion("GLD200 >", value, "GLD200");
            return (Criteria) this;
        }

        public Criteria andGLD200GreaterThanOrEqualTo(String value) {
            addCriterion("GLD200 >=", value, "GLD200");
            return (Criteria) this;
        }

        public Criteria andGLD200LessThan(String value) {
            addCriterion("GLD200 <", value, "GLD200");
            return (Criteria) this;
        }

        public Criteria andGLD200LessThanOrEqualTo(String value) {
            addCriterion("GLD200 <=", value, "GLD200");
            return (Criteria) this;
        }

        public Criteria andGLD200Like(String value) {
            addCriterion("GLD200 like", value, "GLD200");
            return (Criteria) this;
        }

        public Criteria andGLD200NotLike(String value) {
            addCriterion("GLD200 not like", value, "GLD200");
            return (Criteria) this;
        }

        public Criteria andGLD200In(List<String> values) {
            addCriterion("GLD200 in", values, "GLD200");
            return (Criteria) this;
        }

        public Criteria andGLD200NotIn(List<String> values) {
            addCriterion("GLD200 not in", values, "GLD200");
            return (Criteria) this;
        }

        public Criteria andGLD200Between(String value1, String value2) {
            addCriterion("GLD200 between", value1, value2, "GLD200");
            return (Criteria) this;
        }

        public Criteria andGLD200NotBetween(String value1, String value2) {
            addCriterion("GLD200 not between", value1, value2, "GLD200");
            return (Criteria) this;
        }

        public Criteria andGLAGIsNull() {
            addCriterion("GLAG is null");
            return (Criteria) this;
        }

        public Criteria andGLAGIsNotNull() {
            addCriterion("GLAG is not null");
            return (Criteria) this;
        }

        public Criteria andGLAGEqualTo(BigDecimal value) {
            addCriterion("GLAG =", value, "GLAG");
            return (Criteria) this;
        }

        public Criteria andGLAGNotEqualTo(BigDecimal value) {
            addCriterion("GLAG <>", value, "GLAG");
            return (Criteria) this;
        }

        public Criteria andGLAGGreaterThan(BigDecimal value) {
            addCriterion("GLAG >", value, "GLAG");
            return (Criteria) this;
        }

        public Criteria andGLAGGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLAG >=", value, "GLAG");
            return (Criteria) this;
        }

        public Criteria andGLAGLessThan(BigDecimal value) {
            addCriterion("GLAG <", value, "GLAG");
            return (Criteria) this;
        }

        public Criteria andGLAGLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLAG <=", value, "GLAG");
            return (Criteria) this;
        }

        public Criteria andGLAGIn(List<BigDecimal> values) {
            addCriterion("GLAG in", values, "GLAG");
            return (Criteria) this;
        }

        public Criteria andGLAGNotIn(List<BigDecimal> values) {
            addCriterion("GLAG not in", values, "GLAG");
            return (Criteria) this;
        }

        public Criteria andGLAGBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLAG between", value1, value2, "GLAG");
            return (Criteria) this;
        }

        public Criteria andGLAGNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLAG not between", value1, value2, "GLAG");
            return (Criteria) this;
        }

        public Criteria andGLAAPIsNull() {
            addCriterion("GLAAP is null");
            return (Criteria) this;
        }

        public Criteria andGLAAPIsNotNull() {
            addCriterion("GLAAP is not null");
            return (Criteria) this;
        }

        public Criteria andGLAAPEqualTo(BigDecimal value) {
            addCriterion("GLAAP =", value, "GLAAP");
            return (Criteria) this;
        }

        public Criteria andGLAAPNotEqualTo(BigDecimal value) {
            addCriterion("GLAAP <>", value, "GLAAP");
            return (Criteria) this;
        }

        public Criteria andGLAAPGreaterThan(BigDecimal value) {
            addCriterion("GLAAP >", value, "GLAAP");
            return (Criteria) this;
        }

        public Criteria andGLAAPGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLAAP >=", value, "GLAAP");
            return (Criteria) this;
        }

        public Criteria andGLAAPLessThan(BigDecimal value) {
            addCriterion("GLAAP <", value, "GLAAP");
            return (Criteria) this;
        }

        public Criteria andGLAAPLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLAAP <=", value, "GLAAP");
            return (Criteria) this;
        }

        public Criteria andGLAAPIn(List<BigDecimal> values) {
            addCriterion("GLAAP in", values, "GLAAP");
            return (Criteria) this;
        }

        public Criteria andGLAAPNotIn(List<BigDecimal> values) {
            addCriterion("GLAAP not in", values, "GLAAP");
            return (Criteria) this;
        }

        public Criteria andGLAAPBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLAAP between", value1, value2, "GLAAP");
            return (Criteria) this;
        }

        public Criteria andGLAAPNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLAAP not between", value1, value2, "GLAAP");
            return (Criteria) this;
        }

        public Criteria andGLEV01IsNull() {
            addCriterion("GLEV01 is null");
            return (Criteria) this;
        }

        public Criteria andGLEV01IsNotNull() {
            addCriterion("GLEV01 is not null");
            return (Criteria) this;
        }

        public Criteria andGLEV01EqualTo(String value) {
            addCriterion("GLEV01 =", value, "GLEV01");
            return (Criteria) this;
        }

        public Criteria andGLEV01NotEqualTo(String value) {
            addCriterion("GLEV01 <>", value, "GLEV01");
            return (Criteria) this;
        }

        public Criteria andGLEV01GreaterThan(String value) {
            addCriterion("GLEV01 >", value, "GLEV01");
            return (Criteria) this;
        }

        public Criteria andGLEV01GreaterThanOrEqualTo(String value) {
            addCriterion("GLEV01 >=", value, "GLEV01");
            return (Criteria) this;
        }

        public Criteria andGLEV01LessThan(String value) {
            addCriterion("GLEV01 <", value, "GLEV01");
            return (Criteria) this;
        }

        public Criteria andGLEV01LessThanOrEqualTo(String value) {
            addCriterion("GLEV01 <=", value, "GLEV01");
            return (Criteria) this;
        }

        public Criteria andGLEV01Like(String value) {
            addCriterion("GLEV01 like", value, "GLEV01");
            return (Criteria) this;
        }

        public Criteria andGLEV01NotLike(String value) {
            addCriterion("GLEV01 not like", value, "GLEV01");
            return (Criteria) this;
        }

        public Criteria andGLEV01In(List<String> values) {
            addCriterion("GLEV01 in", values, "GLEV01");
            return (Criteria) this;
        }

        public Criteria andGLEV01NotIn(List<String> values) {
            addCriterion("GLEV01 not in", values, "GLEV01");
            return (Criteria) this;
        }

        public Criteria andGLEV01Between(String value1, String value2) {
            addCriterion("GLEV01 between", value1, value2, "GLEV01");
            return (Criteria) this;
        }

        public Criteria andGLEV01NotBetween(String value1, String value2) {
            addCriterion("GLEV01 not between", value1, value2, "GLEV01");
            return (Criteria) this;
        }

        public Criteria andGLEV02IsNull() {
            addCriterion("GLEV02 is null");
            return (Criteria) this;
        }

        public Criteria andGLEV02IsNotNull() {
            addCriterion("GLEV02 is not null");
            return (Criteria) this;
        }

        public Criteria andGLEV02EqualTo(String value) {
            addCriterion("GLEV02 =", value, "GLEV02");
            return (Criteria) this;
        }

        public Criteria andGLEV02NotEqualTo(String value) {
            addCriterion("GLEV02 <>", value, "GLEV02");
            return (Criteria) this;
        }

        public Criteria andGLEV02GreaterThan(String value) {
            addCriterion("GLEV02 >", value, "GLEV02");
            return (Criteria) this;
        }

        public Criteria andGLEV02GreaterThanOrEqualTo(String value) {
            addCriterion("GLEV02 >=", value, "GLEV02");
            return (Criteria) this;
        }

        public Criteria andGLEV02LessThan(String value) {
            addCriterion("GLEV02 <", value, "GLEV02");
            return (Criteria) this;
        }

        public Criteria andGLEV02LessThanOrEqualTo(String value) {
            addCriterion("GLEV02 <=", value, "GLEV02");
            return (Criteria) this;
        }

        public Criteria andGLEV02Like(String value) {
            addCriterion("GLEV02 like", value, "GLEV02");
            return (Criteria) this;
        }

        public Criteria andGLEV02NotLike(String value) {
            addCriterion("GLEV02 not like", value, "GLEV02");
            return (Criteria) this;
        }

        public Criteria andGLEV02In(List<String> values) {
            addCriterion("GLEV02 in", values, "GLEV02");
            return (Criteria) this;
        }

        public Criteria andGLEV02NotIn(List<String> values) {
            addCriterion("GLEV02 not in", values, "GLEV02");
            return (Criteria) this;
        }

        public Criteria andGLEV02Between(String value1, String value2) {
            addCriterion("GLEV02 between", value1, value2, "GLEV02");
            return (Criteria) this;
        }

        public Criteria andGLEV02NotBetween(String value1, String value2) {
            addCriterion("GLEV02 not between", value1, value2, "GLEV02");
            return (Criteria) this;
        }

        public Criteria andGLEV03IsNull() {
            addCriterion("GLEV03 is null");
            return (Criteria) this;
        }

        public Criteria andGLEV03IsNotNull() {
            addCriterion("GLEV03 is not null");
            return (Criteria) this;
        }

        public Criteria andGLEV03EqualTo(String value) {
            addCriterion("GLEV03 =", value, "GLEV03");
            return (Criteria) this;
        }

        public Criteria andGLEV03NotEqualTo(String value) {
            addCriterion("GLEV03 <>", value, "GLEV03");
            return (Criteria) this;
        }

        public Criteria andGLEV03GreaterThan(String value) {
            addCriterion("GLEV03 >", value, "GLEV03");
            return (Criteria) this;
        }

        public Criteria andGLEV03GreaterThanOrEqualTo(String value) {
            addCriterion("GLEV03 >=", value, "GLEV03");
            return (Criteria) this;
        }

        public Criteria andGLEV03LessThan(String value) {
            addCriterion("GLEV03 <", value, "GLEV03");
            return (Criteria) this;
        }

        public Criteria andGLEV03LessThanOrEqualTo(String value) {
            addCriterion("GLEV03 <=", value, "GLEV03");
            return (Criteria) this;
        }

        public Criteria andGLEV03Like(String value) {
            addCriterion("GLEV03 like", value, "GLEV03");
            return (Criteria) this;
        }

        public Criteria andGLEV03NotLike(String value) {
            addCriterion("GLEV03 not like", value, "GLEV03");
            return (Criteria) this;
        }

        public Criteria andGLEV03In(List<String> values) {
            addCriterion("GLEV03 in", values, "GLEV03");
            return (Criteria) this;
        }

        public Criteria andGLEV03NotIn(List<String> values) {
            addCriterion("GLEV03 not in", values, "GLEV03");
            return (Criteria) this;
        }

        public Criteria andGLEV03Between(String value1, String value2) {
            addCriterion("GLEV03 between", value1, value2, "GLEV03");
            return (Criteria) this;
        }

        public Criteria andGLEV03NotBetween(String value1, String value2) {
            addCriterion("GLEV03 not between", value1, value2, "GLEV03");
            return (Criteria) this;
        }

        public Criteria andGLEV04IsNull() {
            addCriterion("GLEV04 is null");
            return (Criteria) this;
        }

        public Criteria andGLEV04IsNotNull() {
            addCriterion("GLEV04 is not null");
            return (Criteria) this;
        }

        public Criteria andGLEV04EqualTo(String value) {
            addCriterion("GLEV04 =", value, "GLEV04");
            return (Criteria) this;
        }

        public Criteria andGLEV04NotEqualTo(String value) {
            addCriterion("GLEV04 <>", value, "GLEV04");
            return (Criteria) this;
        }

        public Criteria andGLEV04GreaterThan(String value) {
            addCriterion("GLEV04 >", value, "GLEV04");
            return (Criteria) this;
        }

        public Criteria andGLEV04GreaterThanOrEqualTo(String value) {
            addCriterion("GLEV04 >=", value, "GLEV04");
            return (Criteria) this;
        }

        public Criteria andGLEV04LessThan(String value) {
            addCriterion("GLEV04 <", value, "GLEV04");
            return (Criteria) this;
        }

        public Criteria andGLEV04LessThanOrEqualTo(String value) {
            addCriterion("GLEV04 <=", value, "GLEV04");
            return (Criteria) this;
        }

        public Criteria andGLEV04Like(String value) {
            addCriterion("GLEV04 like", value, "GLEV04");
            return (Criteria) this;
        }

        public Criteria andGLEV04NotLike(String value) {
            addCriterion("GLEV04 not like", value, "GLEV04");
            return (Criteria) this;
        }

        public Criteria andGLEV04In(List<String> values) {
            addCriterion("GLEV04 in", values, "GLEV04");
            return (Criteria) this;
        }

        public Criteria andGLEV04NotIn(List<String> values) {
            addCriterion("GLEV04 not in", values, "GLEV04");
            return (Criteria) this;
        }

        public Criteria andGLEV04Between(String value1, String value2) {
            addCriterion("GLEV04 between", value1, value2, "GLEV04");
            return (Criteria) this;
        }

        public Criteria andGLEV04NotBetween(String value1, String value2) {
            addCriterion("GLEV04 not between", value1, value2, "GLEV04");
            return (Criteria) this;
        }

        public Criteria andGLEV05IsNull() {
            addCriterion("GLEV05 is null");
            return (Criteria) this;
        }

        public Criteria andGLEV05IsNotNull() {
            addCriterion("GLEV05 is not null");
            return (Criteria) this;
        }

        public Criteria andGLEV05EqualTo(String value) {
            addCriterion("GLEV05 =", value, "GLEV05");
            return (Criteria) this;
        }

        public Criteria andGLEV05NotEqualTo(String value) {
            addCriterion("GLEV05 <>", value, "GLEV05");
            return (Criteria) this;
        }

        public Criteria andGLEV05GreaterThan(String value) {
            addCriterion("GLEV05 >", value, "GLEV05");
            return (Criteria) this;
        }

        public Criteria andGLEV05GreaterThanOrEqualTo(String value) {
            addCriterion("GLEV05 >=", value, "GLEV05");
            return (Criteria) this;
        }

        public Criteria andGLEV05LessThan(String value) {
            addCriterion("GLEV05 <", value, "GLEV05");
            return (Criteria) this;
        }

        public Criteria andGLEV05LessThanOrEqualTo(String value) {
            addCriterion("GLEV05 <=", value, "GLEV05");
            return (Criteria) this;
        }

        public Criteria andGLEV05Like(String value) {
            addCriterion("GLEV05 like", value, "GLEV05");
            return (Criteria) this;
        }

        public Criteria andGLEV05NotLike(String value) {
            addCriterion("GLEV05 not like", value, "GLEV05");
            return (Criteria) this;
        }

        public Criteria andGLEV05In(List<String> values) {
            addCriterion("GLEV05 in", values, "GLEV05");
            return (Criteria) this;
        }

        public Criteria andGLEV05NotIn(List<String> values) {
            addCriterion("GLEV05 not in", values, "GLEV05");
            return (Criteria) this;
        }

        public Criteria andGLEV05Between(String value1, String value2) {
            addCriterion("GLEV05 between", value1, value2, "GLEV05");
            return (Criteria) this;
        }

        public Criteria andGLEV05NotBetween(String value1, String value2) {
            addCriterion("GLEV05 not between", value1, value2, "GLEV05");
            return (Criteria) this;
        }

        public Criteria andGLD1IsNull() {
            addCriterion("GLD1 is null");
            return (Criteria) this;
        }

        public Criteria andGLD1IsNotNull() {
            addCriterion("GLD1 is not null");
            return (Criteria) this;
        }

        public Criteria andGLD1EqualTo(Integer value) {
            addCriterion("GLD1 =", value, "GLD1");
            return (Criteria) this;
        }

        public Criteria andGLD1NotEqualTo(Integer value) {
            addCriterion("GLD1 <>", value, "GLD1");
            return (Criteria) this;
        }

        public Criteria andGLD1GreaterThan(Integer value) {
            addCriterion("GLD1 >", value, "GLD1");
            return (Criteria) this;
        }

        public Criteria andGLD1GreaterThanOrEqualTo(Integer value) {
            addCriterion("GLD1 >=", value, "GLD1");
            return (Criteria) this;
        }

        public Criteria andGLD1LessThan(Integer value) {
            addCriterion("GLD1 <", value, "GLD1");
            return (Criteria) this;
        }

        public Criteria andGLD1LessThanOrEqualTo(Integer value) {
            addCriterion("GLD1 <=", value, "GLD1");
            return (Criteria) this;
        }

        public Criteria andGLD1In(List<Integer> values) {
            addCriterion("GLD1 in", values, "GLD1");
            return (Criteria) this;
        }

        public Criteria andGLD1NotIn(List<Integer> values) {
            addCriterion("GLD1 not in", values, "GLD1");
            return (Criteria) this;
        }

        public Criteria andGLD1Between(Integer value1, Integer value2) {
            addCriterion("GLD1 between", value1, value2, "GLD1");
            return (Criteria) this;
        }

        public Criteria andGLD1NotBetween(Integer value1, Integer value2) {
            addCriterion("GLD1 not between", value1, value2, "GLD1");
            return (Criteria) this;
        }

        public Criteria andGLD2IsNull() {
            addCriterion("GLD2 is null");
            return (Criteria) this;
        }

        public Criteria andGLD2IsNotNull() {
            addCriterion("GLD2 is not null");
            return (Criteria) this;
        }

        public Criteria andGLD2EqualTo(Integer value) {
            addCriterion("GLD2 =", value, "GLD2");
            return (Criteria) this;
        }

        public Criteria andGLD2NotEqualTo(Integer value) {
            addCriterion("GLD2 <>", value, "GLD2");
            return (Criteria) this;
        }

        public Criteria andGLD2GreaterThan(Integer value) {
            addCriterion("GLD2 >", value, "GLD2");
            return (Criteria) this;
        }

        public Criteria andGLD2GreaterThanOrEqualTo(Integer value) {
            addCriterion("GLD2 >=", value, "GLD2");
            return (Criteria) this;
        }

        public Criteria andGLD2LessThan(Integer value) {
            addCriterion("GLD2 <", value, "GLD2");
            return (Criteria) this;
        }

        public Criteria andGLD2LessThanOrEqualTo(Integer value) {
            addCriterion("GLD2 <=", value, "GLD2");
            return (Criteria) this;
        }

        public Criteria andGLD2In(List<Integer> values) {
            addCriterion("GLD2 in", values, "GLD2");
            return (Criteria) this;
        }

        public Criteria andGLD2NotIn(List<Integer> values) {
            addCriterion("GLD2 not in", values, "GLD2");
            return (Criteria) this;
        }

        public Criteria andGLD2Between(Integer value1, Integer value2) {
            addCriterion("GLD2 between", value1, value2, "GLD2");
            return (Criteria) this;
        }

        public Criteria andGLD2NotBetween(Integer value1, Integer value2) {
            addCriterion("GLD2 not between", value1, value2, "GLD2");
            return (Criteria) this;
        }

        public Criteria andGLD3IsNull() {
            addCriterion("GLD3 is null");
            return (Criteria) this;
        }

        public Criteria andGLD3IsNotNull() {
            addCriterion("GLD3 is not null");
            return (Criteria) this;
        }

        public Criteria andGLD3EqualTo(Integer value) {
            addCriterion("GLD3 =", value, "GLD3");
            return (Criteria) this;
        }

        public Criteria andGLD3NotEqualTo(Integer value) {
            addCriterion("GLD3 <>", value, "GLD3");
            return (Criteria) this;
        }

        public Criteria andGLD3GreaterThan(Integer value) {
            addCriterion("GLD3 >", value, "GLD3");
            return (Criteria) this;
        }

        public Criteria andGLD3GreaterThanOrEqualTo(Integer value) {
            addCriterion("GLD3 >=", value, "GLD3");
            return (Criteria) this;
        }

        public Criteria andGLD3LessThan(Integer value) {
            addCriterion("GLD3 <", value, "GLD3");
            return (Criteria) this;
        }

        public Criteria andGLD3LessThanOrEqualTo(Integer value) {
            addCriterion("GLD3 <=", value, "GLD3");
            return (Criteria) this;
        }

        public Criteria andGLD3In(List<Integer> values) {
            addCriterion("GLD3 in", values, "GLD3");
            return (Criteria) this;
        }

        public Criteria andGLD3NotIn(List<Integer> values) {
            addCriterion("GLD3 not in", values, "GLD3");
            return (Criteria) this;
        }

        public Criteria andGLD3Between(Integer value1, Integer value2) {
            addCriterion("GLD3 between", value1, value2, "GLD3");
            return (Criteria) this;
        }

        public Criteria andGLD3NotBetween(Integer value1, Integer value2) {
            addCriterion("GLD3 not between", value1, value2, "GLD3");
            return (Criteria) this;
        }

        public Criteria andGLD4IsNull() {
            addCriterion("GLD4 is null");
            return (Criteria) this;
        }

        public Criteria andGLD4IsNotNull() {
            addCriterion("GLD4 is not null");
            return (Criteria) this;
        }

        public Criteria andGLD4EqualTo(Integer value) {
            addCriterion("GLD4 =", value, "GLD4");
            return (Criteria) this;
        }

        public Criteria andGLD4NotEqualTo(Integer value) {
            addCriterion("GLD4 <>", value, "GLD4");
            return (Criteria) this;
        }

        public Criteria andGLD4GreaterThan(Integer value) {
            addCriterion("GLD4 >", value, "GLD4");
            return (Criteria) this;
        }

        public Criteria andGLD4GreaterThanOrEqualTo(Integer value) {
            addCriterion("GLD4 >=", value, "GLD4");
            return (Criteria) this;
        }

        public Criteria andGLD4LessThan(Integer value) {
            addCriterion("GLD4 <", value, "GLD4");
            return (Criteria) this;
        }

        public Criteria andGLD4LessThanOrEqualTo(Integer value) {
            addCriterion("GLD4 <=", value, "GLD4");
            return (Criteria) this;
        }

        public Criteria andGLD4In(List<Integer> values) {
            addCriterion("GLD4 in", values, "GLD4");
            return (Criteria) this;
        }

        public Criteria andGLD4NotIn(List<Integer> values) {
            addCriterion("GLD4 not in", values, "GLD4");
            return (Criteria) this;
        }

        public Criteria andGLD4Between(Integer value1, Integer value2) {
            addCriterion("GLD4 between", value1, value2, "GLD4");
            return (Criteria) this;
        }

        public Criteria andGLD4NotBetween(Integer value1, Integer value2) {
            addCriterion("GLD4 not between", value1, value2, "GLD4");
            return (Criteria) this;
        }

        public Criteria andGLD5IsNull() {
            addCriterion("GLD5 is null");
            return (Criteria) this;
        }

        public Criteria andGLD5IsNotNull() {
            addCriterion("GLD5 is not null");
            return (Criteria) this;
        }

        public Criteria andGLD5EqualTo(Integer value) {
            addCriterion("GLD5 =", value, "GLD5");
            return (Criteria) this;
        }

        public Criteria andGLD5NotEqualTo(Integer value) {
            addCriterion("GLD5 <>", value, "GLD5");
            return (Criteria) this;
        }

        public Criteria andGLD5GreaterThan(Integer value) {
            addCriterion("GLD5 >", value, "GLD5");
            return (Criteria) this;
        }

        public Criteria andGLD5GreaterThanOrEqualTo(Integer value) {
            addCriterion("GLD5 >=", value, "GLD5");
            return (Criteria) this;
        }

        public Criteria andGLD5LessThan(Integer value) {
            addCriterion("GLD5 <", value, "GLD5");
            return (Criteria) this;
        }

        public Criteria andGLD5LessThanOrEqualTo(Integer value) {
            addCriterion("GLD5 <=", value, "GLD5");
            return (Criteria) this;
        }

        public Criteria andGLD5In(List<Integer> values) {
            addCriterion("GLD5 in", values, "GLD5");
            return (Criteria) this;
        }

        public Criteria andGLD5NotIn(List<Integer> values) {
            addCriterion("GLD5 not in", values, "GLD5");
            return (Criteria) this;
        }

        public Criteria andGLD5Between(Integer value1, Integer value2) {
            addCriterion("GLD5 between", value1, value2, "GLD5");
            return (Criteria) this;
        }

        public Criteria andGLD5NotBetween(Integer value1, Integer value2) {
            addCriterion("GLD5 not between", value1, value2, "GLD5");
            return (Criteria) this;
        }

        public Criteria andGLSRP1IsNull() {
            addCriterion("GLSRP1 is null");
            return (Criteria) this;
        }

        public Criteria andGLSRP1IsNotNull() {
            addCriterion("GLSRP1 is not null");
            return (Criteria) this;
        }

        public Criteria andGLSRP1EqualTo(String value) {
            addCriterion("GLSRP1 =", value, "GLSRP1");
            return (Criteria) this;
        }

        public Criteria andGLSRP1NotEqualTo(String value) {
            addCriterion("GLSRP1 <>", value, "GLSRP1");
            return (Criteria) this;
        }

        public Criteria andGLSRP1GreaterThan(String value) {
            addCriterion("GLSRP1 >", value, "GLSRP1");
            return (Criteria) this;
        }

        public Criteria andGLSRP1GreaterThanOrEqualTo(String value) {
            addCriterion("GLSRP1 >=", value, "GLSRP1");
            return (Criteria) this;
        }

        public Criteria andGLSRP1LessThan(String value) {
            addCriterion("GLSRP1 <", value, "GLSRP1");
            return (Criteria) this;
        }

        public Criteria andGLSRP1LessThanOrEqualTo(String value) {
            addCriterion("GLSRP1 <=", value, "GLSRP1");
            return (Criteria) this;
        }

        public Criteria andGLSRP1Like(String value) {
            addCriterion("GLSRP1 like", value, "GLSRP1");
            return (Criteria) this;
        }

        public Criteria andGLSRP1NotLike(String value) {
            addCriterion("GLSRP1 not like", value, "GLSRP1");
            return (Criteria) this;
        }

        public Criteria andGLSRP1In(List<String> values) {
            addCriterion("GLSRP1 in", values, "GLSRP1");
            return (Criteria) this;
        }

        public Criteria andGLSRP1NotIn(List<String> values) {
            addCriterion("GLSRP1 not in", values, "GLSRP1");
            return (Criteria) this;
        }

        public Criteria andGLSRP1Between(String value1, String value2) {
            addCriterion("GLSRP1 between", value1, value2, "GLSRP1");
            return (Criteria) this;
        }

        public Criteria andGLSRP1NotBetween(String value1, String value2) {
            addCriterion("GLSRP1 not between", value1, value2, "GLSRP1");
            return (Criteria) this;
        }

        public Criteria andGLSRP2IsNull() {
            addCriterion("GLSRP2 is null");
            return (Criteria) this;
        }

        public Criteria andGLSRP2IsNotNull() {
            addCriterion("GLSRP2 is not null");
            return (Criteria) this;
        }

        public Criteria andGLSRP2EqualTo(String value) {
            addCriterion("GLSRP2 =", value, "GLSRP2");
            return (Criteria) this;
        }

        public Criteria andGLSRP2NotEqualTo(String value) {
            addCriterion("GLSRP2 <>", value, "GLSRP2");
            return (Criteria) this;
        }

        public Criteria andGLSRP2GreaterThan(String value) {
            addCriterion("GLSRP2 >", value, "GLSRP2");
            return (Criteria) this;
        }

        public Criteria andGLSRP2GreaterThanOrEqualTo(String value) {
            addCriterion("GLSRP2 >=", value, "GLSRP2");
            return (Criteria) this;
        }

        public Criteria andGLSRP2LessThan(String value) {
            addCriterion("GLSRP2 <", value, "GLSRP2");
            return (Criteria) this;
        }

        public Criteria andGLSRP2LessThanOrEqualTo(String value) {
            addCriterion("GLSRP2 <=", value, "GLSRP2");
            return (Criteria) this;
        }

        public Criteria andGLSRP2Like(String value) {
            addCriterion("GLSRP2 like", value, "GLSRP2");
            return (Criteria) this;
        }

        public Criteria andGLSRP2NotLike(String value) {
            addCriterion("GLSRP2 not like", value, "GLSRP2");
            return (Criteria) this;
        }

        public Criteria andGLSRP2In(List<String> values) {
            addCriterion("GLSRP2 in", values, "GLSRP2");
            return (Criteria) this;
        }

        public Criteria andGLSRP2NotIn(List<String> values) {
            addCriterion("GLSRP2 not in", values, "GLSRP2");
            return (Criteria) this;
        }

        public Criteria andGLSRP2Between(String value1, String value2) {
            addCriterion("GLSRP2 between", value1, value2, "GLSRP2");
            return (Criteria) this;
        }

        public Criteria andGLSRP2NotBetween(String value1, String value2) {
            addCriterion("GLSRP2 not between", value1, value2, "GLSRP2");
            return (Criteria) this;
        }

        public Criteria andGLSRP3IsNull() {
            addCriterion("GLSRP3 is null");
            return (Criteria) this;
        }

        public Criteria andGLSRP3IsNotNull() {
            addCriterion("GLSRP3 is not null");
            return (Criteria) this;
        }

        public Criteria andGLSRP3EqualTo(String value) {
            addCriterion("GLSRP3 =", value, "GLSRP3");
            return (Criteria) this;
        }

        public Criteria andGLSRP3NotEqualTo(String value) {
            addCriterion("GLSRP3 <>", value, "GLSRP3");
            return (Criteria) this;
        }

        public Criteria andGLSRP3GreaterThan(String value) {
            addCriterion("GLSRP3 >", value, "GLSRP3");
            return (Criteria) this;
        }

        public Criteria andGLSRP3GreaterThanOrEqualTo(String value) {
            addCriterion("GLSRP3 >=", value, "GLSRP3");
            return (Criteria) this;
        }

        public Criteria andGLSRP3LessThan(String value) {
            addCriterion("GLSRP3 <", value, "GLSRP3");
            return (Criteria) this;
        }

        public Criteria andGLSRP3LessThanOrEqualTo(String value) {
            addCriterion("GLSRP3 <=", value, "GLSRP3");
            return (Criteria) this;
        }

        public Criteria andGLSRP3Like(String value) {
            addCriterion("GLSRP3 like", value, "GLSRP3");
            return (Criteria) this;
        }

        public Criteria andGLSRP3NotLike(String value) {
            addCriterion("GLSRP3 not like", value, "GLSRP3");
            return (Criteria) this;
        }

        public Criteria andGLSRP3In(List<String> values) {
            addCriterion("GLSRP3 in", values, "GLSRP3");
            return (Criteria) this;
        }

        public Criteria andGLSRP3NotIn(List<String> values) {
            addCriterion("GLSRP3 not in", values, "GLSRP3");
            return (Criteria) this;
        }

        public Criteria andGLSRP3Between(String value1, String value2) {
            addCriterion("GLSRP3 between", value1, value2, "GLSRP3");
            return (Criteria) this;
        }

        public Criteria andGLSRP3NotBetween(String value1, String value2) {
            addCriterion("GLSRP3 not between", value1, value2, "GLSRP3");
            return (Criteria) this;
        }

        public Criteria andGLSRP4IsNull() {
            addCriterion("GLSRP4 is null");
            return (Criteria) this;
        }

        public Criteria andGLSRP4IsNotNull() {
            addCriterion("GLSRP4 is not null");
            return (Criteria) this;
        }

        public Criteria andGLSRP4EqualTo(String value) {
            addCriterion("GLSRP4 =", value, "GLSRP4");
            return (Criteria) this;
        }

        public Criteria andGLSRP4NotEqualTo(String value) {
            addCriterion("GLSRP4 <>", value, "GLSRP4");
            return (Criteria) this;
        }

        public Criteria andGLSRP4GreaterThan(String value) {
            addCriterion("GLSRP4 >", value, "GLSRP4");
            return (Criteria) this;
        }

        public Criteria andGLSRP4GreaterThanOrEqualTo(String value) {
            addCriterion("GLSRP4 >=", value, "GLSRP4");
            return (Criteria) this;
        }

        public Criteria andGLSRP4LessThan(String value) {
            addCriterion("GLSRP4 <", value, "GLSRP4");
            return (Criteria) this;
        }

        public Criteria andGLSRP4LessThanOrEqualTo(String value) {
            addCriterion("GLSRP4 <=", value, "GLSRP4");
            return (Criteria) this;
        }

        public Criteria andGLSRP4Like(String value) {
            addCriterion("GLSRP4 like", value, "GLSRP4");
            return (Criteria) this;
        }

        public Criteria andGLSRP4NotLike(String value) {
            addCriterion("GLSRP4 not like", value, "GLSRP4");
            return (Criteria) this;
        }

        public Criteria andGLSRP4In(List<String> values) {
            addCriterion("GLSRP4 in", values, "GLSRP4");
            return (Criteria) this;
        }

        public Criteria andGLSRP4NotIn(List<String> values) {
            addCriterion("GLSRP4 not in", values, "GLSRP4");
            return (Criteria) this;
        }

        public Criteria andGLSRP4Between(String value1, String value2) {
            addCriterion("GLSRP4 between", value1, value2, "GLSRP4");
            return (Criteria) this;
        }

        public Criteria andGLSRP4NotBetween(String value1, String value2) {
            addCriterion("GLSRP4 not between", value1, value2, "GLSRP4");
            return (Criteria) this;
        }

        public Criteria andGLSRP5IsNull() {
            addCriterion("GLSRP5 is null");
            return (Criteria) this;
        }

        public Criteria andGLSRP5IsNotNull() {
            addCriterion("GLSRP5 is not null");
            return (Criteria) this;
        }

        public Criteria andGLSRP5EqualTo(String value) {
            addCriterion("GLSRP5 =", value, "GLSRP5");
            return (Criteria) this;
        }

        public Criteria andGLSRP5NotEqualTo(String value) {
            addCriterion("GLSRP5 <>", value, "GLSRP5");
            return (Criteria) this;
        }

        public Criteria andGLSRP5GreaterThan(String value) {
            addCriterion("GLSRP5 >", value, "GLSRP5");
            return (Criteria) this;
        }

        public Criteria andGLSRP5GreaterThanOrEqualTo(String value) {
            addCriterion("GLSRP5 >=", value, "GLSRP5");
            return (Criteria) this;
        }

        public Criteria andGLSRP5LessThan(String value) {
            addCriterion("GLSRP5 <", value, "GLSRP5");
            return (Criteria) this;
        }

        public Criteria andGLSRP5LessThanOrEqualTo(String value) {
            addCriterion("GLSRP5 <=", value, "GLSRP5");
            return (Criteria) this;
        }

        public Criteria andGLSRP5Like(String value) {
            addCriterion("GLSRP5 like", value, "GLSRP5");
            return (Criteria) this;
        }

        public Criteria andGLSRP5NotLike(String value) {
            addCriterion("GLSRP5 not like", value, "GLSRP5");
            return (Criteria) this;
        }

        public Criteria andGLSRP5In(List<String> values) {
            addCriterion("GLSRP5 in", values, "GLSRP5");
            return (Criteria) this;
        }

        public Criteria andGLSRP5NotIn(List<String> values) {
            addCriterion("GLSRP5 not in", values, "GLSRP5");
            return (Criteria) this;
        }

        public Criteria andGLSRP5Between(String value1, String value2) {
            addCriterion("GLSRP5 between", value1, value2, "GLSRP5");
            return (Criteria) this;
        }

        public Criteria andGLSRP5NotBetween(String value1, String value2) {
            addCriterion("GLSRP5 not between", value1, value2, "GLSRP5");
            return (Criteria) this;
        }

        public Criteria andGLDL01IsNull() {
            addCriterion("GLDL01 is null");
            return (Criteria) this;
        }

        public Criteria andGLDL01IsNotNull() {
            addCriterion("GLDL01 is not null");
            return (Criteria) this;
        }

        public Criteria andGLDL01EqualTo(String value) {
            addCriterion("GLDL01 =", value, "GLDL01");
            return (Criteria) this;
        }

        public Criteria andGLDL01NotEqualTo(String value) {
            addCriterion("GLDL01 <>", value, "GLDL01");
            return (Criteria) this;
        }

        public Criteria andGLDL01GreaterThan(String value) {
            addCriterion("GLDL01 >", value, "GLDL01");
            return (Criteria) this;
        }

        public Criteria andGLDL01GreaterThanOrEqualTo(String value) {
            addCriterion("GLDL01 >=", value, "GLDL01");
            return (Criteria) this;
        }

        public Criteria andGLDL01LessThan(String value) {
            addCriterion("GLDL01 <", value, "GLDL01");
            return (Criteria) this;
        }

        public Criteria andGLDL01LessThanOrEqualTo(String value) {
            addCriterion("GLDL01 <=", value, "GLDL01");
            return (Criteria) this;
        }

        public Criteria andGLDL01Like(String value) {
            addCriterion("GLDL01 like", value, "GLDL01");
            return (Criteria) this;
        }

        public Criteria andGLDL01NotLike(String value) {
            addCriterion("GLDL01 not like", value, "GLDL01");
            return (Criteria) this;
        }

        public Criteria andGLDL01In(List<String> values) {
            addCriterion("GLDL01 in", values, "GLDL01");
            return (Criteria) this;
        }

        public Criteria andGLDL01NotIn(List<String> values) {
            addCriterion("GLDL01 not in", values, "GLDL01");
            return (Criteria) this;
        }

        public Criteria andGLDL01Between(String value1, String value2) {
            addCriterion("GLDL01 between", value1, value2, "GLDL01");
            return (Criteria) this;
        }

        public Criteria andGLDL01NotBetween(String value1, String value2) {
            addCriterion("GLDL01 not between", value1, value2, "GLDL01");
            return (Criteria) this;
        }

        public Criteria andGLDL02IsNull() {
            addCriterion("GLDL02 is null");
            return (Criteria) this;
        }

        public Criteria andGLDL02IsNotNull() {
            addCriterion("GLDL02 is not null");
            return (Criteria) this;
        }

        public Criteria andGLDL02EqualTo(String value) {
            addCriterion("GLDL02 =", value, "GLDL02");
            return (Criteria) this;
        }

        public Criteria andGLDL02NotEqualTo(String value) {
            addCriterion("GLDL02 <>", value, "GLDL02");
            return (Criteria) this;
        }

        public Criteria andGLDL02GreaterThan(String value) {
            addCriterion("GLDL02 >", value, "GLDL02");
            return (Criteria) this;
        }

        public Criteria andGLDL02GreaterThanOrEqualTo(String value) {
            addCriterion("GLDL02 >=", value, "GLDL02");
            return (Criteria) this;
        }

        public Criteria andGLDL02LessThan(String value) {
            addCriterion("GLDL02 <", value, "GLDL02");
            return (Criteria) this;
        }

        public Criteria andGLDL02LessThanOrEqualTo(String value) {
            addCriterion("GLDL02 <=", value, "GLDL02");
            return (Criteria) this;
        }

        public Criteria andGLDL02Like(String value) {
            addCriterion("GLDL02 like", value, "GLDL02");
            return (Criteria) this;
        }

        public Criteria andGLDL02NotLike(String value) {
            addCriterion("GLDL02 not like", value, "GLDL02");
            return (Criteria) this;
        }

        public Criteria andGLDL02In(List<String> values) {
            addCriterion("GLDL02 in", values, "GLDL02");
            return (Criteria) this;
        }

        public Criteria andGLDL02NotIn(List<String> values) {
            addCriterion("GLDL02 not in", values, "GLDL02");
            return (Criteria) this;
        }

        public Criteria andGLDL02Between(String value1, String value2) {
            addCriterion("GLDL02 between", value1, value2, "GLDL02");
            return (Criteria) this;
        }

        public Criteria andGLDL02NotBetween(String value1, String value2) {
            addCriterion("GLDL02 not between", value1, value2, "GLDL02");
            return (Criteria) this;
        }

        public Criteria andGLDL03IsNull() {
            addCriterion("GLDL03 is null");
            return (Criteria) this;
        }

        public Criteria andGLDL03IsNotNull() {
            addCriterion("GLDL03 is not null");
            return (Criteria) this;
        }

        public Criteria andGLDL03EqualTo(String value) {
            addCriterion("GLDL03 =", value, "GLDL03");
            return (Criteria) this;
        }

        public Criteria andGLDL03NotEqualTo(String value) {
            addCriterion("GLDL03 <>", value, "GLDL03");
            return (Criteria) this;
        }

        public Criteria andGLDL03GreaterThan(String value) {
            addCriterion("GLDL03 >", value, "GLDL03");
            return (Criteria) this;
        }

        public Criteria andGLDL03GreaterThanOrEqualTo(String value) {
            addCriterion("GLDL03 >=", value, "GLDL03");
            return (Criteria) this;
        }

        public Criteria andGLDL03LessThan(String value) {
            addCriterion("GLDL03 <", value, "GLDL03");
            return (Criteria) this;
        }

        public Criteria andGLDL03LessThanOrEqualTo(String value) {
            addCriterion("GLDL03 <=", value, "GLDL03");
            return (Criteria) this;
        }

        public Criteria andGLDL03Like(String value) {
            addCriterion("GLDL03 like", value, "GLDL03");
            return (Criteria) this;
        }

        public Criteria andGLDL03NotLike(String value) {
            addCriterion("GLDL03 not like", value, "GLDL03");
            return (Criteria) this;
        }

        public Criteria andGLDL03In(List<String> values) {
            addCriterion("GLDL03 in", values, "GLDL03");
            return (Criteria) this;
        }

        public Criteria andGLDL03NotIn(List<String> values) {
            addCriterion("GLDL03 not in", values, "GLDL03");
            return (Criteria) this;
        }

        public Criteria andGLDL03Between(String value1, String value2) {
            addCriterion("GLDL03 between", value1, value2, "GLDL03");
            return (Criteria) this;
        }

        public Criteria andGLDL03NotBetween(String value1, String value2) {
            addCriterion("GLDL03 not between", value1, value2, "GLDL03");
            return (Criteria) this;
        }

        public Criteria andGLDL04IsNull() {
            addCriterion("GLDL04 is null");
            return (Criteria) this;
        }

        public Criteria andGLDL04IsNotNull() {
            addCriterion("GLDL04 is not null");
            return (Criteria) this;
        }

        public Criteria andGLDL04EqualTo(String value) {
            addCriterion("GLDL04 =", value, "GLDL04");
            return (Criteria) this;
        }

        public Criteria andGLDL04NotEqualTo(String value) {
            addCriterion("GLDL04 <>", value, "GLDL04");
            return (Criteria) this;
        }

        public Criteria andGLDL04GreaterThan(String value) {
            addCriterion("GLDL04 >", value, "GLDL04");
            return (Criteria) this;
        }

        public Criteria andGLDL04GreaterThanOrEqualTo(String value) {
            addCriterion("GLDL04 >=", value, "GLDL04");
            return (Criteria) this;
        }

        public Criteria andGLDL04LessThan(String value) {
            addCriterion("GLDL04 <", value, "GLDL04");
            return (Criteria) this;
        }

        public Criteria andGLDL04LessThanOrEqualTo(String value) {
            addCriterion("GLDL04 <=", value, "GLDL04");
            return (Criteria) this;
        }

        public Criteria andGLDL04Like(String value) {
            addCriterion("GLDL04 like", value, "GLDL04");
            return (Criteria) this;
        }

        public Criteria andGLDL04NotLike(String value) {
            addCriterion("GLDL04 not like", value, "GLDL04");
            return (Criteria) this;
        }

        public Criteria andGLDL04In(List<String> values) {
            addCriterion("GLDL04 in", values, "GLDL04");
            return (Criteria) this;
        }

        public Criteria andGLDL04NotIn(List<String> values) {
            addCriterion("GLDL04 not in", values, "GLDL04");
            return (Criteria) this;
        }

        public Criteria andGLDL04Between(String value1, String value2) {
            addCriterion("GLDL04 between", value1, value2, "GLDL04");
            return (Criteria) this;
        }

        public Criteria andGLDL04NotBetween(String value1, String value2) {
            addCriterion("GLDL04 not between", value1, value2, "GLDL04");
            return (Criteria) this;
        }

        public Criteria andGLDL05IsNull() {
            addCriterion("GLDL05 is null");
            return (Criteria) this;
        }

        public Criteria andGLDL05IsNotNull() {
            addCriterion("GLDL05 is not null");
            return (Criteria) this;
        }

        public Criteria andGLDL05EqualTo(String value) {
            addCriterion("GLDL05 =", value, "GLDL05");
            return (Criteria) this;
        }

        public Criteria andGLDL05NotEqualTo(String value) {
            addCriterion("GLDL05 <>", value, "GLDL05");
            return (Criteria) this;
        }

        public Criteria andGLDL05GreaterThan(String value) {
            addCriterion("GLDL05 >", value, "GLDL05");
            return (Criteria) this;
        }

        public Criteria andGLDL05GreaterThanOrEqualTo(String value) {
            addCriterion("GLDL05 >=", value, "GLDL05");
            return (Criteria) this;
        }

        public Criteria andGLDL05LessThan(String value) {
            addCriterion("GLDL05 <", value, "GLDL05");
            return (Criteria) this;
        }

        public Criteria andGLDL05LessThanOrEqualTo(String value) {
            addCriterion("GLDL05 <=", value, "GLDL05");
            return (Criteria) this;
        }

        public Criteria andGLDL05Like(String value) {
            addCriterion("GLDL05 like", value, "GLDL05");
            return (Criteria) this;
        }

        public Criteria andGLDL05NotLike(String value) {
            addCriterion("GLDL05 not like", value, "GLDL05");
            return (Criteria) this;
        }

        public Criteria andGLDL05In(List<String> values) {
            addCriterion("GLDL05 in", values, "GLDL05");
            return (Criteria) this;
        }

        public Criteria andGLDL05NotIn(List<String> values) {
            addCriterion("GLDL05 not in", values, "GLDL05");
            return (Criteria) this;
        }

        public Criteria andGLDL05Between(String value1, String value2) {
            addCriterion("GLDL05 between", value1, value2, "GLDL05");
            return (Criteria) this;
        }

        public Criteria andGLDL05NotBetween(String value1, String value2) {
            addCriterion("GLDL05 not between", value1, value2, "GLDL05");
            return (Criteria) this;
        }

        public Criteria andGLDL06IsNull() {
            addCriterion("GLDL06 is null");
            return (Criteria) this;
        }

        public Criteria andGLDL06IsNotNull() {
            addCriterion("GLDL06 is not null");
            return (Criteria) this;
        }

        public Criteria andGLDL06EqualTo(String value) {
            addCriterion("GLDL06 =", value, "GLDL06");
            return (Criteria) this;
        }

        public Criteria andGLDL06NotEqualTo(String value) {
            addCriterion("GLDL06 <>", value, "GLDL06");
            return (Criteria) this;
        }

        public Criteria andGLDL06GreaterThan(String value) {
            addCriterion("GLDL06 >", value, "GLDL06");
            return (Criteria) this;
        }

        public Criteria andGLDL06GreaterThanOrEqualTo(String value) {
            addCriterion("GLDL06 >=", value, "GLDL06");
            return (Criteria) this;
        }

        public Criteria andGLDL06LessThan(String value) {
            addCriterion("GLDL06 <", value, "GLDL06");
            return (Criteria) this;
        }

        public Criteria andGLDL06LessThanOrEqualTo(String value) {
            addCriterion("GLDL06 <=", value, "GLDL06");
            return (Criteria) this;
        }

        public Criteria andGLDL06Like(String value) {
            addCriterion("GLDL06 like", value, "GLDL06");
            return (Criteria) this;
        }

        public Criteria andGLDL06NotLike(String value) {
            addCriterion("GLDL06 not like", value, "GLDL06");
            return (Criteria) this;
        }

        public Criteria andGLDL06In(List<String> values) {
            addCriterion("GLDL06 in", values, "GLDL06");
            return (Criteria) this;
        }

        public Criteria andGLDL06NotIn(List<String> values) {
            addCriterion("GLDL06 not in", values, "GLDL06");
            return (Criteria) this;
        }

        public Criteria andGLDL06Between(String value1, String value2) {
            addCriterion("GLDL06 between", value1, value2, "GLDL06");
            return (Criteria) this;
        }

        public Criteria andGLDL06NotBetween(String value1, String value2) {
            addCriterion("GLDL06 not between", value1, value2, "GLDL06");
            return (Criteria) this;
        }

        public Criteria andGLDL07IsNull() {
            addCriterion("GLDL07 is null");
            return (Criteria) this;
        }

        public Criteria andGLDL07IsNotNull() {
            addCriterion("GLDL07 is not null");
            return (Criteria) this;
        }

        public Criteria andGLDL07EqualTo(String value) {
            addCriterion("GLDL07 =", value, "GLDL07");
            return (Criteria) this;
        }

        public Criteria andGLDL07NotEqualTo(String value) {
            addCriterion("GLDL07 <>", value, "GLDL07");
            return (Criteria) this;
        }

        public Criteria andGLDL07GreaterThan(String value) {
            addCriterion("GLDL07 >", value, "GLDL07");
            return (Criteria) this;
        }

        public Criteria andGLDL07GreaterThanOrEqualTo(String value) {
            addCriterion("GLDL07 >=", value, "GLDL07");
            return (Criteria) this;
        }

        public Criteria andGLDL07LessThan(String value) {
            addCriterion("GLDL07 <", value, "GLDL07");
            return (Criteria) this;
        }

        public Criteria andGLDL07LessThanOrEqualTo(String value) {
            addCriterion("GLDL07 <=", value, "GLDL07");
            return (Criteria) this;
        }

        public Criteria andGLDL07Like(String value) {
            addCriterion("GLDL07 like", value, "GLDL07");
            return (Criteria) this;
        }

        public Criteria andGLDL07NotLike(String value) {
            addCriterion("GLDL07 not like", value, "GLDL07");
            return (Criteria) this;
        }

        public Criteria andGLDL07In(List<String> values) {
            addCriterion("GLDL07 in", values, "GLDL07");
            return (Criteria) this;
        }

        public Criteria andGLDL07NotIn(List<String> values) {
            addCriterion("GLDL07 not in", values, "GLDL07");
            return (Criteria) this;
        }

        public Criteria andGLDL07Between(String value1, String value2) {
            addCriterion("GLDL07 between", value1, value2, "GLDL07");
            return (Criteria) this;
        }

        public Criteria andGLDL07NotBetween(String value1, String value2) {
            addCriterion("GLDL07 not between", value1, value2, "GLDL07");
            return (Criteria) this;
        }

        public Criteria andGLDL08IsNull() {
            addCriterion("GLDL08 is null");
            return (Criteria) this;
        }

        public Criteria andGLDL08IsNotNull() {
            addCriterion("GLDL08 is not null");
            return (Criteria) this;
        }

        public Criteria andGLDL08EqualTo(String value) {
            addCriterion("GLDL08 =", value, "GLDL08");
            return (Criteria) this;
        }

        public Criteria andGLDL08NotEqualTo(String value) {
            addCriterion("GLDL08 <>", value, "GLDL08");
            return (Criteria) this;
        }

        public Criteria andGLDL08GreaterThan(String value) {
            addCriterion("GLDL08 >", value, "GLDL08");
            return (Criteria) this;
        }

        public Criteria andGLDL08GreaterThanOrEqualTo(String value) {
            addCriterion("GLDL08 >=", value, "GLDL08");
            return (Criteria) this;
        }

        public Criteria andGLDL08LessThan(String value) {
            addCriterion("GLDL08 <", value, "GLDL08");
            return (Criteria) this;
        }

        public Criteria andGLDL08LessThanOrEqualTo(String value) {
            addCriterion("GLDL08 <=", value, "GLDL08");
            return (Criteria) this;
        }

        public Criteria andGLDL08Like(String value) {
            addCriterion("GLDL08 like", value, "GLDL08");
            return (Criteria) this;
        }

        public Criteria andGLDL08NotLike(String value) {
            addCriterion("GLDL08 not like", value, "GLDL08");
            return (Criteria) this;
        }

        public Criteria andGLDL08In(List<String> values) {
            addCriterion("GLDL08 in", values, "GLDL08");
            return (Criteria) this;
        }

        public Criteria andGLDL08NotIn(List<String> values) {
            addCriterion("GLDL08 not in", values, "GLDL08");
            return (Criteria) this;
        }

        public Criteria andGLDL08Between(String value1, String value2) {
            addCriterion("GLDL08 between", value1, value2, "GLDL08");
            return (Criteria) this;
        }

        public Criteria andGLDL08NotBetween(String value1, String value2) {
            addCriterion("GLDL08 not between", value1, value2, "GLDL08");
            return (Criteria) this;
        }

        public Criteria andGLDL09IsNull() {
            addCriterion("GLDL09 is null");
            return (Criteria) this;
        }

        public Criteria andGLDL09IsNotNull() {
            addCriterion("GLDL09 is not null");
            return (Criteria) this;
        }

        public Criteria andGLDL09EqualTo(String value) {
            addCriterion("GLDL09 =", value, "GLDL09");
            return (Criteria) this;
        }

        public Criteria andGLDL09NotEqualTo(String value) {
            addCriterion("GLDL09 <>", value, "GLDL09");
            return (Criteria) this;
        }

        public Criteria andGLDL09GreaterThan(String value) {
            addCriterion("GLDL09 >", value, "GLDL09");
            return (Criteria) this;
        }

        public Criteria andGLDL09GreaterThanOrEqualTo(String value) {
            addCriterion("GLDL09 >=", value, "GLDL09");
            return (Criteria) this;
        }

        public Criteria andGLDL09LessThan(String value) {
            addCriterion("GLDL09 <", value, "GLDL09");
            return (Criteria) this;
        }

        public Criteria andGLDL09LessThanOrEqualTo(String value) {
            addCriterion("GLDL09 <=", value, "GLDL09");
            return (Criteria) this;
        }

        public Criteria andGLDL09Like(String value) {
            addCriterion("GLDL09 like", value, "GLDL09");
            return (Criteria) this;
        }

        public Criteria andGLDL09NotLike(String value) {
            addCriterion("GLDL09 not like", value, "GLDL09");
            return (Criteria) this;
        }

        public Criteria andGLDL09In(List<String> values) {
            addCriterion("GLDL09 in", values, "GLDL09");
            return (Criteria) this;
        }

        public Criteria andGLDL09NotIn(List<String> values) {
            addCriterion("GLDL09 not in", values, "GLDL09");
            return (Criteria) this;
        }

        public Criteria andGLDL09Between(String value1, String value2) {
            addCriterion("GLDL09 between", value1, value2, "GLDL09");
            return (Criteria) this;
        }

        public Criteria andGLDL09NotBetween(String value1, String value2) {
            addCriterion("GLDL09 not between", value1, value2, "GLDL09");
            return (Criteria) this;
        }

        public Criteria andGLDL10IsNull() {
            addCriterion("GLDL10 is null");
            return (Criteria) this;
        }

        public Criteria andGLDL10IsNotNull() {
            addCriterion("GLDL10 is not null");
            return (Criteria) this;
        }

        public Criteria andGLDL10EqualTo(String value) {
            addCriterion("GLDL10 =", value, "GLDL10");
            return (Criteria) this;
        }

        public Criteria andGLDL10NotEqualTo(String value) {
            addCriterion("GLDL10 <>", value, "GLDL10");
            return (Criteria) this;
        }

        public Criteria andGLDL10GreaterThan(String value) {
            addCriterion("GLDL10 >", value, "GLDL10");
            return (Criteria) this;
        }

        public Criteria andGLDL10GreaterThanOrEqualTo(String value) {
            addCriterion("GLDL10 >=", value, "GLDL10");
            return (Criteria) this;
        }

        public Criteria andGLDL10LessThan(String value) {
            addCriterion("GLDL10 <", value, "GLDL10");
            return (Criteria) this;
        }

        public Criteria andGLDL10LessThanOrEqualTo(String value) {
            addCriterion("GLDL10 <=", value, "GLDL10");
            return (Criteria) this;
        }

        public Criteria andGLDL10Like(String value) {
            addCriterion("GLDL10 like", value, "GLDL10");
            return (Criteria) this;
        }

        public Criteria andGLDL10NotLike(String value) {
            addCriterion("GLDL10 not like", value, "GLDL10");
            return (Criteria) this;
        }

        public Criteria andGLDL10In(List<String> values) {
            addCriterion("GLDL10 in", values, "GLDL10");
            return (Criteria) this;
        }

        public Criteria andGLDL10NotIn(List<String> values) {
            addCriterion("GLDL10 not in", values, "GLDL10");
            return (Criteria) this;
        }

        public Criteria andGLDL10Between(String value1, String value2) {
            addCriterion("GLDL10 between", value1, value2, "GLDL10");
            return (Criteria) this;
        }

        public Criteria andGLDL10NotBetween(String value1, String value2) {
            addCriterion("GLDL10 not between", value1, value2, "GLDL10");
            return (Criteria) this;
        }

        public Criteria andGLDL11IsNull() {
            addCriterion("GLDL11 is null");
            return (Criteria) this;
        }

        public Criteria andGLDL11IsNotNull() {
            addCriterion("GLDL11 is not null");
            return (Criteria) this;
        }

        public Criteria andGLDL11EqualTo(String value) {
            addCriterion("GLDL11 =", value, "GLDL11");
            return (Criteria) this;
        }

        public Criteria andGLDL11NotEqualTo(String value) {
            addCriterion("GLDL11 <>", value, "GLDL11");
            return (Criteria) this;
        }

        public Criteria andGLDL11GreaterThan(String value) {
            addCriterion("GLDL11 >", value, "GLDL11");
            return (Criteria) this;
        }

        public Criteria andGLDL11GreaterThanOrEqualTo(String value) {
            addCriterion("GLDL11 >=", value, "GLDL11");
            return (Criteria) this;
        }

        public Criteria andGLDL11LessThan(String value) {
            addCriterion("GLDL11 <", value, "GLDL11");
            return (Criteria) this;
        }

        public Criteria andGLDL11LessThanOrEqualTo(String value) {
            addCriterion("GLDL11 <=", value, "GLDL11");
            return (Criteria) this;
        }

        public Criteria andGLDL11Like(String value) {
            addCriterion("GLDL11 like", value, "GLDL11");
            return (Criteria) this;
        }

        public Criteria andGLDL11NotLike(String value) {
            addCriterion("GLDL11 not like", value, "GLDL11");
            return (Criteria) this;
        }

        public Criteria andGLDL11In(List<String> values) {
            addCriterion("GLDL11 in", values, "GLDL11");
            return (Criteria) this;
        }

        public Criteria andGLDL11NotIn(List<String> values) {
            addCriterion("GLDL11 not in", values, "GLDL11");
            return (Criteria) this;
        }

        public Criteria andGLDL11Between(String value1, String value2) {
            addCriterion("GLDL11 between", value1, value2, "GLDL11");
            return (Criteria) this;
        }

        public Criteria andGLDL11NotBetween(String value1, String value2) {
            addCriterion("GLDL11 not between", value1, value2, "GLDL11");
            return (Criteria) this;
        }

        public Criteria andGLDL12IsNull() {
            addCriterion("GLDL12 is null");
            return (Criteria) this;
        }

        public Criteria andGLDL12IsNotNull() {
            addCriterion("GLDL12 is not null");
            return (Criteria) this;
        }

        public Criteria andGLDL12EqualTo(String value) {
            addCriterion("GLDL12 =", value, "GLDL12");
            return (Criteria) this;
        }

        public Criteria andGLDL12NotEqualTo(String value) {
            addCriterion("GLDL12 <>", value, "GLDL12");
            return (Criteria) this;
        }

        public Criteria andGLDL12GreaterThan(String value) {
            addCriterion("GLDL12 >", value, "GLDL12");
            return (Criteria) this;
        }

        public Criteria andGLDL12GreaterThanOrEqualTo(String value) {
            addCriterion("GLDL12 >=", value, "GLDL12");
            return (Criteria) this;
        }

        public Criteria andGLDL12LessThan(String value) {
            addCriterion("GLDL12 <", value, "GLDL12");
            return (Criteria) this;
        }

        public Criteria andGLDL12LessThanOrEqualTo(String value) {
            addCriterion("GLDL12 <=", value, "GLDL12");
            return (Criteria) this;
        }

        public Criteria andGLDL12Like(String value) {
            addCriterion("GLDL12 like", value, "GLDL12");
            return (Criteria) this;
        }

        public Criteria andGLDL12NotLike(String value) {
            addCriterion("GLDL12 not like", value, "GLDL12");
            return (Criteria) this;
        }

        public Criteria andGLDL12In(List<String> values) {
            addCriterion("GLDL12 in", values, "GLDL12");
            return (Criteria) this;
        }

        public Criteria andGLDL12NotIn(List<String> values) {
            addCriterion("GLDL12 not in", values, "GLDL12");
            return (Criteria) this;
        }

        public Criteria andGLDL12Between(String value1, String value2) {
            addCriterion("GLDL12 between", value1, value2, "GLDL12");
            return (Criteria) this;
        }

        public Criteria andGLDL12NotBetween(String value1, String value2) {
            addCriterion("GLDL12 not between", value1, value2, "GLDL12");
            return (Criteria) this;
        }

        public Criteria andGLDL13IsNull() {
            addCriterion("GLDL13 is null");
            return (Criteria) this;
        }

        public Criteria andGLDL13IsNotNull() {
            addCriterion("GLDL13 is not null");
            return (Criteria) this;
        }

        public Criteria andGLDL13EqualTo(String value) {
            addCriterion("GLDL13 =", value, "GLDL13");
            return (Criteria) this;
        }

        public Criteria andGLDL13NotEqualTo(String value) {
            addCriterion("GLDL13 <>", value, "GLDL13");
            return (Criteria) this;
        }

        public Criteria andGLDL13GreaterThan(String value) {
            addCriterion("GLDL13 >", value, "GLDL13");
            return (Criteria) this;
        }

        public Criteria andGLDL13GreaterThanOrEqualTo(String value) {
            addCriterion("GLDL13 >=", value, "GLDL13");
            return (Criteria) this;
        }

        public Criteria andGLDL13LessThan(String value) {
            addCriterion("GLDL13 <", value, "GLDL13");
            return (Criteria) this;
        }

        public Criteria andGLDL13LessThanOrEqualTo(String value) {
            addCriterion("GLDL13 <=", value, "GLDL13");
            return (Criteria) this;
        }

        public Criteria andGLDL13Like(String value) {
            addCriterion("GLDL13 like", value, "GLDL13");
            return (Criteria) this;
        }

        public Criteria andGLDL13NotLike(String value) {
            addCriterion("GLDL13 not like", value, "GLDL13");
            return (Criteria) this;
        }

        public Criteria andGLDL13In(List<String> values) {
            addCriterion("GLDL13 in", values, "GLDL13");
            return (Criteria) this;
        }

        public Criteria andGLDL13NotIn(List<String> values) {
            addCriterion("GLDL13 not in", values, "GLDL13");
            return (Criteria) this;
        }

        public Criteria andGLDL13Between(String value1, String value2) {
            addCriterion("GLDL13 between", value1, value2, "GLDL13");
            return (Criteria) this;
        }

        public Criteria andGLDL13NotBetween(String value1, String value2) {
            addCriterion("GLDL13 not between", value1, value2, "GLDL13");
            return (Criteria) this;
        }

        public Criteria andGLDL14IsNull() {
            addCriterion("GLDL14 is null");
            return (Criteria) this;
        }

        public Criteria andGLDL14IsNotNull() {
            addCriterion("GLDL14 is not null");
            return (Criteria) this;
        }

        public Criteria andGLDL14EqualTo(String value) {
            addCriterion("GLDL14 =", value, "GLDL14");
            return (Criteria) this;
        }

        public Criteria andGLDL14NotEqualTo(String value) {
            addCriterion("GLDL14 <>", value, "GLDL14");
            return (Criteria) this;
        }

        public Criteria andGLDL14GreaterThan(String value) {
            addCriterion("GLDL14 >", value, "GLDL14");
            return (Criteria) this;
        }

        public Criteria andGLDL14GreaterThanOrEqualTo(String value) {
            addCriterion("GLDL14 >=", value, "GLDL14");
            return (Criteria) this;
        }

        public Criteria andGLDL14LessThan(String value) {
            addCriterion("GLDL14 <", value, "GLDL14");
            return (Criteria) this;
        }

        public Criteria andGLDL14LessThanOrEqualTo(String value) {
            addCriterion("GLDL14 <=", value, "GLDL14");
            return (Criteria) this;
        }

        public Criteria andGLDL14Like(String value) {
            addCriterion("GLDL14 like", value, "GLDL14");
            return (Criteria) this;
        }

        public Criteria andGLDL14NotLike(String value) {
            addCriterion("GLDL14 not like", value, "GLDL14");
            return (Criteria) this;
        }

        public Criteria andGLDL14In(List<String> values) {
            addCriterion("GLDL14 in", values, "GLDL14");
            return (Criteria) this;
        }

        public Criteria andGLDL14NotIn(List<String> values) {
            addCriterion("GLDL14 not in", values, "GLDL14");
            return (Criteria) this;
        }

        public Criteria andGLDL14Between(String value1, String value2) {
            addCriterion("GLDL14 between", value1, value2, "GLDL14");
            return (Criteria) this;
        }

        public Criteria andGLDL14NotBetween(String value1, String value2) {
            addCriterion("GLDL14 not between", value1, value2, "GLDL14");
            return (Criteria) this;
        }

        public Criteria andGLDL15IsNull() {
            addCriterion("GLDL15 is null");
            return (Criteria) this;
        }

        public Criteria andGLDL15IsNotNull() {
            addCriterion("GLDL15 is not null");
            return (Criteria) this;
        }

        public Criteria andGLDL15EqualTo(String value) {
            addCriterion("GLDL15 =", value, "GLDL15");
            return (Criteria) this;
        }

        public Criteria andGLDL15NotEqualTo(String value) {
            addCriterion("GLDL15 <>", value, "GLDL15");
            return (Criteria) this;
        }

        public Criteria andGLDL15GreaterThan(String value) {
            addCriterion("GLDL15 >", value, "GLDL15");
            return (Criteria) this;
        }

        public Criteria andGLDL15GreaterThanOrEqualTo(String value) {
            addCriterion("GLDL15 >=", value, "GLDL15");
            return (Criteria) this;
        }

        public Criteria andGLDL15LessThan(String value) {
            addCriterion("GLDL15 <", value, "GLDL15");
            return (Criteria) this;
        }

        public Criteria andGLDL15LessThanOrEqualTo(String value) {
            addCriterion("GLDL15 <=", value, "GLDL15");
            return (Criteria) this;
        }

        public Criteria andGLDL15Like(String value) {
            addCriterion("GLDL15 like", value, "GLDL15");
            return (Criteria) this;
        }

        public Criteria andGLDL15NotLike(String value) {
            addCriterion("GLDL15 not like", value, "GLDL15");
            return (Criteria) this;
        }

        public Criteria andGLDL15In(List<String> values) {
            addCriterion("GLDL15 in", values, "GLDL15");
            return (Criteria) this;
        }

        public Criteria andGLDL15NotIn(List<String> values) {
            addCriterion("GLDL15 not in", values, "GLDL15");
            return (Criteria) this;
        }

        public Criteria andGLDL15Between(String value1, String value2) {
            addCriterion("GLDL15 between", value1, value2, "GLDL15");
            return (Criteria) this;
        }

        public Criteria andGLDL15NotBetween(String value1, String value2) {
            addCriterion("GLDL15 not between", value1, value2, "GLDL15");
            return (Criteria) this;
        }

        public Criteria andGLAN11IsNull() {
            addCriterion("GLAN11 is null");
            return (Criteria) this;
        }

        public Criteria andGLAN11IsNotNull() {
            addCriterion("GLAN11 is not null");
            return (Criteria) this;
        }

        public Criteria andGLAN11EqualTo(BigDecimal value) {
            addCriterion("GLAN11 =", value, "GLAN11");
            return (Criteria) this;
        }

        public Criteria andGLAN11NotEqualTo(BigDecimal value) {
            addCriterion("GLAN11 <>", value, "GLAN11");
            return (Criteria) this;
        }

        public Criteria andGLAN11GreaterThan(BigDecimal value) {
            addCriterion("GLAN11 >", value, "GLAN11");
            return (Criteria) this;
        }

        public Criteria andGLAN11GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLAN11 >=", value, "GLAN11");
            return (Criteria) this;
        }

        public Criteria andGLAN11LessThan(BigDecimal value) {
            addCriterion("GLAN11 <", value, "GLAN11");
            return (Criteria) this;
        }

        public Criteria andGLAN11LessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLAN11 <=", value, "GLAN11");
            return (Criteria) this;
        }

        public Criteria andGLAN11In(List<BigDecimal> values) {
            addCriterion("GLAN11 in", values, "GLAN11");
            return (Criteria) this;
        }

        public Criteria andGLAN11NotIn(List<BigDecimal> values) {
            addCriterion("GLAN11 not in", values, "GLAN11");
            return (Criteria) this;
        }

        public Criteria andGLAN11Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLAN11 between", value1, value2, "GLAN11");
            return (Criteria) this;
        }

        public Criteria andGLAN11NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLAN11 not between", value1, value2, "GLAN11");
            return (Criteria) this;
        }

        public Criteria andGLAN12IsNull() {
            addCriterion("GLAN12 is null");
            return (Criteria) this;
        }

        public Criteria andGLAN12IsNotNull() {
            addCriterion("GLAN12 is not null");
            return (Criteria) this;
        }

        public Criteria andGLAN12EqualTo(BigDecimal value) {
            addCriterion("GLAN12 =", value, "GLAN12");
            return (Criteria) this;
        }

        public Criteria andGLAN12NotEqualTo(BigDecimal value) {
            addCriterion("GLAN12 <>", value, "GLAN12");
            return (Criteria) this;
        }

        public Criteria andGLAN12GreaterThan(BigDecimal value) {
            addCriterion("GLAN12 >", value, "GLAN12");
            return (Criteria) this;
        }

        public Criteria andGLAN12GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLAN12 >=", value, "GLAN12");
            return (Criteria) this;
        }

        public Criteria andGLAN12LessThan(BigDecimal value) {
            addCriterion("GLAN12 <", value, "GLAN12");
            return (Criteria) this;
        }

        public Criteria andGLAN12LessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLAN12 <=", value, "GLAN12");
            return (Criteria) this;
        }

        public Criteria andGLAN12In(List<BigDecimal> values) {
            addCriterion("GLAN12 in", values, "GLAN12");
            return (Criteria) this;
        }

        public Criteria andGLAN12NotIn(List<BigDecimal> values) {
            addCriterion("GLAN12 not in", values, "GLAN12");
            return (Criteria) this;
        }

        public Criteria andGLAN12Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLAN12 between", value1, value2, "GLAN12");
            return (Criteria) this;
        }

        public Criteria andGLAN12NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLAN12 not between", value1, value2, "GLAN12");
            return (Criteria) this;
        }

        public Criteria andGLAN13IsNull() {
            addCriterion("GLAN13 is null");
            return (Criteria) this;
        }

        public Criteria andGLAN13IsNotNull() {
            addCriterion("GLAN13 is not null");
            return (Criteria) this;
        }

        public Criteria andGLAN13EqualTo(BigDecimal value) {
            addCriterion("GLAN13 =", value, "GLAN13");
            return (Criteria) this;
        }

        public Criteria andGLAN13NotEqualTo(BigDecimal value) {
            addCriterion("GLAN13 <>", value, "GLAN13");
            return (Criteria) this;
        }

        public Criteria andGLAN13GreaterThan(BigDecimal value) {
            addCriterion("GLAN13 >", value, "GLAN13");
            return (Criteria) this;
        }

        public Criteria andGLAN13GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLAN13 >=", value, "GLAN13");
            return (Criteria) this;
        }

        public Criteria andGLAN13LessThan(BigDecimal value) {
            addCriterion("GLAN13 <", value, "GLAN13");
            return (Criteria) this;
        }

        public Criteria andGLAN13LessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLAN13 <=", value, "GLAN13");
            return (Criteria) this;
        }

        public Criteria andGLAN13In(List<BigDecimal> values) {
            addCriterion("GLAN13 in", values, "GLAN13");
            return (Criteria) this;
        }

        public Criteria andGLAN13NotIn(List<BigDecimal> values) {
            addCriterion("GLAN13 not in", values, "GLAN13");
            return (Criteria) this;
        }

        public Criteria andGLAN13Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLAN13 between", value1, value2, "GLAN13");
            return (Criteria) this;
        }

        public Criteria andGLAN13NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLAN13 not between", value1, value2, "GLAN13");
            return (Criteria) this;
        }

        public Criteria andGLAN14IsNull() {
            addCriterion("GLAN14 is null");
            return (Criteria) this;
        }

        public Criteria andGLAN14IsNotNull() {
            addCriterion("GLAN14 is not null");
            return (Criteria) this;
        }

        public Criteria andGLAN14EqualTo(BigDecimal value) {
            addCriterion("GLAN14 =", value, "GLAN14");
            return (Criteria) this;
        }

        public Criteria andGLAN14NotEqualTo(BigDecimal value) {
            addCriterion("GLAN14 <>", value, "GLAN14");
            return (Criteria) this;
        }

        public Criteria andGLAN14GreaterThan(BigDecimal value) {
            addCriterion("GLAN14 >", value, "GLAN14");
            return (Criteria) this;
        }

        public Criteria andGLAN14GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLAN14 >=", value, "GLAN14");
            return (Criteria) this;
        }

        public Criteria andGLAN14LessThan(BigDecimal value) {
            addCriterion("GLAN14 <", value, "GLAN14");
            return (Criteria) this;
        }

        public Criteria andGLAN14LessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLAN14 <=", value, "GLAN14");
            return (Criteria) this;
        }

        public Criteria andGLAN14In(List<BigDecimal> values) {
            addCriterion("GLAN14 in", values, "GLAN14");
            return (Criteria) this;
        }

        public Criteria andGLAN14NotIn(List<BigDecimal> values) {
            addCriterion("GLAN14 not in", values, "GLAN14");
            return (Criteria) this;
        }

        public Criteria andGLAN14Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLAN14 between", value1, value2, "GLAN14");
            return (Criteria) this;
        }

        public Criteria andGLAN14NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLAN14 not between", value1, value2, "GLAN14");
            return (Criteria) this;
        }

        public Criteria andGLAN15IsNull() {
            addCriterion("GLAN15 is null");
            return (Criteria) this;
        }

        public Criteria andGLAN15IsNotNull() {
            addCriterion("GLAN15 is not null");
            return (Criteria) this;
        }

        public Criteria andGLAN15EqualTo(BigDecimal value) {
            addCriterion("GLAN15 =", value, "GLAN15");
            return (Criteria) this;
        }

        public Criteria andGLAN15NotEqualTo(BigDecimal value) {
            addCriterion("GLAN15 <>", value, "GLAN15");
            return (Criteria) this;
        }

        public Criteria andGLAN15GreaterThan(BigDecimal value) {
            addCriterion("GLAN15 >", value, "GLAN15");
            return (Criteria) this;
        }

        public Criteria andGLAN15GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GLAN15 >=", value, "GLAN15");
            return (Criteria) this;
        }

        public Criteria andGLAN15LessThan(BigDecimal value) {
            addCriterion("GLAN15 <", value, "GLAN15");
            return (Criteria) this;
        }

        public Criteria andGLAN15LessThanOrEqualTo(BigDecimal value) {
            addCriterion("GLAN15 <=", value, "GLAN15");
            return (Criteria) this;
        }

        public Criteria andGLAN15In(List<BigDecimal> values) {
            addCriterion("GLAN15 in", values, "GLAN15");
            return (Criteria) this;
        }

        public Criteria andGLAN15NotIn(List<BigDecimal> values) {
            addCriterion("GLAN15 not in", values, "GLAN15");
            return (Criteria) this;
        }

        public Criteria andGLAN15Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLAN15 between", value1, value2, "GLAN15");
            return (Criteria) this;
        }

        public Criteria andGLAN15NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GLAN15 not between", value1, value2, "GLAN15");
            return (Criteria) this;
        }

        public Criteria andGLDS01IsNull() {
            addCriterion("GLDS01 is null");
            return (Criteria) this;
        }

        public Criteria andGLDS01IsNotNull() {
            addCriterion("GLDS01 is not null");
            return (Criteria) this;
        }

        public Criteria andGLDS01EqualTo(String value) {
            addCriterion("GLDS01 =", value, "GLDS01");
            return (Criteria) this;
        }

        public Criteria andGLDS01NotEqualTo(String value) {
            addCriterion("GLDS01 <>", value, "GLDS01");
            return (Criteria) this;
        }

        public Criteria andGLDS01GreaterThan(String value) {
            addCriterion("GLDS01 >", value, "GLDS01");
            return (Criteria) this;
        }

        public Criteria andGLDS01GreaterThanOrEqualTo(String value) {
            addCriterion("GLDS01 >=", value, "GLDS01");
            return (Criteria) this;
        }

        public Criteria andGLDS01LessThan(String value) {
            addCriterion("GLDS01 <", value, "GLDS01");
            return (Criteria) this;
        }

        public Criteria andGLDS01LessThanOrEqualTo(String value) {
            addCriterion("GLDS01 <=", value, "GLDS01");
            return (Criteria) this;
        }

        public Criteria andGLDS01Like(String value) {
            addCriterion("GLDS01 like", value, "GLDS01");
            return (Criteria) this;
        }

        public Criteria andGLDS01NotLike(String value) {
            addCriterion("GLDS01 not like", value, "GLDS01");
            return (Criteria) this;
        }

        public Criteria andGLDS01In(List<String> values) {
            addCriterion("GLDS01 in", values, "GLDS01");
            return (Criteria) this;
        }

        public Criteria andGLDS01NotIn(List<String> values) {
            addCriterion("GLDS01 not in", values, "GLDS01");
            return (Criteria) this;
        }

        public Criteria andGLDS01Between(String value1, String value2) {
            addCriterion("GLDS01 between", value1, value2, "GLDS01");
            return (Criteria) this;
        }

        public Criteria andGLDS01NotBetween(String value1, String value2) {
            addCriterion("GLDS01 not between", value1, value2, "GLDS01");
            return (Criteria) this;
        }

        public Criteria andGLDS02IsNull() {
            addCriterion("GLDS02 is null");
            return (Criteria) this;
        }

        public Criteria andGLDS02IsNotNull() {
            addCriterion("GLDS02 is not null");
            return (Criteria) this;
        }

        public Criteria andGLDS02EqualTo(String value) {
            addCriterion("GLDS02 =", value, "GLDS02");
            return (Criteria) this;
        }

        public Criteria andGLDS02NotEqualTo(String value) {
            addCriterion("GLDS02 <>", value, "GLDS02");
            return (Criteria) this;
        }

        public Criteria andGLDS02GreaterThan(String value) {
            addCriterion("GLDS02 >", value, "GLDS02");
            return (Criteria) this;
        }

        public Criteria andGLDS02GreaterThanOrEqualTo(String value) {
            addCriterion("GLDS02 >=", value, "GLDS02");
            return (Criteria) this;
        }

        public Criteria andGLDS02LessThan(String value) {
            addCriterion("GLDS02 <", value, "GLDS02");
            return (Criteria) this;
        }

        public Criteria andGLDS02LessThanOrEqualTo(String value) {
            addCriterion("GLDS02 <=", value, "GLDS02");
            return (Criteria) this;
        }

        public Criteria andGLDS02Like(String value) {
            addCriterion("GLDS02 like", value, "GLDS02");
            return (Criteria) this;
        }

        public Criteria andGLDS02NotLike(String value) {
            addCriterion("GLDS02 not like", value, "GLDS02");
            return (Criteria) this;
        }

        public Criteria andGLDS02In(List<String> values) {
            addCriterion("GLDS02 in", values, "GLDS02");
            return (Criteria) this;
        }

        public Criteria andGLDS02NotIn(List<String> values) {
            addCriterion("GLDS02 not in", values, "GLDS02");
            return (Criteria) this;
        }

        public Criteria andGLDS02Between(String value1, String value2) {
            addCriterion("GLDS02 between", value1, value2, "GLDS02");
            return (Criteria) this;
        }

        public Criteria andGLDS02NotBetween(String value1, String value2) {
            addCriterion("GLDS02 not between", value1, value2, "GLDS02");
            return (Criteria) this;
        }

        public Criteria andGLDS03IsNull() {
            addCriterion("GLDS03 is null");
            return (Criteria) this;
        }

        public Criteria andGLDS03IsNotNull() {
            addCriterion("GLDS03 is not null");
            return (Criteria) this;
        }

        public Criteria andGLDS03EqualTo(String value) {
            addCriterion("GLDS03 =", value, "GLDS03");
            return (Criteria) this;
        }

        public Criteria andGLDS03NotEqualTo(String value) {
            addCriterion("GLDS03 <>", value, "GLDS03");
            return (Criteria) this;
        }

        public Criteria andGLDS03GreaterThan(String value) {
            addCriterion("GLDS03 >", value, "GLDS03");
            return (Criteria) this;
        }

        public Criteria andGLDS03GreaterThanOrEqualTo(String value) {
            addCriterion("GLDS03 >=", value, "GLDS03");
            return (Criteria) this;
        }

        public Criteria andGLDS03LessThan(String value) {
            addCriterion("GLDS03 <", value, "GLDS03");
            return (Criteria) this;
        }

        public Criteria andGLDS03LessThanOrEqualTo(String value) {
            addCriterion("GLDS03 <=", value, "GLDS03");
            return (Criteria) this;
        }

        public Criteria andGLDS03Like(String value) {
            addCriterion("GLDS03 like", value, "GLDS03");
            return (Criteria) this;
        }

        public Criteria andGLDS03NotLike(String value) {
            addCriterion("GLDS03 not like", value, "GLDS03");
            return (Criteria) this;
        }

        public Criteria andGLDS03In(List<String> values) {
            addCriterion("GLDS03 in", values, "GLDS03");
            return (Criteria) this;
        }

        public Criteria andGLDS03NotIn(List<String> values) {
            addCriterion("GLDS03 not in", values, "GLDS03");
            return (Criteria) this;
        }

        public Criteria andGLDS03Between(String value1, String value2) {
            addCriterion("GLDS03 between", value1, value2, "GLDS03");
            return (Criteria) this;
        }

        public Criteria andGLDS03NotBetween(String value1, String value2) {
            addCriterion("GLDS03 not between", value1, value2, "GLDS03");
            return (Criteria) this;
        }

        public Criteria andGLDS04IsNull() {
            addCriterion("GLDS04 is null");
            return (Criteria) this;
        }

        public Criteria andGLDS04IsNotNull() {
            addCriterion("GLDS04 is not null");
            return (Criteria) this;
        }

        public Criteria andGLDS04EqualTo(String value) {
            addCriterion("GLDS04 =", value, "GLDS04");
            return (Criteria) this;
        }

        public Criteria andGLDS04NotEqualTo(String value) {
            addCriterion("GLDS04 <>", value, "GLDS04");
            return (Criteria) this;
        }

        public Criteria andGLDS04GreaterThan(String value) {
            addCriterion("GLDS04 >", value, "GLDS04");
            return (Criteria) this;
        }

        public Criteria andGLDS04GreaterThanOrEqualTo(String value) {
            addCriterion("GLDS04 >=", value, "GLDS04");
            return (Criteria) this;
        }

        public Criteria andGLDS04LessThan(String value) {
            addCriterion("GLDS04 <", value, "GLDS04");
            return (Criteria) this;
        }

        public Criteria andGLDS04LessThanOrEqualTo(String value) {
            addCriterion("GLDS04 <=", value, "GLDS04");
            return (Criteria) this;
        }

        public Criteria andGLDS04Like(String value) {
            addCriterion("GLDS04 like", value, "GLDS04");
            return (Criteria) this;
        }

        public Criteria andGLDS04NotLike(String value) {
            addCriterion("GLDS04 not like", value, "GLDS04");
            return (Criteria) this;
        }

        public Criteria andGLDS04In(List<String> values) {
            addCriterion("GLDS04 in", values, "GLDS04");
            return (Criteria) this;
        }

        public Criteria andGLDS04NotIn(List<String> values) {
            addCriterion("GLDS04 not in", values, "GLDS04");
            return (Criteria) this;
        }

        public Criteria andGLDS04Between(String value1, String value2) {
            addCriterion("GLDS04 between", value1, value2, "GLDS04");
            return (Criteria) this;
        }

        public Criteria andGLDS04NotBetween(String value1, String value2) {
            addCriterion("GLDS04 not between", value1, value2, "GLDS04");
            return (Criteria) this;
        }

        public Criteria andGLDS05IsNull() {
            addCriterion("GLDS05 is null");
            return (Criteria) this;
        }

        public Criteria andGLDS05IsNotNull() {
            addCriterion("GLDS05 is not null");
            return (Criteria) this;
        }

        public Criteria andGLDS05EqualTo(String value) {
            addCriterion("GLDS05 =", value, "GLDS05");
            return (Criteria) this;
        }

        public Criteria andGLDS05NotEqualTo(String value) {
            addCriterion("GLDS05 <>", value, "GLDS05");
            return (Criteria) this;
        }

        public Criteria andGLDS05GreaterThan(String value) {
            addCriterion("GLDS05 >", value, "GLDS05");
            return (Criteria) this;
        }

        public Criteria andGLDS05GreaterThanOrEqualTo(String value) {
            addCriterion("GLDS05 >=", value, "GLDS05");
            return (Criteria) this;
        }

        public Criteria andGLDS05LessThan(String value) {
            addCriterion("GLDS05 <", value, "GLDS05");
            return (Criteria) this;
        }

        public Criteria andGLDS05LessThanOrEqualTo(String value) {
            addCriterion("GLDS05 <=", value, "GLDS05");
            return (Criteria) this;
        }

        public Criteria andGLDS05Like(String value) {
            addCriterion("GLDS05 like", value, "GLDS05");
            return (Criteria) this;
        }

        public Criteria andGLDS05NotLike(String value) {
            addCriterion("GLDS05 not like", value, "GLDS05");
            return (Criteria) this;
        }

        public Criteria andGLDS05In(List<String> values) {
            addCriterion("GLDS05 in", values, "GLDS05");
            return (Criteria) this;
        }

        public Criteria andGLDS05NotIn(List<String> values) {
            addCriterion("GLDS05 not in", values, "GLDS05");
            return (Criteria) this;
        }

        public Criteria andGLDS05Between(String value1, String value2) {
            addCriterion("GLDS05 between", value1, value2, "GLDS05");
            return (Criteria) this;
        }

        public Criteria andGLDS05NotBetween(String value1, String value2) {
            addCriterion("GLDS05 not between", value1, value2, "GLDS05");
            return (Criteria) this;
        }
    }

    /**
     */
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