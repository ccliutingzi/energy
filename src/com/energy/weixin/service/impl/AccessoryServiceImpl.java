/**
 * 
 */
package com.energy.weixin.service.impl;

import java.io.File;
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
import com.energy.weixin.utils.CommonUtil;
import com.energy.weixin.utils.ConfigUtil;
import com.energy.weixin.utils.ImageUtil;
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
	public void addAccessory(List<FileItem> fileltems) {
		if (!CollectionUtils.isEmpty(fileltems)) {
			List<Accessory> fileList = new ArrayList<Accessory>();
			String storagePath = ConfigUtil.get(Constants.ENERGY_CONFIG_PATH, Constants.ACCESSORY_STORAGE_PATH);
			String fileDirName = ConfigUtil.get(Constants.ENERGY_CONFIG_PATH, Constants.FILE_DIR, "resource");
			String zoomDirName = ConfigUtil.get(Constants.ENERGY_CONFIG_PATH, Constants.ZOOM_DIR, "imageZoom");
			if (StringUtil.isEmpty(storagePath)) {
				LOGGER.error("附件存储路径不存在!");
				throw new EnergyException("附件存储路径不存在!");
			}
			File storageDir = new File(storagePath);
			File fileDir = new File(storageDir + File.separator + fileDirName);
			File zoomDir = new File(storageDir + File.separator + zoomDirName);
			// 创建存储目录
			if (!storageDir.exists()) {
				storageDir.mkdirs();
			} else if (!storageDir.isDirectory()) {
				LOGGER.error("附件存储路径不是目录!");
				throw new EnergyException("附件存储路径不是目录!");
			}

			if (!fileDir.exists()) {
				fileDir.mkdirs();
			}
			if (!zoomDir.exists()) {
				zoomDir.mkdirs();
			}

			Accessory accessory = null;
			for (FileItem fileItem : fileltems) {
				if (!fileItem.isFormField()) {
					accessory = new Accessory();
					accessory.setId(CommonUtil.GeneGUID());
					accessory.setFileName(fileItem.getName());
					accessory.setFilePath(storageDir + File.separator + Constants.FILE_DIR);
					accessory.setZoomPath(storageDir + File.separator + Constants.ZOOM_DIR);
					fileList.add(accessory);
				}
			}
			accessoryDao.addAccessory(null);
			// 存储附件
			File file = null;
			FileItem fileItem = null;
			for (int i = 0, size = fileltems.size(); i < size; i++) {
				fileItem = fileltems.get(i);
				if (!fileItem.isFormField()) {
					file = new File(fileDir, fileItem.getName());
					try {
						fileItem.write(file);
						ImageUtil.getInstance().zoomImage(file);
					} catch (Exception e) {
						LOGGER.error("附件保存出现异常!", e);
						// 删除以创建的资源
						for (int j = i; j >= 0; j--) {
							file = new File(fileDir, fileItem.getName());
							file.delete();
							file = new File(zoomDir, fileItem.getName());
							if (file.exists()) {
								file.delete();
							}
						}
						throw new EnergyException(e);
					}
				}
			}
		}
	}
}
