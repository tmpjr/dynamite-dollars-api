package com.dynamitedollars.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ExpenseController {
    @Autowired
    private ExpenseRepository expenseRepository;

    @GetMapping("/expenses")
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    @PostMapping("/expenses")
    public Expense createExpense(@Valid @RequestBody Expense expense) {
        return expenseRepository.save(expense);
    }
}
