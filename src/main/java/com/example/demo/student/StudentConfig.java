package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    3L,
                    "Mariam",
                    LocalDate.of(2000, 01, 10),
                    "mariam@gmail.com"
            );
            Student janes = new Student(
                    3L,
                    "Janes",
                    LocalDate.of(2000, 01, 10),
                    "janes@gmail.com"
            );
            Student mavene = new Student(
                    3L,
                    "Mavene",
                    LocalDate.of(2000, 01, 10),
                    "mavene@gmail.com"
            );
            repository.saveAll(
                    List.of(mariam, janes, mavene));

        };
    }
}