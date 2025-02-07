package com.example.Student.Admission.Registration.Repository;

import com.example.Student.Admission.Registration.Model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Integer> {
}
