package module3;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(5000);
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs);
		Thread.sleep(5000);
		
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(5000);
		
		String windowtitle = driver.getTitle();
		System.out.println(windowtitle);
		Thread.sleep(5000);
		
		driver.switchTo().window(tabs.get(0));
		String newwindowtitle = driver.getTitle();
		System.out.println(newwindowtitle);
		
		driver.quit();
			
	}

}
