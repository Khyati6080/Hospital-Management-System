package com.example.dao;

import com.example.model.Doctor;

public interface DoctorDao {
	
	Doctor getDoctorDetails(int doctorId);
	void addDoctor(Doctor doctor);
	void updateDoctor(int doctorId,Doctor doctor);

}
