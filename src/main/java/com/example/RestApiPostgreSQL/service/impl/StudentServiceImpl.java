package com.example.RestApiPostgreSQL.service.impl;

import com.example.RestApiPostgreSQL.exception.StudentExceptionHandler;
import com.example.RestApiPostgreSQL.exception.StudentNotFoundException;
import com.example.RestApiPostgreSQL.model.Student;
import com.example.RestApiPostgreSQL.repository.StudentRepository;
import com.example.RestApiPostgreSQL.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student getStudent(Integer studentId) {
        if (studentRepository.findById(studentId).isEmpty())
            throw new StudentNotFoundException("Request Student does not Exist");
        return studentRepository.findById(studentId).get();
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll(Sort.by(Sort.Direction.ASC, "Id"));
    }

    @Override
    public String addStudent(Student student) {
        studentRepository.save(student);
        return "Success";
    }

    @Override
    public String updateStudent(Student student) {
        studentRepository.save(student);
        return "Success";
    }

    @Override
    public String deleteStudent(Integer studentId) {
        studentRepository.deleteById(studentId);
        return "Success";
    }
}
