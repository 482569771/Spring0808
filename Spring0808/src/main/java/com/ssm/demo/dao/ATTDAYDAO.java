package com.ssm.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ssm.demo.entity.ATTUpdateEntity;

@Mapper
public interface ATTDAYDAO {
    ATTUpdateEntity findById(@Param("id") Long id);
    void deleteById(@Param("id") Long id);
}
//【@Mapper注解】
//这个注解是MyBatis提供的，用于告诉框架将这个接口作为Mapper接口进行管理。

//【findById方法注解】
//这个方法用于根据传入的ID查找考勤实体。
//@Param("id") 注解表示方法参数的名称，并将传入的ID参数与SQL查询中的参数进行匹配。

//【deleteById方法注解】
//这个方法用于根据传入的ID删除考勤实体。
//同样地，@Param("id") 注解表示方法参数的名称，并将传入的ID参数与SQL查询中的参数进行匹配。

//这个接口定义了两个方法用于与数据库进行交互。
//分别是根据 ID 查找考勤实体和根据 ID 删除考勤实体。




