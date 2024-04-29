package com.servicea.students.controller;

import com.servicea.students.entity.Student;
import com.serviceb.teachers.entity.Teacher;
import java.util.List;

public class CombinedInfoResponse {

    private List<Student> students;
    private List<Teacher> teachers;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
