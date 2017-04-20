package com.pluralsight.service;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

@Scope("prototype")
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository ;
	
	
	
	@Override
	public List<Customer> findAll() {

		return customerRepository.findAll();

	}


	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}
