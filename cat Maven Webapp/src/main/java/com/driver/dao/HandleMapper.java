package com.driver.dao;

import com.driver.dao.Handle;
import com.driver.dao.HandleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HandleMapper {
    int countByExample(HandleExample example);

    int deleteByExample(HandleExample example);

    int deleteByPrimaryKey(Integer handleId);

    int insert(Handle record);

    int insertSelective(Handle record);

    List<Handle> selectByExample(HandleExample example);

    Handle selectByPrimaryKey(Integer handleId);

    int updateByExampleSelective(@Param("record") Handle record, @Param("example") HandleExample example);

    int updateByExample(@Param("record") Handle record, @Param("example") HandleExample example);

    int updateByPrimaryKeySelective(Handle record);

    int updateByPrimaryKey(Handle record);
}