package com.cursojava.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.cursojava.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	 

}
