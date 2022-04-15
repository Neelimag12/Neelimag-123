package com.assignmentMvc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignmentMvc.model.Course;
@Repository
public interface CourseRepository extends CrudRepository<Course, Integer>{

}
