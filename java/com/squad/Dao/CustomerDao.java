package com.squad.Dao;

import java.util.List;

import com.squad.Pojo.Customer;



public interface CustomerDao {
	
	boolean addCustomer(Customer customer);
	boolean updateCustomerById(Customer customer);
	boolean deleteCustomerById(String customerEID);
	List<Customer>getAllCustomer();
	Customer searchCustomerById(String customerEID);

}
