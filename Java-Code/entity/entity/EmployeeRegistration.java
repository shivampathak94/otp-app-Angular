package com.prac1.springdemo.entity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="employeelist")
public class EmployeeRegistration {

	
	@NotBlank(message="Please enter your name")
	@Column(name="name")
	String name;
	
	@NotBlank(message="Please enter your email")
	@Column(name="v_email")
	String virtusaEmail;
	
	@NotBlank(message="Please enter your emp id")
	@Id
	@Column(name="emp_id")
	String emapId;
	
	
	@NotBlank(message="Please enter your project name")
	@Column(name="p_name")
	String projectName;
	
	@NotBlank(message="Please enter your project code")
	@Column(name="p_code")
	String projectCode;
	
	
	
	@NotBlank(message="Please enter your password")
	@Column(name="password")
	String password;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVirtusaEmail() {
		return virtusaEmail;
	}

	public void setVirtusaEmail(String virtusaEmail) {
		this.virtusaEmail = virtusaEmail;
	}

	public String getEmapId() {
		return emapId;
	}

	public void setEmapId(String emapId) {
		this.emapId = emapId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public EmployeeRegistration(String name, String virtusaEmail, String emapId, String projectName, String projectCode,
			String password) {
		this.name = name;
		this.virtusaEmail = virtusaEmail;
		this.emapId = emapId;
		this.projectName = projectName;
		this.projectCode = projectCode;
		this.password = password;
	}

	public EmployeeRegistration() {
	
    }
	
	@Override
	public String toString() {
		return "EmployeeRegistration [name=" + name + ", virtusaEmail=" + virtusaEmail + ", emapId=" + emapId
				+ ", projectName=" + projectName + ", projectCode=" + projectCode + ", password=" + password + "]";
	}
	
	
	
	
}
