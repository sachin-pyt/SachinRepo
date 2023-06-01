package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		//launch the URl
		WebDriver driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		Thread.sleep(5000);
		
		//Slider actions
		WebElement e = driver.findElement(By.xpath("//div[@id = 'slider']"));
		Actions a = new Actions(driver);
		a.dragAndDropBy(e, 60, 0).build().perform();
		Thread.sleep(5000);
		
		//close
		driver.close();
}
	}


