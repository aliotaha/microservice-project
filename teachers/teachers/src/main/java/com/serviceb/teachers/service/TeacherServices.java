package com.serviceb.teachers.service;

import java.util.List;

import com.serviceb.teachers.entity.Teacher;

public interface TeacherServices {
	
	List<Teacher>findAllTeacher();
	
	Teacher findTeacherById(Integer id);
	
	Teacher addTeacher(Teacher teacher);
	
	void deleteTeacherById(int id);
	
	Teacher updateTeacher(Teacher student);

}
