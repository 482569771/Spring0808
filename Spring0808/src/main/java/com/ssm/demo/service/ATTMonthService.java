package com.ssm.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ssm.demo.dao.ATTMonthDAO;
import com.ssm.demo.entity.ATTMonthEntity;

@Service
public class ATTMonthService {

    @Autowired
    private ATTMonthDAO attendanceMonthDAO;

    public void saveAttendanceMonth(ATTMonthEntity attendanceMonth) {
        attendanceMonthDAO.save(attendanceMonth);
    }
}