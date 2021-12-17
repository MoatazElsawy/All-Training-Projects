package com.project.springboot.cruddemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.springboot.cruddemo.dao.EmployeeRepositry;
import com.project.springboot.cruddemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepositry employeeRepositry;
	
	@Autowired
	public EmployeeServiceImpl( EmployeeRepositry theemployee) {
		employeeRepositry = theemployee;
	}

	@Override
	public List<Employee> findAll() {

		return employeeRepositry.findAll();
	}

	@Override
	public Employee findById(int theId) {

		Optional<Employee> result = employeeRepositry.findById(theId);
		
		Employee theEmployee = null;
		if(result.isPresent()) {
			theEmployee = result.get();
		}
		else {
			throw new RuntimeException("the employee id is not found !" + theId);
		}
		return  theEmployee;
		
	}

	@Override	
	public void save(Employee theEmployee) {
		
		employeeRepositry.save(theEmployee);
	}

	@Override
	public void deleteById(int theId) {

		employeeRepositry.deleteById(theId);
	}

}
