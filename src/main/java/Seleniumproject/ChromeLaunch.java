package Seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/pyt/Downloads/chromedriver_mac64/chromedriver" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/?safe=active&ssui=on");
		
		
		
	}

}
