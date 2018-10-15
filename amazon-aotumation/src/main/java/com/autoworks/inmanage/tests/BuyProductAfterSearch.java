package com.autoworks.inmanage.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BuyProductAfterSearch extends BaseTest{

	
	
	@BeforeTest
	public void beforeTests() throws InterruptedException {
		simpleLoginTest();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterTest
	public void entTests() throws InterruptedException {
		driver.quit();
	}
	
	
}
