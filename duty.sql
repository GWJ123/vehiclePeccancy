CREATE TABLE duty_message(
     dutyNo VARCHAR(255) PRIMARY KEY COMMENT '责任人id',
     dutyType VARCHAR(255) COMMENT '责任人类型',
     dutyName VARCHAR(255) COMMENT '责任人姓名',
     dutyTel VARCHAR(255) COMMENT '责任人手机号',
     dutyCity VARCHAR(255) COMMENT '服务城市',
     dutyReason VARCHAR(255) COMMENT '匹配责任人原因'
)
INSERT INTO duty_message(dutyNo,dutyType,dutyName,dutyTel,dutyCity,dutyReason)
VALUES("123","司机","张三","177xxxxx921","北京","车辆信息匹配");
SELECT * FROM duty_message;