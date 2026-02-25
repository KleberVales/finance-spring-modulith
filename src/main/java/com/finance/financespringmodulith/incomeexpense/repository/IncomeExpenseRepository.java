package com.finance.financespringmodulith.incomeexpense.repository;

import com.finance.financespringmodulith.incomeexpense.domain.IncomeExpense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeExpenseRepository extends JpaRepository<IncomeExpense, Long> {
}

