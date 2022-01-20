package com.conatus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conatus.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
