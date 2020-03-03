package com.lsj.service;

import com.lsj.entity.TbAddress;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAddressService {


    int deleteByPrimaryKey(Long uid);

    int insert(TbAddress record);

    int insertSelective(TbAddress record);


    TbAddress selectByPrimaryKey(Long uid);


    int updateByPrimaryKeySelective(TbAddress record);

    int updateByPrimaryKey(TbAddress record);
}