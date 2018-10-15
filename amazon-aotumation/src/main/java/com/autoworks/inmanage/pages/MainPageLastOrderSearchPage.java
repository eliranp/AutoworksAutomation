package com.autoworks.inmanage.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageLastOrderSearchPage extends AbstractPage{




	//main page - last order search
	private static final By fromDateBtn = By.cssSelector("input[type='text'][class='JS_selected_start_date']");
	private static final By toDateBtn = By.cssSelector("input[type='text'][class='JS_selected_end_date']");
	private static final By dateFromPicker = By.cssSelector("td[class='day']");
	private static final By lastordersStatusBtn = By.cssSelector("select[class='JS_selected_status'][name='status']");
	private static final By searchByProductBox = By.cssSelector("div[class='filter_label order_label_tablet_fix'] input[type='text'][class='input--search typeahead tt-input'][dir='rtl'][style='position: relative; vertical-align: top;']");




	//ctor
	public MainPageLastOrderSearchPage(WebDriver driver) {
		super("main page - last order layer", driver, fromDateBtn, toDateBtn, lastordersStatusBtn, searchByProductBox);
	}


	
	
	
	//click on 'from date' button
	public void pressFromDateBtn() {
		driver.findElement(fromDateBtn).click();
	}


	//click on 'to date' button
	public void pressToDateBtn() {
		driver.findElement(toDateBtn).click();
	}



	//select the date from the calendar picker 
	public void chooseDateFromPicker(String dateValue) {
		WebElement dateWidget = driver.findElement(dateFromPicker);
		List<WebElement> columns=dateWidget.findElements(By.tagName("td"));

		for (WebElement cell: columns){
			if (cell.getText().equals(dateValue)){
				cell.findElement(By.linkText(dateValue)).click();
				break;
			}
		}
	}





	public void clickOnStatusBox() {
		
	}








}
