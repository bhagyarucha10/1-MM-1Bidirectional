package com.demo.JPAHib1toMBiDirectional.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empid")
    private int empid;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @ManyToOne
    @JoinColumn(name="did")
    private Department department;
    
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	
	public Employee() {}
	public Employee(int id,String firstName, String lastName) {
		super();
		empid=id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Employee(int empid, String firstName, String lastName, Department department) {
		super();
		this.empid = empid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
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
/*
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", firstName=" + firstName + ", lastName=" + lastName + ", department="
				+ department + "]";
	}
*/

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
   

}

