package com.springboot_ims_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.springboot_ims_app.model.Student1;
import jakarta.transaction.Transactional;

@Repository
public interface StudentRepository extends JpaRepository<Student1,Integer> {

	@Transactional
	@Modifying
	@Query(name="deletedata", value="delete from Student1 where studentId=?1")
	public void deleteData(int facultyId);
	
	@Query(name="getStudentdataById", value="from Student1 where studentId=?1")
	public Student1 getStudentdata(int studentId);
	
	@Transactional
	@Modifying
	@Query(name="update", value="update Student1 set studentName=?1,educationDetails=?2,age=?3,address=?4 where studentId=?5")
	public void updateData(String studentName,String educationDetails,int age,String address,int studentId);
}
