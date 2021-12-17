package com.project.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOjpaImpl implements EmployeeDAO {
	
	private EntityManager entitymanager;
	 
	@Autowired
	public EmployeeDAOjpaImpl(EntityManager theEntityManager) {
		entitymanager = theEntityManager;
	}
	

	@Override
	public List<Employee> findAll() {
		//create query 
		Query theQuery = entitymanager.createQuery("from Employee");
		
		//execute query and get result
		List<Employee> employees = theQuery.getResultList();
		
		//return result
		return employees;
	}

	@Override
	public Employee findByID(int theId) {
		//get employee
		Employee theEmployee =
				entitymanager.find(Employee.class, theId);
		//return 
		return theEmployee;
	}

	@Override
	public void save(Employee theEmployee) {
		//save or update employee
		Employee dbEmployee = entitymanager.merge(theEmployee);
		
		//update with id from db .... so we can get generated id for save/insert
		theEmployee.setId(dbEmployee.getId());
	}

	@Override
	public void deletById(int theId) {

			Query theQuery = entitymanager.createQuery("delete Employee where id=: emplId");
			
			theQuery.setParameter("emplId", theId);
			
			theQuery.executeUpdate();
	}

}
