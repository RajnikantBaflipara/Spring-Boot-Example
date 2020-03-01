package com.example.rajnish.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rajnish.model.Student;
import com.example.rajnish.service.StudentService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/getStudents")
	public ResponseEntity<List<Student>> getAllStudents(){
		
		return new ResponseEntity<List<Student>>(studentService.getStudents(),HttpStatus.OK);
	}
	
	@GetMapping("/getStundetById/{student_id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("student_id") int student_id){
		
		return new ResponseEntity<Student>(studentService.getStudentByID(student_id),HttpStatus.OK);
	}
	
	@PutMapping("/updateStudent")
	public ResponseEntity<String> updateStdent(@RequestBody Student student){
		studentService.updateStudent(student);
		return new ResponseEntity<String>("Update Successfully",HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteStudent/{student_id}")
	public ResponseEntity<String> deleteStudent(@PathVariable("student_id") int student_id){
		studentService.deleteStudent(student_id);
		return new ResponseEntity<String>("Delete Student Successfully",HttpStatus.OK);
	}	
	
	@PostMapping("/saveStudent")
	public ResponseEntity<String> SaveStudent(@RequestBody Student student){
		studentService.saveStudent(student);
		return new ResponseEntity<String>("Student Save Successfully",HttpStatus.OK);
	}
}
