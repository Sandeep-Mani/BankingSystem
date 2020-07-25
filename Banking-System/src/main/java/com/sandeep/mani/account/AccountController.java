package com.sandeep.mani.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sandeep.mani.customers.CustomerService;

@RestController
public class AccountController {
	@Autowired
	private AccountService accountService;
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customers/{customerId}/accounts")
	public List<Account> getAllAccount(@PathVariable String customerId){
		return accountService.getAllAccount(customerId);
	}
	
	@GetMapping("/customers/{customerId}/accounts/{accountNo}")
	public Account getAccount(@PathVariable String customerId, @PathVariable String accountNo) {
		return accountService.getAccount(accountNo);
	}
	
	@PostMapping("/customers/{customerId}/accounts")
	public void addAccount(@RequestBody Account account, @PathVariable String customerId) {
		account.setCustomer(customerService.getCustomer(customerId) );
		accountService.addAccount(account);
	}
	
	@PutMapping("/customers/{customerId}/accounts/{accountNo}")
	public void updateAccount(@PathVariable String accountNo, @RequestBody Account account, @PathVariable String customerId) {
		account.setCustomer(customerService.getCustomer(customerId) );
		accountService.updateAccount(accountNo, account);
	}
	
	@DeleteMapping("/customers/{customersId}/accounts/{accountNo}")
	public void removeUser(@PathVariable String accountNo) {
		accountService.deleteAccount(accountNo);
	}
}
