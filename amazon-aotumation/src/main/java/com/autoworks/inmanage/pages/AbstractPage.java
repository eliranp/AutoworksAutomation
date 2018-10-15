package com.autoworks.inmanage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.autoworks.inmanage.infra.reports.Reports;


public abstract class AbstractPage {

	protected WebDriver driver;
//	protected ActionBot bot;
	
	protected String pageName;
	protected By[] pageUniqueElements;
	
	public AbstractPage(String pageName, WebDriver driver, By... pageUniqueElements) {
		
		this.pageName = pageName;
		this.driver = driver;
		this.pageUniqueElements = pageUniqueElements;
//		this.bot = new ActionBot(driver);
		
		assertInPage();
	}
	
	public void assertInPage() {
		
		WebDriverWait webdriverWait = new WebDriverWait(driver, 10);

		try {
			for (By by : pageUniqueElements) {
				webdriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
			}
			
			Reports.report("*** On page: " + pageName);
		}
		catch (TimeoutException e) {
			Reports.fail("Not on the expected page: " + pageName);
			throw e;
		}
	}
}
