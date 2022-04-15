package com.assignmentMvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="COURSES")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int courseId;
	@Column(name="name")
	private String courseName;
	@Column(name="fees")
	private int fees;
	@Column(name="duration")
	private int duration; // in weeks
	@Column(name="startDate")
	private String startDate;;
	
	public Course() {}
	public Course(String courseName, int fees, int duration, String startDate) {
		this.courseName = courseName;
		this.fees = fees;
		this.duration = duration;
		this.startDate = startDate;
	}
	
	// Getters and Setters
	public int getCourseId() {return courseId;}
	public void setCourseId(int courseId) {this.courseId = courseId;}
	public String getCourseName() {return courseName;}
	public void setCourseName(String courseName) {this.courseName = courseName;}
	public int getFees() {return fees;}
	public void setFees(int fees) {this.fees = fees;}
	public int getDuration() {return duration;}
	public void setDuration(int duration) {this.duration = duration;}
	public String getStartDate() {return startDate;}
	public void setStartDate(String startDate) {this.startDate = startDate;}
	
	
	
	

}
