package com.finance.financespringmodulith.goals.repository;


import com.finance.financespringmodulith.goals.domain.Goal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalRepository extends JpaRepository<Goal, Long> {
}

