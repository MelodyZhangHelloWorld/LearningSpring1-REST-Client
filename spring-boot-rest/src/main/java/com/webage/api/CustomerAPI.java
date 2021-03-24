package com.webage.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webage.repository.CustomersRepository;

@RestController
@RequestMapping("/customers")
public class CustomerAPI {
	
	@Autowired
	CustomersRepository repo;

}
