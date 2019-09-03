package com.prac1.springdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prac1.springdemo.entity.entity.EmployeeRegistration;

public interface EmployeeDAO extends JpaRepository<EmployeeRegistration, String> {

//	public List<Employee> findAll();
//	
//	public void saveemp(EmployeeRegistration emp);
//		
}
