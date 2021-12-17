package com.project.springboot.cruddemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name="employee")
@ApiModel(description = "All Desceiption about Employee") //swagger documentation(definitions: )
/* @JsonIgnoreProperties(value = "lastName")  //ignore this field from display request (static filtering) */
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	
	@Column(name="id")
	private int id ;
	
	@Column(name="first_name")
	@ApiModelProperty(notes = "first name should be at least tow charctrs")  //swagger documentation(definitions: ) you can iterate it on all fields
/*..@JsonIgnore   //another approach of ignore this field from display request (static filtering)  ..*/
	private String firstName ;
	
	@Column(name="last_name")
	private String lastName ;
	
	@Column(name="email")
	private String email ;


	
	//constructor without argument
	public Employee() {
		
	}


	//constructor without <ID> argument
	public Employee(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}


	//define getter and setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	//define toString
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	
	
	
	
	
	
	
	

	
	
	
}
