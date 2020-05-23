package com.victor.expensetracker1.repository;

import com.victor.expensetracker1.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
