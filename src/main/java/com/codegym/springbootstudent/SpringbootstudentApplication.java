package com.codegym.springbootstudent;

import com.codegym.springbootstudent.service.DepartmentService;
import com.codegym.springbootstudent.service.StudentService;
import com.codegym.springbootstudent.service.impl.DepartmentServiceIplm;
import com.codegym.springbootstudent.service.impl.StudentServiceIplm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootstudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootstudentApplication.class, args);
    }

    @Bean
    public StudentService studentService(){
        return new StudentServiceIplm();
    }

    @Bean
    public DepartmentService departmentService(){
        return new DepartmentServiceIplm();
    }
}

