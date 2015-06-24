/**
 * 
 */
package com.energy.weixin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IProgramFeedDao;
import com.energy.weixin.entity.ProgramFeed;
import com.energy.weixin.service.IProgramFeedService;

/**
 * @author tf
 * 
 *         2015年6月24日
 */
@Service("programFeedService")
public class ProgramFeedServiceImpl implements IProgramFeedService {

	@Autowired
	private IProgramFeedDao programFeedDao;

	@Override
	public void addProgramFeed(ProgramFeed programFeed) {
		programFeedDao.addProgramFeed(programFeed);
	}
}
