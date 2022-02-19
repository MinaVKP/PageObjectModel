package com.w2a.crm.Pages;

import org.openqa.selenium.By;

import com.w2a.BaseClass.PageClass;
import com.w2a.crm.Acounts.crmAccountsHomePage;

public class crmHomePage extends PageClass{

	public void goToHome() {
		
	}

	public void goToLeads() {

	}

	public void goToContacts() {

	}

	public crmAccountsHomePage goToAccounts() {
		
//		driver.findElement(By.id("crmpluscommonui_crm_Accounts")).click();
		driver.findElement(By.cssSelector("#mainMenuTabDiv > crm-menu > div.crmMenuLeft.fL > crm-tab > div.lyteMenuItems > div:nth-child(4)")).click();
		
		return new crmAccountsHomePage();
	}

	public void goToDeals() {

	}

	public void goToTasks() {

	}

	public void goToMeetings() {

	}

	public void goToCalls() {

	}

	public void goToReports() {

	}

	public void goToAnalytics() {

	}

	public void goToProducts() {

	}

	public void goToQuotes() {

	}

}
