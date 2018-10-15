package com.autoworks.inmanage.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPageByFreeSearch extends AbstractPage{

	
	private static final By resultTitle = By.cssSelector("h2[class='product-name']");
	private static final By addOneToAmount = By.cssSelector("button[class='btn--plus']");
	private static final By productTotalAmount = By.cssSelector("input[type='number']");
	private static final By productTotalPrice = By.cssSelector("span[class='JS_item_total_price']");
	
	
	
	
	
	
	//ctor
	public ResultPageByFreeSearch(WebDriver driver) {
		super("Search result page", driver, resultTitle);
	}

	
	 //לא מצליח למצוא את האלמנט שהמרתי לסטרינג
	public void ifOnRightResultPage(String searchValue) {
		String textToEquals = driver.findElement(resultTitle).getText();
		assertTrue(textToEquals.contains(searchValue));
	}
	
	
	
	public void addProductToAmount() {
		driver.findElement(addOneToAmount).click();
	}
	
	
	//צריך לעשות בקלאס "פרי סרצ" מתודה שמקבלת את האינט ובודקת האם הוא שווה ל2, מכיוון שנעשתה רק לחיצה אחת.
	//אם האינט שווה ל2 הבדיקה הצליחה, אם לא הבדיקה נכשלה
	public int theAmountOfProduct() {
		String productNumber = driver.findElement(productTotalAmount).getText();
		int productAmount = Integer.parseInt(productNumber);
		return productAmount;
	}
	
	
	public void isEqualesAfterAddingToAmount () {
		addProductToAmount();
		if(theAmountOfProduct() == 2) {
			System.out.println("product amount is equals to 2, test 'isEquales()' passed");
		}else {
			System.out.println("product amount is not equals to 2, test 'isEquales()' failed");
		}
	}
	
	
	
}
