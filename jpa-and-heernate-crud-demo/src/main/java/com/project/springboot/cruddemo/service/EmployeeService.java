package com.project.springboot.cruddemo.service;

import java.util.List;

import com.project.springboot.cruddemo.entity.Employee;

public interface EmployeeService {

	
	public List<Employee> findAll();
	public Employee findByID(int theId);
	public void save(Employee theEmployee);
	public void deletById(int theId);
	
}
