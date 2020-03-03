package com.lsj.dao;

import com.lsj.entity.TbGoods;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbGoodsMapper {


    int deleteByPrimaryKey(Long uid);

    int insert(TbGoods record);

    int insertSelective(TbGoods record);

    TbGoods selectByPrimaryKey(Long uid);

    int updateByPrimaryKeySelective(TbGoods record);

    int updateByPrimaryKey(TbGoods record);
}