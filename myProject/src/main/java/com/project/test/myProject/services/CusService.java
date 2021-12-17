package com.project.test.myProject.services;

import java.util.List;
import com.project.test.myProject.entity.Customer;

public interface CusService  {

	public List<Customer> findAll();
	public Customer findById(int id);
	public void save(Customer theCstomer);
	public void deleteById(int id);
	
	
}
