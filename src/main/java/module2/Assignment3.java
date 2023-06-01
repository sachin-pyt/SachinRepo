package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/?safe=active&ssui=on");
		Thread.sleep(5000);
		
		String gettitle = driver.getTitle();
		System.out.println(gettitle);
	}

}
