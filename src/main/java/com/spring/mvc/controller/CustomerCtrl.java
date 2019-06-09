package com.spring.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mvc.component.Customers;
import com.spring.mvc.service.CustomerServiceImpl;
@RestController
public class CustomerCtrl {

@Autowired
CustomerServiceImpl customerServiceImpl;
//Method to test the angular fetch call.
	@CrossOrigin(origins="http://localhost:4200")							// @CrossOrigin is used to handle the request from a difference origin.
	@RequestMapping(value= "/getcustomers", method= RequestMethod.GET)
public List<Customers>getCustomers(){
	return customerServiceImpl.getCustomerLists();
	
}
}
