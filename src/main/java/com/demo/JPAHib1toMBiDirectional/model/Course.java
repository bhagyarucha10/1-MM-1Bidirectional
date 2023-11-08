package com.demo.JPAHib1toMBiDirectional.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.*;
@Entity
public class Course {
    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cid;

    private String cname;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;

	public Course(Long cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + "]";
	}
    
    
    
    
    
    
    
    
}
