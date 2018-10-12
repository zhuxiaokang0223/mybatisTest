package com.mybatis.generator.dao;

import com.mybatis.generator.model.userCameraRelation;
import com.mybatis.generator.model.userCameraRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface userCameraRelationMapper {
    long countByExample(userCameraRelationExample example);

    int deleteByExample(userCameraRelationExample example);

    int deleteByPrimaryKey(String camSn);

    int insert(userCameraRelation record);

    int insertSelective(userCameraRelation record);

    List<userCameraRelation> selectByExample(userCameraRelationExample example);

    userCameraRelation selectByPrimaryKey(String camSn);

    int updateByExampleSelective(@Param("record") userCameraRelation record, @Param("example") userCameraRelationExample example);

    int updateByExample(@Param("record") userCameraRelation record, @Param("example") userCameraRelationExample example);

    int updateByPrimaryKeySelective(userCameraRelation record);

    int updateByPrimaryKey(userCameraRelation record);
}