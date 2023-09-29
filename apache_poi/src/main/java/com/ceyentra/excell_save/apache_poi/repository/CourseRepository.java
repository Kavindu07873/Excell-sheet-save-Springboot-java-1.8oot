package com.ceyentra.excell_save.apache_poi.repository;

import com.ceyentra.excell_save.apache_poi.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
