package com.autoworks.inmanage.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.autoworks.inmanage.pages.MainPageProductsLinePage;

public class MainPageProductsLineTest extends BaseTest{

	
	@BeforeTest
	public void beforeTests() throws InterruptedException {
		simpleLoginTest();
	}
	
	
	
	public void searchFromProductslineTest() {
		MainPageProductsLinePage mainPageProductsLinePage = new MainPageProductsLinePage(driver);
		
		mainPageProductsLinePage.hoveredOverCarAccessoriesBtnAndClickOnCarEquipmentBtn();
	}
	
	
	public void addToCartTest() {
		MainPageProductsLinePage mainPageProductsLinePage = new MainPageProductsLinePage(driver);
		
		mainPageProductsLinePage.addToCartButton();
	}
	
	
	
	
	
	@AfterTest
	public void entTests() throws InterruptedException {
		driver.quit();
	}
	
	
	
}
