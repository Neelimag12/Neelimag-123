package com.assignmentMvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.assignmentMvc.model.Course;
import com.assignmentMvc.model.User;
import com.assignmentMvc.service.CourseService;
import com.assignmentMvc.service.UserService;
@Controller
public class AppController {
	@Autowired
	UserService service;
	
	@Autowired
	CourseService courseService;

	@GetMapping("/")
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("home");
		return mav;
	}
	
	@GetMapping("/login")
	public ModelAndView loginPage() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	
	@GetMapping("/register")
	public ModelAndView registrationPage() {
		ModelAndView mav = new ModelAndView("register");
		return mav;
	}
	
	@PostMapping("/save")
	public ModelAndView saveUser(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("created");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		User user = new User(userName,password);
		service.saveUser(user);
		return mav;
	}
	
	@PostMapping("/courses")
	public ModelAndView showCourses(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("failed");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		if(service.validateUser(userName, password)) {
			mav.setViewName("courses");
			List<Course> courseList = courseService.getCourseList();
			mav.addObject("courseList",courseList);
		}
		return mav;
	}
	

}
