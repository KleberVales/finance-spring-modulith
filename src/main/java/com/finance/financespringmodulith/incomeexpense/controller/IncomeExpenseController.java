package com.finance.financespringmodulith.incomeexpense.controller;

import com.finance.financespringmodulith.incomeexpense.domain.IncomeExpense;
import com.finance.financespringmodulith.incomeexpense.service.IncomeExpenseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/incomeexpense")
public class IncomeExpenseController {

    private final IncomeExpenseService service;

    public IncomeExpenseController(IncomeExpenseService service) {
        this.service = service;
    }

    @PostMapping
    public IncomeExpense create(@RequestBody IncomeExpense incomeExpense) {
        return service.save(incomeExpense);
    }

    @GetMapping
    public List<IncomeExpense> list() {
        return service.findAll();
    }
}

