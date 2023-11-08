package com.demo.JPAHib1toMBiDirectional;

import java.util.*;

import com.demo.JPAHib1toMBiDirectional.model.Department;
import com.demo.JPAHib1toMBiDirectional.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	   EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeePU3");
           EntityManager em = emf.createEntityManager();
/*
           // Create a Department with Employees
           Department department = new Department(60,"Finance");
           Employee employee1 = new Employee(108,"vasavi", "vasavieee",department);
          // employee1.getDepartment().setDid(50);
           Employee employee2 = new Employee(109,"deepak", "deepakeee",department);
           Employee employee3 = new Employee(110,"pen", "peneee",department);
          // employee2.getDepartment().setDid(50);
         List<Employee> l=new ArrayList();
         l.add(employee1);
         l.add(employee2);
         l.add(employee3);
       department.setEmployees(l);
        
          
           em.getTransaction().begin();
           em.persist(department);
          
           em.getTransaction().commit();
           System.out.println("saved");
           
    
      */   
           // Retrieve the department and its employees
           Department retrievedDepartment = em.find(Department.class, 60);
           System.out.println("Retrieved Department: " + retrievedDepartment);
           List<Employee> employees = retrievedDepartment.getEmployees();
           for (Employee employee : employees) {
               System.out.println("Employee: " + employee);
           }

          
    }
}
