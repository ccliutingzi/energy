package com.energy.weixin.service;

import java.util.List;

import org.apache.commons.fileupload.FileItem;

import com.energy.weixin.entity.Accessory;

public interface IAccessoryService {

	public void addAccessory(Accessory accessory);

	public List<Accessory> getAllAccessory();

	public Accessory getAccessoryById(String id);

	public void deleteById(String id);

	public void update(Accessory accessory);

	/**
	 * 添加附件信息
	 * 
	 * @param fileltems
	 */
	public void addAccessory(List<FileItem> fileltems);

}
