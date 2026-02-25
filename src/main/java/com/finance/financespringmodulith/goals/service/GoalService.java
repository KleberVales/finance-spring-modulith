package com.finance.financespringmodulith.goals.service;


import com.finance.financespringmodulith.goals.domain.Goal;
import com.finance.financespringmodulith.goals.repository.GoalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoalService {

    private final GoalRepository repository;

    public GoalService(GoalRepository repository) {
        this.repository = repository;
    }

    public Goal save(Goal goal) {
        return repository.save(goal);
    }

    public List<Goal> findAll() {
        return repository.findAll();
    }
}

