package com.serviceb.teachers.controller;

import java.util.List;

import com.serviceb.teachers.service.AccountsContactInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @Autowired
    private AccountsContactInfoDto accountsContactInfoDto;
	private TeacherServices teacherservices;
	@Autowired
    public TeacherRestController(TeacherServices theTeacher) {
    	teacherservices = theTeacher;
    }
    @GetMapping("/teachers/by-subject/{subject}")
    public List<Teacher> queryTeacherBySubject(@PathVariable String subject) {
        return teacherservices.findTeachersBySubject(subject);
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
    @GetMapping("/contact-info")
    public ResponseEntity<AccountsContactInfoDto> getContactInfo() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(accountsContactInfoDto);
    }
	

}
