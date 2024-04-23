package com.example.RestApiPostgreSQL.repository;

import com.example.RestApiPostgreSQL.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
