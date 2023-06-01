package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text() = 'Create new account']")).click();
		Thread.sleep(5000);
		
	WebElement searchBox = driver.findElement(By.xpath("//input[@name = 'firstname']"));
		
		searchBox.sendKeys("Sachin");
		searchBox.clear();
		searchBox.sendKeys("Gowda");
		Thread.sleep(5000);
		
		String thevalue = searchBox.getAttribute("value");
		System.out.println(thevalue);
		
		 
		 driver.close();
		 
		 
		
	}

}
