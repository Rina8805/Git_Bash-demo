package com.springboot_ims_app.servicei;

import java.util.List;

import com.springboot_ims_app.model.Course;

public interface CourseServiceI {

	public void saveCourse(Course c);

	public List<Course> getAllCourses();

	public List<Course> deleteCourse(int courseId);

	public Course editCourse(int courseId);

	public List<Course> updateCourse(Course c);



}
