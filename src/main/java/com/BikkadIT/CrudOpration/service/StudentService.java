package com.BikkadIT.CrudOpration.service;

import java.util.List;

import com.BikkadIT.CrudOpration.entities.Student;

public interface StudentService {

	
	public boolean saveStudent(Student st);
	
	public List<Student> getAllStudent();
	
	public boolean updateStudent(Student st);
	
	public boolean deletAllStu();
}
