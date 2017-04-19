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

/*Table structure for table `car` */

DROP TABLE IF EXISTS `car`;

CREATE TABLE `car` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `car_number` varchar(255) DEFAULT NULL COMMENT '车牌号码',
  `frame_number` varchar(255) DEFAULT NULL COMMENT '车架号',
  `car_type` varchar(255) DEFAULT NULL COMMENT '车型',
  `car_city` varchar(255) DEFAULT NULL COMMENT '车辆所属城市',
  `car_user` varchar(255) DEFAULT NULL COMMENT '车辆所属人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `car` */

insert  into `car`(`id`,`car_number`,`frame_number`,`car_type`,`car_city`,`car_user`) values (1,'35647899','56134534','大众','深圳','大华'),(2,'3565433','568765','法拉利','北京','花花'),(3,'3111433','5456665','奔驰','深圳','二狗');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
