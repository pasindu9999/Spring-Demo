package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository)
    {
        return args -> {
            Student udara = new Student(
                    "Udara",
                    LocalDate.of(1999, Month.JUNE, 12),
                    "example@gmail.com"
            );

            Student pasindu = new Student(
                    "Pasindu",
                    LocalDate.of(2000, Month.JUNE, 12),
                    "example1@gmail.com"
            );

            Student saman = new Student(
                    "Saman",
                    LocalDate.of(1998, Month.JUNE, 16),
                    "example2@gmail.com"
            );

            repository.saveAll(
                    List.of(udara, pasindu, saman));
        };
    }
}
