package com.avanish.learning.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.avanish.learning.collection.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String>{

}
