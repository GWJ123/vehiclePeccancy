package com.driver.dao;

import com.driver.dao.CarMessage;
import com.driver.dao.CarMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarMessageMapper {
    int countByExample(CarMessageExample example);

    int deleteByExample(CarMessageExample example);

    int deleteByPrimaryKey(String offenceno);

    int insert(CarMessage record);

    int insertSelective(CarMessage record);

    List<CarMessage> selectByExample(CarMessageExample example);

    CarMessage selectByPrimaryKey(String offenceno);

    int updateByExampleSelective(@Param("record") CarMessage record, @Param("example") CarMessageExample example);

    int updateByExample(@Param("record") CarMessage record, @Param("example") CarMessageExample example);

    int updateByPrimaryKeySelective(CarMessage record);

    int updateByPrimaryKey(CarMessage record);
}