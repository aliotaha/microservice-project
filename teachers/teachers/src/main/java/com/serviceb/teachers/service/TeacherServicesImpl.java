package com.serviceb.teachers.service;

import java.util.List;

import com.serviceb.teachers.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serviceb.teachers.entity.Teacher;
import com.serviceb.teachers.repository.TeacherRepository;

@Service
public class TeacherServicesImpl implements TeacherServices  {
	@Autowired
	private TeacherRepository repository; 

	@Override
	public List<Teacher> findAllTeacher() {
	    List <Teacher> teacher = repository.findAll();
    	return teacher;
	}

	@Override
	public Teacher findTeacherById(Integer id) {
		if (repository.findById(id).isPresent()) {
			return repository.findById(id).get();
		} else {
			throw new NotFoundException("Teacher By ID: " + id + " is not Found");
		}
	}

	@Override
	public Teacher addTeacher(Teacher teacher) {
		return repository.save(teacher);
	}

	@Override
	public void deleteTeacherById(int id) {
		repository.deleteById(id);
		
	}

	@Override
	public Teacher updateTeacher(Teacher theTeacher) {
		Teacher teacher = repository.save(theTeacher);
		return teacher;
	}

	@Override
	public List<Teacher> findTeachersBySubject(String subject) {
		return repository.findBySubject(subject);
	}

}
