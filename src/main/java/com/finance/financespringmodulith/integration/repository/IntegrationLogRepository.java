package com.finance.financespringmodulith.integration.repository;

import com.finance.financespringmodulith.integration.domain.IntegrationLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntegrationLogRepository extends JpaRepository<IntegrationLog, Long> {
}
