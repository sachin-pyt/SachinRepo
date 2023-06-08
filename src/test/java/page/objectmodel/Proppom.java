package page.objectmodel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Proppom {
	WebDriver driver;
	
	
  @Test
  public void login_FB() throws IOException, InterruptedException {
	  Properties prop = new Properties();
	  FileInputStream fis = new FileInputStream("/Users/pyt/eclipse-workspace/sachinsmavenproject/src/test/java/page/objectmodel/config.properties");
	  
	  prop.load(fis);
	  
	  //Name
	  String Name = prop.getProperty("name");
	  System.out.println("Name");
	  
	  
	  //Age
	  String Age = prop.getProperty("age");
	  System.out.println("Age");
	  
	  
	  //Url
	  String URL = prop.getProperty("url");
	  System.out.println("URL");
	  
	  
	  //Browser
	  String Browser = prop.getProperty("browser");
	  System.out.println("Browser");
	  
	  //Browser setup
	  if (Browser.equals("firefox"))
	  {
		  driver = new FirefoxDriver();
	  }
	  
	  
	  else if(Browser.equals("edge"))
	  {
		  driver = new EdgeDriver();
	  }
	  
	  
	  else if(Browser.equals("chrome"))
	  {
		  driver = new ChromeDriver();
	  }
	  
	  
	  driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		  //input number
		  driver.findElement(By.xpath(prop.getProperty("UserNameField"))).sendKeys(prop.getProperty("username"));
		  Thread.sleep(7000);
	 
		  //input password
		driver.findElement(By.xpath(prop.getProperty("PasswordField"))).sendKeys(prop.getProperty("password"));
		Thread.sleep(7000);


		  //click login
		  driver.findElement(By.xpath(prop.getProperty("LoginButton"))).click();
		  Thread.sleep(10000);
		  
		  //Close
		  driver.close();
  }
}
