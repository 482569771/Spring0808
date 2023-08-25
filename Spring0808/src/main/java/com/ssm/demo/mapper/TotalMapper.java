package com.ssm.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssm.demo.entity.AttendanceMonth;
import com.ssm.demo.entity.BusinessDays;

@Mapper
public interface TotalMapper {

	List<AttendanceMonth> findworkday(String selectedYear);
	
	List<AttendanceMonth> findAttMonth(String selectedYear);
	
}
