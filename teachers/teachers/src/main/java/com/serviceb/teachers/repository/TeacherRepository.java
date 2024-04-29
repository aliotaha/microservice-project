package com.serviceb.teachers.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.serviceb.teachers.entity.Teacher;

import java.util.List;


public interface TeacherRepository extends JpaRepository <Teacher, Integer>{

    List<Teacher> findBySubject(String subject);
	

}
