package com.ssm.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ssm.demo.entity.ATTUpdateEntity;

@Mapper
public interface ATTDAYDAO {
    ATTUpdateEntity findById(@Param("id") Long id);
    void deleteById(@Param("id") Long id);
}