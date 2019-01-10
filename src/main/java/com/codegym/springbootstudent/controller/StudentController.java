package com.codegym.springbootstudent.controller;

import com.codegym.springbootstudent.model.Department;
import com.codegym.springbootstudent.model.Student;
import com.codegym.springbootstudent.service.DepartmentService;
import com.codegym.springbootstudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private DepartmentService departmentService;

    @ModelAttribute("department")
    public Iterable<Department> departments(){
        return departmentService.findAll();
    }

    @GetMapping("/studentlist")
    public ModelAndView studentList(){
        ModelAndView list = new ModelAndView("student/index");
        return list;
    }

    @GetMapping("/create-student")
    public ModelAndView createStudent(){
        ModelAndView createStudent = new ModelAndView("student/create", "student", new Student());
        return createStudent;
    }

}
