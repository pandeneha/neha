package com.BikkadIt.SpringMvcCurd.Service;

import java.util.List;

import com.BikkadIt.SpringMvcCurd.model.Student;

public interface StudentServiceI {

	public boolean saveStudent(Student stu);
		
	public List<Student> getAllStudent();
	
	
	public boolean updateStudent(Student stu);
	
	public boolean deleteAllStu();
	
	}

