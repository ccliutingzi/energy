/**
 * 
 */
package com.energy.weixin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IProgramPaymentDao;
import com.energy.weixin.entity.ProgramPayment;
import com.energy.weixin.service.IProgramPaymentService;

/**
 * @author tf
 * 
 *         2015年6月24日
 */
@Service("programPaymentService")
public class ProgramPaymentServiceImpl implements IProgramPaymentService {

	@Autowired
	private IProgramPaymentDao programPaymentDao;

	@Override
	public void addProgramPayment(ProgramPayment programPayment) {
		programPaymentDao.addProgramPayment(programPayment);
	}
}
