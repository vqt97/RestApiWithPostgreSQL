package com.example.RestApiPostgreSQL.service;

import com.example.RestApiPostgreSQL.model.Student;

import java.util.List;

public interface StudentService {
    public Student getStudent(Integer studentId);
    public List<Student> getStudents();
    public String addStudent(Student student);
    public String updateStudent(Student student);
    public String deleteStudent(Integer studentId);
}
