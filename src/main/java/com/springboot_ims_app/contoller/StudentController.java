package com.springboot_ims_app.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot_ims_app.model.Faculty;
import com.springboot_ims_app.model.Student1;
import com.springboot_ims_app.servicei.FacultyServiceI;
import com.springboot_ims_app.servicei.StudentServiceI;

@Controller
public class StudentController {

	@Autowired
	StudentServiceI ssi;
	
	@RequestMapping("/addstudent")
	public String preRegisterStudent()
	{
		return "registerStudent";
	}
	
	@RequestMapping("/viewstudent")
	public String ViewStudent(Model m)
	{
		List<Student1> stu = ssi.getAllStudent();
		m.addAttribute("data",stu);
		return "viewStudent";
	}
	
	@RequestMapping("/saves")
	public String SubmitS(@ModelAttribute Student1 s)
	{
		ssi.saveStudent(s);
		return "success";		
	}
	
	@RequestMapping("/deletes")
	public String deleteStudent(@RequestParam int studentId, Model m)
	{
		List<Student1> list = ssi.deleteStudent(studentId);
		m.addAttribute("data",list);
		return "viewStudent";
	}
	
	@RequestMapping("/edits")
	public String editStudent(@RequestParam int studentId, Model m)
	{
		Student1 s = ssi.editStudent(studentId);
		m.addAttribute("stu", s);
		return "editStudent";
	}
	
	@RequestMapping("/updates")
	public String updateStudent(@ModelAttribute Student1 s,Model m)
	{
		List<Student1> list = ssi.updateStudent(s);
		m.addAttribute("data", list);
		return "viewStudent";
	}
}
