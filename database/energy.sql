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
