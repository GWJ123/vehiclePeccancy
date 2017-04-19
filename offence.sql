CREATE TABLE car_message(
     offenceNo VARCHAR(255) PRIMARY KEY COMMENT '违章单号',
     offenceType VARCHAR(255) COMMENT '违章类型',
     offenceName VARCHAR(255) COMMENT '违章名称',
     offenceCity VARCHAR(255) COMMENT '违章城市',
     offenceSite VARCHAR(255) COMMENT '违章地点',
     offenceTime VARCHAR(255) COMMENT '违章时间',
     offenceState VARCHAR(255) COMMENT '违章状态',
     offenceOverdue INT COMMENT '逾期信息',
     penaltyPoint VARCHAR(255) COMMENT '罚分',
     penaltyFee VARCHAR(255) COMMENT '罚款',
     vehicleNo VARCHAR(255) COMMENT '车牌号',
     provider VARCHAR(255) COMMENT '提供方'
);
INSERT INTO car_message(offenceNo,offenceType,offenceName,offenceCity,offenceSite,offenceTime,
offenceState,offenceOverdue,penaltyPoint,penaltyFee,vehicleNo,provider)
VALUES("WZ201711010001","酒驾","喝酒驾驶","北京","后海","2017-04-13","待处理",3,"8","1000","京G666","他人举报");
SELECT * FROM car_message;
