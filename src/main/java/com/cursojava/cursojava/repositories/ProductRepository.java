package com.cursojava.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.cursojava.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
	 

}
