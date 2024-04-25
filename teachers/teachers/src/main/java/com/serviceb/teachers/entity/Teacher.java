package com.serviceb.teachers.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="teacher")
public class Teacher {
	
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="id")
	    private int id;

	    @Column(name="first_name")
	    private String firstName;

	    @Column(name="last_name")
	    private String lastName;


	    @Column(name="subject")
	    private String subject;



	    @Column(name="mobile")
	    private String mobile;


	    @Column(name="email")
	    private String email;


		public Teacher() {
			super();
		}


		public Teacher(String firstName, String lastName, String subject, String mobile, String email) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.subject = subject;
			this.mobile = mobile;
			this.email = email;
		}


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


		public String getSubject() {
			return subject;
		}


		public void setSubject(String subject) {
			this.subject = subject;
		}


		public String getMobile() {
			return mobile;
		}


		public void setMobile(String mobile) {
			this.mobile = mobile;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		@Override
		public String toString() {
			return "Teacher [id=" + id +
					", firstName=" + firstName + 
					", lastName=" + lastName + 
					", subject=" + subject+
					", mobile=" + mobile + 
					", email=" + email + "]";
		}
	    
	    

}
