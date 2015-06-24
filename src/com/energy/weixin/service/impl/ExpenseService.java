/**
 * 
 */
package com.energy.weixin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IExpenseDao;
import com.energy.weixin.entity.Expense;
import com.energy.weixin.service.IExpenseService;

/**
 * @author tf
 * 
 *         2015年6月24日
 */
@Service("expenseService")
public class ExpenseService implements IExpenseService {

	@Autowired
	private IExpenseDao expenseDao;

	@Override
	public void addExpense(Expense expense) {
		expenseDao.addExpense(expense);
	}

	@Override
	public List<Expense> getAllExpense() {
		return expenseDao.getAllExpense();
	}

	@Override
	public Expense getExpenseById(String id) {
		return expenseDao.getExpenseById(id);
	}

	@Override
	public void deleteById(String id) {
		expenseDao.deleteById(id);
	}

	@Override
	public void update(Expense expense) {
		expenseDao.update(expense);
	}

}
