package com.greatLearning.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greatLearning.crm.dao.CustomerDAO;
import com.greatLearning.crm.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;
	

	@Override
	@Transactional
	public List<Customer> findAll() {
		return customerDAO.getCustomers();
	}


	@Override
	@Transactional
	public Customer findById(int id) {
		return customerDAO.getCustomer(id);
	}

	@Override
	@Transactional
	public void save(Customer customer) {
		customerDAO.saveCustomer(customer);
		
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		customerDAO.deleteCustomer(id);
	}


}