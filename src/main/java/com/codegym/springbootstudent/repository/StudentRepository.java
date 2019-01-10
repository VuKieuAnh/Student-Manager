package com.codegym.springbootstudent.repository;

import com.codegym.springbootstudent.model.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {
}
