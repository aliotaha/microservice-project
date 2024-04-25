package com.serviceb.teachers.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serviceb.teachers.entity.Teacher;
import com.serviceb.teachers.service.TeacherServices;

@RestController
@RequestMapping("/api")
public class TeacherRestController {
	private TeacherServices teacherservices;
	@Autowired
    public TeacherRestController(TeacherServices theTeacher) {
    	teacherservices = theTeacher;
    }
	
	@GetMapping("/teachers")
    public List<Teacher> qureyAllteacher() {
        return teacherservices.findAllTeacher();
    }
    @GetMapping("/teachers/{id}")
    public Teacher qureyStudentById(@PathVariable int id ) {
    	
        return teacherservices.findTeacherById(id);
    }
    @PostMapping("/teachers")
    public Teacher createStudent(@RequestBody Teacher theteacher ) {
    	
        return teacherservices.addTeacher(theteacher);
    }
    @DeleteMapping("/teachers/{id}")
    public void deleteTeacher(@PathVariable int id ) {
    	teacherservices.deleteTeacherById(id);
    }

    @PutMapping("/teachers")
    public Teacher updateTeacher(@RequestBody Teacher theTeacher ) {
    	
        return teacherservices.updateTeacher(theTeacher);
    }
	

}
