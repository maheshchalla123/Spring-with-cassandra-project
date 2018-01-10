package com.egiants.service;

import java.util.List;

public interface CustomerService {
		 
	public CustomerService create(CustomerService cs);
	 
	public CustomerService delete(String id);
	 
	public List<CustomerService> findAll();
	 
	public CustomerService findById(String id);
	 
	public CustomerService update(CustomerService cs);
	}

