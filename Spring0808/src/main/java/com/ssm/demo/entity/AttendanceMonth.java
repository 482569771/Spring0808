package com.ssm.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class AttendanceMonth implements Serializable{

    private String attYear;
    private String attMonth;
    private Integer dayCount;
    private Integer workdayCount;
    private Integer absencedayCount;
    private double absenceHours;
    private double workingHours;
    private double overtimeHours;
}