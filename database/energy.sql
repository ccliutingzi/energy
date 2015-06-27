/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : energy

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2015-06-23 14:27:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for absent_table
-- ----------------------------
DROP TABLE IF EXISTS `absent_table`;
CREATE TABLE `absent_table` (
  `ID` char(32) NOT NULL,
  `UserID` char(32) NOT NULL,
  `UserName` char(10) DEFAULT NULL,
  `AbsentType` char(1) DEFAULT NULL,
  `Reason` varchar(100) DEFAULT NULL,
  `Position` char(20) DEFAULT NULL,
  `Department` char(20) DEFAULT NULL,
  `BeginTime` datetime DEFAULT NULL,
  `EndTime` datetime DEFAULT NULL,
  `CreateTime` datetime DEFAULT NULL,
  `Status` char(1) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `UserID_index` (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of absent_table
-- ----------------------------

-- ----------------------------
-- Table structure for approval_table
-- ----------------------------
DROP TABLE IF EXISTS `approval_table`;
CREATE TABLE `approval_table` (
  `ID` char(32) NOT NULL,
  `UserID` char(32) NOT NULL,
  `UserName` char(10) DEFAULT NULL,
  `FlowName` char(20) DEFAULT NULL,
  `Department` char(20) DEFAULT NULL,
  `Content` varchar(200) DEFAULT NULL,
  `Remark` varchar(200) DEFAULT NULL,
  `ContractNumber` char(60) DEFAULT NULL,
  `Partner` varchar(200) DEFAULT NULL,
  `CreateTime` datetime DEFAULT NULL,
  `FlowType` char(2) DEFAULT NULL,
  `Status` char(1) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `UserID_index` (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of approval_table
-- ----------------------------

-- ----------------------------
-- Table structure for entity_account_table
-- ----------------------------
DROP TABLE IF EXISTS `entity_account_table`;
CREATE TABLE `entity_account_table` (
  `EntityID` char(32) NOT NULL,
  `EntityType` char(2) DEFAULT NULL,
  `AccountID` char(20) DEFAULT NULL,
  `AccountType` char(1) DEFAULT NULL,
  `PersonType` char(2) DEFAULT NULL,
  `DealResult` char(1) DEFAULT NULL,
  'TargetDate' date default null,
  `Remark` varchar(200) DEFAULT NULL,
  `UpdateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  KEY `AccountID_index` (`AccountID`),
  KEY `EntityID_index` (`EntityID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of entity_account_table
-- ----------------------------

-- ----------------------------
-- Table structure for entity_file_table
-- ----------------------------
DROP TABLE IF EXISTS `entity_file_table`;
CREATE TABLE `entity_file_table` (
  `EntityID` char(32) NOT NULL,
  `FileID` char(32) NOT NULL,
  KEY `EntityID_index` (`EntityID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of entity_file_table
-- ----------------------------

-- ----------------------------
-- Table structure for entity_progress_table
-- ----------------------------
DROP TABLE IF EXISTS `entity_progress_table`;
CREATE TABLE `entity_progress_table` (
  `EntityID` char(32) NOT NULL,
  `Content` varchar(200) DEFAULT NULL,
  `CreateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  KEY `EntityID_index` (`EntityID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of entity_progress_table
-- ----------------------------

-- ----------------------------
-- Table structure for expense_table
-- ----------------------------
DROP TABLE IF EXISTS `expense_table`;
CREATE TABLE `expense_table` (
  `ID` char(32) NOT NULL,
  `UserID` char(32) NOT NULL,
  `UserName` char(10) DEFAULT NULL,
  `Theme` char(20) DEFAULT NULL,
  `Department` char(20) DEFAULT NULL,
  `Reason` varchar(200) DEFAULT NULL,
  `Amount` float(10,2) DEFAULT NULL,
  `AnnexCount` tinyint(4) DEFAULT NULL,
  `CreateTime` datetime DEFAULT NULL,
  `Status` char(1) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `UserID_index` (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of expense_table
-- ----------------------------

-- ----------------------------
-- Table structure for file_table
-- ----------------------------
DROP TABLE IF EXISTS `file_table`;
CREATE TABLE `file_table` (
  `ID` char(32) NOT NULL,
  `FileName` varchar(255) DEFAULT NULL,
  `FilePath` varchar(255) DEFAULT NULL,
  `ZoomPath` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of file_table
-- ----------------------------

-- ----------------------------
-- Table structure for meeting_building_table
-- ----------------------------
DROP TABLE IF EXISTS `meeting_building_table`;
CREATE TABLE `meeting_building_table` (
  `ID` char(32) NOT NULL,
  `BuildingName` char(30) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of meeting_building_table
-- ----------------------------

-- ----------------------------
-- Table structure for meeting_room_table
-- ----------------------------
DROP TABLE IF EXISTS `meeting_room_table`;
CREATE TABLE `meeting_room_table` (
  `ID` char(32) NOT NULL,
  `BuildingID` char(32) DEFAULT NULL,
  `RoomName` char(30) DEFAULT NULL,
  `Capacity` tinyint(4) DEFAULT NULL,
  `Equipment` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `BuildingID_index` (`BuildingID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of meeting_room_table
-- ----------------------------

-- ----------------------------
-- Table structure for meeting_table
-- ----------------------------
DROP TABLE IF EXISTS `meeting_table`;
CREATE TABLE `meeting_table` (
  `ID` char(32) NOT NULL,
  `UserID` char(32) NOT NULL,
  `UserName` char(10) DEFAULT NULL,
  `BuildingID` char(32) DEFAULT NULL,
  `RoomID` char(32) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `Time` time DEFAULT NULL,
  `TimeSpan` tinyint(4) DEFAULT NULL,
  `Theme` char(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `BuildingID_index` (`BuildingID`),
  KEY `RoomID_index` (`RoomID`),
  KEY `UserID_index` (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of meeting_table
-- ----------------------------

-- ----------------------------
-- Table structure for program_chief_table
-- ----------------------------
DROP TABLE IF EXISTS `program_chief_table`;
CREATE TABLE `program_chief_table` (
  `ID` char(32) NOT NULL,
  `ProgramID` char(32) NOT NULL,
  `UserID` char(32) DEFAULT NULL,
  `UserName` char(10) DEFAULT NULL,
  `Type` char(1) DEFAULT NULL COMMENT '类型，取值范围为：0-纵队负责人，1-项目部负责人，2-营销负责人，3-营销支出负责人，4-设计负责人，5-运营经理',
  `UpdateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`),
  KEY `ProgramID_index` (`ProgramID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of program_chief_table
-- ----------------------------

-- ----------------------------
-- Table structure for program_ensure_table
-- ----------------------------
DROP TABLE IF EXISTS `program_ensure_table`;
CREATE TABLE `program_ensure_table` (
  `ProgramID` char(32) NOT NULL,
  `UserID` char(32) DEFAULT NULL,
  `UserName` char(10) DEFAULT NULL,
  `UpdateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  KEY `ProgramID_index` (`ProgramID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of program_ensure_table
-- ----------------------------

-- ----------------------------
-- Table structure for program_feed_table
-- ----------------------------
DROP TABLE IF EXISTS `program_feed_table`;
CREATE TABLE `program_feed_table` (
  `ID` char(32) NOT NULL,
  `ProgramID` char(32) NOT NULL,
  `UserID` char(32) DEFAULT NULL,
  `UserName` char(10) DEFAULT NULL,
  `Content` varchar(500) DEFAULT NULL COMMENT '类型，取值范围为：0-纵队负责人，1-项目部负责人，2-营销负责人，3-营销支出负责人，4-设计负责人，5-运营经理',
  `UpdateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`),
  KEY `ProgramID_index` (`ProgramID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of program_feed_table
-- ----------------------------

-- ----------------------------
-- Table structure for program_payment_table
-- ----------------------------
DROP TABLE IF EXISTS `program_payment_table`;
CREATE TABLE `program_payment_table` (
  `ID` char(32) NOT NULL,
  `ProgramID` char(32) NOT NULL,
  `UserID` char(32) DEFAULT NULL,
  `UserName` char(10) DEFAULT NULL,
  `Amount` float(12,2) DEFAULT NULL COMMENT '类型，取值范围为：0-纵队负责人，1-项目部负责人，2-营销负责人，3-营销支出负责人，4-设计负责人，5-运营经理',
  `InvoiceDate` date DEFAULT NULL,
  `Remark` varchar(200) DEFAULT NULL,
  `UpdateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`),
  KEY `ProgramID_index` (`ProgramID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of program_payment_table
-- ----------------------------

-- ----------------------------
-- Table structure for program_position_table
-- ----------------------------
DROP TABLE IF EXISTS `program_position_table`;
CREATE TABLE `program_position_table` (
  `ID` char(32) NOT NULL,
  `ProgramID` char(32) NOT NULL,
  `UserID` char(32) DEFAULT NULL,
  `UserName` char(10) DEFAULT NULL,
  `Stage` char(1) DEFAULT NULL COMMENT '所属阶段，取值范围：0-可研、1-初设、2-施工图、3-竣工图',
  `Position` char(2) DEFAULT NULL,
  `Type` char(1) DEFAULT NULL COMMENT '类型，取值范围：0-主设，1-校核',
  `UpdateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`),
  KEY `ProgramID_index` (`ProgramID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of program_position_table
-- ----------------------------

-- ----------------------------
-- Table structure for program_table
-- ----------------------------
DROP TABLE IF EXISTS `program_table`;
CREATE TABLE `program_table` (
  `ID` char(32) NOT NULL,
  `UserID` char(32) NOT NULL,
  `UserName` char(10) DEFAULT NULL,
  `ProgramName` varchar(255) DEFAULT NULL,
  `Partner` varchar(200) DEFAULT NULL,
  `PartnerPerson` char(32) DEFAULT NULL,
  `ConstructionType` char(2) DEFAULT NULL COMMENT '建设类型，取值范围为：XJ-新建，JG-技改，DX-大修',
  `ProgramNature` char(2) DEFAULT NULL,
  `ProxySignTime` date DEFAULT NULL,
  `ContractSignTime` date DEFAULT NULL,
  `TotalInvestment` float(12,2) DEFAULT NULL,
  `DesignFee` float(12,2) DEFAULT NULL,
  `ProgramScale` varchar(1000) DEFAULT NULL,
  `ExpectedEndDate` date DEFAULT NULL,
  `CompletedStage` char(1) DEFAULT NULL COMMENT '已完成阶段，取值范围：0-可研、1-初设、2-施工图、3-竣工图',
  `PresentStage` char(1) DEFAULT NULL COMMENT '现所属阶段，取值范围：0-可研、1-初设、2-施工图、3-竣工图',
  `ApprovalMatter` varchar(100) DEFAULT NULL,
  `CompleteMatter` varchar(100) DEFAULT NULL,
  `DrawingsMatter` varchar(100) DEFAULT NULL,
  `ProgramType` char(1) DEFAULT NULL COMMENT '项目类别，取值范围：0-配网，1-主网',
  `Remark` varchar(200) DEFAULT NULL,
  `IsEnsured` tinyint(1) DEFAULT NULL,
  `Status` char(1) DEFAULT NULL COMMENT '当前状态，取值范围：0-草稿，1-待审核，2-审核中，6-实施中，7-结束确认中，8-已结束',
  `UpdateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`),
  KEY `UserID_index` (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of program_table
-- ----------------------------

-- ----------------------------
-- Table structure for sign_table
-- ----------------------------
DROP TABLE IF EXISTS `sign_table`;
CREATE TABLE `sign_table` (
  `ID` char(32) NOT NULL,
  `UserID` char(32) NOT NULL,
  `UserName` char(10) DEFAULT NULL,
  `Theme` char(30) DEFAULT NULL,
  `BeginTime` datetime DEFAULT NULL,
  `EndTime` datetime DEFAULT NULL,
  `SignType` char(2) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `UserID_index` (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sign_table
-- ----------------------------

-- ----------------------------
-- Table structure for sign_user_table
-- ----------------------------
DROP TABLE IF EXISTS `sign_user_table`;
CREATE TABLE `sign_user_table` (
  `SignID` char(32) NOT NULL,
  `UserID` char(32) NOT NULL,
  `Location` varchar(200) DEFAULT NULL,
  `SignTime` datetime DEFAULT NULL,
  `AttendType` char(2) DEFAULT NULL,
  `Remark` varchar(200) DEFAULT NULL,
  KEY `SignID_index` (`SignID`) USING HASH,
  KEY `UserID_index` (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sign_user_table
-- ----------------------------

-- ----------------------------
-- Table structure for system_status_table
-- ----------------------------
DROP TABLE IF EXISTS `system_status_table`;
CREATE TABLE `system_status_table` (
  `ID` int(11) NOT NULL COMMENT '唯一ID',
  `Type` varchar(32) DEFAULT NULL COMMENT '类型',
  `Status` varchar(10) DEFAULT NULL COMMENT '状态',
  `Name` varchar(100) DEFAULT NULL COMMENT '状态名称',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统状态配置';

-- ---------------------
-- 初始化系统配置
-- ---------------------
-- ----------------------------
-- Records of system_status_table
-- ----------------------------
-- 请假
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('00001', 'AbsentType', '0', '事假');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('00002', 'AbsentType', '1', '病假');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('00003', 'AbsentType', '2', '丧假');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('00004', 'AbsentType', '3', '产假');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('00005', 'AbsentType', '4', '特殊休假');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('00006', 'AbsentType', '5', '其他');

-- 账户类型
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('10001', 'AccountType', '0', '部门');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('10002', 'AccountType', '1', '标签');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('10003', 'AccountType', '2', '用户');

-- 出勤类型
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('20001', 'AttendType', '0', '签到');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('20002', 'AttendType', '1', '签退');

-- 负责人类型
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('30001', 'ChiefType', '0', '纵队负责人');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('30002', 'ChiefType', '1', '项目部负责人');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('30003', 'ChiefType', '2', '营销负责人');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('30004', 'ChiefType', '3', '营销支出负责人');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('30005', 'ChiefType', '4', '设计负责人');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('30006', 'ChiefType', '5', '运营经理');

-- 建设类型
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('40001', 'ConstructionType', '0', '新建');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('40002', 'ConstructionType', '1', '技改');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('40003', 'ConstructionType', '2', '大修');

-- 实体类型
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('50001', 'EntityType', '0', '签到');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('50002', 'EntityType', '1', '请假');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('50003', 'EntityType', '2', '报销');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('50004', 'EntityType', '3', '审批');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('50005', 'EntityType', '4', '会议室预定');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('50006', 'EntityType', '5', '项目管理');

-- 人员类型
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('60001', 'PersonType', '0', '审核');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('60002', 'PersonType', '1', '抄送');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('60003', 'PersonType', '2', '财务');

-- 职务/岗位
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('70001', 'Position', '0', '设总');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('70002', 'Position', '1', '变电一次设计');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('70003', 'Position', '2', '变电二次');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('70004', 'Position', '3', '土建');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('70005', 'Position', '4', '水工');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('70006', 'Position', '5', '暖通');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('70007', 'Position', '6', '技经');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('70008', 'Position', '7', '系统');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('70009', 'Position', '8', '通信');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('70010', 'Position', '9', '设计');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('70011', 'Position', '10', '报物资人员');

-- 职务/岗位类型
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('80001', 'PositionType', '0', '主设');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('80002', 'PositionType', '1', '校核');

-- 项目性质
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('90001', 'ProgramNature', '0', '系统');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('90002', 'ProgramNature', '1', '业扩');

-- 项目所属阶段
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('11001', 'ProgramStage', '0', '可研');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('11002', 'ProgramStage', '1', '初设');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('11003', 'ProgramStage', '2', '施工图');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('11004', 'ProgramStage', '3', '竣工图');

-- 项目类型
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('12001', 'ProgramType', '0', '配网');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('12002', 'ProgramType', '1', '主网');


-- 签到类型
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('13001', 'SignType', '0', '考勤签到');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('13002', 'SignType', '1', '其他签到');

-- 状态枚举类
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('14001', 'Status', '0', '草稿');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('14002', 'Status', '1', '待审核');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('14003', 'Status', '2', '审核中');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('14004', 'Status', '3', '已审核');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('14005', 'Status', '4', '待报销');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('14006', 'Status', '5', '已报销');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('14007', 'Status', '6', '实施中');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('14008', 'Status', '7', '结束确认中');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('14009', 'Status', '8', '已结束');