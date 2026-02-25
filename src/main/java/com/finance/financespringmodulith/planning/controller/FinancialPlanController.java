package com.finance.financespringmodulith.planning.controller;

import com.finance.financespringmodulith.planning.domain.FinancialPlan;
import com.finance.financespringmodulith.planning.service.FinancialPlanService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planning")
public class FinancialPlanController {

    private final FinancialPlanService service;

    public FinancialPlanController(FinancialPlanService service) {
        this.service = service;
    }

    @PostMapping
    public FinancialPlan create(@RequestBody FinancialPlan plan) {
        return service.save(plan);
    }

    @GetMapping
    public List<FinancialPlan> list() {
        return service.findAll();
    }
}

