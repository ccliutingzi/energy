/**
 * 
 */
package com.energy.weixin.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.energy.weixin.constant.Constants;
import com.energy.weixin.dao.IExpenseDao;
import com.energy.weixin.entity.EntityAccount;
import com.energy.weixin.entity.Expense;
import com.energy.weixin.enums.AccountType;
import com.energy.weixin.enums.PersonType;
import com.energy.weixin.service.IEntityAccountService;
import com.energy.weixin.service.IExpenseService;
import com.energy.weixin.service.IFileService;
import com.energy.weixin.utils.CommonUtil;
import com.energy.weixin.utils.ConfigUtil;
import com.energy.weixin.utils.StringUtil;
import com.energy.weixin.web.api.SendMessage;

/**
 * @author tf
 * 
 *         2015年6月24日
 */
@Service("expenseService")
public class ExpenseServiceImpl implements IExpenseService {

	private static final Logger LOGGER = Logger.getLogger(ExpenseServiceImpl.class);

	/**
	 * 报销dao
	 */
	@Autowired
	private IExpenseDao expenseDao;

	/**
	 * 实体-账户服务
	 */
	@Autowired
	private IEntityAccountService entityAccountService;

	/**
	 * 文件服务
	 */
	@Autowired
	private IFileService fileService;

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

	@Override
	public void doApply(String expenseApplyInfo) {
		if (StringUtil.isNotEmpty(expenseApplyInfo)) {
			JSONObject jsonAbsentApplyInfoObj = JSONObject.parseObject(expenseApplyInfo);
			// 获取请假信息
			Expense expense = new Expense();
			expense.setId(CommonUtil.GeneGUID());
			expense.setUserId(jsonAbsentApplyInfoObj.getString("userId"));
			expense.setUserName(jsonAbsentApplyInfoObj.getString("userName"));
			expense.setTheme(jsonAbsentApplyInfoObj.getString("theme"));
			expense.setReason(jsonAbsentApplyInfoObj.getString("reason"));
			expense.setAmount(Float.valueOf(jsonAbsentApplyInfoObj.getString("amount")));
			expense.setAnnexCount(Integer.valueOf(jsonAbsentApplyInfoObj.getString("annexCount")));
			expense.setDepartment(jsonAbsentApplyInfoObj.getString("department"));
			expense.setCreateTime(new Date());
			expense.setStatus("1");
			// 获取审核人 抄送者
			List<EntityAccount> entityAccountList = new ArrayList<EntityAccount>();
			EntityAccount entityAccount = new EntityAccount();
			entityAccount.setEntityId(expense.getId());
			entityAccount.setAccountId(jsonAbsentApplyInfoObj.getString("auditor"));
			entityAccount.setAccountType(AccountType.U.value());
			entityAccount.setPersonType(PersonType.SH.value());
			entityAccount.setDealResult("0");
			entityAccountList.add(entityAccount);
			// 抄送者
			if (jsonAbsentApplyInfoObj.containsKey("cc")) {
				JSONArray jsonCcs = jsonAbsentApplyInfoObj.getJSONArray("cc");
				for (Object object : jsonCcs) {
					entityAccount = new EntityAccount();
					entityAccount.setEntityId(expense.getId());
					entityAccount.setAccountId(StringUtil.getString(object));
					entityAccount.setAccountType(AccountType.U.value());
					entityAccount.setPersonType(PersonType.CS.value());
					entityAccount.setDealResult("0");
					entityAccountList.add(entityAccount);
				}
			}
			// 添加请假信息
			expenseDao.addExpense(expense);
			// 附件信息
			//fileService.addFile();
			// 审核人 抄送人
			entityAccountService.addEntityAccount(entityAccountList.toArray(new EntityAccount[] {}));
			// 发送消息通知
			Map<String, Object> message = new HashMap<String, Object>();
			try {
				StringBuffer touser = new StringBuffer();
				for (int i = 0, length = entityAccountList.size(); i < length; i++) {
					if (i >= 0) {
						touser.append('|');
					}
					touser.append(entityAccountList.get(0).getAccountId());
				}
				Map<String, Object> text = new HashMap<String, Object>();
				text.put("content", "请审批谢谢!");
				message.put("agentid", ConfigUtil.get(Constants.WEIXIN_APP_PATH, "absent_agentid"));
				text.put("safe", "0");
				SendMessage.getInstance().sendText(message);
			} catch (Exception e) {
				LOGGER.error("消息推送失败!", e);
				e.printStackTrace();
			}
		} else {
			LOGGER.warn("请假信息为空！");
		}
	}

}
