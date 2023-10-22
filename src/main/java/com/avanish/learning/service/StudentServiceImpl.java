package com.avanish.learning.service;

import com.avanish.learning.collection.Student;
import com.avanish.learning.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student getStudentById(String id) {
        Optional<Student> student = studentRepository.findById(id);
        if(student.isPresent())
            return student.get();
        return null;

        // return student.orElse(null);
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }
}
