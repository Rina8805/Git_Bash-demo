package com.springboot_ims_app.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot_ims_app.model.Course;
import com.springboot_ims_app.repository.CourseRepository;
import com.springboot_ims_app.servicei.CourseServiceI;
import jakarta.transaction.Transactional;

@Service
public class CourseServiceImpl implements CourseServiceI {

	@Autowired
	CourseRepository cr;
	
	@Override
	public void saveCourse(Course c)
	{
		
	    cr.save(c);
		
	}

	@Override
	public List<Course> getAllCourses() {
		
		return cr.findAll();
	}

	@Transactional
	@Override
	public List<Course> deleteCourse(int courseId) {
		
		cr.deleteData(courseId);
		return cr.findAll();
	}

	@Override
	public Course editCourse(int courseId) {
		
		return cr.getCoursedata(courseId);
	}

	@Override
	public List<Course> updateCourse(Course c) {
		
		cr.updateData(c.getCourseName(),c.getCourseType(),c.getFees(),c.getModes(),c.getCourseId());
		return cr.findAll();
	}

	
}
