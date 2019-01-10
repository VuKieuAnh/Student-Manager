package com.codegym.springbootstudent.service.impl;

import com.codegym.springbootstudent.model.Student;
import com.codegym.springbootstudent.repository.StudentRepository;
import com.codegym.springbootstudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceIplm implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Iterable<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void remove(Long id) {
        studentRepository.delete(findById(id));
    }
}
