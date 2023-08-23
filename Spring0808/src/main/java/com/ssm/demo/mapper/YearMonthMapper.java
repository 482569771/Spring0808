package com.ssm.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssm.demo.entity.AttendanceYM;

@Mapper
public interface YearMonthMapper {
	
	List<AttendanceYM> findYM();
	List<String> findYear();
}
