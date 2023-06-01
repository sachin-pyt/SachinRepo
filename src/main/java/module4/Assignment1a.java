package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1a {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.name("firstname")).sendKeys("Sachin");
	
	driver.findElement(By.name("lastname")).sendKeys("gowda");
	
	driver.findElement(By.name("reg_email__")).sendKeys("8496036320");
	
	driver.findElement(By.id("password_step_input")).sendKeys("sachingowda123");
	Thread.sleep(5000);
	
	Select day = new Select(driver.findElement(By.id("day")));
	day.selectByValue("24");
	Thread.sleep(5000);
	
	Select month = new Select(driver.findElement(By.id("month")));
	month.selectByValue("4");
	Thread.sleep(5000);
	
	Select year = new Select(driver.findElement(By.id("year")));
	year.selectByValue("1998");
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.name("websubmit")).click();
	
	}

}
