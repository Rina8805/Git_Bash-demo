package com.springboot_ims_app.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.springboot_ims_app.model.Course;


import jakarta.transaction.Transactional;
@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {
	

	@Transactional
	@Modifying
	@Query(name="deletedata", value="delete from Course where courseId=?1")
	public void deleteData(int courseId);
	
	@Query(name="getCoursedataById", value="from Course where courseId=?1")
	public Course getCoursedata(int courseId);
	
	@Transactional
	@Modifying
	@Query(name="update", value="update Course set courseName=?1,courseType=?2,fees=?3,modes=?4 where courseId=?5")
	public void updateData(String courseName,String courseType,float fees,String modes,int courseId);
	

}
