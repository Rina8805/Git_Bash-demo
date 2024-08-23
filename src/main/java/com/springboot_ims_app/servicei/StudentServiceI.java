package com.springboot_ims_app.servicei;

import java.util.List;

import com.springboot_ims_app.model.Student1;

public interface StudentServiceI {

	public void saveStudent(Student1 s);

	public List<Student1> getAllStudent();

	public List<Student1> deleteStudent(int studentId);

	public Student1 editStudent(int studentId);

	public List<Student1> updateStudent(Student1 s);

}
