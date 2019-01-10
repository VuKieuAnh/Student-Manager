package com.codegym.springbootstudent.service;

import com.codegym.springbootstudent.model.Department;

public interface DepartmentService {
    Iterable<Department> findAll();

    Department findById(Long id);

    void save(Department department);

    void remove(Long id);
}
