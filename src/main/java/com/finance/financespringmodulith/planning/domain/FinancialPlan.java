package com.finance.financespringmodulith.planning.domain;

import jakarta.persistence.*;
import java.time.YearMonth;
import java.math.BigDecimal;

@Entity
public class FinancialPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private YearMonth period;       // Ex: 2026-02
    private BigDecimal plannedIncome;
    private BigDecimal plannedExpense;

    private String description;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public YearMonth getPeriod() {
        return period;
    }

    public void setPeriod(YearMonth period) {
        this.period = period;
    }

    public BigDecimal getPlannedIncome() {
        return plannedIncome;
    }

    public void setPlannedIncome(BigDecimal plannedIncome) {
        this.plannedIncome = plannedIncome;
    }

    public BigDecimal getPlannedExpense() {
        return plannedExpense;
    }

    public void setPlannedExpense(BigDecimal plannedExpense) {
        this.plannedExpense = plannedExpense;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

