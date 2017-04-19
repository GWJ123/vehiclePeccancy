/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.5.36 : Database - car_test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`car_test` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `car_test`;

/*Table structure for table `process_information` */

DROP TABLE IF EXISTS `process_information`;

CREATE TABLE `process_information` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `processor_type` varchar(255) DEFAULT NULL COMMENT '处理人类型',
  `processor_id` varchar(255) DEFAULT NULL COMMENT '处理人ID',
  `processor_name` varchar(255) DEFAULT NULL COMMENT '处理人姓名',
  `processor_phone` varchar(255) DEFAULT NULL COMMENT '处理人手机号',
  `serve_city` varchar(255) DEFAULT NULL COMMENT '服务城市',
  `peccancy_city` varchar(255) DEFAULT NULL COMMENT '违章处理城市',
  `check_status` varchar(255) DEFAULT NULL COMMENT '审核状态',
  `check_time` varchar(255) DEFAULT NULL COMMENT '审核时间',
  `check_message` varchar(255) DEFAULT NULL COMMENT '审核信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `process_information` */

insert  into `process_information`(`id`,`processor_type`,`processor_id`,`processor_name`,`processor_phone`,`serve_city`,`peccancy_city`,`check_status`,`check_time`,`check_message`) values (1,'停车场管理人员','123','张三','187679006654','北京','北京','通过','2016-12-21','已通过，审核完毕'),(2,'停车场管理人员','133','李四','187679665454','北京','上海','通过','2016-12-22','已通过，审核完毕'),(3,'停车场管理人员','137','王五','1987729665454','北京','深圳','通过','2016-12-23','已通过，审核完毕');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
