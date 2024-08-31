package com.reactspringpj.Studentsystem.controller;

import com.reactspringpj.Studentsystem.model.Student;
import com.reactspringpj.Studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "Student is added";
    };

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents() {
        return studentService.getAllStudent();
    };
}
