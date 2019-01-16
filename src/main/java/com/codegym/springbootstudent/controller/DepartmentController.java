package com.codegym.springbootstudent.controller;

import com.codegym.springbootstudent.model.Department;
import com.codegym.springbootstudent.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/create-department")
    public ModelAndView createStudent(){
        ModelAndView createStudent = new ModelAndView("department/create", "department", new Department());
        return createStudent;
    }

    @PostMapping("/created-department")
    public ModelAndView createdStudent(@ModelAttribute("department") Department department){
        departmentService.save(department);
        ModelAndView createDepartment = new ModelAndView("department/create", "department", new Department());
        return createDepartment;
    }
}
