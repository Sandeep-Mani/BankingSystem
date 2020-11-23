package com.sandeep.mani.repository;

import org.springframework.data.repository.CrudRepository;

import com.sandeep.mani.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String>{

}
