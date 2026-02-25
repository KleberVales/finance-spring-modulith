package com.finance.financespringmodulith.incomeexpense.service;

import com.finance.financespringmodulith.incomeexpense.domain.IncomeExpense;
import com.finance.financespringmodulith.incomeexpense.repository.IncomeExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncomeExpenseService {

    private final IncomeExpenseRepository repository;

    public IncomeExpenseService(IncomeExpenseRepository repository) {
        this.repository = repository;
    }

    public IncomeExpense save(IncomeExpense incomeExpense) {
        return repository.save(incomeExpense);
    }

    public List<IncomeExpense> findAll() {
        return repository.findAll();
    }
}

