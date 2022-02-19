package org.w2a.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
	WebDriver driver;
	public SignUpPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void doSignUp(String username, String password,String dropdown) {
		
		driver.findElement(By.cssSelector("#emailfield")).sendKeys(username);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		WebElement dd=driver.findElement(By.cssSelector(".za-globalstate-signup"));
		Select s = new Select(dd);
		s.selectByVisibleText(dropdown);
		
		driver.findElement(By.cssSelector("#signup-termservice")).click();
		driver.findElement(By.cssSelector("#signupbtn")).click();
	}
}
