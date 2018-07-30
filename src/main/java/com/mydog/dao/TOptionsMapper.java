package com.mydog.dao;

import com.mydog.entity.TOptions;
import com.mydog.entity.TOptionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOptionsMapper {
    long countByExample(TOptionsExample example);

    int deleteByExample(TOptionsExample example);

    int deleteByPrimaryKey(String name);

    int insert(TOptions record);

    int insertSelective(TOptions record);

    List<TOptions> selectByExample(TOptionsExample example);

    TOptions selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") TOptions record, @Param("example") TOptionsExample example);

    int updateByExample(@Param("record") TOptions record, @Param("example") TOptionsExample example);

    int updateByPrimaryKeySelective(TOptions record);

    int updateByPrimaryKey(TOptions record);
}