package com.ssm.demo.form;
import java.io.Serializable;

import lombok.Data;

@Data
public class RegisterForm implements Serializable{

	private String employeeId;
	private String attendanceDate;
	private String startTime;
	private String endTime;
	private double restHours;
	private double workingHours;
	private double overtimeHours;
	private double absenceHours;
	private String statusId;
	private String remarks;
	
//	CREATE_DATE date 
//	CREATE_USER varchar(10) 
//	UPDATE_DATE date 
//	UPDATE_USER varchar(10)
}
