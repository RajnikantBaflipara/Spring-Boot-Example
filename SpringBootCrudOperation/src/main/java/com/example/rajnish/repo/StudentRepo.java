package com.example.rajnish.repo;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rajnish.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
