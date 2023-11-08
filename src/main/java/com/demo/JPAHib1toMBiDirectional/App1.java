package com.demo.JPAHib1toMBiDirectional;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

import com.demo.JPAHib1toMBiDirectional.model.Course;
import com.demo.JPAHib1toMBiDirectional.model.Student;

public class App1 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EmployeePU3");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            entityManager.getTransaction().begin();
            Course course1 = new Course(100L,"Math");
                      Course course2 = new Course(200L,"History");
            Set<Course> s=new HashSet();
            s.add(course1);
            Student student1 = new Student(1L,"Alice",s);
            
            Set<Course> s2=new HashSet();
            s2.add(course1);
            s2.add(course2);

            Student student2 = new Student(2L,"Bob",s2);
    

            // Create courses
           
            //course2.setName("History");
            // Enroll students in courses
//            student1.getCourses().add(course1);
//            student2.getCourses().add(course1);
//            student2.getCourses().add(course2);

            // Persist entities
            entityManager.persist(student1);
            entityManager.persist(student2);
//           entityManager.persist(course1);
//           entityManager.persist(course2);

            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
