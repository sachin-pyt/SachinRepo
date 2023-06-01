package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		//launch the URL
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		//close login alert
		driver.findElement(By.xpath("//span[text() = 'Login']/preceding::*[1]")).click();
		Thread.sleep(5000);
		
		//mouse hover on more
		WebElement e = driver.findElement(By.xpath("//div[text()= 'More']"));
		 Actions a = new Actions(driver);
		 a.moveToElement(e).build().perform();
		 Thread.sleep(5000);
		 
		 //click on mens to wear - not able to find Xpath
		// driver.findElement(By.xpath("")).click();
		// Thread.sleep(5000);
	
		 driver.close();
	}

}
