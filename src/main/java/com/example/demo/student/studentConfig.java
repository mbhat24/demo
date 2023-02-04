package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class studentConfig {
    @Bean
    CommandLineRunner commandLineRunner(studentRepository repository){
     return args -> {
          student mahesh=new student(
                  "Mahesh",
                  "mbhat24@gmail.com",
                  LocalDate.of(2000, Month.JANUARY,5)
          );
         student ganesh=new student(
                 "Ganesh",
                 "ganesh@gmail.com",
                 LocalDate.of(2001, Month.JANUARY,10)
         );
         repository.saveAll(List.of(mahesh,ganesh));
     };

    }
}
