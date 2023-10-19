package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class AddCustomerPage extends BasePage{
	WebDriver driver;
	
    public AddCustomerPage(WebDriver driver) {
	
	driver = this.driver;
}
	

	@FindBy(how = How.XPATH, using = "//input[@id='account']") WebElement FullNameElement;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")  WebElement CompanyElement;
	@FindBy(how = How.XPATH, using = "//input[@id='email']") WebElement EmailElement;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']") WebElement PhoneElement;	
	@FindBy(how = How.XPATH, using = "//button[@id='submit']") WebElement SaveButtonElement;

	public void enterFullName(String fullname) {
		
		FullNameElement.sendKeys(fullname + generateRandomNum(9999));

	}

	public void enterEmail(String email) {
		
		EmailElement.sendKeys(generateRandomNum(999) + email);
		
	}
	
	public void selectCompany(String company ) {
		
		selectFromDropdown(CompanyElement, company);
	}
	
	public void enterPhoneNumber(String num) {
		
		PhoneElement.sendKeys(num + generateRandomNum(99999));
		
	}
	
	public void clickOnSaveButton() {
		
		SaveButtonElement.click();
	}
}