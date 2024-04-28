package com.servicea.students.service;

import java.util.List;

import com.servicea.students.exception.NotFoundException;
import org.springframework.stereotype.Service;

import com.servicea.students.entity.Student;
import com.servicea.students.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;

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
		if (repository.findById(id).isPresent()) {
			return repository.findById(id).get();
		} else {
			throw new NotFoundException("Student By ID: " + id + " is not Found");
		}
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
