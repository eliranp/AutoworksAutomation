package com.autoworks.inmanage.tests;

import org.openqa.selenium.SearchContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.autoworks.inmanage.pages.MainPage;
import com.autoworks.inmanage.pages.ResultPageByFreeSearch;

public class SearchByNameTest extends BaseTest {
	

	@BeforeTest
	public void beforeTests() throws InterruptedException {
		simpleLoginTest();
	}
	

	
	@Test
	public void positiveSearchTest() throws InterruptedException {
		
		MainPage mainPage = new MainPage(driver);
		mainPage.sendValueToSerchBoxByName("כיסוי הגה");
		login();
		mainPage.clickOnNameGoBtn();
		
	}
	
	
	@Test //check if i landed on the right page
	public void searchResultTest() {
		ResultPageByFreeSearch searchResultPage = new ResultPageByFreeSearch(driver);
		searchResultPage.ifOnRightResultPage("כיסוי הגה");
	}
	
	
	
	//adding 1 more product to the amount by clicking
	@Test
	public void addOneMoreProductToAmount() {
		ResultPageByFreeSearch searchResultPage = new ResultPageByFreeSearch(driver);
		searchResultPage.addProductToAmount();
	}
	
	
	
	//Check if number of product equals to 2.
	@Test
	public void isEquales() {
		ResultPageByFreeSearch searchResultPage = new ResultPageByFreeSearch(driver);
		searchResultPage.isEqualesAfterAddingToAmount();
	}
	
	

	@AfterTest
	public void entTests() throws InterruptedException {
		driver.quit();
	}
	
}
