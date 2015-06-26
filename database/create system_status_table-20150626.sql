DROP TABLE IF EXISTS `system_status_table`;
CREATE TABLE `system_status_table` (
  `ID` int(11) NOT NULL COMMENT '唯一ID',
  `Type` varchar(32) DEFAULT NULL COMMENT '类型',
  `Status` varchar(10) DEFAULT NULL COMMENT '状态',
  `Name` varchar(100) DEFAULT NULL COMMENT '状态名称',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统状态配置';


-----------------------
-- 初始化系统配置
-----------------------
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

--人员类型
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

--职务/岗位类型
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('80001', 'PositionType', '0', '主设');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('80002', 'PositionType', '1', '校核');

--项目性质
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('90001', 'ProgramNature', '0', '系统');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('90002', 'ProgramNature', '1', '业扩');

--项目所属阶段
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('11001', 'ProgramStage', '0', '可研');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('11002', 'ProgramStage', '1', '初设');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('11001', 'ProgramStage', '2', '施工图');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('11002', 'ProgramStage', '3', '竣工图');

--项目类型
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('12001', 'ProgramType', '0', '配网');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('12002', 'ProgramType', '1', '主网');


--签到类型
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('13001', 'SignType', '0', '考勤签到');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('13002', 'SignType', '1', '其他签到');

--状态枚举类
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('13001', 'Status', '0', '考勤签到');
INSERT INTO `system_status_table`(`ID`,`Type`,`Status`,`Name`) VALUES ('13002', 'Status', '1', '其他签到');

草稿(0), 待审核(1), 审核中(2), 已审核(3), 待报销(4), 已报销(5), 实施中(6), 结束确认中(7), 已结束(8);









