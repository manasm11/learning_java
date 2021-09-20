package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            studentRepository.saveAll(List.of(
                    new Student("Manas", "manas@example.com", LocalDate.of(2000, OCTOBER, 21)),
                    new Student("Divya", "divya@example.com", LocalDate.of(2003, APRIL, 12)),
                    new Student("Lakshya", "lakshya@example.com", LocalDate.of(2002, JANUARY, 23)),
                    new Student("Harsh", "harsh@example.com", LocalDate.of(1998, FEBRUARY, 23)),
                    new Student("Abhishek", "abhishek@example.com", LocalDate.of(1992, NOVEMBER, 21))
            ));
        };
    }
}
