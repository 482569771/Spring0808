package com.ssm.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ssm.demo.entity.ATTUpdateEntity;
import com.ssm.demo.service.ATTDAYService;

@Controller
public class ATTDAYController {

    @Autowired
    private ATTDAYService attdayService;

    @GetMapping("/edit/DAY")
    public String showEditPage(@PathVariable Long id, Model model) {
        ATTUpdateEntity attendance = attdayService.getAttendanceById(id);
        model.addAttribute("attendance", attendance);
        return "EditAttendancePage"; 
        //替换为您的编辑页面模板的实际名称
    }
    @GetMapping("/delete/DAY")
    public String deleteAttendance(@PathVariable Long id) {
        attdayService.deleteAttendanceById(id);
        return "redirect:/update"; 
        //删除后重定向到更新页面
    }
}