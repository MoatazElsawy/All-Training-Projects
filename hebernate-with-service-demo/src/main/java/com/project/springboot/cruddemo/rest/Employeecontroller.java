package com.project.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.springboot.cruddemo.entity.Employee;
import com.project.springboot.cruddemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class Employeecontroller {
	
	private EmployeeService employeeService;
	@Autowired
	public Employeecontroller(EmployeeService theemployeeService) {
		employeeService = theemployeeService;
		
	}
	//get all employees
	@GetMapping("/employees")
	public List<Employee> fidAll(){
		return employeeService.findAll();
	}
	
	//get a single employee by id
	@GetMapping("/by_id/{id}")
	public Employee getById(@PathVariable int id) {
		
		Employee theEmployee = employeeService.findByID(id);
		if(theEmployee == null) {
			throw new RuntimeException("Employee id not found ! " + id);
		}
		
		return theEmployee;
		
		
	}
	
	
	//get a single employee by id
	@GetMapping("/by_fname/{fName}")
	public Employee getByFname(@PathVariable String  fName) {
		
		Employee theEmployee = employeeService.findByFname(fName);
		if(theEmployee == null) {
			throw new RuntimeException("Employee id not found ! " + fName);
		}
		
		return theEmployee;
		
		
	}
	
	
	
	//add employee

	@PostMapping("/post")
	public Employee addEmployee(@RequestBody Employee theEmployee) {
		
		theEmployee.setId(0);
		employeeService.save(theEmployee);
		return theEmployee;
		
	}
	
	//update an employee
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee theEmployee) {
	
		employeeService.save(theEmployee);
		return theEmployee;
	
	}
	
	//delete employee
	@DeleteMapping("/delete/{theId}")
	public String deleteEmployee(@PathVariable int theId) {
		
		Employee empl = employeeService.findByID(theId);
		
		if(empl == null) {
			throw new RuntimeException("the employee id not found ! " + theId);
		}
		else
			employeeService.deletById(theId);
			return "deleted employee id : " + theId;
	} 
	

	



}
