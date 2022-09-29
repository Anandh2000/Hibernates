package com.javaByKiran.assignment.repository;

import com.javaByKiran.assignment.entity.SignUp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface signInRepository extends JpaRepository<SignUp, String>{
	
}
