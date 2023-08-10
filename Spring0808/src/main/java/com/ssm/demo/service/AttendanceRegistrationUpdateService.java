package com.ssm.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ssm.demo.dao.AttendanceRegistrationUpdateDAO;
import com.ssm.demo.entity.AttendanceRegistrationUpdateEntity;
//引入org.springframework.stereotype中的@Service注解
//表示这是一个Spring的服务类
@Service
public class AttendanceRegistrationUpdateService {

	//使用@Autowired注解进行自动装配
	//将AttendanceRegistrationUpdateDAO注入到Service中
    @Autowired
    private AttendanceRegistrationUpdateDAO attendanceDAO;
    //提交出勤信息的方法，参数为一个AttendanceRegistrationUpdateEntity对象
    public void submitAttendance(AttendanceRegistrationUpdateEntity attendance) {
    	//调用attendanceDAO的save方法，将出勤信息对象保存到数据库中
    	attendanceDAO.save(attendance);
    }
}
//上述代码定义了一个名为AttendanceRegistrationUpdateService
//的服务类，用于处理出勤信息的业务逻辑。
//它使用了@Service注解，告诉Spring这是一个服务类，
//需要被Spring管理。
//通过@Autowired注解，它将一个AttendanceRegistrationUpdateDAO
//对象注入到服务类中，以便在业务逻辑中调用DAO层的方法。
//submitAttendance方法是服务类中的一个业务方法
//它接受一个AttendanceRegistrationUpdateEntity对象作为参数
//这个对象包含了要提交的出勤信息。
//在方法内部，它调用了attendanceDAO的save方法
//将传入的出勤信息对象保存到数据库中。
//总之，服务层的作用是处理业务逻辑。
//将不同组件（例如DAO层）之间的交互组织起来
//实现特定的功能。在这个示例中，服务层负责将出勤信息保存到数据库中。

