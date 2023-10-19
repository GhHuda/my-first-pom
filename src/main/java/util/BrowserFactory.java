package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {

	static WebDriver driver;
	static String browser="chrome";
	static String url="https://techfios.com/billing/?ng=admin/";

	/*
	 * public static void config() {
	 * 
	 * Properties prop = new Properties();
	 * 
	 * try { InputStream input = new
	 * FileInputStream("src\\main\\java\\config\\config.properties");
	 * prop.load(input); prop.getProperty("browser"); prop.getProperty("url");
	 * 
	 * } catch (IOException e) {
	 * 
	 * e.printStackTrace();
	 * 
	 * }
	 * 
	 * }
	 */

	public static WebDriver init() {

//		config();

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "drivers\\msedgedriver.exe");
			driver = new EdgeDriver();

		} else {
			System.out.println("Please enter a valid browser");

		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		return driver;

	}

	public static void tearDown() throws InterruptedException {

		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}

}
