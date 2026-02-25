package com.finance.financespringmodulith.creditcards.service;


import com.finance.financespringmodulith.creditcards.domain.CreditCard;
import com.finance.financespringmodulith.creditcards.repository.CreditCardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditCardService {

    private final CreditCardRepository repository;

    public CreditCardService(CreditCardRepository repository) {
        this.repository = repository;
    }

    public CreditCard save(CreditCard card) {
        return repository.save(card);
    }

    public List<CreditCard> findAll() {
        return repository.findAll();
    }
}

