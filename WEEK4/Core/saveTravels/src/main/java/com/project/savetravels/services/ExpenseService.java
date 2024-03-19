package com.project.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.savetravels.models.Expense;
import com.project.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepo;

	public Expense create(Expense expense) {
		return expenseRepo.save(expense);
	}

	public List<Expense> getAll() {
		return expenseRepo.findAll();
	}

	public Expense getOne(Long id) {
		Optional<Expense> optionalExpense = expenseRepo.findById(id);
		if (optionalExpense.isPresent()) {
			return optionalExpense.get();
		} else {
			return null;
		}
	}

	public Expense update(Expense expense) {
		return expenseRepo.save(expense);
	}

	public String delete(Long id) {
		expenseRepo.deleteById(id);
		return id + " has been deleted";
	}
}