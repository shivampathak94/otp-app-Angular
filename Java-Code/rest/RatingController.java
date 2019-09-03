package com.prac1.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prac1.springdemo.dao.RatingDAO;
import com.prac1.springdemo.entity.entity.EmployeeRegistration1;
import com.prac1.springdemo.entity.entity.Rating;
import com.prac1.springdemo.service.RatingService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rating")
public class RatingController {

	Rating rating=new Rating();
	
	
	private RatingService ratingservice;
	
	@Autowired
	public RatingController(RatingService ratingservice)
	{
		this.ratingservice=ratingservice;
	}
	
	@RequestMapping("/employees")
	public List<Rating> findAll() 
	{

		 List<Rating> employees2=new ArrayList();
		
	//	System.out.println(employeeService1.findAll().get(0).isApprove());
		System.out.println("record :" +ratingservice.findAll().size());
		
		
		for(int i=0;i<ratingservice.findAll().size();i++)
		{
			
			
			boolean b=ratingservice.findAll().get(i).isFlag();
			System.out.println("record :"+b);
			System.out.println("employee 2 :"+employees2);
			if(b==true)
			{
				System.out.println("inside if");
			//	employees1=employeeService1.findAll();
				System.out.println("inside if :"+ratingservice.findAll().get(i));
				employees2.add(ratingservice.findAll().get(i));
				
				
			}
			
			System.out.println("after if "+employees2);
		
			
		}
		return employees2;
	
	}
	
	@RequestMapping("/employees1")
	public List<Rating> findAll1() 
	{

		 List<Rating> employees2=new ArrayList();
		
		//System.out.println("flag value :"+ratingservice.findAll().get(2).isFlag());
		System.out.println("record :" +ratingservice.findAll().size());
		
		
		for(int i=0;i<ratingservice.findAll().size();i++)
		{
			
			
			boolean b=ratingservice.findAll().get(i).isFlag();
			System.out.println("record :"+b);
			System.out.println("employee 2 :"+employees2);
			if(b!=true)
			{
				System.out.println("inside if");
			//	employees1=employeeService1.findAll();
				System.out.println("inside if :"+ratingservice.findAll().get(i));
				employees2.add(ratingservice.findAll().get(i));
				
				
			}
			
			System.out.println("after if "+employees2);
		
			
		}
		return employees2;
	
	}
	
	@PostMapping("/reg")
	public Rating create(@RequestBody Rating user) {
		
		System.out.println("Inside create employee");
		System.out.println("Deatils from front end "+user);
		
		System.out.println(user);
		
		rating.setAdaptive(user.getAdaptive());
		rating.setAnalysisSkill(user.getAnalysisSkill());
		rating.setAttitude(user.getAttitude());
		rating.setCodeQuality(user.getCodeQuality());
		rating.setComment(user.getComment());
		rating.setDelivery(user.getDelivery());
		rating.setDesignation(user.getDesignation());
		rating.setEmpId(user.getEmpId());
		rating.setEmpName(user.getEmpName());
		rating.setResponsibility(user.getResponsibility());
		rating.setTechSkill(user.getTechSkill());
		
		ratingservice.save(user);
		System.out.println("Saved");
		return user;
	}
	
	// Update a Note
	@PostMapping("/upadteuser")
	public void updateemp(@RequestBody Rating emp) {
		
	
		System.out.println("Inside Upadete user :"+emp);
		Rating r =new Rating();
		
		r.setAdaptive(emp.getAdaptive());
		r.setAnalysisSkill(emp.getAnalysisSkill());
		r.setAttitude(emp.getAttitude());
		r.setCodeQuality(emp.getCodeQuality());
		r.setComment(emp.getComment());
		r.setDelivery(emp.getDelivery());
		r.setDesignation(emp.getDesignation());
		r.setEmpId(emp.getEmpId());
		r.setEmpName(emp.getEmpName());
		r.setFlag(true);
		r.setResponsibility(emp.getResponsibility());
		r.setTechSkill(emp.getTechSkill());
		
		
		/*EmployeeRegistration1 e=new EmployeeRegistration1();
		e.setEmpId(emp.getEmpId());
		e.setFirstName(emp.getFirstName());
		e.setLastName(emp.getLastName());
		e.setProjectcode(emp.getProjectcode());
		e.setPass(emp.getPass());
		e.setProjectmanager(emp.getProjectmanager());
		e.setProjectname(emp.getProjectname());
		e.setTeamname(emp.getTeamname());
		e.setEmail(emp.getEmail());
		e.setApprove(true);*/
			
		
		ratingservice.save(r);
       
	   System.out.println("user :"+emp);
	   
	}
	
	@PostMapping("/id")
	public void delete1(@RequestBody String emp) {
		//int id = Integer.parseInt(emp);
		
		ratingservice.delete(emp);
		System.out.println("controller delete method");
		System.out.println("user id :"+emp);
		
		
		
		
	}
	
}
