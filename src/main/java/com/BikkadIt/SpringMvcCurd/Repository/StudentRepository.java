package com.BikkadIt.SpringMvcCurd.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIt.SpringMvcCurd.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

	
}
