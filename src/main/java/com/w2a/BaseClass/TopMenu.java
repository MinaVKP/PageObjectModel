package com.w2a.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.crm.Acounts.crmAccountsHomePage;

public class TopMenu {
	/*
	 * HomePage HasA TopMenu
	 * Accounts HasA TopMenu
	 * Page HasA TopMEnu
	 * 
	 *  HasA relationship is Encapsulation
	 *   
	 */
	WebDriver driver;
	public TopMenu(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void goToHome() {

		
	}

	public void goToLeads() {

	}

	public void goToContacts() {

	}

	public crmAccountsHomePage goToAccounts() {
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
