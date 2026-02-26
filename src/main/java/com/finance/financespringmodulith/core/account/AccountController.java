package com.finance.financespringmodulith.core.account;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    @PostMapping
    public Account create(@RequestBody Account account) {
        return service.save(account);
    }

    @GetMapping
    public List<Account> list() {
        return service.findAll();
    }
}

