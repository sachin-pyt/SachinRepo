package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/?safe=active&ssui=on");

	}

}
