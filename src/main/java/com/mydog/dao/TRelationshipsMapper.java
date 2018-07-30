package com.mydog.dao;

import com.mydog.entity.TRelationshipsExample;
import com.mydog.entity.TRelationshipsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRelationshipsMapper {
    long countByExample(TRelationshipsExample example);

    int deleteByExample(TRelationshipsExample example);

    int deleteByPrimaryKey(TRelationshipsKey key);

    int insert(TRelationshipsKey record);

    int insertSelective(TRelationshipsKey record);

    List<TRelationshipsKey> selectByExample(TRelationshipsExample example);

    int updateByExampleSelective(@Param("record") TRelationshipsKey record, @Param("example") TRelationshipsExample example);

    int updateByExample(@Param("record") TRelationshipsKey record, @Param("example") TRelationshipsExample example);
}