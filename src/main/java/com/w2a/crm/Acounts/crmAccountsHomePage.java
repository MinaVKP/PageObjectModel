package com.w2a.crm.Acounts;

import org.openqa.selenium.By;

import com.w2a.BaseClass.PageClass;

public class crmAccountsHomePage extends PageClass{

	public crmCreateAccountsPage goToCreateAccount() {
//		driver.findElement(By.className("button.customPlusBtn crm-font-bold newwhitebtn cP")).click();
//		driver.findElement(By.id("//*[@id=\'table_row_1\']/lyte-td[3]/span[1]/link-to/button")).click();
		driver.findElement(By.cssSelector(".customPluswithImpotBtnCon > link-to:nth-child(1)")).click();
		return new crmCreateAccountsPage();
	}
	
	public void goToImport() {
		driver.findElement(By.cssSelector("#importButton")).click();
	}
	
	public crmImportAccountsPage goToImportAccount() {
		driver.findElement(By.cssSelector("lyte-menu-box.moreActionListview:nth-child(130) > lyte-yield:nth-child(1) > lyte-menu-body:nth-child(1) > lyte-menu-item:nth-child(2) > link-to:nth-child(1) > a:nth-child(1)")).click();
		
		return new crmImportAccountsPage();
	}
	public void goToImportNotes() {
		driver.findElement(By.cssSelector(".lyteMenuSelection > link-to:nth-child(1) > a:nth-child(1)")).click();
	}
	
}
