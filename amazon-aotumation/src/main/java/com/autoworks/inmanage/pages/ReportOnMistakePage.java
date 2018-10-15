package com.autoworks.inmanage.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReportOnMistakePage extends AbstractPage{

	private static final By textArea = By.cssSelector("textarea[name='user_input'][class='validate-mandatory'][placeholder='דיווח על טעות במוצר']");
	private static final By sendButton = By.cssSelector("button[type='submit']");
	private static final By layerHeadLine = By.cssSelector("div[class='JS_product_name_report_error product-name']");
	private static final By layerSerialNUmber = By.cssSelector("strong[class='JS_product_catalog_number_report_error'][dir='ltr']");
	private static final By layerImage = By.cssSelector("img[class='JS_product_img_report_error'][alt='Manufacturer']");
	
	
	
	//ctor
	public ReportOnMistakePage(WebDriver driver) {
		super("report on mistake layer", driver,layerHeadLine, layerSerialNUmber, layerImage);
	}

	
	//sending text to text area
	public void sendValueToTextArea(String textValue) {
		driver.findElement(textArea).sendKeys(textValue);
	}
	
	
	//press on 'send' button
	public void pressOnSendBtn() {
		driver.findElement(sendButton).click();
	}
	
	
	
}
