package com.greatLearning.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatLearning.crm.entity.Customer;
import com.greatLearning.crm.service.CustomerService;



@Controller
@RequestMapping("/customer")
public class CustomerController {

	//Autowire Student Service
	@Autowired
	private CustomerService customerService;
	
	
	// add mapping for "/list"

	@RequestMapping("/list")
	public String listBooks(Model theModel) {

		
		
		// get Customers from db
		List<Customer> customers = customerService.findAll();
		
		theModel.addAttribute("customers", customers);
		
		System.out.print("List of customers " + customers);
		

		// add to the spring model


		return "list-customers";
	}
	
	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		// get the Customer from the service
		Customer theCustomer = new Customer();


		// set Customer as a model attribute to pre-populate the form
		theModel.addAttribute("customer", theCustomer);

		// send over to our form
		return "Customer-form";			
	}
	
	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId,
			Model theModel) {

		// get the Customer from the service
		Customer theCustomer = customerService.findById(theId);


		// set Customer as a model attribute to pre-populate the form
		theModel.addAttribute("customer", theCustomer);

		return "Customer-form";			
	}
	
	@PostMapping("/save")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		customerService.save(customer);	
		
		return "redirect:/customer/list";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int theId) {
		customerService.deleteById(theId);
		return "redirect:/customer/list";
	}
	
}


















