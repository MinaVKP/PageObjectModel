package com.w2a.rough;

import org.w2a.Pages.HomePage;
import org.w2a.Pages.LoginPage;
import org.w2a.Pages.ZohoAppPage;

import com.w2a.BaseClass.PageClass;
import com.w2a.crm.Acounts.crmAccountsHomePage;
import com.w2a.crm.Acounts.crmCreateAccountsPage;
import com.w2a.crm.Pages.crmHomePage;
import com.w2a.crm.Pages.crmLandingPage;

public class LoginTest {

	public static void main(String[] args){
						
		HomePage hp=new HomePage();
//		hp.goToSignUp();
		LoginPage login = hp.goToSignin();
//		hp.goToAnnouncements();
//		hp.goToProducts();
//		hp.goToLanguage();
//		hp.goToSupport();
//		hp.goToEnterprise();
		
//		SignUpPage signup =new SignUpPage();
//		signup.doSignUp("priyanka_vkp@yahoo.com", "Meena1783", "Kansas");
		
		ZohoAppPage zp = login.doLogin("priyanka.vkp@gmail.com", "Meena1783");
		
//		ZohoAppPage zp = login.doLogin("priyanka_vkp@yahoo.com", "Ampa7982");
		 zp.goToCRM();
////	zp.goToAssist();
		crmLandingPage crmland = new crmLandingPage();
		crmland.AccessZohoCRM();
//		
		crmAccountsHomePage account = PageClass.menu.goToAccounts();
		 
					
		crmCreateAccountsPage createaccount = account.goToCreateAccount();
		
		createaccount.createAccount("Priyanka");
	}
}
