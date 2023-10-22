package com.avanish.learning.controller;

import com.avanish.learning.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.avanish.learning.collection.Student;
import com.avanish.learning.repository.StudentRepository;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping("{id}")
    public Student getStudentById(@PathVariable String id){
        return studentService.getStudentById(id);
    }

}