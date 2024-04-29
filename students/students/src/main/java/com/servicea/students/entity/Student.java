package com.servicea.students.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name="student")
public class Student {

    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    @NotEmpty(message = "First Name can not be a null or empty")
    @Schema(description = "First Name of Student", example = "Ali")
    private String firstName;

    @Column(name="last_name")
    @NotEmpty(message = "Last Name can not be a null or empty")
    @Schema(description = "Last Name of Student", example = "Ali")
    private String lastName;

    @Column(name="email")
    @NotEmpty(message = "Student Email can not be a null or empty")
    @Schema(description = "Student Email", example = "xxx@tus.com")
    private String email;



    @Column(name="subject")
    @NotEmpty(message = "Subject can not be a null or empty")
    @Schema(description = "Name of Subject", example = "RHCSA")
    private String subject;

    // define constructors
    public Student() {

    }

    public Student(String firstName, String lastName, String email, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.subject = subject;
    }

// define getters/setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // define toString() method


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
