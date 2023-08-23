package com.ssm.demo.service;

import org.springframework.stereotype.Service;
import com.ssm.demo.entity.ATTMonthEntity;

import java.util.ArrayList;
import java.util.List;

@Service
public class ATTMonthService {

    private List<ATTMonthEntity> monthlyAttendanceList = new ArrayList<>();

    public List<ATTMonthEntity> getMonthlyAttendance() {
        return monthlyAttendanceList;
    }

    public void addMonthlyAttendance(ATTMonthEntity attMonthEntity) {
        monthlyAttendanceList.add(attMonthEntity);
    }

    public void updateMonthlyAttendance(ATTMonthEntity attMonthEntity) {
    }

    public void deleteMonthlyAttendance(Long id) {

    }
}