package com.servicea.students.dao;
import com.servicea.students.entity.Student;
import java.util.List;



public interface StudentService {
	
	List<Student>findAllStudetns();
	
	Student findStudentById(Integer id);
	// 
	Student addStudent(Student student);
	
	void deleteStudentById(int id);
	
	Student updateStudent(Student student);
	
	
	
	

}
