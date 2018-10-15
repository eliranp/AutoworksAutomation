package com.autoworks.inmanage.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.autoworks.inmanage.pages.HeaderLogoPage;

public class HeaderLogoTests extends BaseTest{


	@BeforeTest
	public void beforeTests() throws InterruptedException {
		simpleLoginTest();
		login();
		browseToUrl("https://autoworksb2b.inmanage.com/%D7%AA%D7%95%D7%A6%D7%90%D7%95%D7%AA_%D7%97%D7%99%D7%A4%D7%95%D7%A9_%D7%A2%D7%A1%D7%A7%D7%99%D7%9D?q=%D7%9B%D7%99%D7%A1%D7%95%D7%99%20%D7%94%D7%92%D7%94&search_by=title&search_logs=1");
	}

	
	@Test
	public void clickOnHeaderLogo() {
		HeaderLogoPage headerLogoPage = new HeaderLogoPage(driver);  
		headerLogoPage.clickOnLogo();
	}


	@Test
	public void isreturnToMainPage() {
		HeaderLogoPage headerLogoPage = new HeaderLogoPage(driver);  
		headerLogoPage.isElementExsitsInPage();
		headerLogoPage.isReturnToMainPageAfterClick();
	
	}




	@AfterTest
	public void entTests() throws InterruptedException {
		driver.quit();
	}

}
