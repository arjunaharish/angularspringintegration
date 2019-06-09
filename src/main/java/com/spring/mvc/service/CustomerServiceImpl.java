package com.spring.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.mvc.component.Customers;
import com.spring.mvc.repository.CustomerDaoImpl;

public class CustomerServiceImpl {

	@Autowired
	CustomerDaoImpl customerDao;
	
	public List<Customers>getCustomerLists(){
		return customerDao.getAllCustomerFromDb();
	}
}
