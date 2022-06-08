package com.example.learning.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return (args) -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2000,12,12)
                    );

            Student terence = new Student(
                    "Terence",
                    "terencehilln@gmail.com",
                    LocalDate.of(1999,12,12)
                    );

            repository.saveAll(
                    List.of(mariam, terence)
            );
        };

    }
}
