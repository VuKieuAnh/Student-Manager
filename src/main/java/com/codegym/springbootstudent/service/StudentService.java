package com.codegym.springbootstudent.service;

import com.codegym.springbootstudent.model.Student;

public interface StudentService {
    Iterable<Student> findAll();

    Student findById(Long id);

    void save(Student student);

    void remove(Long id);
}
