package com.ssm.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ssm.demo.entity.AttendanceMonth;


import com.ssm.demo.service.ATTMonthService;

import java.util.List;

@Controller
public class ATTMonthController {


    @Autowired
    private ATTMonthService attMonthService;


    @GetMapping("/month")
    public String showAttendanceList(Model model) {

        List<String> yearList = attMonthService.getYear();
        model.addAttribute("yearList", yearList);
        
        List<AttendanceMonth> attendanceMonths = attMonthService.getAttMonthList("2022");

        model.addAttribute("attendanceMonths", attendanceMonths);

        return "ATTMonth";
    }
    
    @GetMapping("/month/{selectedYear}")
    public String handleSubmit(@PathVariable String selectedYear,Model model) {
    	List<String> yearList = attMonthService.getYear();
        model.addAttribute("yearList", yearList);
        
        List<AttendanceMonth> attendanceMonths = attMonthService.getAttMonthList(selectedYear);
       
        model.addAttribute("outputYear", selectedYear);
        model.addAttribute("attendanceMonths", attendanceMonths);

        return "ATTMonth";
    }
}