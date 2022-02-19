package com.w2a.rough;

import org.w2a.Pages.HomePage;
import org.w2a.Pages.LoginPage;
import org.w2a.Pages.ZohoAppPage;

import com.w2a.BaseClass.PageClass;
import com.w2a.crm.Acounts.crmAccountsHomePage;
import com.w2a.crm.Acounts.crmCreateAccountsPage;
import com.w2a.crm.Pages.crmHomePage;
import com.w2a.crm.Pages.crmLandingPage;

public class LoginTest1 {

	public static void main(String[] args) {
		
				HomePage hp=new HomePage();
//				hp.goToSignUp();
				hp.goToSignin();
//				hp.goToAnnouncements();
//				hp.goToProducts();
//				hp.goToLanguage();
//				hp.goToSupport();
//				hp.goToEnterprise();
				
//				SignUpPage signup =new SignUpPage();
//				signup.doSignUp("priyanka_vkp@yahoo.com", "Meena1783", "Kansas");
				LoginPage login = new LoginPage();
				login.doLogin("priyanka.vkp@gmail.com", "Meena1783");
//				login.doLogin("priyanka_vkp@yahoo.com", "Ampa7982");
				
				ZohoAppPage zp = new ZohoAppPage();
				zp.goToCRM();
////			zp.goToAssist();
//				 
				crmLandingPage crmland = new crmLandingPage();
				crmland.AccessZohoCRM();
								
//				PageClass.menu.goToAccounts();	
				
				crmHomePage crmhome = new crmHomePage();
				crmhome.goToAccounts();
				
				crmAccountsHomePage account= new crmAccountsHomePage();
				account.goToCreateAccount();
										
				crmCreateAccountsPage createaccount = new crmCreateAccountsPage();
							
				createaccount.createAccount("Priyanka");
			
		


	}

}
