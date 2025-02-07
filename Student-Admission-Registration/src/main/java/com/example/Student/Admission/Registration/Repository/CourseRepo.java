package com.example.Student.Admission.Registration.Repository;

import com.example.Student.Admission.Registration.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course,String> {
}
