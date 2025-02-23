package com.jpahibernate.example.student_management.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // it is an entity or model class which directly represents the database table/schema
@Table(name="student") // it creates the table inside mysql database
public class Student {

    @Id                // it means it is a primary key of the table and it cannot take duplicate values
    @Column(name="id")
    private int id;

    @Column(name="name", nullable = false) // it creates a column inside the mysql database table
    private String name;

    @Column(name="age", nullable = false) // nullable= false - it cannot take null values
    private int age;

    @Column(name="grade", nullable = false)
    private String grade;

    @Column(name="email", nullable = false, unique = true) // unique = true - it allows only unique values
    private String email;

    @Column(name="mobile", nullable = false)
    private String mobile;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
