package com.project.test.myProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.test.myProject.dao.Reposetory;
import com.project.test.myProject.entity.Customer;

@Service
public class CusServicrImpl implements CusService {
	
	private Reposetory reposetory;
	@Autowired
	public CusServicrImpl(Reposetory theReposetory) {
		reposetory = theReposetory;
	}
	
	
	

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return reposetory.findAll();
	}


	@Override
	public Customer findById(int id) {
		
		Optional<Customer> result = reposetory.findById(id);
		Customer theCustomer = null;
		if(result.isPresent()) {
			theCustomer = result.get();
		}
		else {
			throw new RuntimeException("the customer id ont found! =>" + id);
		}
		
		return theCustomer;
	}


	@Override
	public void save(Customer theCstomer) {
		// TODO Auto-generated method stub
		reposetory.save(theCstomer);
	}


	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		reposetory.deleteById(id);
	}

	


}
