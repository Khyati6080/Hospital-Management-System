package com.example.HospitalManagementSystem;

import com.example.model.Doctor;
import com.example.dao.DoctorDao;
import com.example.daoImpl.DoctorDaoImpl;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        DoctorDaoImpl doctordao = new DoctorDaoImpl();
        Doctor doctor = new Doctor();
        
        doctor.setDoctorId(1);
        doctor.setName("Alice");
        doctor.setSpecialization("Cardiologist");
        doctor.setContactNumber("9876543210");
        doctor.setAvailabilitySchedule("Mon-Fri : 10:00 to 16:00");
        doctordao.addDoctor(doctor);
        
        
//        To Check GIT
        
        
//        Second Entry
//        doctor.setDoctorId(2);
//        doctor.setName("Dr. Alice Verma");
//        doctor.setSpecialization("Dermatologist");
//        doctor.setContactNumber("9874556210");
//        doctor.setAvailabilitySchedule("Mon-Fri : 9:00 to 17:00");
//        doctordao.addDoctor(doctor);
        
//        doctor.setName("Dr. Anil Kapoor");
//        doctor.setSpecialization("Oncologist");
//        doctor.setContactNumber("8974556210");
//        doctor.setAvailabilitySchedule("Tue-Fri : 9:00 to 13:00");
//        doctordao.addDoctor(doctor);
        
          doctordao.updateDoctor(1,doctor);
    }
}
