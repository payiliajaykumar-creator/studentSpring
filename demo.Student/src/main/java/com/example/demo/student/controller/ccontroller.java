package com.example.demo.student.controller;

import com.example.demo.student.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.student.model.Student;

@RestController
public class ccontroller {

    @Autowired
    private Service service;

    @PostMapping("/post")
    public Student saveStudent(@RequestBody Student student) {

        return service.saveStudent(student);
    }
    
    
    @GetMapping("/get")
    public void nowget() {

        System.out.println("hello world");

    }    
    
}