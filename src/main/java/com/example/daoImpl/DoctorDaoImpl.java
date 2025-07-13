package com.example.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.dao.DoctorDao;
import com.example.model.Doctor;
import com.example.util.DatabaseConnection;

public class DoctorDaoImpl implements DoctorDao {

	@Override
	public Doctor getDoctorDetails(int doctorId) {
		
		String query = "select * from Doctor where doctorId=?";
		Doctor doctor = null;
		
		try {
			Connection con = DatabaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,doctorId);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				doctor = new Doctor();
				doctor.setDoctorId(rs.getInt("doctorId"));
				doctor.setName(rs.getString("name"));
				doctor.setSpecialization(rs.getString("specialization"));
				doctor.setContactNumber(rs.getString("contactNumber"));
				doctor.setAvailabilitySchedule(rs.getString("availabilitySchedule"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return doctor;
	}
	

	@Override
	public void addDoctor(Doctor doctor) {
		
		String query = "insert into Doctor(`doctorId`,`name`,`specialization`,`contactNumber`,`availabilitySchedule`) values(?,?,?,?,?)";
		
		try{
			Connection con = DatabaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,doctor.getDoctorId());
			ps.setString(2,doctor.getName());
			ps.setString(3, doctor.getSpecialization());
			ps.setString(4,doctor.getContactNumber());
			ps.setString(5, doctor.getAvailabilitySchedule());
			ps.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

	
	@Override
	public void updateDoctor(int doctorId,Doctor doctor) {
		String query = "update Doctor set name=? where doctorId=?"; 
		try{
			Connection con = DatabaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1, doctor.getDoctorId());
			ps.setString(2,doctor.getName());
			ps.setString(3, doctor.getSpecialization());
			ps.setString(4,doctor.getContactNumber());
			ps.setString(5, doctor.getAvailabilitySchedule());
			ps.executeUpdate();
		
	    }catch(SQLException e) {
		    e.printStackTrace();
	    }
	}
}
