package com.ui.pojo;

import org.openqa.selenium.By;

public class AddressPOJO {

	
	private String company;
	private String address1;
	private String address2;
	private String city;
	private String postcode;
	private String phone;
	private String mobile;
	private String other;
	private String addressAlias;
	private String state;
	
	
	@Override
	public String toString() {
		return "AddressPOJO [company=" + company + ", address1=" + address1 + ", address2=" + address2 + ", city="
				+ city + ", postcode=" + postcode + ", phone=" + phone + ", mobile=" + mobile + ", other=" + other
				+ ", addressAlias=" + addressAlias + ", state=" + state + "]";
	}
	
	
	public AddressPOJO(String company, String address1, String address2, String city, String postcode, String phone,
			String mobile, String other, String addressAlias, String state) {
		super();
		this.company = company;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.postcode = postcode;
		this.phone = phone;
		this.mobile = mobile;
		this.other = other;
		this.addressAlias = addressAlias;
		this.state = state;
	}
	public String getCompany() {
		return company;
	}
	public String getAddress1() {
		return address1;
	}
	public String getAddress2() {
		return address2;
	}
	public String getCity() {
		return city;
	}
	public String getPostcode() {
		return postcode;
	}
	public String getPhone() {
		return phone;
	}
	public String getMobile() {
		return mobile;
	}
	public String getOther() {
		return other;
	}
	public String getAddressAlias() {
		return addressAlias;
	}
	public String getState() {
		return state;
	}
	
	
}
