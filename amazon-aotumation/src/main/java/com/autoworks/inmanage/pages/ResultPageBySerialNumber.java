package com.autoworks.inmanage.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//change to resultPageBySerialNumber and in class serialNumberTest
public class ResultPageBySerialNumber extends AbstractPage{

	
	private static final By ifOnRightPage = By.cssSelector("#close-search-result--btn");
	private static final By productHeadLine = By.cssSelector("h2[class='product-name']");
	private static final By addOneToAmount = By.cssSelector("button[class='btn--plus']");
	private static final By deductOneToAmount = By.cssSelector("button[class='btn--minus']");
	private static final By productCost = By.cssSelector("span[class='JS_item_total_price']");
	private static final By addToCartButton = By.cssSelector("div[class='btn add-to-cart-btn']");
	private static final By moveToCart = By.cssSelector("a[href='/cart_b2b'][class='btn go-to-cart-btn']");
	private static final By reportMistakeButton = By.cssSelector("a[class='report-a-mistake--btn']");

	
	
	
	
	//ctor
	public ResultPageBySerialNumber(WebDriver driver) {
		super("Serial number search result page", driver, ifOnRightPage);
	}

	
	
		
		//check if landed on right page
		public void ifLandOnRightPage(String searchValue) {
			String productHeadlineName = driver.findElement(productHeadLine).getText();
			assertTrue(productHeadlineName.contains(searchValue));
		}
		
		
		//add product to amount 
		public void addProdductToAmount() {
			driver.findElement(addOneToAmount).click();
		}
		
		//deduct product to amount
		public void adeuctProdductToAmount() {
			driver.findElement(deductOneToAmount).click();
		}
		
		
		//check  product cost
		public int productCosts() {
			String stringOriginalCost = driver.findElement(productCost).getText();
			int originalCost = Integer.parseInt(stringOriginalCost);
			return originalCost;
		}
		
			
		
		//check if product amount and price
		public String checkIfPriceIncreasing() {
			String addToCart = null;
			
			int productCostBeforeAdding = productCosts();	//product cost before adding
			addProdductToAmount();							//add product to amount
			int productCostAfter = productCosts();			//product cost after adding 
			
			if(productCostBeforeAdding*2 ==  productCostAfter) {
				System.out.println("test passed, added to amount and double the price");
				addToCart = "test passed";
			}else {
				System.out.println("Test failed, didn't added to amount and double the price");
				addToCart = "Test failed";
			}
			
			return addToCart;
		}
		
		
		
		
		//click on 'add to cart' button
		public void addProductsToCart() {
			driver.findElement(addToCartButton).click();
		}
		
		
		
		//click on 'navigate to cart' button
		public void navigateToCart() {
			driver.findElement(moveToCart).click();
		}
		
		
		public void pressOnReportMistakeBtn() {
			driver.findElement(reportMistakeButton).click();
		}
		
		
		
}
