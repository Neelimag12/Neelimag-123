package com.assignmentMvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignmentMvc.model.Course;
import com.assignmentMvc.repository.CourseRepository;
@Service
public class CourseService {
	@Autowired
	CourseRepository repository;
	
	public List<Course> getCourseList(){
		return (List<Course>)repository.findAll();
	}

}
