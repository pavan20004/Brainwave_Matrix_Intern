package com.PatientRegistration;

public class Patient {
	private int patientId;
	private String name;
	private int age;
	private String gender;
	private String contactInfo;
	
	public Patient(int patientId, String name, int age, String gender, String contactInfo) {
	
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.contactInfo = contactInfo;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	
	
	

}
