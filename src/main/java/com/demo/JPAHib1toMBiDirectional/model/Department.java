package com.demo.JPAHib1toMBiDirectional.model;

import jakarta.persistence.*;
import java.util.List;
import java.util.*;
@Entity
@Table(name = "department")
public class Department {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "did")
    private int did;

    @Column(name = "dname")
    private String name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Employee> employees = new ArrayList<>();
    
    
    public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Department() {}

	public Department(int id,String name) {
		super();
		did=id;
		this.name = name;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", name=" + name + ", employees=" + employees + "]";
	}

	

	

	

   
}

