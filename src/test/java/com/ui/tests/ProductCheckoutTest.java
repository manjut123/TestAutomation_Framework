package com.ui.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.constants.Size.*;
import com.ui.pages.SearchResultPage;

public class ProductCheckoutTest extends TestBase{
    private static final String SEARCH_TERM="Printed Summer Dress";
    private SearchResultPage searchResult;
    @BeforeMethod(description="User able to logged into application and search for product")
	public void setup()
	{
		
    	searchResult=homePage.goToLoginPage().doLoginWith("mepefo8161@dmener.com","password123")
		.searchProduct(SEARCH_TERM);
		
	}
	
	@Test(description="Verify that logged in user is able to buy product",groups= {"smoke","sanity"})
	public void checkoutTest()
	{
		String message=searchResult.clickonProductAt(1).changeSize(L).addProductToCart().
		proceedToCheckout().gotoConfirmAddressPage().gotoShipmentPage().
		gotoPaymentPage().makePaymentByWire();
		Assert.assertTrue(message.contains("complete"));
	}
}
