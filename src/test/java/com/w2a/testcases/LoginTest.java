package com.w2a.testcases;

import org.testng.annotations.Test;
import org.w2a.Pages.HomePage;
import org.w2a.Pages.LoginPage;
import org.w2a.Pages.ZohoAppPage;

public class LoginTest extends BaseTest{
	
	@Test
	public void loginTest() {
		
		HomePage hp=new HomePage();
		LoginPage login = hp.goToSignin();
		ZohoAppPage zp = login.doLogin("priyanka.vkp@gmail.com", "Meena1783");
	}
	

}
