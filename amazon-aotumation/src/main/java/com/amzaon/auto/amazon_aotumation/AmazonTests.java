
package com.amzaon.auto.amazon_aotumation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonTests {

	private WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
	}
	
	@Test
	public void searchFromMainLandingPage() {
		driver.get("http://www.amazon.com");
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("iPhone");
		driver.findElement(By.cssSelector("input[value='Go']")).click();
		WebElement firstResultItemElement = driver.findElement(By.cssSelector("li#result_0 h2"));
		String innerText = firstResultItemElement.getText();
		System.out.println(innerText);
		Assert.assertTrue(innerText.contains("iPhone"), "Expecting to see 'iPhone' in first result");
	}
	
	@Test
	public void loginTest() {
		
		driver.get("http://www.amazon.com");
		
		WebElement helloSignInLink = driver.findElement(By.id("nav-link-accountList"));
		
		Actions action = new Actions(driver);
		action.moveToElement(helloSignInLink).build().perform();
		
		driver.findElement(By.className("nav-action-inner")).click();
	}
}

