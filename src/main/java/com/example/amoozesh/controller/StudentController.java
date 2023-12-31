package com.example.amoozesh.controller;

import com.example.amoozesh.model.Student;
import com.example.amoozesh.model.Teacher;
import com.example.amoozesh.repository.StudentRepository;
import com.example.amoozesh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("savestudent")
    public Student save(@RequestBody Student student)
    {
        return studentService.save(student);
    }



}
