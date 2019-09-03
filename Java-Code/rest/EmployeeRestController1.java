package com.prac1.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prac1.springdemo.entity.entity.EmployeeRegistration1;
import com.prac1.springdemo.service.EmployeeRegistrationService1;


@CrossOrigin("*")
@RestController
@RequestMapping("/emp1")
public class EmployeeRestController1 {


	private EmployeeRegistrationService1 employeeService1;
	
	private List<EmployeeRegistration1> employees;
	
	private List<EmployeeRegistration1> employees1;
	
	
	@Autowired
	public EmployeeRestController1(EmployeeRegistrationService1 employeeService1) {
		this.employeeService1 = employeeService1;
	}

	// expose "/employees" and return list of employees
	@RequestMapping("/employees")
	public List<EmployeeRegistration1> findAll() {
		System.out.println("!!Hello Pathak!!");
		
		 List<EmployeeRegistration1> employees2=new ArrayList();
		
	//	System.out.println(employeeService1.findAll().get(0).isApprove());
		System.out.println("record :" +employeeService1.findAll().size());
		
		
		for(int i=0;i<employeeService1.findAll().size();i++)
		{
			
			
			boolean b=employeeService1.findAll().get(i).isApprove();
			System.out.println("record :"+b);
			System.out.println("employee 2 :"+employees2);
			if(b!=true)
			{
				System.out.println("inside if");
			//	employees1=employeeService1.findAll();
				System.out.println("inside if :"+employeeService1.findAll().get(i));
				employees2.add(employeeService1.findAll().get(i));
				
				
			}
			
			System.out.println("after if "+employees2);
		
			
		}
		return employees2;
	
		
		
	}
	
	
	
	@PostMapping("/reg")
	public EmployeeRegistration1 create(@RequestBody EmployeeRegistration1 user) {
		
		System.out.println("Inside create employee");
		System.out.println("Deatils from front end "+user);
		boolean approve=user.isApprove();
		
		System.out.println("Approve value is :"+approve);
		employeeService1.save(user);
		System.out.println("Inside create employee");
		
		System.out.println(user);
		return user;
	}
	
	
	// Update a Note
	@PostMapping("/upadteuser")
	public void updateemp(@RequestBody EmployeeRegistration1 emp) {
		
		EmployeeRegistration1 e=new EmployeeRegistration1();
		e.setEmpId(emp.getEmpId());
		e.setFirstName(emp.getFirstName());
		e.setLastName(emp.getLastName());
		e.setProjectcode(emp.getProjectcode());
		e.setPass(emp.getPass());
		e.setProjectmanager(emp.getProjectmanager());
		e.setProjectname(emp.getProjectname());
		e.setTeamname(emp.getTeamname());
		e.setEmail(emp.getEmail());
		e.setApprove(true);
			
		
		employeeService1.save(e);
       
	   System.out.println("user :"+emp);
	   
	}
	
	
	
	@PostMapping("/id")
	public void delete1(@RequestBody String emp) {
		//int id = Integer.parseInt(emp);
		
		employeeService1.delete(emp);
		System.out.println("controller delete method");
		System.out.println("user id :"+emp);
		
		
		
		
	}

}
