package com.conatus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conatus.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}