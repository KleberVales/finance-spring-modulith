package com.finance.financespringmodulith.bankaccounts.repository;

import com.finance.financespringmodulith.bankaccounts.domain.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
}

