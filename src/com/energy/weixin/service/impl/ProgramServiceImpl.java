/**
 * 
 */
package com.energy.weixin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IProgramDao;
import com.energy.weixin.entity.Program;
import com.energy.weixin.service.IProgramService;

/**
 * @author tf
 *
 * 2015年6月24日
 */
@Service("programService")
public class ProgramServiceImpl implements IProgramService {

	@Autowired
	private IProgramDao programDao;
	@Override
	public void addProgram(Program program) {
		programDao.addProgram(program);
	}
}
