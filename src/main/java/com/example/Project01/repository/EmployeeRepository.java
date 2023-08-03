package com.example.Project01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project01.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}