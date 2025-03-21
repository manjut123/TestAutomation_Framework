package com.ui.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.constants.Browser;
import com.utility.BrowserUtility;

public class SearchResultPage extends BrowserUtility{
 
	private static final By PRODUCT_LISTING_TEXT_LOCATOR=By.xpath("//span[@class='lighter']");
	private static final By ALL_PRODUCT_LIST_NAME=By.xpath("//h5[@itemprop='name']/a");
	
	public SearchResultPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public String getProductListingTitle()
	{
		return getVisibleText(PRODUCT_LISTING_TEXT_LOCATOR);
	}
	
	public boolean isSearchPresentinProductList(String searchTerms)
	{
		List<String>keywordList=Arrays.asList(searchTerms.toLowerCase().split(" "));
		List<String>productNameList=getAllVisibleText(ALL_PRODUCT_LIST_NAME);
		boolean result=productNameList.stream().anyMatch
		(name->(keywordList.stream().anyMatch(name.toLowerCase()::contains)));
		return result;
	}
	
	public ProductDetails clickonProductAt(int index)
	{
		clickOn(getAllElements( ALL_PRODUCT_LIST_NAME).get(index));
		ProductDetails productDetail = new ProductDetails(getDriver());
		return productDetail;
	}

}
