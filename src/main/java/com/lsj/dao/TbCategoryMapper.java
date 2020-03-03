package com.lsj.dao;

import com.lsj.entity.TbCategory;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCategoryMapper {


    int deleteByPrimaryKey(Long uid);

    int insert(TbCategory record);

    int insertSelective(TbCategory record);


    TbCategory selectByPrimaryKey(Long uid);



    int updateByPrimaryKeySelective(TbCategory record);

    int updateByPrimaryKey(TbCategory record);
}