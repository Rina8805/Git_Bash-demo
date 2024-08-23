package com.springboot_ims_app.contoller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.springboot_ims_app.model.Course;
import com.springboot_ims_app.servicei.CourseServiceI;

@Controller
public class CourseController {

	@Autowired
	CourseServiceI csi;
	
	@RequestMapping("/addcourse")
	public String preRegisterCourse()
	{
		return "registerCourse";
	}
	
	@RequestMapping("/viewcourse")
	public String ViewCourse(Model m)
	{
		List<Course> courses= csi.getAllCourses();
		m.addAttribute("data",courses );
		return "viewCourses";
	}
	
	@RequestMapping("/savec")
	public String SubmitC(@ModelAttribute Course c)
	{
		csi.saveCourse(c);
		return "success";
		
	}
	
	
	@RequestMapping("/delete")
	public String deleteCourse(@RequestParam int courseId, Model m)
	{
		List<Course> list = csi.deleteCourse(courseId);
		m.addAttribute("data",list);
		return "viewCourses";
	}
	
	@RequestMapping("/edit")
	public String editCourse(@RequestParam int courseId, Model m)
	{
		Course c = csi.editCourse(courseId);
		m.addAttribute("co", c);
		return "editCourse";
	}
	
	@RequestMapping("/update")
	public String updateCourse(@ModelAttribute Course c,Model m)
	{
		List<Course> list = csi.updateCourse(c);
		m.addAttribute("data", list);
		return "viewCourses";
	}
	
}
