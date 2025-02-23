package com.jpahibernate.example.student_management.service;

import com.jpahibernate.example.student_management.model.Student;
import com.jpahibernate.example.student_management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // it contains business logic
public class StudentService {

    @Autowired // creates internal bean object
    private StudentRepository studentRepository;

    public String addStudent(Student student){
        studentRepository.save(student);
        return "Student saved successfully";
    }
}
