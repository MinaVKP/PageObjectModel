package com.w2a.crm.Pages;

import org.openqa.selenium.By;

import com.w2a.BaseClass.PageClass;

public class crmLandingPage extends PageClass{

	public crmHomePage AccessZohoCRM() {
		
		driver.findElement(By.cssSelector("a.act-btn:nth-child(3)")).click();
		return new crmHomePage();
	}
	
}
