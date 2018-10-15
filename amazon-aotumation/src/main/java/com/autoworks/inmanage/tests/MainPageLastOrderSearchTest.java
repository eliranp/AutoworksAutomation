package com.autoworks.inmanage.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.autoworks.inmanage.pages.MainPageLastOrderSearchPage;

public class MainPageLastOrderSearchTest extends BaseTest{

	
	private static String startSearchDate = "1"; 
	private static String endSearchDate = "15"; 

	
	
	
	
	@BeforeTest
	public void beforeTests() throws InterruptedException {
		simpleLoginTest();
	}
	
	
	//choose the start date for the search filter
	@Test
	public void selectStartDateBtn() {
		MainPageLastOrderSearchPage mainPageLastOrderSearchPage = new MainPageLastOrderSearchPage(driver);
		mainPageLastOrderSearchPage.pressFromDateBtn();
		mainPageLastOrderSearchPage.chooseDateFromPicker(startSearchDate);
	}
	
	
	
	//choose the end date for the search filter
	@Test
	public void selectEndDateBtn() {
		MainPageLastOrderSearchPage mainPageLastOrderSearchPage = new MainPageLastOrderSearchPage(driver);
		mainPageLastOrderSearchPage.pressToDateBtn();
		mainPageLastOrderSearchPage.chooseDateFromPicker(endSearchDate);
	}
	
	
	
	
	
	
	
	
	
	@AfterTest
	public void entTests() throws InterruptedException {
		driver.quit();
	}

	
	
}
