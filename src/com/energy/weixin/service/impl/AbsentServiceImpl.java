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
import com.energy.weixin.dao.IAbsentDao;
import com.energy.weixin.dao.IEntityAccountDao;
import com.energy.weixin.entity.Absent;
import com.energy.weixin.entity.EntityAccount;
import com.energy.weixin.entity.PageQueryParameter;
import com.energy.weixin.enums.AccountType;
import com.energy.weixin.enums.PersonType;
import com.energy.weixin.service.IAbsentService;
import com.energy.weixin.utils.CommonUtil;
import com.energy.weixin.utils.ConfigUtil;
import com.energy.weixin.utils.DateUtil;
import com.energy.weixin.utils.StringUtil;
import com.energy.weixin.web.api.SendMessage;
import com.energy.weixin.web.model.DataResult;

/**
 * 请假服务
 * 
 * @author tf
 * 
 *         2015年6月24日
 */
@Service("absentService")
public class AbsentServiceImpl implements IAbsentService {

	private static final Logger LOGGER = Logger.getLogger(AbsentServiceImpl.class);

	/**
	 * 请假
	 */
	@Autowired
	private IAbsentDao absentDao;
	/**
	 * 实体-账户
	 */
	@Autowired
	private IEntityAccountDao entityAccountDao;

	@Override
	public void addAbsent(Absent absent) {
		absentDao.addAbsent(absent);
	}

	@Override
	public List<Absent> getAllAbsent() {
		return absentDao.getAllAbsent();
	}

	@Override
	public Absent getAbsentById(String id) {
		return absentDao.getAbsentById(id);
	}

	@Override
	public void deleteById(String id) {
		absentDao.deleteById(id);
	}

	@Override
	public void update(Absent absent) {
		absentDao.update(absent);
	}

	@Override
	public void doApply(String jsonAbsentApplyInfo) {

		if (StringUtil.isNotEmpty(jsonAbsentApplyInfo)) {
			JSONObject jsonAbsentApplyInfoObj = JSONObject.parseObject(jsonAbsentApplyInfo);
			// 获取请假信息
			Absent absent = new Absent();
			absent.setId(CommonUtil.GeneGUID());
			absent.setUserId(jsonAbsentApplyInfoObj.getString("userId"));
			absent.setUserName(jsonAbsentApplyInfoObj.getString("userName"));
			absent.setAbsentType(jsonAbsentApplyInfoObj.getString("absentType"));
			absent.setReason(jsonAbsentApplyInfoObj.getString("reason"));
			absent.setPosition(jsonAbsentApplyInfoObj.getString("position"));
			absent.setDepartment(jsonAbsentApplyInfoObj.getString("department"));
			absent.setBeginTime(DateUtil.stringToDate(jsonAbsentApplyInfoObj.getString("beginTime")));
			absent.setEndTime(DateUtil.stringToDate(jsonAbsentApplyInfoObj.getString("endTime")));
			absent.setCreateTime(new Date());
			absent.setStatus("0");
			// 获取审核人 抄送者
			List<EntityAccount> entityAccountList = new ArrayList<EntityAccount>();
			EntityAccount entityAccount = new EntityAccount();
			entityAccount.setEntityId(absent.getId());
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
					entityAccount.setEntityId(absent.getId());
					entityAccount.setAccountId(StringUtil.getString(object));
					entityAccount.setAccountType(AccountType.U.value());
					entityAccount.setPersonType(PersonType.CS.value());
					entityAccount.setDealResult("0");
					entityAccountList.add(entityAccount);
				}
			}
			// 添加请假信息
			absentDao.addAbsent(absent);
			// 审核人 抄送人
			entityAccountDao.addEntityAccount(entityAccountList.toArray(new EntityAccount[] {}));
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

	@Override
	public DataResult<Absent> queryAbsentRecord(Absent absent, int pageIndex, int pageSize) {
		DataResult<Absent> dataResult = new DataResult<Absent>();
		PageQueryParameter pageQueryParameter = new PageQueryParameter();
		pageQueryParameter.setPageIndex(pageIndex);
		pageQueryParameter.setPageSize(pageSize);
		pageQueryParameter.setParameter(absent);
		dataResult.setDataList(absentDao.queryAbsent(pageQueryParameter));
		dataResult.setTotal((int)absentDao.queryCount(pageQueryParameter));
		return dataResult;
	}
}
