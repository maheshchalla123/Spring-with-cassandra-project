package com.egiants.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.egiants.service.CustomerService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	 @Autowired
	    CustomerController(CustomerService customerservice) {
	        this.customerService = customerservice;
	    }

	public CustomerController() {
		System.out.println("CustomerController()");
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	CustomerService create(@RequestBody @Valid CustomerService cs) {
		return customerService.create(cs);
	}

	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	CustomerService delete(@PathVariable("id") String id) {
		return customerService.delete(id);
	}

	@RequestMapping(method = RequestMethod.GET)
	List<CustomerService> findAll() {
		return customerService.findAll();
	}

	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	CustomerService findById(@PathVariable("id") String id) {
		return customerService.findById(id);
	}

	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
	CustomerService update(@RequestBody @Valid CustomerService cs) {
		return customerService.update(cs);
	}

}