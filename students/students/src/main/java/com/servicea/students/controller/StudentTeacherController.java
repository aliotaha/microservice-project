package com.servicea.students.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.servicea.students.entity.Student;
import com.servicea.students.service.StudentService;
import com.serviceb.teachers.entity.Teacher;
import com.servicea.students.service.client.TeacherFeignClient;
import java.util.List;

@RestController
public class StudentTeacherController {

    private final StudentService studentService;
    private final TeacherFeignClient teacherFeignClient;

    @Autowired
    public StudentTeacherController(StudentService studentService, TeacherFeignClient teacherFeignClient) {
        this.studentService = studentService;
        this.teacherFeignClient = teacherFeignClient;
    }

    @GetMapping("/api/students-teachers")
    public CombinedInfoResponse getStudentsAndTeachersBySubject(@RequestParam("subject") String subject) {
        // Retrieve student information based on the subject
        List<Student> students = studentService.findStudentsBySubject(subject);

        // Retrieve teacher information based on the subject using Feign client
        List<Teacher> teachers = teacherFeignClient.getTeachersBySubject(subject);

        // Combine student and teacher information into a single response object
        CombinedInfoResponse response = new CombinedInfoResponse();
        response.setStudents(students);
        response.setTeachers(teachers);

        return response;
    }
}
