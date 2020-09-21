package com.cts.employeeoperation.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {

	@Id
	@GeneratedValue
	private long id;
	
	private String employeeName;

	private String streetLine1;

	private String streetLine2;

	private String city;

	private String state;

	private String zip;
	
	private Date dob;
	
	private Date dateOfJoining;
	
	private String department;
	
	private long salary;
	
}
