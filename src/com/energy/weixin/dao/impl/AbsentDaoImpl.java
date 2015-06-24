/**
 * 
 */
package com.energy.weixin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IAbsentDao;
import com.energy.weixin.entity.Absent;

/**
 * @author tf
 * 
 *         2015年6月24日
 */
@Service
public class AbsentDaoImpl implements IAbsentDao {

	@Autowired
	private BaseDao baseDao;

	private static final String ADDABSENT_SQL = "addAbsent";
	
	@Override
	public void addAbsent(Absent absent) {
		baseDao.insert(ADDABSENT_SQL, absent);
	}

	@Override
	public List<Absent> getAllAbsent() {
		return null;
	}

	@Override
	public Absent getAbsentById(String id) {
		return null;
	}

	@Override
	public void deleteById(String id) {

	}

	@Override
	public void update(Absent absent) {

	}

}
