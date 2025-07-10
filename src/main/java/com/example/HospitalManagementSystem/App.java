package com.example.HospitalManagementSystem;

import com.example.dao.impl.DoctorDaoImpl;
import com.example.dao.DoctorDao;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        DoctorDao doctor = new DoctorDaoImpl();
    }
}
