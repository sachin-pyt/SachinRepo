package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0; i<links.size(); i=i+1)
	     {
		
		  System.out.println(links.get(i).getText());
		 
		}
	}

}
