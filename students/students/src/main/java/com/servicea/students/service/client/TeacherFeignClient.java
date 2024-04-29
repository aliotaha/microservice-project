package com.servicea.students.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.serviceb.teachers.entity.Teacher;
import java.util.List;

@FeignClient(name = "teacher-service", url = "http://localhost:8082") // Specify the name of the Teacher microservice
public interface TeacherFeignClient {

    @GetMapping("/api/teachers/by-subject/{subject}") // Specify the endpoint to fetch teachers by subject
    List<Teacher> getTeachersBySubject(@PathVariable String subject);
}

