package com.paymentcomponents.common.request.subobjects
/**
 * Created by aalexandrakis on 17/05/2017.
 */
class Salary {

    BigDecimal totalGrossSalary
    Deductions deductions
    BigDecimal totalNetSalary

    Salary(BigDecimal totalGrossSalary, Deductions deductions, BigDecimal totalNetSalary) {
        this.totalGrossSalary = totalGrossSalary
        this.deductions = deductions
        this.totalNetSalary = totalNetSalary
    }

    Salary() {
    }

    BigDecimal getTotalGrossSalary() {
        return totalGrossSalary
    }

    void setTotalGrossSalary(BigDecimal totalGrossSalary) {
        this.totalGrossSalary = totalGrossSalary
    }

    Deductions getDeductions() {
        return deductions
    }

    void setDeductions(Deductions deductions) {
        this.deductions = deductions
    }

    BigDecimal getTotalNetSalary() {
        return totalNetSalary
    }

    void setTotalNetSalary(BigDecimal totalNetSalary) {
        this.totalNetSalary = totalNetSalary
    }


    @Override
    public String toString() {
        return "Salary{" +
                "totalGrossSalary=" + totalGrossSalary +
                ", deductions=" + deductions.toString() +
                ", totalNetSalary=" + totalNetSalary +
                '}';
    }
}

class Deductions {
    BigDecimal pension
    BigDecimal nhf
    BigDecimal tax
    BigDecimal others
    BigDecimal totalDeductions

    Deductions(BigDecimal pension, BigDecimal nhf, BigDecimal tax, BigDecimal others, BigDecimal totalDeductions) {
        this.pension = pension
        this.nhf = nhf
        this.tax = tax
        this.others = others
        this.totalDeductions = totalDeductions
    }

    Deductions() {
    }

    BigDecimal getPension() {
        return pension
    }

    void setPension(BigDecimal pension) {
        this.pension = pension
    }

    BigDecimal getNhf() {
        return nhf
    }

    void setNhf(BigDecimal nhf) {
        this.nhf = nhf
    }

    BigDecimal getTax() {
        return tax
    }

    void setTax(BigDecimal tax) {
        this.tax = tax
    }

    BigDecimal getOthers() {
        return others
    }

    void setOthers(BigDecimal others) {
        this.others = others
    }

    BigDecimal getTotalDeductions() {
        return totalDeductions
    }

    void setTotalDeductions(BigDecimal totalDeductions) {
        this.totalDeductions = totalDeductions
    }


    @Override
    public String toString() {
        return "Deductions{" +
                "pension=" + pension +
                ", nhf=" + nhf +
                ", tax=" + tax +
                ", others=" + others +
                ", totalDeductions=" + totalDeductions +
                '}';
    }
}
