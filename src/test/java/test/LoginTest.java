package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;
	

	String userName="demo@techfios.com";
	String password="abc123";
	String dashboard ="Dashboard";
	
	@Test
	public void validUserShouldBeAbleToLogin() throws InterruptedException {
		
		driver= BrowserFactory.init();
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.insertUserName(userName);
		loginpage.insertPassword(password);
		loginpage.clickSignInButton();
		
		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.validateDashboardPage(dashboard);

		
		BrowserFactory.tearDown();
		
		
		
	}
	
}
