package com.energy.weixin.service;

import java.util.List;

import com.energy.weixin.entity.SignUser;

public interface ISignUserService {

	public void addSignUser(SignUser signUser);

	public List<SignUser> getAllSignUser();

	public SignUser getSignUserById(String id);

	public void deleteById(String id);

	public void update(SignUser signUser);

}
