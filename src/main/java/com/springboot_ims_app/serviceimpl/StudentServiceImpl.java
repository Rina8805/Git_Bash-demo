package com.springboot_ims_app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot_ims_app.model.Student1;
import com.springboot_ims_app.repository.StudentRepository;
import com.springboot_ims_app.servicei.StudentServiceI;
@Service
public class StudentServiceImpl implements StudentServiceI{

	@Autowired
	StudentRepository sr;
	
	@Override
	public void saveStudent(Student1 s) 
	{
	    sr.save(s);
		
	}

	@Override
	public List<Student1> getAllStudent() {
		
		return sr.findAll();
	}

	@Override
	public List<Student1> deleteStudent(int studentId) {
		
		sr.deleteData(studentId);
		return sr.findAll();
	}

	@Override
	public Student1 editStudent(int studentId) {
		
		return sr.getStudentdata(studentId);
		
	}

	@Override
	public List<Student1> updateStudent(Student1 s) {
		
		sr.updateData(s.getStudentName(),s.getEduationDetails(),s.getAge(),s.getAddress(),s.getStudentId());
		return sr.findAll();
	}

}
