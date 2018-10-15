package com.autoworks.inmanage.infra.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {

	public static WebDriver getWebDriver(BrowserType browserType) {
		
		WebDriver driver = null;
		
		switch (browserType) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			break;
		case FIREFOX:
			System.setProperty("webdriver.gecko.driver", "webdrivers/geckodriver");
			driver = new FirefoxDriver();
			break;
		case INTERNET_EXPLORER:
			System.setProperty("webdriver.ie.driver", "webdrivers/IEDriverServer");
			driver = new InternetExplorerDriver();
			break;
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
}
