package com.example.RestApiPostgreSQL.controller;

import com.example.RestApiPostgreSQL.model.Student;
import com.example.RestApiPostgreSQL.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("{studentId}")
    public Student getStudent(@PathVariable Integer studentId) {
        return studentService.getStudent(studentId);
    }

    @GetMapping()
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public String addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @PutMapping
    public String updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("{studentId}")
    public String deleteStudent(@PathVariable Integer studentId) {
        return studentService.deleteStudent(studentId);
    }
}
