package com.ssm.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.demo.entity.AttendanceMonth;
import com.ssm.demo.entity.AttendanceYM;
import com.ssm.demo.entity.Status;
import com.ssm.demo.form.SearchForm;
import com.ssm.demo.mapper.StatusMapper;
import com.ssm.demo.service.ATTDAYService;
import com.ssm.demo.service.ATTMonthService;

import java.util.List;

@Controller
public class ATTMonthController {

    @Autowired
    private ATTDAYService attdayService;

    @Autowired
    private ATTMonthService attMonthService;

    @Autowired
    private StatusMapper statusMapper;

    @GetMapping("/month")
    public String showAttendanceList(Model model) {
        //List<ATTMonthEntity> monthlyAttendanceList = attMonthService.getMonthlyAttendance();

        List<String> yearList = attMonthService.getYear();
        model.addAttribute("yearList", yearList);

        //model.addAttribute("monthlyAttendanceList", monthlyAttendanceList);
       
        model.addAttribute("searchForm", new SearchForm());

        return "ATTMonth";
    }
}