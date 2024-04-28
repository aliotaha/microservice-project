package com.servicea.students.controller;

import java.util.List;

import com.servicea.students.service.AccountsContactInfoDto;
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

import com.servicea.students.service.StudentService;
import com.servicea.students.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @Autowired
    private AccountsContactInfoDto accountsContactInfoDto;
	private StudentService student;
    
    public StudentRestController(StudentService theStudentDAO) {
    	student = theStudentDAO;
    }

    @GetMapping("/students")
    public List<Student> qureyAllstudents() {
        return student.findAllStudetns();
    }
    @GetMapping("/students/{id}")
    public Student qureyStudentById(@PathVariable int id ) {
    	
        return student.findStudentById(id);
    }
    @PostMapping("/students")
    public Student createStudent(@RequestBody Student theStudent ) {
    	
        return student.addStudent(theStudent);
    }
    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable int id ) {
    	student.deleteStudentById(id);
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student theStudent ) {
    	
        return student.updateStudent(theStudent);
    }
    @GetMapping("/contact-info")
    public ResponseEntity<AccountsContactInfoDto> getContactInfo() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(accountsContactInfoDto);
    }
}
