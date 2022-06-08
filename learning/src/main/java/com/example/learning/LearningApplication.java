package com.example.learning;

import com.example.learning.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication

public class LearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningApplication.class, args);
	}


}
