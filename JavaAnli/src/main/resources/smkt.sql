/*
 Navicat Premium Data Transfer

 Source Server         : xxxx
 Source Server Type    : MySQL
 Source Server Version : 50173
 Source Host           : 192.168.56.101:3306
 Source Schema         : smkt

 Target Server Type    : MySQL
 Target Server Version : 50173
 File Encoding         : 65001

 Date: 07/10/2020 12:18:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for casher
-- ----------------------------
DROP TABLE IF EXISTS `casher`;
CREATE TABLE `casher`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `phone` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `authority` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `socialID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `onjobtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of casher
-- ----------------------------
INSERT INTO `casher` VALUES (3, 'jack ', '34179558064@qq.com     ', '1346747256    ', '3', 'é”€å”®å‘˜', '5238569369356 ', '2015-12-26 18:32:18');
INSERT INTO `casher` VALUES (5, '2', '132989513@qq.com', '123456', '3', 'é”€å”®å‘˜', '734476819845109375', '2015-12-26 23:18:30');
INSERT INTO `casher` VALUES (6, 'å°å¼ ', '32784319685@126.com', '12423513465', '3', 'é”€å”®å‘˜', '3628953695480854', '2015-12-26 23:42:54');
INSERT INTO `casher` VALUES (7, 'fhifh', '325682875@126.com', '3257829694', '123456', 'é”€å”®å‘˜', '34685298375456', '2015-12-27 08:30:49');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `productID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `productname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `price` int(11) NOT NULL,
  `infor` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`productID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', 'çº¢æž£', 3, ' æ–°ç–†å¤§çº¢æž£');
INSERT INTO `goods` VALUES ('2', 'ç‰›å¥¶', 4, ' çº¯ç‰›å¥¶ï¼Œè¿›å£');
INSERT INTO `goods` VALUES ('3', 'çŸ¿æ³‰æ°´', 1, ' å†œæˆ·å±±æ³‰æœ‰ç‚¹ç”œ');
INSERT INTO `goods` VALUES ('4', 'é¢æ¡', 5, ' æ‰‹æ“€é¢ï¼Œæœ‰åŠ²é“');
INSERT INTO `goods` VALUES ('5', 'è›‹ç³•', 6, ' ç›¼ç›¼fashå°é¢åŒ…ï¼Œå“¦å“¦å“¦ï¼Œå¥½åƒ');
INSERT INTO `goods` VALUES ('6', 'é£Ÿç›', 3, ' å®¶åŠ ç¢˜é£Ÿç›ï¼Œæ›´å¥åº·');
INSERT INTO `goods` VALUES ('7', 'çº¢é…’', 100, ' å¤šå¹´æ­£è—ï¼Œå‘³é“å¥½');

-- ----------------------------
-- Table structure for importrecord
-- ----------------------------
DROP TABLE IF EXISTS `importrecord`;
CREATE TABLE `importrecord`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productID` int(11) NOT NULL,
  `importtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `arrivetime` datetime NULL DEFAULT NULL,
  `amount` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for manager
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `phone` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `authority` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '0',
  `socialID` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `onjobtime` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of manager
-- ----------------------------
INSERT INTO `manager` VALUES (1, 'smkt', '961871997@qq.com', '3', '1', '1', '3', '2315-12-25 17:44:30');

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `mname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `phone` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `adress` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `discountlevel` double NULL DEFAULT NULL,
  `validtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 33 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of member
-- ----------------------------
INSERT INTO `member` VALUES (20, 'æŽæœˆ  ', '123456  ', '864592093@qq.com  ', 'ç«¹1B208233 ', 0.9, '2015-12-25 22:09:31');
INSERT INTO `member` VALUES (27, 'å¤§é”¤', '14223156', '3257971340@qq.com', 'èŠ±æžœå±±', 0.9, '2015-12-26 23:23:48');
INSERT INTO `member` VALUES (29, 'å°èŠ± ', '123 ', '456756513@126.cm ', 'ä¸­å›½çŸ¿ä¸šå¤§å­¦ ', 0.9, '2015-12-27 00:26:52');
INSERT INTO `member` VALUES (30, 'ddd', 'ddd', '2488397825@qq.om', 'ddd', NULL, '2020-08-27 14:29:13');
INSERT INTO `member` VALUES (31, 'ccc', 'ccc', 'ccc', 'cccc', NULL, '2020-08-27 15:22:51');
INSERT INTO `member` VALUES (32, 'yyy', 'yyyy', 'yyy', 'yyy', NULL, '2020-08-28 07:57:55');

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `subject` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0',
  `time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `message` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES (8, '中秋国庆购物狂欢', '陈总', '2020-09-16 23:41:03', '喜迎中秋国庆');

-- ----------------------------
-- Table structure for sales
-- ----------------------------
DROP TABLE IF EXISTS `sales`;
CREATE TABLE `sales`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `productID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `price` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `money` int(11) NOT NULL,
  `state` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 78 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sales
-- ----------------------------
INSERT INTO `sales` VALUES (44, '3', 'é¢æ¡', 3, 5, 15, 'å®Œæˆ', '2015-12-24 08:11:37');
INSERT INTO `sales` VALUES (52, '1', 'è›‹ç³•', 3, 10, 30, 'å®Œæˆ', '2015-12-24 08:36:25');
INSERT INTO `sales` VALUES (56, '2', 'çŸ¿æ³‰æ°´', 2, 1, 2, 'å®Œæˆ', '2015-12-24 09:31:27');
INSERT INTO `sales` VALUES (57, '2', 'çŸ¿æ³‰æ°´', 1, 1, 1, 'å®Œæˆ', '2015-12-25 13:02:14');
INSERT INTO `sales` VALUES (58, '1', 'è›‹ç³•', 1, 10, 10, 'å®Œæˆ', '2015-12-25 22:13:15');
INSERT INTO `sales` VALUES (59, '2', 'çŸ¿æ³‰æ°´', 3, 1, 3, 'å®Œæˆ', '2015-12-25 22:13:34');
INSERT INTO `sales` VALUES (63, '2', 'çŸ¿æ³‰æ°´', 1, 1, 1, 'å®Œæˆ', '2015-12-25 22:29:05');
INSERT INTO `sales` VALUES (64, '1', 'è›‹ç³•', 1, 10, 10, 'å®Œæˆ', '2015-12-25 22:29:11');
INSERT INTO `sales` VALUES (65, '1', 'è›‹ç³•', 1, 10, 10, 'å®Œæˆ', '2015-12-26 10:14:21');
INSERT INTO `sales` VALUES (66, '4', 'é£Ÿè¨€', 1, 3, 3, 'å®Œæˆ', '2015-12-26 21:37:16');
INSERT INTO `sales` VALUES (67, '1', 'çº¢æž£', 3, 3, 9, 'å®Œæˆ', '2015-12-26 23:25:41');
INSERT INTO `sales` VALUES (69, '2', 'ç‰›å¥¶', 3, 4, 12, 'å®Œæˆ', '2015-12-26 23:27:17');
INSERT INTO `sales` VALUES (70, '1', 'çº¢æž£', 1, 3, 3, 'å®Œæˆ', '2015-12-26 23:28:10');
INSERT INTO `sales` VALUES (71, '2', 'ç‰›å¥¶', 1, 4, 4, 'å®Œæˆ', '2015-12-27 00:28:47');
INSERT INTO `sales` VALUES (72, '3', 'çŸ¿æ³‰æ°´', 11, 1, 11, 'å®Œæˆ', '2015-12-27 00:28:58');
INSERT INTO `sales` VALUES (74, '1', 'çº¢æž£', 1, 3, 3, 'å®Œæˆ', '2015-12-27 00:29:42');
INSERT INTO `sales` VALUES (75, '2', 'ç‰›å¥¶', 10, 4, 40, 'å®Œæˆ', '2015-12-27 00:29:52');
INSERT INTO `sales` VALUES (76, '4', 'é¢æ¡', 10, 5, 50, 'å®Œæˆ', '2015-12-27 00:30:06');
INSERT INTO `sales` VALUES (77, '2', 'ç‰›å¥¶', 10, 4, 40, 'å®Œæˆ', '2015-12-27 09:03:11');

-- ----------------------------
-- Table structure for shelf
-- ----------------------------
DROP TABLE IF EXISTS `shelf`;
CREATE TABLE `shelf`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `updatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `amount` int(11) NOT NULL DEFAULT 0,
  `productID` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for staff
-- ----------------------------
DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `phone` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `authority` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `socialID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `onjobtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of staff
-- ----------------------------
INSERT INTO `staff` VALUES (8, 'å‘¨æ°ä¼¦   ', '36578785478@126.com   ', '1234567 ', '2', 'åº“å­˜ç®¡ç†å‘˜', '23454136562437867   ', '2015-12-26 15:18:16');
INSERT INTO `staff` VALUES (17, 'allen', '961871997@qq.com  ', '123456 ', '2', 'åº“å­˜ç®¡ç†å‘˜', '4444444  ', '2015-12-26 23:06:25');
INSERT INTO `staff` VALUES (19, 'åŽä»”', '961871932@qq.com', '12542536756', '2', 'åº“å­˜ç®¡ç†å‘˜', '4513564656732153', '2015-12-26 23:41:55');
INSERT INTO `staff` VALUES (21, 'dgfbj', '43q673862@126.c0m', '32785482', '123456', 'åº“å­˜ç®¡ç†å‘˜', '32578568923', '2015-12-27 08:28:49');

-- ----------------------------
-- Table structure for storage
-- ----------------------------
DROP TABLE IF EXISTS `storage`;
CREATE TABLE `storage`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `amount` int(11) NOT NULL DEFAULT 0,
  `updatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of storage
-- ----------------------------
INSERT INTO `storage` VALUES (5, '3', 'çŸ¿æ³‰æ°´', 786, '2015-12-23 15:37:25');
INSERT INTO `storage` VALUES (10, '4', 'é¢æ¡', 800, '2015-12-24 08:38:14');
INSERT INTO `storage` VALUES (12, '5', 'è›‹ç³•', 800, '2015-12-26 13:05:05');
INSERT INTO `storage` VALUES (13, '6', 'é£Ÿç›', 800, '2015-12-26 20:31:09');
INSERT INTO `storage` VALUES (14, '1', 'ç‰›å¥¶', 797, '2015-12-26 22:45:41');
INSERT INTO `storage` VALUES (15, '2', 'çº¢æž£', 779, '2015-12-26 22:49:34');
INSERT INTO `storage` VALUES (20, '7', 'çº¢é…’', 20, '2015-12-27 00:14:01');
