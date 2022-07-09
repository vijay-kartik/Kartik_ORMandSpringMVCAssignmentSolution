package com.greatLearning.crm.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.greatLearning.crm.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Customer> getCustomers() {
		Session currentSession;
		try {
			currentSession = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			currentSession = sessionFactory.openSession();
		}
				
		List<Customer> customers = currentSession.createQuery("from Customer",
				Customer.class).getResultList();
						
		return customers;
	}

	@Override
	public Customer getCustomer(int id) {
		Session currentSession;
		try {
			currentSession = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			currentSession = sessionFactory.openSession();
		}
		
		Customer customer = currentSession.get(Customer.class, id);
		
		return customer;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		Session currentSession;
		try {
			currentSession = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			currentSession = sessionFactory.openSession();
		}
		
		Transaction tx  = currentSession.beginTransaction();
		
		
		currentSession.saveOrUpdate(theCustomer);
		tx.commit();
		
		
	}

	@Override
	public void deleteCustomer(int id) {
		Session currentSession;
		try {
			currentSession = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			currentSession = sessionFactory.openSession();
		}
		Transaction tx  = currentSession.beginTransaction();
		
		Query query = currentSession.createQuery("delete from Customer where id=?1");
		query.setParameter(1, id);
		query.executeUpdate();
		tx.commit();
	}

}
