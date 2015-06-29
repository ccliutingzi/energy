/**
 * 
 */
package com.energy.weixin.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.fileupload.FileItem;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.energy.weixin.constant.Constants;
import com.energy.weixin.dao.IAccessoryDao;
import com.energy.weixin.entity.Accessory;
import com.energy.weixin.exception.EnergyException;
import com.energy.weixin.service.IAccessoryService;
import com.energy.weixin.utils.ConfigUtil;
import com.energy.weixin.utils.StringUtil;

/**
 * @author tf
 * 
 *         2015年6月24日
 */
@Service("accessoryService")
public class AccessoryServiceImpl implements IAccessoryService {

	private static final Logger LOGGER = Logger.getLogger(AccessoryServiceImpl.class);
	
	@Autowired
	private IAccessoryDao accessoryDao;

	@Override
	public void addAccessory(Accessory file) {
		accessoryDao.addAccessory(file);
	}

	@Override
	public List<Accessory> getAllAccessory() {
		return accessoryDao.getAllAccessory();
	}

	@Override
	public Accessory getAccessoryById(String id) {
		return accessoryDao.getAccessoryById(id);
	}

	@Override
	public void deleteById(String id) {
		accessoryDao.deleteById(id);
	}

	@Override
	public void update(Accessory file) {
		accessoryDao.update(file);
	}

	@Override
	public void addFile(List<FileItem> fileltems) {
		if (!CollectionUtils.isEmpty(fileltems)) {
			List<Accessory> fileList = new ArrayList<Accessory>();
			String path = ConfigUtil.get(Constants.ENERGY_CONFIG_PATH, "");
			if(StringUtil.isEmpty(path)){
				LOGGER.error("附件存储路径不存在!");
				throw new EnergyException("附件存储路径不存在!");
			}
			//File file = 
			for (FileItem fileItem : fileltems) {

			}
		}
	}

}
