package com.finance.financespringmodulith.core.account;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AccountService {

    private final AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public Account save(Account account) {
        return repository.save(account);
    }

    public List<Account> findAll() {
        return repository.findAll();
    }
}

