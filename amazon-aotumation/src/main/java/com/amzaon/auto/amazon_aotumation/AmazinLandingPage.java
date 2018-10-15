package com.amzaon.auto.amazon_aotumation;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class AmazinLandingPage {
	
	
	public void serchInTextBox() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","webDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[value='Go']")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}
	

}
