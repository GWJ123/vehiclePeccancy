package com.driver.dao;

import com.driver.dao.VehicleUse;
import com.driver.dao.VehicleUseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicleUseMapper {
    int countByExample(VehicleUseExample example);

    int deleteByExample(VehicleUseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VehicleUse record);

    int insertSelective(VehicleUse record);

    List<VehicleUse> selectByExample(VehicleUseExample example);

    VehicleUse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VehicleUse record, @Param("example") VehicleUseExample example);

    int updateByExample(@Param("record") VehicleUse record, @Param("example") VehicleUseExample example);

    int updateByPrimaryKeySelective(VehicleUse record);

    int updateByPrimaryKey(VehicleUse record);
}