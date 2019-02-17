package testingpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestingClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM WEBDRIVER\\geckodriver-v0.24.0-win64\\geckodriver.exe\\");
		
		WebDriver driver = new  FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
	}

}
