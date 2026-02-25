package com.finance.financespringmodulith.reports.service;


import com.finance.financespringmodulith.reports.domain.Report;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    public Report generateIncomeExpenseSummary() {

        return new Report("Resumo de Receitas e Despesas", List.of("Receitas: 8000", "Despesas: 5000"));
    }
}
