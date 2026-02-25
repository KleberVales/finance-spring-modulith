package com.finance.financespringmodulith.bankaccounts.controller;

import com.finance.financespringmodulith.bankaccounts.domain.BankAccount;
import com.finance.financespringmodulith.bankaccounts.service.BankAccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bankaccounts")
public class BankAccountController {

    private final BankAccountService service;

    public BankAccountController(BankAccountService service) {
        this.service = service;
    }

    @PostMapping
    public BankAccount create(@RequestBody BankAccount account) {
        return service.save(account);
    }

    @GetMapping
    public List<BankAccount> list() {
        return service.findAll();
    }
}

