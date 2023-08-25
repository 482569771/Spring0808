package com.ssm.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssm.demo.entity.AttendanceMonth;


@Mapper
public interface TotalMapper {

	
	List<AttendanceMonth> findAttMonth(String selectedYear);
	
}
