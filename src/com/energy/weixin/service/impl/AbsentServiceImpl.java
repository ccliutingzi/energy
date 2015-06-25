/**
 * 
 */
package com.energy.weixin.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.energy.weixin.dao.IAbsentDao;
import com.energy.weixin.dao.IEntityAccountDao;
import com.energy.weixin.entity.Absent;
import com.energy.weixin.entity.EntityAccount;
import com.energy.weixin.enums.AbsentType;
import com.energy.weixin.enums.AccountType;
import com.energy.weixin.enums.PersonType;
import com.energy.weixin.enums.Status;
import com.energy.weixin.service.IAbsentService;
import com.energy.weixin.utils.CommonUtil;
import com.energy.weixin.utils.DateUtil;
import com.energy.weixin.utils.StringUtil;

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

		if (StringUtil.isEmpty(jsonAbsentApplyInfo)) {
			JSONObject jsonAbsentApplyInfoObj = JSONObject.parseObject(jsonAbsentApplyInfo);
			// 获取请假信息
			Absent absent = new Absent();
			absent.setId(CommonUtil.GeneGUID());
			absent.setUserId(jsonAbsentApplyInfoObj.getString("userId"));
			absent.setUserName(jsonAbsentApplyInfoObj.getString("userName"));
			absent.setAbsentType(AbsentType.valueOf(jsonAbsentApplyInfoObj.getString("absentType")));
			absent.setReason(jsonAbsentApplyInfoObj.getString("reason"));
			absent.setPosition(jsonAbsentApplyInfoObj.getString("position"));
			absent.setDepartment(jsonAbsentApplyInfoObj.getString("department"));
			absent.setBeginTime(DateUtil.stringToDate(jsonAbsentApplyInfoObj.getString("beginTime")));
			absent.setEndTime(DateUtil.stringToDate(jsonAbsentApplyInfoObj.getString("endTime")));
			absent.setCreateTime(new Date());
			absent.setStatus(Status.草稿);

			// 获取审核人 抄送者
			List<EntityAccount> entityAccountList = new ArrayList<EntityAccount>();
			EntityAccount entityAccount = new EntityAccount();
			entityAccount.setEntityID(absent.getId());
			entityAccount.setAccountID(jsonAbsentApplyInfoObj.getString("accountID"));
			entityAccount.setAccountType(AccountType.U);
			entityAccount.setPersonType(PersonType.SH);
			entityAccount.setDealResult("0");
			entityAccountList.add(entityAccount);
			// 抄送者
			if (jsonAbsentApplyInfoObj.containsKey("cc")) {
				JSONArray jsonCcs = jsonAbsentApplyInfoObj.getJSONArray("cc");
				for (Object object : jsonCcs) {
					entityAccount = new EntityAccount();
					entityAccount.setEntityID(absent.getId());
					entityAccount.setAccountID(StringUtil.getString(object));
					entityAccount.setAccountType(AccountType.U);
					entityAccount.setPersonType(PersonType.CS);
					entityAccount.setDealResult("0");
					entityAccountList.add(entityAccount);
				}
			}
			// 添加请假信息
			absentDao.addAbsent(absent);
			// 审核人 抄送人
			entityAccountDao.addEntityAccount(entityAccountList.toArray(new EntityAccount[] {}));
		
			//发送消息通知
			
			
			
		    
		} else {
			LOGGER.warn("信息为空！");
		}
	}
}
