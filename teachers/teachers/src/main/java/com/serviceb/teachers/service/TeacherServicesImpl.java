package com.serviceb.teachers.service;

import java.util.List;

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
		return repository.findById(id).get();
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

}
