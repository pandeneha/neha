package com.BikkadIt.SpringMvcCurd.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIt.SpringMvcCurd.Repository.StudentRepository;
import com.BikkadIt.SpringMvcCurd.model.Student;


@Service
public class StudentServiceImpl implements StudentServiceI {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public boolean saveStudent(Student stu) {
		Student save = studentRepository.save(stu);
		
		if(save!=null) {
			return true;
			
		}
		else {
		
		return false;
	
	}}

	@Override
	public List<Student> getAllStudent() {
		List<Student> findAll = (List<Student>) studentRepository.findAll();
		return findAll;
	}

	@Override
	public boolean updateStudent(Student stu) {
		Student save = studentRepository.save(stu);
		
		if(save!=null) {
			return true;
			
		}
		else {
		
		return false;
	
	}
		
	}

	@Override
	public boolean deleteAllStu() {
		
		List<Student> findAll = (List<Student>) studentRepository.findAll();
		if (findAll.isEmpty()) {
		
			return false;
		} else	{
			studentRepository.deleteAll();
			return true;
		}
	}

	

		
	}

