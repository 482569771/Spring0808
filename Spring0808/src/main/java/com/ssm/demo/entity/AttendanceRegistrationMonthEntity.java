package com.ssm.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AttendanceRegistrationMonthEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int year;
    private int month;
    private int workingDays;
    private int attendanceDays;
    private int absenteeismDays;
    private double actualWorkingHours;
    private double overtimeHours;
    private String comments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public int getAttendanceDays() {
        return attendanceDays;
    }

    public void setAttendanceDays(int attendanceDays) {
        this.attendanceDays = attendanceDays;
    }

    public int getAbsenteeismDays() {
        return absenteeismDays;
    }

    public void setAbsenteeismDays(int absenteeismDays) {
        this.absenteeismDays = absenteeismDays;
    }

    public double getActualWorkingHours() {
        return actualWorkingHours;
    }

    public void setActualWorkingHours(double actualWorkingHours) {
        this.actualWorkingHours = actualWorkingHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}