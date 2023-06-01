package module3;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment4 {

		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new FirefoxDriver();
			driver.get("https://demoqa.com/browser-windows");
			Thread.sleep(5000);
			
			driver.manage().window().maximize();
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(5000);
			
			driver.findElement(By.id("windowButton")).click();
			Thread.sleep(5000);
			
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
					System.out.println(tabs);
			Thread.sleep(5000);
			
			driver.switchTo().window(tabs.get(1));
			String title1 = driver.getTitle();
			System.out.println(title1);
			Thread.sleep(5000);
			
			driver.close();
			
			driver.switchTo().window(tabs.get(0));
			String title2 = driver.getTitle();
			System.out.println(title2);
			Thread.sleep(5000);
			
			driver.close();
			
	}

}
