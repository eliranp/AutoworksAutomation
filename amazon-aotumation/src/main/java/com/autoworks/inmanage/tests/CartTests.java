package com.autoworks.inmanage.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.autoworks.inmanage.pages.CartPage;

public class CartTests extends BaseTest{


//לא ניתן לבדוק עדיין את הבדיקה הזאת בגלל שלא ניתן לנתב לעמוד,
//	צריך לבצע הזמנה של הוספה של מוצר לעגלה ורק לאחר מכן ללחוץ על העברה לעגלת הקניות.
//	אחרי זה יהיה ניתן לבדוק ולהשתמש בטסט הזה


	@BeforeTest
	public void beforeTests() throws InterruptedException {
		simpleLoginTest();
	}

	

	//tests if the product price doubled after adding one more product
	@Test
	public void didPriceIncreased() {
		CartPage cartPage = new CartPage(driver);
		cartPage.didPriceRise();
	}


	//select a date from calendar to make the order
	@Test
	public void chooseDateForDeliveryfromCalendar() {
		CartPage cartPage = new CartPage(driver);
		cartPage.DateBox();
	}

	//press on 'make order' button
	@Test
	public void clickmakeOrderBtn() {
		CartPage cartPage = new CartPage(driver);
		cartPage.makeOrder();
	}



	@AfterTest
	public void entTests() throws InterruptedException {
		driver.quit();
	}


}
