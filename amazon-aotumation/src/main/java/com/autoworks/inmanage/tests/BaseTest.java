package com.autoworks.inmanage.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.autoworks.inmanage.infra.web.BrowserType;
import com.autoworks.inmanage.infra.web.WebDriverFactory;

public abstract class BaseTest {

	protected WebDriver driver;

	protected void browseToUrl(String url) {
		
		if (driver == null) {
			driver = WebDriverFactory.getWebDriver(BrowserType.CHROME);
		}
		
		driver.get(url);
	}
	
	public void simpleLoginTest() throws InterruptedException {

		browseToUrl("https://autoworksb2b.inmanage.com?debug=inmanage");


		driver.findElement(By.id("btn-signin")).click();
		driver.findElement(By.cssSelector("#sign_in_form input[type='email'][name='business[email]']")).sendKeys("hila@inmanage.net");;
		driver.findElement(By.cssSelector("input[name='business[password]']")).sendKeys("123456");

		driver.findElement(By.cssSelector(".btn-line button[class='btn btn-form btn_form_login']")).click();

	}
	
	public void login() {
		browseToUrl("https://inmanage:inmanage@autoworksb2b.inmanage.com/%D7%AA%D7%95%D7%A6%D7%90%D7%95%D7%AA_%D7%97%D7%99%D7%A4%D7%95%D7%A9_%D7%A2%D7%A1%D7%A7%D7%99%D7%9D?q=%D7%9B%D7%99%D7%A1%D7%95%D7%99+%D7%94%D7%92%D7%94&search_by=title&search_logs=1");

	}

	
}
