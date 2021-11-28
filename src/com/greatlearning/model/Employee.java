package com.greatlearning.model;

public class Employee {

	private String firstName;
	private String lastName;
	private String department;
	
	
	public Employee (String fname, String lname, String deptname)	{
		
		this.setFirstName(fname);
		this.setLastName(lname);
		this.setDepartment(deptname);
		
	}

	//getters and setters
	
	
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


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}
	


	
}
