package com.ssm.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.demo.dao.ATTDAYDAO;
import com.ssm.demo.entity.ATTUpdateEntity;

@Service
public class ATTDAYService {

    @Autowired
    private ATTDAYDAO attdayDao;

    public ATTUpdateEntity getAttendanceById(Long id) {
        return attdayDao.findById(id);
    }

    public void deleteAttendanceById(Long id) {
    	attdayDao.deleteById(id);
    }
}