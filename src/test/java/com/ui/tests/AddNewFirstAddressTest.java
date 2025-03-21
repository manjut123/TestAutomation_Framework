package com.ui.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.pages.AddressPage;
import com.ui.pages.MyAccountPage;
import com.ui.pojo.AddressPOJO;
import com.utility.AddressFakeUtility;

public class AddNewFirstAddressTest extends TestBase {
	private MyAccountPage myaccountPage;
	private AddressPage addressPage;
	private AddressPOJO addressPojo;
	@BeforeMethod(description="Valid first time user logs into application")
	public void setup()
	{
		myaccountPage=homePage.goToLoginPage().doLoginWith("mepefo8161@dmener.com","password123");
		addressPojo=AddressFakeUtility.getFakeAddress();
				
	}
   
	@Test(description="First time User enter new address")
	public void addNewAddress()
	{
	String newAddress=myaccountPage.gotoAddAddressPage().saveAddress(addressPojo);
	Assert.assertEquals(newAddress, addressPojo.getAddressAlias().toUpperCase());	
	}
	
}
