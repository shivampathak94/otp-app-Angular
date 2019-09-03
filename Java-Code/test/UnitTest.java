package com.prac1.springdemo.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.prac1.springdemo.rest.LoginController;

public class UnitTest {
	
	@Test
    public void getLoginEmployee() {
		LoginController loginemp=new LoginController();
        String result=loginemp.loginEmp("emp", "1234");
        assertEquals("Employee Login Successfull",result);
	}

    @Test
    public void getLoginAdmin() {
       LoginController loginadmin=new LoginController();
       String result=loginadmin.loginAdmin("admin", "1234");
        assertEquals("Admin Login Successfull",result);
    }
    
    @Test
    public void getRegister() {
       LoginController register=new LoginController();
       String result=register.registerLogin("Shivam", "2323", "xyz@gmail.com", "O4JT", "OneJava");
       assertEquals("Registration Successfull",result);
    }
    
    
}
