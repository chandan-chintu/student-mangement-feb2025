package com.jpahibernate.example.student_management.service;

import com.jpahibernate.example.student_management.model.Student;
import com.jpahibernate.example.student_management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // it contains business logic
public class StudentService {

    @Autowired // creates internal bean object
    private StudentRepository studentRepository;

    public String addStudent(Student student){
        studentRepository.save(student);
        return "Student saved successfully";
    }

    public Student findStudentById(int id){
        Optional<Student> studentOptional = studentRepository.findById(id);
        return studentOptional.get();
    }

    public List<Student> findAllStudents(){
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }

    public String deleteStudentById(int id){
        studentRepository.deleteById(id);
        return "Student with id : "+id+" is deleted successfully";
    }

    // updating whole object
    public String updateStudentByPut(int studentId, Student studentRequest){
        // find student with id
        // if id present update student
        // else cannot update
        Student studentFromDb = findStudentById(studentId);
        if(studentFromDb!=null){
            studentRepository.save(studentRequest);
            return "Student updated successfully";
        } else{
            return "Cannot find student to update";
        }
    }

    // updating specific field
    public String updateStudentMobileByPatch(int studentId, String mobile){
        // find student with id
        // if id present update student
        // else cannot update
        Student studentFromDb = findStudentById(studentId);
        if(studentFromDb!=null){
            studentFromDb.setMobile(mobile);
            studentRepository.save(studentFromDb);
            return "Student mobile number updated successfully";
        } else{
            return "Cannot find student to update";
        }
    }
}
