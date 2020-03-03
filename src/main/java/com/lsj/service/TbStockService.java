package com.lsj.service;

import com.lsj.entity.TbStock;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbStockService {

    int deleteByPrimaryKey(Long uid);

    int insert(TbStock record);

    int insertSelective(TbStock record);


    TbStock selectByPrimaryKey(Long uid);


    int updateByPrimaryKeySelective(TbStock record);

    int updateByPrimaryKey(TbStock record);
}