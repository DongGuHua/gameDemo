package com.dong.mapper;

import com.dong.entity.Root;
import com.dong.entity.RootExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RootMapper {
    int countByExample(RootExample example);

    int deleteByExample(RootExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Root record);

    int insertSelective(Root record);

    List<Root> selectByExample(RootExample example);

    Root selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Root record, @Param("example") RootExample example);

    int updateByExample(@Param("record") Root record, @Param("example") RootExample example);

    int updateByPrimaryKeySelective(Root record);

    int updateByPrimaryKey(Root record);
}