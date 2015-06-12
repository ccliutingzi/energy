package com.energy.weixin.mapper;

import java.util.List;

import com.energy.weixin.entity.Absent;

public interface AbsentMapper {

	public void addAbsent(Absent absent);

	public List<Absent> getAllAbsent();

	public Absent getAbsentById(String id);

	public void deleteById(String id);

	public void update(Absent absent);

}
