package com.mydog.dao;

import com.mydog.entity.TMetas;
import com.mydog.entity.TMetasExample;
import java.util.List;
import java.util.Map;

import com.mydog.model.MetaDto;
import org.apache.ibatis.annotations.Param;

public interface TMetasMapper {
    long countByExample(TMetasExample example);

    int deleteByExample(TMetasExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(TMetas record);

    int insertSelective(TMetas record);

    List<TMetas> selectByExample(TMetasExample example);

    TMetas selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") TMetas record, @Param("example") TMetasExample example);

    int updateByExample(@Param("record") TMetas record, @Param("example") TMetasExample example);

    int updateByPrimaryKeySelective(TMetas record);

    int updateByPrimaryKey(TMetas record);

    List<MetaDto> selectFromSql(Map<String,Object> paraMap);

    MetaDto selectDtoByNameAndType(@Param("name") String name,@Param("type") String type);

    Integer countWithSql(Integer mid);
}