package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");
		Thread.sleep(5000);
		
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		
		String ptext = driver.findElement(By.xpath("//p[@class = 'examp3']")).getText();
		System.out.println(ptext);
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		Thread.sleep(5000);
		
		WebElement SearchBox = driver.findElement(By.xpath("//textarea[@name = 'browser']"));
		SearchBox.clear();
		SearchBox.sendKeys("sachin Gowda");
		String thevalue = SearchBox.getAttribute("value");
		System.out.println(thevalue);
		Thread.sleep(5000);
		

		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		Thread.sleep(5000);
		
		String ptext2 = driver.findElement(By.cssSelector("tbody:nth-child(1) tr:nth-child(1) td:nth-child(2) p:nth-child(2) > font:nth-child(1)")).getText();
		System.out.println(ptext2);
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
