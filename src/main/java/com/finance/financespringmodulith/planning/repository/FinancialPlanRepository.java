package com.finance.financespringmodulith.planning.repository;

import com.finance.financespringmodulith.planning.domain.FinancialPlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialPlanRepository extends JpaRepository<FinancialPlan, Long> {
}

