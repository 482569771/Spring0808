package com.ssm.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ssm.demo.entity.AttendanceRegistrationMonthEntity;

@Repository
public interface AttendanceRegistrationMonthDAO extends JpaRepository<AttendanceRegistrationMonthEntity, Long> {
    // 这里可以添加自定义的查询方法，例如按年度和月份查询
    // List<AttendanceRegistrationMonthEntity> findByYearAndMonth(int year, int month);
}