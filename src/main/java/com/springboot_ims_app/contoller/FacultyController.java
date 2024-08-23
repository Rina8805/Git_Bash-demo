package com.springboot_ims_app.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot_ims_app.model.Course;
import com.springboot_ims_app.model.Faculty;
import com.springboot_ims_app.servicei.FacultyServiceI;


@Controller
public class FacultyController {

	@Autowired
	FacultyServiceI fsi;
	
	@RequestMapping("/addfaculty")
	public String preRegisterFaculty()
	{
		return "registerFaculty";
	}
	
	@RequestMapping("/viewfaculty")
	public String ViewFaculty(Model m)
	{
		List<Faculty> fa= fsi.getAllFaculty();
		m.addAttribute("data",fa);
		return "viewFaculties";
	}
	
	@RequestMapping("/savef")
	public String SubmitF(@ModelAttribute Faculty f)
	{
		fsi.saveFaculty(f);
		return "success";
		
	}
	
	@RequestMapping("/deletef")
	public String deleteFaculty(@RequestParam int facultyId, Model m)
	{
		List<Faculty> list = fsi.deleteFaculty(facultyId);
		m.addAttribute("data",list);
		return "viewFaculties";
	}
	
	@RequestMapping("/editf")
	public String editFaculty(@RequestParam int facultyId, Model m)
	{
		Faculty f = fsi.editFaculty(facultyId);
		m.addAttribute("fa", f);
		return "editFaculty";
	}
	
	@RequestMapping("/updatef")
	public String updateFaculty(@ModelAttribute Faculty f,Model m)
	{
		List<Faculty> list = fsi.updateFaculty(f);
		m.addAttribute("data", list);
		return "viewFaculties";
	}
	
}
