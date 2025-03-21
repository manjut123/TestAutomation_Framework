package com.ui.tests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.pages.MyAccountPage;

public class SearchProductTest extends TestBase {
	private MyAccountPage myaccountPage;
	
	private static final String SEARCH_TERM="Printed Summer Dress";
	
	@BeforeMethod
	public void setup()
	{
		myaccountPage=homePage.goToLoginPage().doLoginWith("mepefo8161@dmener.com","password123");
	}

//	@Test
//	public void verifyProductSearch()
//	{
//		String searchTitle=myaccountPage.searchProduct(SEARCH_TERM).getProductListingTitle();
//       System.out.println(searchTitle);	
//	}
//	
	@Test
	public void getProductname()
	{
		boolean actualResult=myaccountPage.searchProduct(SEARCH_TERM).isSearchPresentinProductList(SEARCH_TERM);
	    Assert.assertEquals(actualResult,true);
	}
}
