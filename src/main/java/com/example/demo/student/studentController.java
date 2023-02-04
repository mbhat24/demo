package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/student")
public class studentController {
    private final studentService studentServiceVar;
    @Autowired
    public studentController(studentService studentServiceVar) {
        this.studentServiceVar = studentServiceVar;
    }

    @GetMapping
    public List<student> getStudent(){
        return studentServiceVar.getStudent();
    }


    @PostMapping
    public void registerNewStudents(@RequestBody  student student){
        studentServiceVar.addNewStudent(student );
    }

    @DeleteMapping(path="{studentId}" )
    public void deleteStudent(@PathVariable Long studentId){
      studentServiceVar.deleteStudent(studentId);
    }
}
