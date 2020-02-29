package com.demo.dao;

import com.demo.entity.TbBrand;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbBrandMapper {


    int deleteByPrimaryKey(Long uid);

    int insert(TbBrand record);

    int insertSelective(TbBrand record);


    TbBrand selectByPrimaryKey(Long uid);


    int updateByPrimaryKeySelective(TbBrand record);

    int updateByPrimaryKey(TbBrand record);
}