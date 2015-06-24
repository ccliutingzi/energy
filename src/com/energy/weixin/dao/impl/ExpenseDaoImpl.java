package com.energy.weixin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IExpenseDao;
import com.energy.weixin.entity.Expense;

/**
 * 
 * @author tf
 * 
 *         2015年6月24日
 */
@Service
public class ExpenseDaoImpl implements IExpenseDao {

	@Autowired
	private BaseDao baseDao;

	/**
	 * 添加报销信息
	 */
	private static final String ADDEXPENSE_SQL = "addExpense";
	/**
	 * 获取所有报销信息
	 */
	private static final String GETALLEXPENSE_SQL = "getAllExpense";
	/**
	 * 根据id获取报销信息
	 */
	private static final String GETEXPENSEBYID_SQL = "getExpenseById";
	/**
	 * 根据id删除报销信息
	 */
	private static final String DELETEBYID_SQL = "deleteById";
	/**
	 * 更新报销信息
	 */
	private static final String UPDATE_SQL = "update";

	@Override
	public void addExpense(Expense expense) {
		baseDao.insert(ADDEXPENSE_SQL, expense);
	}

	@Override
	public List<Expense> getAllExpense() {
		return baseDao.selectList(GETALLEXPENSE_SQL);
	}

	@Override
	public Expense getExpenseById(String id) {
		return baseDao.selectOne(GETEXPENSEBYID_SQL, id);
	}

	@Override
	public void deleteById(String id) {
		baseDao.delete(DELETEBYID_SQL, id);
	}

	@Override
	public void update(Expense expense) {
		baseDao.update(UPDATE_SQL, expense);
	}

}
