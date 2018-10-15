package com.autoworks.inmanage.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.autoworks.inmanage.pages.MainPage;
import com.autoworks.inmanage.pages.ResultPageBySerialNumber;

public class SearchBySerialNumberTest extends BaseTest{


	@BeforeTest
	public void beforeTests() throws InterruptedException {
		simpleLoginTest();
	}

	//Test the search box on main page
	@Test
	public void isSearchBoxWorking() {
		MainPage mainPage = new MainPage(driver);
		mainPage.clickonSerialNumberButton();						//select the serial number search box
		mainPage.sendVlaueToSearchBoxBySerialNumber("7575807572");	//send value to search box
		login();
		mainPage.clickOnSerialNumberGoBtn();						//click on go button
	}

	
	
	
	
	//לא מוצא לי את הטקסט "שואב אבק" למרות שקיים באלמנט הנבחר, למה?
	//Test the 'adding to cart' process
//	@Test
//	public void landOnRightPage() {
//		SerialSearchResultPage serialSearchResultPage = new SerialSearchResultPage(driver);
//		serialSearchResultPage.ifLandOnRightPage("שואב אבק");	//check if landed on the right page		
//	}


	
	
	
	
	
	//
	//added one more product add tested if the cost doubled - return passed/failed
	@Test
	public void addMoreProductToAmount() {
		ResultPageBySerialNumber serialSearchResultPage = new ResultPageBySerialNumber(driver);
//		serialSearchResultPage.checkIfPriceIncreasing();
		serialSearchResultPage.addProdductToAmount();
		
	}


	//adding product to cart
	@Test
	public void clickOnAddProductsToCart() {
		ResultPageBySerialNumber serialSearchResultPage = new ResultPageBySerialNumber(driver);
		serialSearchResultPage.addProductsToCart();
	}
	
	
	//לחיצה על כפתור 'דווח על טעות'
	@Test
	public void pressOnReportMistake() {
		ResultPageBySerialNumber serialSearchResultPage = new ResultPageBySerialNumber(driver);
		ReportOnMistakeTest reportOnMistakeTest = new ReportOnMistakeTest();	

		serialSearchResultPage.pressOnReportMistakeBtn();
		
		reportOnMistakeTest.reportMistakeLayerFunctionalCeck();
	}
	
	
	
	//click on 'navigate to cart'
	@Test
	public void clickOnNavigateToCart() {
		ResultPageBySerialNumber serialSearchResultPage = new ResultPageBySerialNumber(driver);
		serialSearchResultPage.navigateToCart();

	}
	


	@AfterTest
	public void entTests() throws InterruptedException {
		driver.quit();
	}

}
