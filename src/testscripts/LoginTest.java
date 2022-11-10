package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.PredefinedActions;
import pages.LoginPage;

public class LoginTest {
	
	
	@Test
	public void tc1() {
		System.out.println("STEP - Launch Chrome Browser and Hit url");
		PredefinedActions.start("https://rganachari-trials77.orangehrmlive.com/auth/seamlessLogin");
			
		System.out.println("STEP - Enter valid login credentials");
		LoginPage loginPage = new LoginPage();
		loginPage.login("Admin","5ZXpcAy1Q@");
		
		System.out.println("VERIFY -  home page is displayed");
		String expectedTitle = "Employee Management";
		String actualTitle = loginPage.getPageTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle, "Expected title was " + expectedTitle + " but actual title was " + actualTitle);
		
		PredefinedActions.closeBrowser();

	}
}