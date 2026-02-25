package com.finance.financespringmodulith.creditcards.controller;


import com.finance.financespringmodulith.creditcards.domain.CreditCard;
import com.finance.financespringmodulith.creditcards.service.CreditCardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/creditcards")
public class CreditCardController {

    private final CreditCardService service;

    public CreditCardController(CreditCardService service) {
        this.service = service;
    }

    @PostMapping
    public CreditCard create(@RequestBody CreditCard card) {
        return service.save(card);
    }

    @GetMapping
    public List<CreditCard> list() {
        return service.findAll();
    }
}

