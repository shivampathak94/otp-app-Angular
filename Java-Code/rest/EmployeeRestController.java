package com.prac1.springdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prac1.springdemo.entity.entity.EmployeeRegistration;
import com.prac1.springdemo.service.EmployeeRegistrationService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	
	
	
	private EmployeeRegistrationService employeeService;
	
	@Autowired
	public EmployeeRestController(EmployeeRegistrationService employeeService) {
		this.employeeService = employeeService;
	}

	// expose "/employees" and return list of employees
	@RequestMapping("/employees")
	public List<EmployeeRegistration> findAll() {
		return employeeService.findAll();
	}
	
	@PostMapping("/reg")
	public EmployeeRegistration create(@RequestBody EmployeeRegistration user) {
		employeeService.save(user);
		System.out.println(user);
		return user;
	}


	
}





