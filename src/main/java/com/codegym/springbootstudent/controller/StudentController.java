package com.codegym.springbootstudent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @GetMapping("/studentlist")
    public ModelAndView studentList(){
        ModelAndView list = new ModelAndView("student/index");
        return list;
    }
}
