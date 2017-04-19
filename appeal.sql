
CREATE TABLE handle(
	handle_id INT PRIMARY KEY AUTO_INCREMENT COMMENT '操作人ID',
	handle_time DATETIME COMMENT '操作时间',
	handle_man_type VARCHAR(255) COMMENT '操作人类型',
	handle_man_name VARCHAR(255) COMMENT '操作人'
);
INSERT INTO handle(handle_time,handle_man_type,handle_man_name) VALUES(NOW(),'后台','当前操作人');
SELECT * FROM handle;


CREATE TABLE appeal_audit(
	appeal_id INT PRIMARY KEY AUTO_INCREMENT COMMENT '申诉单号',
	appeal_illegal_id INT COMMENT '违章单号',
	appeal_state VARCHAR(255) COMMENT '申诉状态',
	appeal_reason VARCHAR(255) COMMENT '申诉理由',
	appeal_time DATETIME COMMENT '申诉时间',
	audit_man_type VARCHAR(255) COMMENT '审核人类型',
	audit_man_id INT COMMENT '审核人ID',
	audit_man_name VARCHAR(255) COMMENT '审核人姓名',
	audit_man_tel INT COMMENT '审核人电话',
	audit_state VARCHAR(255) COMMENT '审核状态',
	audit_time DATETIME COMMENT '审核时间',
	audit_commit_time DATETIME COMMENT '审核提交时间'
);
SELECT * FROM appeal_audit;


