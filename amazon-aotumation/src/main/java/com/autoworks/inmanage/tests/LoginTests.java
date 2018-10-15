package com.autoworks.inmanage.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

	//positive test
	@Test
	public void positiveLoginTest() throws InterruptedException {

		browseToUrl("https://autoworksb2b.inmanage.com?debug=inmanage");


		driver.findElement(By.id("btn-signin")).click();
		driver.findElement(By.cssSelector("#sign_in_form input[type='email'][name='business[email]']")).sendKeys("hila@inmanage.net");;
		driver.findElement(By.cssSelector("input[name='business[password]']")).sendKeys("123456");;

		driver.findElement(By.cssSelector(".btn-line button[class='btn btn-form btn_form_login']")).click();

		driver.quit();
	}

	//negative test
	@Test
	public void negativeLoginTest() throws InterruptedException {

		browseToUrl("https://autoworksb2b.inmanage.com?debug=inmanage");


		driver.findElement(By.id("btn-signin")).click();
		driver.findElement(By.cssSelector("#sign_in_form input[type='email'][name='business[email]']")).sendKeys("123456");;
		driver.findElement(By.cssSelector("input[name='business[password]']")).sendKeys("hila@inmanage.net");;

		driver.findElement(By.cssSelector(".btn-line button[class='btn btn-form btn_form_login']")).click();

		driver.quit();
	}




	public void simpleLoginTest() throws InterruptedException {

		browseToUrl("https://autoworksb2b.inmanage.com?debug=inmanage");


		driver.findElement(By.id("btn-signin")).click();
		driver.findElement(By.cssSelector("#sign_in_form input[type='email'][name='business[email]']")).sendKeys("hila@inmanage.net");;
		driver.findElement(By.cssSelector("input[name='business[password]']")).sendKeys("123456");;

		driver.findElement(By.cssSelector(".btn-line button[class='btn btn-form btn_form_login']")).click();

	}

}
