package com.ssm.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ssm.demo.entity.AttendanceYM;
import com.ssm.demo.entity.BusinessDays;
import com.ssm.demo.mapper.TotalMapper;
import com.ssm.demo.mapper.YearMonthMapper;

import java.util.List;

@Service
public class ATTMonthService {

	@Autowired
	private YearMonthMapper yearMonthMapper;

	@Autowired
	private TotalMapper totalMapper;
	
	public List<AttendanceYM> getYM() {
		return yearMonthMapper.findYM();
	}

	public List<String> getYear() {
		return yearMonthMapper.findYear();
	}

	public List<BusinessDays> getBusinessDays() {
		return totalMapper.findworkday();
	}
}