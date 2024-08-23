package com.springboot_ims_app.servicei;

import java.util.List;

import com.springboot_ims_app.model.Faculty;

public interface FacultyServiceI {

	public void saveFaculty(Faculty f);

	public List<Faculty> getAllFaculty();

	public List<Faculty> deleteFaculty(int facultyId);

	public Faculty editFaculty(int facultyId);

	public List<Faculty> updateFaculty(Faculty f);
	

}
