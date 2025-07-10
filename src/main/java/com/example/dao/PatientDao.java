package com.example.dao;

import com.example.model.Patient;

public interface PatientDao {
	
	Patient getPatient(int id);
	void addPatient(Patient patient);
	void deletePatient(int id);
	void updatePatient(Patient patient);

}
