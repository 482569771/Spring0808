package com.ssm.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ssm.demo.entity.ATTUpdateEntity;
import com.ssm.demo.entity.Attendance;
import com.ssm.demo.service.ATTDAYService;

@Controller
public class ATTDAYController {

    @Autowired
    private ATTDAYService attdayService;

    @GetMapping("/edit") 
    public String showEditPage(Model model) {
    	
    	List<Attendance> attendanceList = attdayService.getAttendanceById("001");
    	
    	
    	
        //ATTUpdateEntity attendance = attdayService.getAttendanceById(id);
        model.addAttribute("attendanceList", attendanceList);
        return "ATTDAY"; 
    }

    @GetMapping("/delete") 
    public String deleteAttendance(@PathVariable Long id) {
        //attdayService.deleteAttendanceById(id);
        return "redirect:/update"; 
    }
}
//【@Autowired注解】
//这个注解用于进行自动依赖注入，将 ATTDAYService 的实例注入到该控制器类中。
//【@GetMapping("/edit/{id}")注解】
//这个注解表示该方法会处理路径为 "/edit/{id}"的GET请求。
//【@PathVariableLongId注解】
//这个注解表示该方法参数会从路径中提取对应的参数值，并将其赋值给Id变量。
//【showEditPage方法】
//这个方法处理编辑考勤页面的请求。
//它调用attdayService的getAttendanceById方法来获取指定ID的考勤实体
//然后将实体添加到Model中，最后返回视图名"EditAttendancePage"。
//【@GetMapping("/delete/{id}")注解】
//这个注解表示该方法会处理路径为"/delete/{id}"的GET请求。
//【deleteAttendance方法】这个方法处理删除考勤记录的请求。
//它调用attdayService的deleteAttendanceById方法来删除指定ID的考勤实体
//并进行重定向到"/update"路径。