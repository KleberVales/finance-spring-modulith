package com.finance.financespringmodulith.categories.domain;

import jakarta.persistence.*;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;       // Ex: "Alimentação", "Transporte"
    private String description;

    // Getters e Setters
}

