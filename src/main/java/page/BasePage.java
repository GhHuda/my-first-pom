package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	

	public int generateRandomNum(int boundryNum) {
		
		Random rnd = new Random();
		int randNum = rnd.nextInt(boundryNum);
		
		return randNum;
		
	} 
	
	
	public void selectFromDropdown(WebElement element , String visibleText) {
		
		Select sel =  new Select (element);
		sel.selectByVisibleText(visibleText);
		
	}
}
