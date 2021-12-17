package com.project.test.myProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.test.myProject.entity.Customer;

public interface Reposetory extends JpaRepository<Customer, Integer>{
	

	
}
