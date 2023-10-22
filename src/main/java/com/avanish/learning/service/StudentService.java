package com.avanish.learning.service;

import com.avanish.learning.collection.Student;

public interface StudentService {
    public Student getStudentById(String id);
    public Student save(Student save);
}
