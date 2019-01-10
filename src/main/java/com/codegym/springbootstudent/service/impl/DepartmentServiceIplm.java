package com.codegym.springbootstudent.service.impl;

import com.codegym.springbootstudent.model.Department;
import com.codegym.springbootstudent.model.Student;
import com.codegym.springbootstudent.repository.DepartmentRepository;
import com.codegym.springbootstudent.repository.StudentRepository;
import com.codegym.springbootstudent.service.DepartmentService;
import com.codegym.springbootstudent.service.StudentService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;

public class DepartmentServiceIplm implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Iterable<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department findById(Long id) {
        return departmentRepository.findById(id).get();
    }

    @Override
    public void save(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public void remove(Long id) {
        departmentRepository.delete(findById(id));
    }
}
