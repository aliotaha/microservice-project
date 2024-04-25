package com.serviceb.teachers.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.serviceb.teachers.entity.Teacher;


public interface TeacherRepository extends JpaRepository <Teacher, Integer>{
	

}
