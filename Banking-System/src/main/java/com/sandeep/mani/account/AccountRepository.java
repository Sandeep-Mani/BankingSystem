package com.sandeep.mani.account;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, String>{
	public List<Account> findByCustomerCustomerId(String customerId);
}
