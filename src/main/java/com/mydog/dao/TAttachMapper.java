package com.mydog.dao;

import com.mydog.entity.TAttach;
import com.mydog.entity.TAttachExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAttachMapper {
    long countByExample(TAttachExample example);

    int deleteByExample(TAttachExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TAttach record);

    int insertSelective(TAttach record);

    List<TAttach> selectByExample(TAttachExample example);

    TAttach selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TAttach record, @Param("example") TAttachExample example);

    int updateByExample(@Param("record") TAttach record, @Param("example") TAttachExample example);

    int updateByPrimaryKeySelective(TAttach record);

    int updateByPrimaryKey(TAttach record);
}