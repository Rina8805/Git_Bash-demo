package com.springboot_ims_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.springboot_ims_app.model.Faculty;

import jakarta.transaction.Transactional;
@Repository
public interface FacultyRepository extends JpaRepository<Faculty,Integer> {

	@Transactional
	@Modifying
	@Query(name="deletedata", value="delete from Faculty where facultyId=?1")
	public void deleteData(int facultyId);
	
	@Query(name="getFacultydataById", value="from Faculty where facultyId=?1")
	public Faculty getFacultydata(int facultyId);
	
	@Transactional
	@Modifying
	@Query(name="update", value="update Faculty set facultyName=?1,occupation=?2,salary=?3,contactNumber=?4 where facultyId=?5")
	public void updateData(String facultyName,String occupation,float salary,long contactNumber,int facultyId);
	
}
