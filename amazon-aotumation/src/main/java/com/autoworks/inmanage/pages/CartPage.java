package com.autoworks.inmanage.pages;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.AcceptedW3CCapabilityKeys;

public class CartPage extends AbstractPage{

	//main page - get to cart
	private static final By mouseOverCart = By.cssSelector("div[class='cart-popup'][style='display: none;']");
	private static final By moveToCartPage = By.cssSelector("a[href='/cart_b2b'][class='to-cart-btn']");
	private static final By lastOrder = By.cssSelector("div[class='header order_titles'][style='line-height: normal']");

	public void hoverOverCard() {
		Actions action = new Actions(driver);
		WebElement moc = driver.findElement(mouseOverCart);
		action.moveToElement(moc).build().perform();
		driver.findElement(moveToCartPage).click();
	}
	
	
	
	
	
	//cart page - 
	private static final By addProductToAmount = By.cssSelector("td[class='td--quantity'] button[class='btn--plus']");
	private static final By productCost = By.cssSelector("div[class='total--net JS_cart_item_price text_unselectable'] span[class='JS_price_text']");
	private static final By deliveryDateBox = By.cssSelector("input[type='text'][class='JS_delivery_date delivery-date--input']");
	private static final By deliveryDatePicker = By.cssSelector("td[class='active day']");
	private static final By makeOrderBtn = By.cssSelector("div[class='JS_payment_btn btn btn-form']");

	
	
	//ctor
	public CartPage(WebDriver driver) {
		super("Cart page", driver,addProductToAmount,productCost, deliveryDateBox);
	}

	
	//pessing on '+' - addind product to the amount 
	public void addOneProductToAmount() {
		driver.findElement(addProductToAmount).click();
	}
	
	
	//check the price before adding product to the amount
	public int priceBeforeRaising() {
		String originalCost = driver.findElement(productCost).getText();
		int originalCostInt = Integer.parseInt(originalCost);
		return originalCostInt;
	}
	
	
	//check the price after adding product to the amount
	public int priceAfterRaising() {
		String costAfterRaising = driver.findElement(productCost).getText();
		int costAfterRaisingInt = Integer.parseInt(costAfterRaising);
		return costAfterRaisingInt;
	}
	
	
	//test if the price of the product raised after adding one more to the amount
	public void didPriceRise() {
		int priceBefore = priceBeforeRaising();
		addOneProductToAmount();
		int priceAfter = priceAfterRaising();
		
		if(priceBefore*2 != priceAfter) {
			System.out.println("Test failed - price did not doubled");
		}else {
			System.out.println("Test passed - price doubled");
		}
	}
	
	
	
	
	
	//click on the date box
	public void DateBox() {
		driver.findElement(deliveryDateBox).click();
	}
	
	
	
	//select a date from calendar
	public void chooseDateFromCalendar(String dateValue) {
		DateBox();
		
		WebElement dateWidget = driver.findElement(deliveryDatePicker);
		List<WebElement> columns=dateWidget.findElements(By.tagName("td"));
		
		for (WebElement cell: columns){
			   if (cell.getText().equals(dateValue)){
			      cell.findElement(By.linkText(dateValue)).click();
			      break;
			 }
		
		}
	}
	
	
	//press on 'make order' button
	public void makeOrder() {
		driver.findElement(makeOrderBtn).click();
	}

	
	
	
	
	
}
