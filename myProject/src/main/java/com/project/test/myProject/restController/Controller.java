package com.project.test.myProject.restController;

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

import com.project.test.myProject.entity.Customer;
import com.project.test.myProject.services.CusService;

@RestController
@RequestMapping("/api")
public class Controller {
    
	private CusService cusService;
	@Autowired
	public Controller(CusService theCusService) {
		cusService = theCusService;
	}
	
	@GetMapping("/customers")
	public List<Customer> findAll() {

		return cusService.findAll();
	}

	
	@GetMapping("/customer/{id}")
	public Customer findById(@PathVariable int id) {
		
		Customer theCustomer = cusService.findById(id);
		if(theCustomer == null) {
			throw new RuntimeException("the customer ont found ! " );
		}
		return theCustomer;
	}
	@PostMapping("/addcustomer")
	public Customer addCustomer(@RequestBody Customer theCustomer) {
		
		theCustomer.setCust_id(0);
		cusService.save(theCustomer);
		return theCustomer;
	}
	
	@PutMapping("/updatecustomer")
	public Customer update(@RequestBody Customer theCustomer) {
		
		cusService.save(theCustomer);
		return theCustomer;
	}
	
	@DeleteMapping("/deletecustomer")
	public String deleteBrId(int id) {
		
		Customer theCustomer = cusService.findById(id);
		if(theCustomer == null) {
			throw new RuntimeException("hte id not found ! "  + id);
		}
		else {
			cusService.deleteById(id);
			return " custoer is deledted by id: " + id;
		}
	}
	
	

	
	
}

