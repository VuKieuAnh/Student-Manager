package com.codegym.springbootstudent.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty
    @Size(max = 10)
    private String code;

    @NotEmpty
    @Size(max = 200)
    private String firstName;

    @NotEmpty
    @Size(max = 200)
    private String lastName;

    @NotEmpty
    @Size(max = 200)
    private String address;

    private String status;

    private String email;

    @ManyToOne(targetEntity = Department.class)
    @JoinColumn(name = "department_id")
    private Department department;

    public Student(@NotEmpty @Size(max = 10) String code, @NotEmpty @Size(max = 200) String firstName, @NotEmpty @Size(max = 200) String lastName, @NotEmpty @Size(max = 200) String address, String status, String email, Department department) {
        this.code = code;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.status = status;
        this.email = email;
        this.department = department;
    }

    public Student() {
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
