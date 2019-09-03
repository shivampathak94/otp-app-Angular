package com.prac1.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prac1.springdemo.dao.EmployeeDAO;
import com.prac1.springdemo.entity.entity.EmployeeRegistration;

@Service
public class EmployeeRegistrationService {

	private EmployeeDAO empDao;
	

	@Autowired
	public EmployeeRegistrationService(EmployeeDAO empDao) {
		this.empDao = empDao;
	}
	
	public List<EmployeeRegistration> findAll(){
		return empDao.findAll();
	}
	
	public void save(EmployeeRegistration emp) {
		empDao.save(emp);
	}
}
