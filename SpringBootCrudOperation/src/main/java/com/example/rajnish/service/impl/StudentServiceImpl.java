package com.example.rajnish.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.rajnish.model.Student;
import com.example.rajnish.repo.StudentRepo;
import com.example.rajnish.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepo studentRepo;
	
	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepo.save(student);
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public void deleteStudent(int student_id) {
		// TODO Auto-generated method stub
		studentRepo.delete(student_id);
	}

	@Override
	public Student getStudentByID(int student_id) {
		// TODO Auto-generated method stub
		return studentRepo.findOne(student_id);
	}

	@Override
	public void updateStudent(Student student) {
		 Student s1=studentRepo.findOne(student.getStudent_id());
		 s1.setStudent_email(student.getStudent_email());
		 s1.setStudent_branch(student.getStudent_branch());
		 s1.setStudent_name(student.getStudent_name());
		 studentRepo.save(s1);
	}

}
