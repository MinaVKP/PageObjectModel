package com.w2a.crm.Acounts;

import org.openqa.selenium.By;

import com.w2a.BaseClass.PageClass;

public class crmCreateAccountsPage extends PageClass{

	public void createAccount(String accOwner) {
		driver.findElement(By.cssSelector("#Crm_Accounts_ACCOUNTNAME_LInput")).sendKeys(accOwner);
		
	}
}
