/**
 * 
 */
package com.energy.weixin.constant;

/**
 * @author tf
 * 
 *         2015年6月25日
 */
public interface Constants {

	/**
	 * 微信相关配置
	 */
	String WEIXIN_APP_PATH = "resources\\config\\weixin_app.properties";
	/**
	 * 系统相关配置
	 */
	String ENERGY_CONFIG_PATH = "resources\\config\\energy_config.properties";

	/**
	 * 附件存储路径
	 */
	String ACCESSORY_STORAGE_PATH = "accessory_storage_path";

	/**
	 * 文件目录名称
	 */
	String FILE_DIR = "resource_dir";

	/**
	 * 图片缩放目录名称
	 */
	String ZOOM_DIR = "imageZoom";

	/****************************** 系统类型 **************************************/

	/**
	 * 请假
	 */
	String SYSTEM_ABSENT_TYPE = "AbsentType";
	/**
	 * 账户类型
	 */
	String SYSTEM_ACCOUNT_TYPE = "AccountType";
	/**
	 * 出勤类型
	 */
	String SYSTEM_ATTEND_TYPE = "AttendType";
	/**
	 * 负责人类型
	 */
	String SYSTEM_CHIEF_TYPE = "ChiefType";
	/**
	 * 建设类型
	 */
	String SYSTEM_CONSTRUCTION_TYPE = "ConstructionType";
	/**
	 * 实体类型
	 */
	String SYSTEM_ENTITY_TYPE = "EntityType";
	/**
	 * 人员类型
	 */
	String SYSTEM_PERSON_TYPE = "PersonType";
	/**
	 * 职务/岗位
	 */
	String SYSTEM_POSITION = "Position";
	/**
	 * 职务/岗位类型
	 */
	String SYSTEM_POSITION_TYPE = "PositionType";
	/**
	 * 项目性质
	 */
	String SYSTEM_PROGRAM_NATURE = "ProgramNature";
	/**
	 * 项目所属阶段
	 */
	String SYSTEM_PROGRAM_STAGE = "ProgramStage";
	/**
	 * 项目类型
	 */
	String SYSTEM_PROGRAM_TYPE = "ProgramType";
	/**
	 * 签到类型
	 */
	String SYSTEM_SIGN_TYPE = "SignType";
	/**
	 * 状态枚举类
	 */
	String SYSTEM_STATUS = "Status";

}
