package com.example.rajnish.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.rajnish.model.Student;

public interface StudentService {
	
	public void saveStudent(Student student);  
    public List<Student> getStudents();  
    public void deleteStudent(int student_id);  
    public Student getStudentByID(int student_id);  
    public void updateStudent(Student student);  
}
