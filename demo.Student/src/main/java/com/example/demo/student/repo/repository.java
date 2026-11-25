package com.example.demo.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.student.model.Student;

public interface repository extends JpaRepository<Student,Integer>{

}
