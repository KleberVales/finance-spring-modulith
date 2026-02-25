package com.finance.financespringmodulith.goals.controller;


import com.finance.financespringmodulith.goals.domain.Goal;
import com.finance.financespringmodulith.goals.service.GoalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goals")
public class GoalController {

    private final GoalService service;

    public GoalController(GoalService service) {
        this.service = service;
    }

    @PostMapping
    public Goal create(@RequestBody Goal goal) {
        return service.save(goal);
    }

    @GetMapping
    public List<Goal> list() {
        return service.findAll();
    }
}

