package com.sandeep.mani.customers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> getAllCustomer() {
		List<Customer> customers = new ArrayList<>();
		customerRepository.findAll().forEach(customers::add);
		return customers;
	}

	public Customer getCustomer(String customerId) {
		return customerRepository.findOne(customerId);
	}

	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	public void updateCustomer(String customerId, Customer customer) {
		boolean exists = customerRepository.exists(customerId);
		if(exists) {
			customerRepository.save(customer);
		}
	}

	public void removeCustomer(String customerId) {
		customerRepository.delete(customerId);
	}
}
