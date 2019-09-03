package com.prac1.springdemo.entity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee1")
public class EmployeeRegistration1 {

	
	  @Column(name="first_Name")
	  String firstName;
	  
	  @Column(name="last_Name")
	  String lastName;
	  
	  @Id
	  @Column(name="emp_Id")
	  String empId;
	  
	  
	  @Column(name="email")
	  String email;
	  
	  @Column(name="pass")
	  String pass;
	  
	  @Column(name="project_code")
	  String projectcode;
	  
	  @Column(name="project_name")
	  String projectname;
	  
	  @Column(name="project_manager")
	  String projectmanager;
	  
	  @Column(name="team_name")
	  String teamname;
	  
	  @Column(name="approve")
	  boolean approve;
	  
	  
	  

	public boolean isApprove() {
		return approve;
	}
	public void setApprove(boolean approve) {
		this.approve = approve;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getProjectcode() {
		return projectcode;
	}
	public void setProjectcode(String projectcode) {
		this.projectcode = projectcode;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getProjectmanager() {
		return projectmanager;
	}
	public void setProjectmanager(String projectmanager) {
		this.projectmanager = projectmanager;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	

	public EmployeeRegistration1() {
		super();
	}
	@Override
	public String toString() {
		return "EmployeeRegistration1 [firstName=" + firstName + ", lastName=" + lastName + ", empId=" + empId
				+ ", email=" + email + ", pass=" + pass + ", projectcode=" + projectcode + ", projectname="
				+ projectname + ", projectmanager=" + projectmanager + ", teamname=" + teamname + ", approve=" + approve
				+ "]";
	}
	public EmployeeRegistration1(String firstName, String lastName, String empId, String email, String pass,
			String projectcode, String projectname, String projectmanager, String teamname, boolean approve) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
		this.email = email;
		this.pass = pass;
		this.projectcode = projectcode;
		this.projectname = projectname;
		this.projectmanager = projectmanager;
		this.teamname = teamname;
		this.approve = approve;
	}

	
	
	
	  
	  
	  
	  
}
