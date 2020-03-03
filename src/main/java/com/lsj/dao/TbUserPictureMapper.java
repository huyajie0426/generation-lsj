package com.lsj.dao;

import com.lsj.entity.TbUserPicture;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserPictureMapper {

    int deleteByPrimaryKey(Long uid);

    int insert(TbUserPicture record);

    int insertSelective(TbUserPicture record);

    TbUserPicture selectByPrimaryKey(Long uid);

    int updateByPrimaryKeySelective(TbUserPicture record);

    int updateByPrimaryKey(TbUserPicture record);
}