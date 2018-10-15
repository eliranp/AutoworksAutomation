package com.autoworks.inmanage.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends AbstractPage {
	
	private static final By searchBox = By.cssSelector("input[name='q'][dir='rtl']");
	private static final By goButton = By.xpath("(//img[@class='JS_search_glass search_image'])[2]");
	private static final By serialNumberButton = By.cssSelector("#btn--search-by-catalog-number");
	private static final By serialNumberSearchBox = By.cssSelector("input[name='q'][dir='ltr']");
	private static final By serialNumberGoButtn = By.cssSelector("img[class='JS_search_glass search_image']");

	
	
	
	
	public MainPage(WebDriver driver) {
		super("Main Page", driver, searchBox, goButton);
	}
	
	
	
	
	//send value to name search box
	public void sendValueToSerchBoxByName(String searchValue) {
		driver.findElement(searchBox).sendKeys(searchValue);
	}
	
	//click on go button in name box search
	public void clickOnNameGoBtn() {
		driver.findElement(goButton).click();
	}
	
	
	
	
	
	//click on button "search by serial number" 
	public void clickonSerialNumberButton() {
		driver.findElement(serialNumberButton).click();
	}
	
	
	//send serial number to the search box
	public void sendVlaueToSearchBoxBySerialNumber(String SearchValue) {
		driver.findElement(serialNumberSearchBox).sendKeys(SearchValue);
	}
	
	
	//click on go button to search the product
	public void clickOnSerialNumberGoBtn() {
		driver.findElement(serialNumberGoButtn).click();
	}
	
	
	
}
