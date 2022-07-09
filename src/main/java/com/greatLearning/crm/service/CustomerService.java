package com.greatLearning.crm.service;

import java.util.List;

import com.greatLearning.crm.entity.Customer;

public interface CustomerService {
	public List<Customer> findAll();
	public Customer findById( int id );
	public void save( Customer book ); // save or update
	public void deleteById( int id );

}
