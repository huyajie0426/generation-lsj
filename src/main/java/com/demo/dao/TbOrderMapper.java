package com.demo.dao;

import com.demo.entity.TbOrder;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderMapper {


    int deleteByPrimaryKey(Long uid);

    int insert(TbOrder record);

    int insertSelective(TbOrder record);


    TbOrder selectByPrimaryKey(Long uid);


    int updateByPrimaryKeySelective(TbOrder record);

    int updateByPrimaryKey(TbOrder record);
}