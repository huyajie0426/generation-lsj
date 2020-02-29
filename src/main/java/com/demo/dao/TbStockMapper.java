package com.demo.dao;

import com.demo.entity.TbStock;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbStockMapper {

    int deleteByPrimaryKey(Long uid);

    int insert(TbStock record);

    int insertSelective(TbStock record);


    TbStock selectByPrimaryKey(Long uid);


    int updateByPrimaryKeySelective(TbStock record);

    int updateByPrimaryKey(TbStock record);
}