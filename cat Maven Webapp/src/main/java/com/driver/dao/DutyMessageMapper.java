package com.driver.dao;

import com.driver.dao.DutyMessage;
import com.driver.dao.DutyMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DutyMessageMapper {
    int countByExample(DutyMessageExample example);

    int deleteByExample(DutyMessageExample example);

    int deleteByPrimaryKey(String dutyno);

    int insert(DutyMessage record);

    int insertSelective(DutyMessage record);

    List<DutyMessage> selectByExample(DutyMessageExample example);

    DutyMessage selectByPrimaryKey(String dutyno);

    int updateByExampleSelective(@Param("record") DutyMessage record, @Param("example") DutyMessageExample example);

    int updateByExample(@Param("record") DutyMessage record, @Param("example") DutyMessageExample example);

    int updateByPrimaryKeySelective(DutyMessage record);

    int updateByPrimaryKey(DutyMessage record);
}