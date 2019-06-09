package com.spring.mvc.component;

import org.springframework.stereotype.Component;

@Component
public class Customers {

	private int id;
	private String name;
	private String mobile;
	private String address;
	private String companyLogo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setMobile(String mobile) {
		this.mobile=mobile;
	}

	public String getMobile(){
	return mobile;
	}

	public void setCompanyLogo(String companyLogo) {
		this.companyLogo=companyLogo;
	}
	
	public String getCompanyLogo() {
		return companyLogo;
	}

	public void setAddress(String address) {
		this.address=address;
	}

	public String getAddress() {
		return address;
	}
}
