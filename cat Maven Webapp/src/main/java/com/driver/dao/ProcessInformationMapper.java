package com.driver.dao;

import com.driver.dao.ProcessInformation;
import com.driver.dao.ProcessInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcessInformationMapper {
    int countByExample(ProcessInformationExample example);

    int deleteByExample(ProcessInformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProcessInformation record);

    int insertSelective(ProcessInformation record);

    List<ProcessInformation> selectByExample(ProcessInformationExample example);

    ProcessInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProcessInformation record, @Param("example") ProcessInformationExample example);

    int updateByExample(@Param("record") ProcessInformation record, @Param("example") ProcessInformationExample example);

    int updateByPrimaryKeySelective(ProcessInformation record);

    int updateByPrimaryKey(ProcessInformation record);
}