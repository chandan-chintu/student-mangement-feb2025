package com.jpahibernate.example.student_management.repository;

import com.jpahibernate.example.student_management.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // it contains database operations and it is data layer
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
