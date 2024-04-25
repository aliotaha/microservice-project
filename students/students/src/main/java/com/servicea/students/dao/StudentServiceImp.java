package com.servicea.students.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.servicea.students.entity.Student;
import com.servicea.students.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;


import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Service
public class StudentServiceImp implements StudentService {
	@Autowired
	private StudentRepository repository; 
	

    @Override
    public List<Student> findAllStudetns() {
    List <Student> students = repository.findAll();
    	return students;
    }


	@Override
	public Student findStudentById(Integer id) {
		
		return repository.findById(id).get();
	}


	@Override
	public Student addStudent(Student student) {
		
		return repository.save(student);
	}


	@Override
	public void deleteStudentById(int id) {
		repository.deleteById(id);
			
	}


	@Override
	public Student updateStudent(Student theStudent) {
		Student student = repository.save(theStudent);
		return student;
		
		
	}

}
