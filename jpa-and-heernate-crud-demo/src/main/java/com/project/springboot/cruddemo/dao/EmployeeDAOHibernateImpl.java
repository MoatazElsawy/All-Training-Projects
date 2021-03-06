package com.project.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.springboot.cruddemo.entity.Employee;
@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {
	
	//define field for entity manager
	private EntityManager entityManager;
	
	//set up constructor injection
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager ;
	}
	
	@Override
	public List<Employee> findAll() {

		//get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		//create query
		Query<Employee> theQuery = 
				currentSession.createQuery("from Employee" , Employee.class);
		
		//execute query and get result list
		List<Employee> Employees = theQuery.getResultList();
		
		//return result
	    return Employees;
		
		
		 
		
		
	}

	@Override
	public Employee findByID(int theId) {

		//get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		//get the employee
		Employee theemployee =
				currentSession.get(Employee.class , theId);
		
		//get result		
		return theemployee;
	}

	@Override
	public void save(Employee theEmployee) {
		//get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);	
		
		//save employee
		currentSession.saveOrUpdate(theEmployee);
	}

	@Override
	public void deletById(int theId) {
		//get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);		
		
		//delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from Employee where id=:employeeId");
		theQuery.setParameter("employeeId", theId);
		
		theQuery.executeUpdate();
	}

}
