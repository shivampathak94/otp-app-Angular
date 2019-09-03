package com.prac1.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prac1.springdemo.dao.Employee1DAO;
import com.prac1.springdemo.dao.EmployeeDAO;
import com.prac1.springdemo.entity.entity.EmployeeRegistration;
import com.prac1.springdemo.entity.entity.EmployeeRegistration1;

@Service
public class EmployeeRegistrationService1
{
         private Employee1DAO empDao1;
	

	@Autowired
	public EmployeeRegistrationService1(Employee1DAO empDao) {
		this.empDao1 = empDao;
	}
	
	public List<EmployeeRegistration1> findAll(){
		return empDao1.findAll();
	}
	
	public void save(EmployeeRegistration1 emp) {
		empDao1.save(emp);
		
	}
	
	public void delete(String emp) {
		empDao1.deleteById(emp);
		
	}

}

