package com.greatLearning.crm.dao;

import java.util.List;

import com.greatLearning.crm.entity.Customer;

public interface CustomerDAO {
	public List<Customer> getCustomers();
	public Customer getCustomer(int id);
	public void saveCustomer(Customer theCustomer);
	public void deleteCustomer(int id);
}
