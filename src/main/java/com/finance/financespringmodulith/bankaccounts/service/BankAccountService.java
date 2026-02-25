package com.finance.financespringmodulith.bankaccounts.service;


import com.finance.financespringmodulith.bankaccounts.domain.BankAccount;
import com.finance.financespringmodulith.bankaccounts.repository.BankAccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountService {

    private final BankAccountRepository repository;

    public BankAccountService(BankAccountRepository repository) {
        this.repository = repository;
    }

    public BankAccount save(BankAccount account) {
        return repository.save(account);
    }

    public List<BankAccount> findAll() {
        return repository.findAll();
    }
}

