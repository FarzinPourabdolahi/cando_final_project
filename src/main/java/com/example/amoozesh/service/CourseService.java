package com.example.amoozesh.service;

import com.example.amoozesh.model.Course;
import com.example.amoozesh.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;
    public Course save(Course course){
        if (courseRepository.findByCourseCode(course).isPresent())
        {
            return course;
        }
        return  courseRepository.save(course);
    }
}
