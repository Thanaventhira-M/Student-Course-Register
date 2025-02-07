package com.example.Student.Admission.Registration.Controller;


import com.example.Student.Admission.Registration.Model.Course;
import com.example.Student.Admission.Registration.Model.CourseRegistry;
import com.example.Student.Admission.Registration.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/courses")
    public List<Course> availableCourse(){

        return courseService.availableCourse();

    }

    @GetMapping("/courses/enrolled")
    public List<CourseRegistry> enrolledStudents(){

        return courseService.enrolledStudents();
    }

    @PostMapping("/courses/register")
    public String enrollCourse(@RequestParam("name") String name,
                                @RequestParam("emailId") String emailId,
                                @RequestParam("courseName") String courseName){
        courseService.enrollCourse(name,emailId,courseName);
        return "Congratulation!"+ name+" Entrollment SuccessFull for"+ courseName;
    }
}
