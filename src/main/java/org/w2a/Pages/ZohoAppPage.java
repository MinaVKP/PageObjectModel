package org.w2a.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.BaseClass.PageClass;
import com.w2a.crm.Pages.crmLandingPage;

public class ZohoAppPage extends PageClass{
	
	public crmLandingPage goToCRM() {
		

		driver.findElement(By.className("zh-crm")).click();		

		
		return new crmLandingPage();
	}
	public void goToMail() {
			
	}
	public void goToDesk() {
		
	}
	public void goToCreator() {
		
	}
	public void goToAssist() {
		
	}
	public void goToBooks() {
		
	}
	public void goToSocial() {
		
	}
	public void goToAnalytics() {
		
	}
}
