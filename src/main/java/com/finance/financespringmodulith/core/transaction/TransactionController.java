package com.finance.financespringmodulith.core.transaction;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @PostMapping
    public Transaction create(@RequestBody Transaction transaction) {
        return service.save(transaction);
    }

    @GetMapping
    public List<Transaction> list() {
        return service.findAll();
    }
}

