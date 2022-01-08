package com.conatus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conatus.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
