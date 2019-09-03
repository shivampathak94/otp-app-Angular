package com.prac1.springdemo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@ResponseBody
	@GetMapping("/loginemployee")
    public String loginEmp(String username, String password) {
		if(username=="emp" && password=="1234") {
			return "Employee Login Successfull";
		}
		else
			return "Login failed";
    }

	
	@ResponseBody
	@GetMapping("/loginadmin")
    public String loginAdmin(String username, String password) {
		if(username=="admin" && password=="1234") {
			return "Admin Login Successfull";
		}
		else
			return "Login failed";
    }
	
	
	@SuppressWarnings("unused")
	@ResponseBody
	@GetMapping("/registerlogin")
    public String registerLogin(String name, String empId, String email, String projectCode, String projectName) {
		
		name="Shivam";
		empId="2323";
		email="xyz@gmail.com";
		projectCode="O4JT";
		projectName="OneJava";
		String username = null,password = null;
		if(username=="register" && password=="1234") {
			return "Registration";
		}
		else {
			return "Registration Successfull";
		}
    }


}
