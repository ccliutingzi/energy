/**
 * 
 */
package com.energy.weixin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IProgramPositionDao;
import com.energy.weixin.entity.ProgramPosition;
import com.energy.weixin.service.IProgramPositionService;

/**
 * @author tf
 * 
 *         2015年6月24日
 */
@Service("programPositionService")
public class ProgramPositionServiceImpl implements IProgramPositionService {

	@Autowired
	private IProgramPositionDao programPositionDao;

	@Override
	public void addProgramPosition(ProgramPosition programPosition) {
		programPositionDao.addProgramPosition(programPosition);
	}
}
