package com.autoworks.inmanage.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderLogoPage extends AbstractPage{


	private static final By headerLogo = By.cssSelector("div[class='header-logo']");
	private static final By onMainPage = By.cssSelector("h1[class='cart cart--black']");


	//ctor
	public HeaderLogoPage(WebDriver driver) {
		super("Header logo page", driver, headerLogo);
	}



	public void clickOnLogo() {
		driver.findElement(headerLogo).click();
	}



	public boolean isElementExsitsInPage() {
		try {
			driver.findElement(onMainPage);
			return true;
		}catch (Exception e) {
			return false;
		}
	}


	//כיצד מכשילים בדיקה? כלומר כיצד מחזירים שהבדיקה נכשלה?
	public void isReturnToMainPageAfterClick() {
		if(isElementExsitsInPage() != true) {
			System.out.println("test failed, didnt return to main page");
		}else {
			System.out.println("test passed, return to main page");
		}
	}

}
