package com.finance.financespringmodulith.reports.controller;


import com.finance.financespringmodulith.reports.domain.Report;
import com.finance.financespringmodulith.reports.service.ReportService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reports")
public class ReportController {

    private final ReportService service;

    public ReportController(ReportService service) {
        this.service = service;
    }

    @GetMapping("/incomeexpense")
    public Report incomeExpenseReport() {
        return service.generateIncomeExpenseSummary();
    }
}

