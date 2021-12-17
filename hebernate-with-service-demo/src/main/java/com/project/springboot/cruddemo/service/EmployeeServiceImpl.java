package com.project.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.springboot.cruddemo.dao.EmployeeDAO;
import com.project.springboot.cruddemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDAO theemployee) {
		employeeDAO = theemployee;
	}

	@Override
	@Transactional
	public List<Employee> findAll() {

		return employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee findByID(int theId) {

		return employeeDAO.findByID(theId);
	}
	
	
	@Override
	@Transactional
	public Employee findByFname(String fName) {
		
		return employeeDAO.findByFname(fName);
	}


	@Override	
	@Transactional
	public void save(Employee theEmployee) {
		
		employeeDAO.save(theEmployee);
	}

	@Override
	@Transactional
	public void deletById(int theId) {

		employeeDAO.deletById(theId);
	}


}
