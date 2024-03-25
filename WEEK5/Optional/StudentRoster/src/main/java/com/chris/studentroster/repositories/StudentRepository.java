package com.chris.studentroster.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chris.studentroster.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{

	List<Student> findAll();
	List<Student> findByDormIdIs(Long dormId);
}
