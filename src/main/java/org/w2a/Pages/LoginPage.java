package org.w2a.Pages;

import com.w2a.BaseClass.PageClass;

public class LoginPage extends PageClass{
	 
			public ZohoAppPage doLogin(String username,String password) {
			
//			driver.findElement(By.cssSelector("#login_id")).sendKeys(username);
			type("username_CSS",username);
			
//			driver.findElement(By.cssSelector("button.btn:nth-child(6)")).click();
			click("login_submit_CSS");
			
//			driver.findElement(By.cssSelector("#password")).sendKeys(password);
			type("password_CSS",password);
			
//			driver.findElement(By.cssSelector("button.btn:nth-child(6)")).click();
			click("login_submit_CSS");
			return new ZohoAppPage();
	}

}
