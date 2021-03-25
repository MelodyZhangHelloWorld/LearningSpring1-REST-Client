package com.webage.dao;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.webage.domain.Customer;

@Repository
public class APIClientCustomersDAO implements CustomersDAO {

	@Override
	public Collection<Customer> getAllCustomers() {
		// Construct a GET request to the CustomersAPI base url
		// Insert code here..
		return new ArrayList<Customer>();
	}

}
