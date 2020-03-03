package com.lsj.service;

import com.lsj.entity.TbAdmin;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAdminService {


    int deleteByPrimaryKey(Long uid);

    int insert(TbAdmin record);

    int insertSelective(TbAdmin record);


    TbAdmin selectByPrimaryKey(Long uid);


    int updateByPrimaryKeySelective(TbAdmin record);

    int updateByPrimaryKey(TbAdmin record);
}