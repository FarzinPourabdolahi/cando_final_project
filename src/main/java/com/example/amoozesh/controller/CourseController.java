package com.example.amoozesh.controller;

import com.example.amoozesh.model.Course;
import com.example.amoozesh.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("course")
public class CourseController {

    @Autowired
    private CourseService courseService;
    @PostMapping("save")
    public Course save(@RequestBody Course course)
    {
        return courseService.save(course);
    }
}
