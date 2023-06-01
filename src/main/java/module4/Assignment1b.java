package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1b {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
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
	}

}
