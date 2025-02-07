package com.example.Student.Admission.Registration.Service;


import com.example.Student.Admission.Registration.Model.Course;
import com.example.Student.Admission.Registration.Model.CourseRegistry;
import com.example.Student.Admission.Registration.Repository.CourseRegistryRepo;
import com.example.Student.Admission.Registration.Repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
 @Autowired
    CourseRepo courseRepo;
 @Autowired
    CourseRegistryRepo courseRegistryRepo;
    public List<Course> availableCourse() {

       return courseRepo.findAll();

    }

    public List<CourseRegistry> enrolledStudents() {
        return courseRegistryRepo.findAll();
    }

    public void enrollCourse(String name, String emailId, String courseName) {

        CourseRegistry courseRegistry =new CourseRegistry(name,emailId,courseName);
        courseRegistryRepo.save(courseRegistry);


    }
}
