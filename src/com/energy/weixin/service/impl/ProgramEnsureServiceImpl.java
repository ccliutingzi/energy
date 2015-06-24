/**
 * 
 */
package com.energy.weixin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IProgramEnsureDao;
import com.energy.weixin.entity.ProgramEnsure;
import com.energy.weixin.service.IProgramEnsureService;

/**
 * @author tf
 * 
 *         2015年6月24日
 */
@Service("programEnsureService")
public class ProgramEnsureServiceImpl implements IProgramEnsureService {

	@Autowired
	private IProgramEnsureDao programEnsureDao;

	@Override
	public void addProgramEnsure(ProgramEnsure programEnsure) {
		programEnsureDao.addProgramEnsure(programEnsure);
	}

}
