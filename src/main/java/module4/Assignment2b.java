package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2b {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		  
		  Select country = new Select(driver.findElement(By.xpath("//select[@id='sView1:r1:0:country::content']")));
	       country.selectByValue("US");
	       Thread.sleep(5000);
	       
	       Select state = new Select(driver.findElement(By.xpath("//select[@id='sView1:r1:0:state::content']")));
	       state.selectByValue("16");
	       Thread.sleep(5000);
	}

}
