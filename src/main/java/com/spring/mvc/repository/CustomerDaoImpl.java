package com.spring.mvc.repository;

import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;
import com.spring.mvc.component.Customers;

public class CustomerDaoImpl {

	public List<Customers>getAllCustomerFromDb(){
		Faker faker = new Faker();
		
		List<Customers> customerList=new ArrayList<Customers>();
		
		for(int i=1;i<100;i++) {
			Customers customerLists=new Customers();
			customerLists.setId(i);
			customerLists.setName(faker.name().fullName());
			customerLists.setMobile(faker.phoneNumber().cellPhone());
			customerLists.setAddress(faker.address().streetAddress());
			customerLists.setCompanyLogo(faker.company().logo());
			customerList.add(customerLists);
		}
		return customerList;
	}
}
