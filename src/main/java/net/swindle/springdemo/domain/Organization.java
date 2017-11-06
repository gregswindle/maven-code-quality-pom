package net.swindle.springdemo.domain;

import net.swindle.springdemo.service.BusinessService;

public class Organization {

	private String companyName;
	private String slogan;
	private BusinessService businessService;

	public Organization(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setPostalCode(String postalCode) {
	}

	public void setEmployeeCount(int employeeCount) {
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
	}

	public String corporateSlogan() {
		return slogan;
	}

	public String corporateService() {
		return businessService.offerService(companyName);
	}

}
