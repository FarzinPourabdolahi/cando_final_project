package com.example.amoozesh.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="course_seq")
    @SequenceGenerator(name="course_seq", sequenceName = "person_seq", allocationSize = 10000)
    private long id;
    @Enumerated(EnumType.STRING)
    private CourseType courseType;
    private String courseName;
    private String courseCode;
    private int courseUnit;

}
