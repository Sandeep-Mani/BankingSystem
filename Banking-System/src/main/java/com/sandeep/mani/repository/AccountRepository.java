package com.sandeep.mani.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sandeep.mani.model.Account;

public interface AccountRepository extends CrudRepository<Account, String>{
	public List<Account> findByCustomerCustomerId(String customerId);
}
