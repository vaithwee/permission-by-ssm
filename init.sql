/*
 Navicat Premium Data Transfer

 Source Server         : Localhost
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : pmbssm

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 26/11/2019 09:47:41
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sya_acl
-- ----------------------------
DROP TABLE IF EXISTS `sya_acl`;
CREATE TABLE `sya_acl`
(
    `id`            INT(11)                                                NOT NULL AUTO_INCREMENT COMMENT '权限id',
    `code`          VARCHAR(255)                                           NOT NULL DEFAULT '' COMMENT '权限代码',
    `name`          VARCHAR(255)                                           NOT NULL DEFAULT '' COMMENT '权限名称',
    `acl_module_id` INT(11)                                                NOT NULL DEFAULT '0' COMMENT '权限模块id',
    `url`           VARCHAR(255)                                           NOT NULL DEFAULT '' COMMENT '权限链接',
    `type`          INT(11)                                                NOT NULL DEFAULT '0' COMMENT '权限类型 | 0: 其他 1: 菜单 2: 链接',
    `status`        INT(11)                                                NOT NULL DEFAULT '1' COMMENT '权限状态 | 0: 冻结 1: 正常',
    `seq`           INT(11)                                                NOT NULL DEFAULT '0' COMMENT '权限排序',
    `reamark`       VARCHAR(255)                                                    DEFAULT NULL COMMENT '备注',
    `operator`      VARCHAR(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '操作者',
    `operate_timer` DATETIME                                               NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后一次操作时间',
    `operate_ip`    VARCHAR(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '最后一次更新操作者的ip',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Table structure for sys_acl_module
-- ----------------------------
DROP TABLE IF EXISTS `sys_acl_module`;
CREATE TABLE `sys_acl_module`
(
    `id`            INT(11)                                                NOT NULL AUTO_INCREMENT COMMENT '权限模块id',
    `name`          VARCHAR(255)                                           NOT NULL DEFAULT '' COMMENT '权限模块名称',
    `parent_id`     INT(11)                                                NOT NULL DEFAULT '0' COMMENT '上层权限模块id',
    `level`         VARCHAR(255)                                           NOT NULL DEFAULT '' COMMENT '权限模块层级',
    `status`        INT(11)                                                NOT NULL DEFAULT '0' COMMENT '权限模块状态 | 0: 冻结 1: 正常',
    `seq`           INT(11)                                                NOT NULL DEFAULT '0' COMMENT '权限模块排序',
    `remark`        VARCHAR(255)                                                    DEFAULT NULL COMMENT '备注',
    `operator`      VARCHAR(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '操作者',
    `operate_timer` DATETIME                                               NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后一次操作时间',
    `operate_ip`    VARCHAR(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '最后一次更新操作者的ip',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Table structure for sys_dept
-- ----------------------------
DROP TABLE IF EXISTS `sys_dept`;
CREATE TABLE `sys_dept`
(
    `id`            INT(11)                                                NOT NULL AUTO_INCREMENT COMMENT '部门id',
    `name`          VARCHAR(20)                                            NOT NULL DEFAULT '' COMMENT '部门名称',
    `parent_id`     INT(11)                                                NOT NULL DEFAULT '0' COMMENT '上级部门id',
    `level`         VARCHAR(200)                                                    DEFAULT '' COMMENT '部门层级',
    `seq`           INT(11)                                                NOT NULL DEFAULT '0' COMMENT '部门在当前层级下的顺序, 由小到大',
    `remark`        VARCHAR(200)                                                    DEFAULT '' COMMENT '备注',
    `operator`      VARCHAR(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '操作者',
    `operate_timer` DATETIME                                               NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后一次操作时间',
    `operate_ip`    VARCHAR(50)                                            NOT NULL DEFAULT '' COMMENT '最后一次更新操作者的ip',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Table structure for sys_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log`
(
    `id`            INT(11)                                                NOT NULL AUTO_INCREMENT COMMENT 'logid',
    `type`          INT(11)                                                NOT NULL DEFAULT '0' COMMENT '操作类型 | 0',
    `target_id`     INT(11)                                                NOT NULL DEFAULT '0' COMMENT '目标id',
    `old_value`     VARCHAR(255)                                           NOT NULL DEFAULT '' COMMENT '旧值',
    `new_value`     VARCHAR(255)                                           NOT NULL COMMENT '新值',
    `operator`      VARCHAR(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '操作者',
    `operate_timer` DATETIME                                               NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后一次操作时间',
    `operate_ip`    VARCHAR(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '最后一次更新操作者的ip',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role`
(
    `id`            INT(11)                                                NOT NULL AUTO_INCREMENT COMMENT '角色id',
    `name`          VARCHAR(255)                                           NOT NULL DEFAULT '' COMMENT '角色名称',
    `type`          INT(11)                                                NOT NULL DEFAULT '0' COMMENT '角色类型 | 0: 其他 1: 管理员',
    `status`        INT(11)                                                NOT NULL DEFAULT '1' COMMENT '角色状态 | 0: 冻结 1: 正常',
    `remark`        VARCHAR(255)                                                    DEFAULT '' COMMENT '备注',
    `operator`      VARCHAR(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '操作者',
    `operate_timer` DATETIME                                               NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后一次操作时间',
    `operate_ip`    VARCHAR(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '最后一次更新操作者的ip',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Table structure for sys_role_acl
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_acl`;
CREATE TABLE `sys_role_acl`
(
    `id`            INT(11)                                                NOT NULL AUTO_INCREMENT COMMENT 'id',
    `role_id`       INT(11)                                                NOT NULL DEFAULT '0' COMMENT '角色id',
    `acl_id`        INT(11)                                                NOT NULL DEFAULT '0' COMMENT '权限id',
    `operator`      VARCHAR(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '操作者',
    `operate_timer` DATETIME                                               NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后一次操作时间',
    `operate_ip`    VARCHAR(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '最后一次更新操作者的ip',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Table structure for sys_role_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_user`;
CREATE TABLE `sys_role_user`
(
    `id`            INT(11)                                                NOT NULL AUTO_INCREMENT COMMENT 'id',
    `role_id`       INT(11)                                                NOT NULL DEFAULT '0' COMMENT '角色id',
    `user_id`       INT(11)                                                NOT NULL DEFAULT '0' COMMENT '用户id',
    `operator`      VARCHAR(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '操作者',
    `operate_timer` DATETIME                                               NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后一次操作时间',
    `operate_ip`    VARCHAR(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '最后一次更新操作者的ip',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`
(
    `id`            INT(11)                                                NOT NULL AUTO_INCREMENT COMMENT '用户id',
    `username`      VARCHAR(40)                                            NOT NULL DEFAULT '' COMMENT '用户名',
    `telephone`     VARCHAR(40)                                            NOT NULL DEFAULT '' COMMENT '用户手机',
    `mail`          VARCHAR(40)                                            NOT NULL DEFAULT '' COMMENT '用户邮箱',
    `password`      VARCHAR(40)                                            NOT NULL DEFAULT '' COMMENT '用户密码',
    `remark`        VARCHAR(200)                                                    DEFAULT '' COMMENT '备注',
    `dept_id`       INT(11)                                                NOT NULL DEFAULT '0' COMMENT '部门id',
    `status`        INT(11)                                                NOT NULL DEFAULT '0' COMMENT '状态| 0: 冻结 1: 正常 2: 删除',
    `operator`      VARCHAR(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '操作者',
    `operate_timer` DATETIME                                               NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后一次操作时间',
    `operate_ip`    VARCHAR(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '最后一次更新操作者的ip',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

SET FOREIGN_KEY_CHECKS = 1;
