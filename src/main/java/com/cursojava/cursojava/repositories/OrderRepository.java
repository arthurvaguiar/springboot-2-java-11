package com.cursojava.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.cursojava.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
	 

}
