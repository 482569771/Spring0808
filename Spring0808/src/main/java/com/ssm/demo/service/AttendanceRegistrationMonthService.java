package com.ssm.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ssm.demo.dao.AttendanceRegistrationMonthDAO;
import com.ssm.demo.entity.AttendanceRegistrationMonthEntity;

@Service
public class AttendanceRegistrationMonthService {

    @Autowired
    private AttendanceRegistrationMonthDAO attendanceMonthDAO;

    public void saveAttendanceMonth(AttendanceRegistrationMonthEntity attendanceMonth) {
        attendanceMonthDAO.save(attendanceMonth);
    }

    // 添加其他需要的方法，比如查询特定月份的勤怠信息等
}