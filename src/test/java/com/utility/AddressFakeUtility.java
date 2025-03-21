package com.utility;

import java.util.Locale;

import com.github.javafaker.Faker;
import com.ui.pojo.AddressPOJO;

public class AddressFakeUtility {
	
	public static AddressPOJO getFakeAddress()
	{
		
		//private String state;
		
		Faker faker=new Faker(Locale.US);
		String company=faker.company().name();
		String phoneNumber=faker.phoneNumber().cellPhone();
		String address1=faker.address().buildingNumber();
		String address2=faker.address().streetAddress();
		String city=faker.address().city();
		String postcode=faker.numerify("#####");
		String other=faker.address().countryCode();
		String state=faker.address().state();		
			
		AddressPOJO addressPojo=new AddressPOJO(company,address1,address2,city,
				postcode,phoneNumber,phoneNumber,other,"Office Address",state);
		
		return addressPojo;
		
	}

}
