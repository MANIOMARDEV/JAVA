package com.project.savetravels.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.project.savetravels.models.Expense;
import com.project.savetravels.services.ExpenseService;

import jakarta.validation.Valid;

@Controller
public class MainController {
	@Autowired
	private ExpenseService expenseService;
	
	@GetMapping("/expenses")
	public String index(@ModelAttribute("modelExpense") Expense expense, Model model) {
		List<Expense> expenses = expenseService.getAll();
		model.addAttribute("expenses", expenses);
		return "index.jsp";
	}
	
	@PostMapping("/addExpense")
	public String index(@Valid @ModelAttribute("modelExpense") Expense expense, 
			BindingResult result, 
			Model model) {
		if(result.hasErrors()) {
			List<Expense> expenses = expenseService.getAll();
			model.addAttribute(expenses);
			return "index.jsp";			
		}
		else {
			expenseService.create(expense);
			return "redirect:/expenses";
		}
	}
	
	@GetMapping("/expenses/edit/{id}")
	public String editExpenses(@PathVariable("id") Long id, Model model) {
		Expense expense = expenseService.getOne(id);
		model.addAttribute("expense", expense);
		return "editForm.jsp";
	}
	
	@PutMapping("/expenses/edit/{id}")
	public String updateOne(@PathVariable("id") Long id, 
			@Valid @ModelAttribute("modelExpense") Expense expense, 
			BindingResult result, 
			Model model) {
		if (result.hasErrors()) {
			return "editForm.jsp";
		}
		else {
			expenseService.update(expense);
			return "redirect:/expenses";
		}
	}	
	
	@DeleteMapping("expenses/{id}")
	public String destroy(@PathVariable("id") Long id) {
		expenseService.delete(id);
		return "redirect:/expenses";
	}
	
	@GetMapping("/expenses/{id}")
	public String displayOne(@PathVariable("id") Long id, Model model) {
		Expense expense = expenseService.getOne(id);
		model.addAttribute("expense", expense);
		return "displayOne.jsp";
	}
}