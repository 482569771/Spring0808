package com.ssm.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class AttendanceMonth implements Serializable{

    //private int year;
    private int month;
    private int workingDays;
    private int attendanceDays;
    private int absenteeismDays;
    private double actualWorkingHours;
    private double overtimeHours;
}