package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2a {

	public static void main(String[] args) throws InterruptedException {
		
       WebDriver driver = new ChromeDriver();
       driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
       
              
       driver.findElement(By.xpath("//input[@id='sView1:r1:0:email::content']")).sendKeys("sachingowda0159@gmail.com");
       Thread.sleep(5000);
       
       driver.findElement(By.xpath("//input[@id='sView1:r1:0:password::content']")).sendKeys("devuprasadyuvi1");
       Thread.sleep(5000);
       
       driver.findElement(By.xpath("//input[@id='sView1:r1:0:retypePassword::content']")).sendKeys("devuprasadyuvi1");
       Thread.sleep(5000);
       
       Select country = new Select(driver.findElement(By.xpath("//select[@id='sView1:r1:0:country::content']")));
       country.selectByValue("US");
       Thread.sleep(5000);
    
       driver.findElement(By.xpath("//input[@id='sView1:r1:0:firstName::content']")).sendKeys("Sachin");
       Thread.sleep(5000);
       
       driver.findElement(By.xpath("//input[@id='sView1:r1:0:lastName::content']")).sendKeys("Gowda");
       Thread.sleep(5000);
       
       driver.findElement(By.xpath("//input[@id='sView1:r1:0:jobTitle::content']")).sendKeys("QA Engineer");
       Thread.sleep(5000);
       
       driver.findElement(By.xpath("//input[@id='sView1:r1:0:workPhone::content']")).sendKeys("8496036310");
       Thread.sleep(5000);
       
       driver.findElement(By.xpath("//input[@id='sView1:r1:0:companyName::content']")).sendKeys("Pickyourtrail");
       Thread.sleep(5000);
       
       driver.findElement(By.xpath("//input[@id='sView1:r1:0:address1::content']")).sendKeys("Vijaya raghavaroad, t nagar");
       Thread.sleep(5000);
       
       driver.findElement(By.xpath("//input[@id='sView1:r1:0:city::content']")).sendKeys("Chennai");
       Thread.sleep(5000);
       
       Select state = new Select(driver.findElement(By.xpath("//select[@id='sView1:r1:0:state::content']")));
       state.selectByValue("16");
       Thread.sleep(5000);
       
       driver.findElement(By.xpath("//input[@id='sView1:r1:0:postalCode::content']")).sendKeys("573116");
       Thread.sleep(5000);
       
       driver.findElement(By.xpath("//tbody/tr[30]/td[2]/div[1]/a[1]/span[1]")).click();
       
	}
}
