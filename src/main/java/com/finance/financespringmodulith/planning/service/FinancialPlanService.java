package com.finance.financespringmodulith.planning.service;

import com.finance.financespringmodulith.planning.domain.FinancialPlan;
import com.finance.financespringmodulith.planning.repository.FinancialPlanRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialPlanService {

    private final FinancialPlanRepository repository;

    public FinancialPlanService(FinancialPlanRepository repository) {
        this.repository = repository;
    }

    public FinancialPlan save(FinancialPlan plan) {
        return repository.save(plan);
    }

    public List<FinancialPlan> findAll() {
        return repository.findAll();
    }
}

