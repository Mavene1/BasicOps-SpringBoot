package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Mavene",
                        21,
                        LocalDate.of(2000, 01, 10),
                        "mavene@gmail.com")
        );

    }
}
