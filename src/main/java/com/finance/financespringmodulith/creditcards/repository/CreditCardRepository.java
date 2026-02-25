package com.finance.financespringmodulith.creditcards.repository;


import com.finance.financespringmodulith.creditcards.domain.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {
}
