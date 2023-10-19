package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		driver = this.driver;

	}

	// List of elements
	@FindBy(how = How.XPATH, using = "//input[@id='username']") WebElement UserNameElement;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")	WebElement PasswordElement;
	@FindBy(how = How.XPATH, using = "//button[@name='login']") WebElement SigninElement;

	
	//Related methods
	
	public void insertUserName(String userName) {
		
		UserNameElement.sendKeys(userName);
		
	}
	
	public void insertPassword( String password) {
	
		PasswordElement.sendKeys(password);
		
	}
	
	public void clickSignInButton() {
		
		SigninElement.click();
		
	}
	
	

}


