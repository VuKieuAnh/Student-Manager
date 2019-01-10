package com.codegym.springbootstudent.repository;

import com.codegym.springbootstudent.model.Department;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DepartmentRepository extends PagingAndSortingRepository<Department, Long> {
}
