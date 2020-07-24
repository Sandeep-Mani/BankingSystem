package com.sandeep.mani.customers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService userService;
	
	@GetMapping("/customers")
	public List<Customer> getAllUsers() {		
		return userService.getAllCustomer();
	}
	
	@GetMapping("/customers/{customersId}")
	public Customer getUser(@PathVariable String customersId) {
		return userService.getCustomer(customersId);
	}
	
	@PostMapping("/customers")
	public void addUser(@RequestBody Customer customer) {
		userService.addCustomer(customer);
	}
	
	@PutMapping("/customers/{customersId}")
	public void updateUser(@RequestBody Customer customer, @PathVariable String customersId) {
		userService.updateCustomer(customersId, customer);
	}
	
	@DeleteMapping("/customers/{customersId}")
	public void removeUser(@PathVariable String customersId) {
		userService.removeCustomer(customersId);
	}
}
