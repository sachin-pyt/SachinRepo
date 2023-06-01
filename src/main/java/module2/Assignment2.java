package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/?safe=active&ssui=on");
		Thread.sleep(5000);
		
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		
	}

}
