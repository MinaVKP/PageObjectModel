package org.w2a.Pages;

import com.w2a.BaseClass.PageClass;
import org.openqa.selenium.By;

public class HomePage extends PageClass{
		
	public void goToSignUp() {
//		driver.findElement(By.cssSelector(".zh-signup")).click();
		driver.findElement(By.cssSelector(".signUp:nth-child(2)")).click();
	}
	public LoginPage goToSignin() {

//		driver.findElement(By.cssSelector(".login")).click();
		click("login_link_CSS");

		return new LoginPage();
		
	}
	public void goToLanguage() {
		
		driver.findElement(By.cssSelector(".zh-flag-selected")).click();
	}
	public void goToAnnouncements() {
		
		driver.findElement(By.cssSelector(".zh-announcetab")).click();
		
	}
	public void goToSupport() {
		driver.findElement(By.cssSelector(".zgh-nav > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)")).click();
	}
	public void goToProducts() {
		
		driver.findElement(By.cssSelector(".pd-dp")).click();
	}
	public void goToEnterprise() {
		
		driver.findElement(By.cssSelector("li.codeUs:nth-child(2) > a:nth-child(1)")).click();
	}
}
