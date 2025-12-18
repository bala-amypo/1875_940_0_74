package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PutMapping("/updatedata")
    public ResponseEntity<Student> updateData(@RequestBody Student student) {
        return new ResponseEntity<>(
                studentService.updateStudent(student),
                HttpStatus.OK
        );
    }
}
