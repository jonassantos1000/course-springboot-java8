package com.conatus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conatus.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
