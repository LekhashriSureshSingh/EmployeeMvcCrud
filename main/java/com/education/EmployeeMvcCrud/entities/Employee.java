package com.education.EmployeeMvcCrud.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //primary key employee table id
	@Column(name = "eid")
	private int eid;

	@Column(name = "first_name")
	String firstName;

	@Column(name = "last_name")
	String lastName;

	@Column(name = "email")
	String email;

	public Employee() {

	}

	public Employee(String firstname, String lastname, String email) {
		this.firstName = firstname;
		this.lastName = lastname;
		this.email = email;
	}

	public int getId() {
		return eid;
	}

	public void setId(int id) {
		this.eid = id;
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

	@Override
	public String toString() {
		return "Student [id=" + eid + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}

}
