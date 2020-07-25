package com.sandeep.mani.account;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	@Autowired
	private AccountRepository accountRepository;
	
	public List<Account> getAllAccount(String customerId) {
		List<Account> accounts = new ArrayList<>();
		accountRepository.findByCustomerCustomerId(customerId).forEach(accounts::add);
		return accounts;
	}
	
	public Account getAccount(String accNo) {
		return accountRepository.findOne(accNo);
	}
	
	public void addAccount(Account account) {
		accountRepository.save(account);
	}
	
	public void updateAccount(String accNo, Account account) {
		boolean exists = accountRepository.exists(accNo);
		if(exists) {
			accountRepository.save(account);
		}
	}
	
	public void deleteAccount(String accNo) {
		accountRepository.delete(accNo);
	}
	
}
