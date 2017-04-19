CREATE TABLE vehicle_use(
 id  INT PRIMARY KEY AUTO_INCREMENT,
 vehicle_No INT COMMENT '车牌号',
vestablish VARCHAR(255) COMMENT "使用时间",
back VARCHAR(255) COMMENT "返回时间",
purpose VARCHAR(255) COMMENT "用途",
 driverId INT COMMENT "使用人ID"
);

INSERT INTO vehicle_use(vehicle_No,usr,back,purpose,driverId) VALUES(1,NOW(),NOW(),'出租',1);
INSERT INTO vehicle_use(vehicle_No,usr,back,purpose,driverId) VALUES(2,NOW(),NOW(),'路游',2);
INSERT INTO vehicle_use(vehicle_No,usr,back,purpose,driverId) VALUES(3,NOW(),NOW(),'结婚',3);
INSERT INTO vehicle_use(vehicle_No,usr,back,purpose,driverId) VALUES(4,NOW(),NOW(),'内用',3);
INSERT INTO vehicle_use(vehicle_No,usr,back,purpose,driverId) VALUES(5,NOW(),NOW(),'出租',10);