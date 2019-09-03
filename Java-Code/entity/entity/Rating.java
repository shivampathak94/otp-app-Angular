package com.prac1.springdemo.entity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rating")
public class Rating {

	@Id
	@Column(name="emp_id")
	String empId;
	
	@Column(name="flag")
	boolean flag;
	
	@Column(name="emp_name")
	String empName;
	
	@Column(name="designation")
	String designation;
	
	@Column(name="tech_skill")
	String techSkill;
	
	@Column(name="analysis_skill")
	String analysisSkill;
	
	@Column(name="code_quality")
	String codeQuality;
	
	@Column(name="attitude")
	String attitude;
	
	@Column(name="adaptive")
	String adaptive;
	
	@Column(name="responsibility")
	String responsibility;
	
	@Column(name="delivery")
	String delivery;
	
	@Column(name="comment")
	String comment;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "Rating [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", techSkill="
				+ techSkill + ", analysisSkill=" + analysisSkill + ", codeQuality=" + codeQuality + ", attitude="
				+ attitude + ", adaptive=" + adaptive + ", responsibility=" + responsibility + ", delivery=" + delivery
				+ ", comment=" + comment + "]";
	}

	


	

	public Rating(String empId, String empName, String designation, String techSkill, String analysisSkill,
			String codeQuality, String attitude, String adaptive, String responsibility, String delivery,
			String comment) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.techSkill = techSkill;
		this.analysisSkill = analysisSkill;
		this.codeQuality = codeQuality;
		this.attitude = attitude;
		this.adaptive = adaptive;
		this.responsibility = responsibility;
		this.delivery = delivery;
		this.comment = comment;
	}

	public String getTechSkill() {
		return techSkill;
	}

	public void setTechSkill(String techSkill) {
		this.techSkill = techSkill;
	}

	public String getAnalysisSkill() {
		return analysisSkill;
	}

	public void setAnalysisSkill(String analysisSkill) {
		this.analysisSkill = analysisSkill;
	}

	public String getCodeQuality() {
		return codeQuality;
	}

	public void setCodeQuality(String codeQuality) {
		this.codeQuality = codeQuality;
	}

	public String getAttitude() {
		return attitude;
	}

	public void setAttitude(String attitude) {
		this.attitude = attitude;
	}

	public String getAdaptive() {
		return adaptive;
	}

	public void setAdaptive(String adaptive) {
		this.adaptive = adaptive;
	}

	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

	public String getDelivery() {
		return delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public Rating() {
		super();
	}
	
	
	
}
