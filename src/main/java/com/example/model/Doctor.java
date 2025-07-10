package com.example.model;

public class Doctor {
	 private int doctorId;
	 private String name;
	 private String specialization;
	 private long contactNumber;
	 private String availabilitySchedule;
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAvailabilitySchedule() {
		return availabilitySchedule;
	}
	public void setAvailabilitySchedule(String availabilitySchedule) {
		this.availabilitySchedule = availabilitySchedule;
	}

}
