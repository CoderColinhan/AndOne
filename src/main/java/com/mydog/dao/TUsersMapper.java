package com.mydog.dao;

import com.mydog.entity.TUsers;
import com.mydog.entity.TUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUsersMapper {
    long countByExample(TUsersExample example);

    int deleteByExample(TUsersExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(TUsers record);

    int insertSelective(TUsers record);

    List<TUsers> selectByExample(TUsersExample example);

    TUsers selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") TUsers record, @Param("example") TUsersExample example);

    int updateByExample(@Param("record") TUsers record, @Param("example") TUsersExample example);

    int updateByPrimaryKeySelective(TUsers record);

    int updateByPrimaryKey(TUsers record);
}