package com.demo.JPAHib1toMBiDirectional.model;
import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {
    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sid;

    private String sname;

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(
        name = "student_course",
        joinColumns = @JoinColumn(name = "sid"),
        inverseJoinColumns = @JoinColumn(name = "cid")
    )
    private Set<Course> courses;

	public Student(Long sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}


	public Student(Long id, String name, Set<Course> courses) {
		super();
		this.sid = id;
		this.sname = name;
		this.courses = courses;
	}

	
	public Long getSid() {
		return sid;
	}


	public void setSid(Long sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public Set<Course> getCourses() {
		return courses;
	}


	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", courses=" + courses + "]";
	}


	
}
    
    
    
    
