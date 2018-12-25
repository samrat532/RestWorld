package com.college.pojo;

import java.util.Date;
import java.util.List;

public class StudentPerInfo {
	private String fullName;
	private String fatherName;
	private String motherName;
	private String mobileNumber;
	private String state;
	private String city;

	// private List<StudentAddress> studentAddress;

	// public List<StudentAddress> getStudentAddress() {
	// return studentAddress;
	// }
	//
	// public void setStudentAddress(List<StudentAddress> studentAddress) {
	// this.studentAddress = studentAddress;
	// }

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	/*
	 * public Date getDob() { return dob; }
	 * 
	 * public void setDob(Date dob) { this.dob = dob; }
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
