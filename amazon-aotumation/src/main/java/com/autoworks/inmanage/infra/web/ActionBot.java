package com.autoworks.inmanage.infra.web;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.autoworks.inmanage.infra.reports.Reports;

public class ActionBot {

	private WebDriver driver;
	
	public ActionBot(WebDriver driver) {
		this.driver = driver;
	}
	
	public void click(By by) {
		
		Reports.report("Click on element: " + by);
		WebElement element = driver.findElement(by);
		executeJavaScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}
	
	public void writeToElement(By by, String text) {
		
		Reports.report("Write '" + text + "' to element: " + by);
		WebElement element = driver.findElement(by);
		element.sendKeys(text);
	}
	
	public void executeJavaScript(String javaScript, WebElement element) {
		
		((JavascriptExecutor) driver).executeScript(javaScript, element);		
	}
}
