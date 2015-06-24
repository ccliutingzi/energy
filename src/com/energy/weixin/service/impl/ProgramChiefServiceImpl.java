/**
 * 
 */
package com.energy.weixin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IProgramChiefDao;
import com.energy.weixin.entity.ProgramChief;
import com.energy.weixin.service.IProgramChiefService;

/**
 * @author tf
 *
 * 2015年6月24日
 */
@Service("programChiefService")
public class ProgramChiefServiceImpl implements IProgramChiefService {

	@Autowired
	private IProgramChiefDao programChiefDao;
	@Override
	public void addProgramChief(ProgramChief programChief) {
		programChiefDao.addProgramChief(programChief);
	}

}
