package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.constants.Browser;
import com.utility.BrowserUtility;

public class ConfirmAddressPage extends BrowserUtility{
   private static final By PROCEED_TO_CHECKOUT_LOCATOR=By.name("processAddress");
   
	public ConfirmAddressPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public ShipmentPage gotoShipmentPage()
	{
		clickOn(PROCEED_TO_CHECKOUT_LOCATOR);
		return new ShipmentPage(getDriver());
	}
	
	

}
