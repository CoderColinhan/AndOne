package com.mydog.dao;

import com.mydog.entity.TComments;
import com.mydog.entity.TCommentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCommentsMapper {
    long countByExample(TCommentsExample example);

    int deleteByExample(TCommentsExample example);

    int deleteByPrimaryKey(Integer coid);

    int insert(TComments record);

    int insertSelective(TComments record);

    List<TComments> selectByExampleWithBLOBs(TCommentsExample example);

    List<TComments> selectByExample(TCommentsExample example);

    TComments selectByPrimaryKey(Integer coid);

    int updateByExampleSelective(@Param("record") TComments record, @Param("example") TCommentsExample example);

    int updateByExampleWithBLOBs(@Param("record") TComments record, @Param("example") TCommentsExample example);

    int updateByExample(@Param("record") TComments record, @Param("example") TCommentsExample example);

    int updateByPrimaryKeySelective(TComments record);

    int updateByPrimaryKeyWithBLOBs(TComments record);

    int updateByPrimaryKey(TComments record);
}