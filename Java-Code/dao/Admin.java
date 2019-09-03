package com.prac1.springdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prac1.springdemo.entity.entity.Employee;

public interface Admin extends JpaRepository<Employee, Integer> {
	
	
}
