package com.example.dao;

import com.example.model.Bill;

public interface BillDao {
	
	Bill getBill(int id);
	void addBill(Bill bill);
	void deleteBill(int id);
	void updateBill(Bill bill);

}
