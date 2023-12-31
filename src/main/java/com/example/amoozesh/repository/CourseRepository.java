package com.example.amoozesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.amoozesh.model.Course;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    public Optional<Course> findByCourseCode(Course course);
}
