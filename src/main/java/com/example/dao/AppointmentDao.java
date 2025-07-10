package com.example.dao;

import com.example.model.Appointment;

public interface AppointmentDao {
	
	Appointment getAppointment(int id);
	void addAppointment(Appointment appointment);
	void deleteDoctor(int id);
	void updateDoctor(Appointment appointment);

}
