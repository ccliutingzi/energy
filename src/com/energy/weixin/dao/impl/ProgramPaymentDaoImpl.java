package com.energy.weixin.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IProgramPaymentDao;
import com.energy.weixin.entity.ProgramPayment;

/**
 * 项目-回款DAO
 * 
 * @author tf
 * 
 *         2015年6月24日
 */
@Service
public class ProgramPaymentDaoImpl implements IProgramPaymentDao {
	@Autowired
	private BaseDao baseDao;

	/**
	 * 添加项目-回款信息
	 */
	private static final String ADDPROGRAMPAYMENT_SQL = "addProgramPayment";
	/**
	 * 获取所有项目-回款信息
	 */
//	private static final String GETALLPROGRAMPAYMENT_SQL = "getAllProgramPayment";
	/**
	 * 根据id获取项目-回款信息
	 */
//	private static final String GETPROGRAMPAYMENTBYID_SQL = "getProgramPaymentById";
	/**
	 * 根据id删除项目-回款信息
	 */
//	private static final String DELETEBYID_SQL = "deleteById";
	/**
	 * 更新项目-回款信息
	 */
//	private static final String UPDATE_SQL = "update";

	@Override
	public void addProgramPayment(ProgramPayment programPayment) {
		baseDao.insert(ADDPROGRAMPAYMENT_SQL, programPayment);
	}

}
