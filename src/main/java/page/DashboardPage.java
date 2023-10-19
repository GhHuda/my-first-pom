package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {

	WebDriver driver;

	public DashboardPage(WebDriver driver) {

		driver = this.driver;

	}

	@FindBy(how = How.XPATH, using = "//h2[text()=' Dashboard ']") WebElement DashboardHeaderElement;

	@FindBy(how = How.XPATH , using ="//span[text()='Customers']") WebElement CustomerElement;
	
	@FindBy(how = How.XPATH , using = "//a[text()='Add Customer']") WebElement AddCustomerElement;

	public void validateDashboardPage(String expectedText) {

		Assert.assertEquals(DashboardHeaderElement.getText(), expectedText, "Dashboard Page Is Not Found!!");

	}
	
	public void clickOnCustomer() {
		
	CustomerElement.click();
		
	}
	
	public void clickOnAddCustomer() {
		
		AddCustomerElement.click();
		
	}

}
