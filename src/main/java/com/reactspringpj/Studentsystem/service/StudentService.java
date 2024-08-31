package com.reactspringpj.Studentsystem.service;

import com.reactspringpj.Studentsystem.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);

    public List<Student> getAllStudent();
}
