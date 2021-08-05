package com.el.easupload.dao;

import com.el.easupload.model.F550911z;
import com.el.easupload.model.F550911zExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface F550911zDao {
    long countByExample(F550911zExample example);

    int deleteByExample(F550911zExample example);

    int insert(F550911z record);

    int insertSelective(F550911z record);

    List<F550911z> selectByExample(F550911zExample example);

    int updateByExampleSelective(@Param("record") F550911z record, @Param("example") F550911zExample example);

    int updateByExample(@Param("record") F550911z record, @Param("example") F550911zExample example);
}