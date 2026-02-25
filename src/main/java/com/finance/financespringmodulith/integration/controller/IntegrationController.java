package com.finance.financespringmodulith.integration.controller;


import com.finance.financespringmodulith.integration.domain.IntegrationLog;
import com.finance.financespringmodulith.integration.service.IntegrationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/integration")
public class IntegrationController {

    private final IntegrationService service;

    public IntegrationController(IntegrationService service) {
        this.service = service;
    }

    @PostMapping("/openfinance")
    public IntegrationLog integrateOpenFinance(@RequestParam String source) {
        // Aqui futuramente chamaremos o OpenFinanceClient
        return service.registerIntegration(source, "SUCCESS", "Dados importados com sucesso");
    }
}
