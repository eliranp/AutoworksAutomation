package com.amzaon.auto.amazon_aotumation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class Testing1 {

	public void amazonTestMathod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","webDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		
		WebElement helloSignInLink = driver.findElement(By.id("nav-link-accountList"));

		Actions action = new Actions(driver);
		action.moveToElement(helloSignInLink).build().perform();

		
		driver.findElement(By.className("nav-action-inner")).click();
		
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("eli@gmail.com");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		driver.findElement(By.id("auth-fpp-link-bottom")).click();
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}


}
