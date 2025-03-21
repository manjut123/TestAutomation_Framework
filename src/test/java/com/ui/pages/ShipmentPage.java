package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public class ShipmentPage extends BrowserUtility{
	private static final By TERMS_CONDITION_CHECKBOX_LOCATOR=By.id("uniform-cgv");
	private static final By PROCEED_TO_CHECKOUT_LOCATOR=By.name("processCarrier");
	
	public ShipmentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public PaymentPage gotoPaymentPage()
	{
		clickOnCheckBox(TERMS_CONDITION_CHECKBOX_LOCATOR);
		clickOn(PROCEED_TO_CHECKOUT_LOCATOR);
		return new PaymentPage(getDriver());
		
	}
	
}
