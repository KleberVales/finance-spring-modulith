package com.finance.financespringmodulith.integration.service;

import com.finance.financespringmodulith.integration.domain.IntegrationLog;
import com.finance.financespringmodulith.integration.repository.IntegrationLogRepository;
import org.springframework.stereotype.Service;

@Service
public class IntegrationService {

    private final IntegrationLogRepository repository;

    public IntegrationService(IntegrationLogRepository repository) {
        this.repository = repository;
    }

    public IntegrationLog registerIntegration(String source, String status, String details) {
        IntegrationLog log = new IntegrationLog();
        log.setSource(source);
        log.setStatus(status);
        log.setDetails(details);
        log.setDate(java.time.LocalDateTime.now());
        return repository.save(log);
    }
}
