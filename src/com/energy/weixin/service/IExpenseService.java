package com.energy.weixin.service;

import java.util.List;

import org.apache.commons.fileupload.FileItem;

import com.energy.weixin.entity.Expense;
import com.energy.weixin.entity.Accessory;

public interface IExpenseService {

	public void addExpense(Expense expense);

	public List<Expense> getAllExpense();

	public Expense getExpenseById(String id);

	public void deleteById(String id);

	public void update(Expense expense);

	/**
	 * 报销申请
	 * 
	 * @param params
	 *            expenseApplyInfo json数据信息{expenseInfo:'',auditor:'',cc:[]}
	 * @param fileltems 附件信息
	 */
	public void doApply(String expenseApplyInfo, List<FileItem> fileltems);

}
