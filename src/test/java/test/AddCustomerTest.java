package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	
	WebDriver driver;
	
	//test data
	String userName="demo@techfios.com";
	String password="abc123";
	String dashboard ="Dashboard";
	String fullName = "Huda";
	String company = "Techfios";
	String email = "Huda@gmail.com";
	String phone = "2450983";
	
	@Test
	public void userShoudBeAbleToAddCustomer() throws InterruptedException {
		
		driver= BrowserFactory.init();
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.insertUserName(userName);
		loginpage.insertPassword(password);
		loginpage.clickSignInButton();
		
		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.validateDashboardPage(dashboard);
		
		Thread.sleep(200);
		dashboardpage.clickOnCustomer();
		dashboardpage.clickOnAddCustomer();

		
		AddCustomerPage addcustomerpage = PageFactory.initElements(driver, AddCustomerPage.class);
		addcustomerpage.enterFullName(fullName);
		addcustomerpage.selectCompany(company);
		addcustomerpage.enterEmail(email);
		addcustomerpage.enterPhoneNumber(phone);
		addcustomerpage.clickOnSaveButton();
		
		BrowserFactory.tearDown();
		

	}

}
