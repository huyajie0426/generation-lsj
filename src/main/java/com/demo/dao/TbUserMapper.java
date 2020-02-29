package com.demo.dao;

import com.demo.entity.TbUser;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserMapper {

    int deleteByPrimaryKey(Long uid);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    TbUser selectByPrimaryKey(Long uid);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);
}