package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.List;
@Service
public class studentService {
    private final studentRepository studentRep;

    @Autowired
    public studentService(studentRepository studentRep) {
        this.studentRep = studentRep;
    }

    public List<student> getStudent(){
        return studentRep.findAll();
    }

    public void addNewStudent(student student){
   System.out.println(student);
    }

    public void deleteStudent(Long student) {
        System.out.println(student);
    }
}
