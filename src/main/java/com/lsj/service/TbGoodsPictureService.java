package com.lsj.service;

import com.lsj.entity.TbGoodsPicture;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbGoodsPictureService {


    int deleteByPrimaryKey(Long uid);

    int insert(TbGoodsPicture record);

    int insertSelective(TbGoodsPicture record);

    TbGoodsPicture selectByPrimaryKey(Long uid);

    int updateByPrimaryKeySelective(TbGoodsPicture record);

    int updateByPrimaryKey(TbGoodsPicture record);
}