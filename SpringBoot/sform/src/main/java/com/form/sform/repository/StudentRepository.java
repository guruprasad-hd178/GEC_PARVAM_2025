package com.form.sform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.form.sform.models.Students;

@Repository

public interface StudentRepository extends JpaRepository<Students, Long>{

	/*
	 * spring data jpa -> jpa -> hibernate -> jdbc -> database
	 * 
	 * 1 
	 */
}
