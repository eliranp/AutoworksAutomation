package com.autoworks.inmanage.tests;

import com.autoworks.inmanage.pages.ReportOnMistakePage;

public class ReportOnMistakeTest extends BaseTest{
	
	
	
	public void reportMistakeLayerFunctionalCeck() {
		ReportOnMistakePage reportOnMistakePage = new ReportOnMistakePage(driver);
	
		reportOnMistakePage.sendValueToTextArea("test test");
		reportOnMistakePage.pressOnSendBtn();
	
	}

	
	
	
}
