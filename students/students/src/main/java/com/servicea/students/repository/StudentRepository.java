package com.servicea.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicea.students.entity.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer>{
    List<Student> findBySubject(String subject);
	
	
	
	

}
