package com.driver.dao;

import com.driver.dao.AppealAudit;
import com.driver.dao.AppealAuditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppealAuditMapper {
    int countByExample(AppealAuditExample example);

    int deleteByExample(AppealAuditExample example);

    int deleteByPrimaryKey(Integer appealId);

    int insert(AppealAudit record);

    int insertSelective(AppealAudit record);

    List<AppealAudit> selectByExample(AppealAuditExample example);

    AppealAudit selectByPrimaryKey(Integer appealId);

    int updateByExampleSelective(@Param("record") AppealAudit record, @Param("example") AppealAuditExample example);

    int updateByExample(@Param("record") AppealAudit record, @Param("example") AppealAuditExample example);

    int updateByPrimaryKeySelective(AppealAudit record);

    int updateByPrimaryKey(AppealAudit record);
}