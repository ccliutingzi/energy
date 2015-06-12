package com.energy.weixin.mapper;

import java.util.List;

import com.energy.weixin.entity.Expense;

public interface ExpenseMapper {

	public void addExpense(Expense expense);

	public List<Expense> getAllExpense();

	public Expense getExpenseById(String id);

	public void deleteById(String id);

	public void update(Expense expense);

}
