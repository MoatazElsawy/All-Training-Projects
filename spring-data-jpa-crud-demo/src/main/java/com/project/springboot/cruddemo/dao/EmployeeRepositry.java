package com.project.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.springboot.cruddemo.entity.Employee;

public interface EmployeeRepositry extends JpaRepository<Employee, Integer> {
	

}
