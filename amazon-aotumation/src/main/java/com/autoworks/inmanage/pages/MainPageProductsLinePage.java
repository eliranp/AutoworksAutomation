package com.autoworks.inmanage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MainPageProductsLinePage extends AbstractPage{

	//main page - product line 
	private static final By carAccessoriesBtn = By.cssSelector("ul[class='menu'] a[href='#']");
	private static final By carEquipmentBtn = By.cssSelector("a[href='/sub_category_b2b/155/אביזרים-וציוד-לרכב/']");
	private static final By ifLandOnresultPage = By.cssSelector("div[class='search-result'][data-page_type='category']");
	private static final By addToCartBtn = By.cssSelector("div[class='btn add-to-cart-btn']");

	
	
	
	
	public MainPageProductsLinePage(WebDriver driver) {
		super("Main page - products line", driver,carAccessoriesBtn);
	}

	
	//hoverd over carAccessoriesBtn and click on carEquipmentBtn
	public void hoveredOverCarAccessoriesBtnAndClickOnCarEquipmentBtn()	{
		WebElement hoverdCarAccessoriesBtn = driver.findElement(carAccessoriesBtn);
		
		Actions action = new Actions(driver);
		action.moveToElement(hoverdCarAccessoriesBtn).build().perform();
		
		driver.findElement(carEquipmentBtn).click();
	}
	
	
	public void checkIfLandOnRightPageAfterClick() {
		driver.findElement(ifLandOnresultPage);
	}
	
	public void addToCartButton() {
		driver.findElement(addToCartBtn).click();
	}
	
	
	
	
	
	
	
}
