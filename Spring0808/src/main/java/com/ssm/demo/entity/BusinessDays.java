package com.ssm.demo.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class BusinessDays implements Serializable{

	private String attendanceYear;
	private String attendanceMonth;
	private Integer dayCount;

}
