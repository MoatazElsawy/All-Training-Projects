package com.project.test.myProject.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {

	 @Id  
     @GeneratedValue(strategy=GenerationType.IDENTITY)
	
	 @Column(name="CUST_ID")
	 private int cust_id;
	 
	
	 @Column(name="ADDRESS")
	 private String address ;
	 
	 @Column(name="CITY")
	 private String city;
	 
	 @Column(name="CUST_TYPE_CD")
	 private String cust_type_cd;
	 
	 @Column(name="FED_ID")
	 private String fed_id;
	 
	 @Column(name="POSTAL_CODE")
	 private String postal_code;
	 
	 @Column(name="STATE") 
	 private String state ;
		

   	 public Customer() {
	 }


	public Customer(String address, String city, String cust_type_cd, String fed_id, String postal_code, String state) {
		super();
		this.address = address;
		this.city = city;
		this.cust_type_cd = cust_type_cd;
		this.fed_id = fed_id;
		this.postal_code = postal_code;
		this.state = state;
	}


	public int getCust_id() {
		return cust_id;
	}


	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCust_type_cd() {
		return cust_type_cd;
	}


	public void setCust_type_cd(String cust_type_cd) {
		this.cust_type_cd = cust_type_cd;
	}


	public String getFed_id() {
		return fed_id;
	}


	public void setFed_id(String fed_id) {
		this.fed_id = fed_id;
	}


	public String getPostal_code() {
		return postal_code;
	}


	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", address=" + address + ", city=" + city + ", cust_type_cd="
				+ cust_type_cd + ", fed_id=" + fed_id + ", postal_code=" + postal_code + ", state=" + state + "]";
	}

		
   	 
   	 
   	 
   	 
   	 
   	
	
   	 
	 
	 
	 
	 

	 
	 
	 
    
    
    

  
}



