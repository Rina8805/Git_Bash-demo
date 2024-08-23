package com.springboot_ims_app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot_ims_app.model.Faculty;
import com.springboot_ims_app.repository.FacultyRepository;
import com.springboot_ims_app.servicei.FacultyServiceI;

@Service
public class FacultyServiceImpl implements FacultyServiceI {

	@Autowired
	 FacultyRepository fr;
	
	@Override
	public void saveFaculty(Faculty f)
	{
		fr.save(f);
		
	}

	@Override
	public List<Faculty> getAllFaculty() {
		
		return fr.findAll();
	}

	@Override
	public List<Faculty> deleteFaculty(int facultyId) {
		
		fr.deleteData(facultyId);
		return fr.findAll();
	}

	@Override
	public Faculty editFaculty(int facultyId) {
		
		return fr.getFacultydata(facultyId);
	}

	@Override
	public List<Faculty> updateFaculty(Faculty f) {
		
		fr.updateData(f.getFacultyName(),f.getOccupation(),f.getSalary(),f.getContactNumber(),f.getFacultyId());
		return fr.findAll();
	}
	
	

}
