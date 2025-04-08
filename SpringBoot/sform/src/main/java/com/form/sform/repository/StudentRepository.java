package com.form.sform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.form.sform.models.Students;

@Repository

public interface StudentRepository extends JpaRepository<Students, Long>{

	

	/*
	 * spring data jpa -> jpa -> hibernate -> jdbc -> database
	 * 
	 * 1 to get all details -> findAll()
	 * 2 to get single data -> findById(id)
	 * 3 to delete data -> deleteById(id)/ dlete (object)
	 * 4 to create or update data -> save (object)
	 */
	/*
	 * findBy -> an object
	 * existBy -> boolean
	 */
	public Students findByEmail(String email);
}
