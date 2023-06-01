package TestNG;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Assignment_01 {
	public WebDriver driver;
	
	
@Test(priority = 0)
public void setup() throws InterruptedException
{
//launch chrome browser
driver = new ChromeDriver();
Thread.sleep(5000);
}


@Test(priority = 1)
public void url() throws InterruptedException
{
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
}

  @Test(priority = 2)
  public void mobilenumber() throws InterruptedException
  {
	  //input number
	  driver.findElement(By.xpath("//input[@id ='email']")).sendKeys("8496036310");
	  Thread.sleep(5000);
  }
  
 
  @Test(priority = 3)
  public void password() throws InterruptedException
  {
	  //input password
	driver.findElement(By.xpath("//input[@id ='pass']")).sendKeys("devuprasadyuvi1");
	Thread.sleep(5000);
  }
  
  
  @Test(priority = 4)
  public void click() 
  {
	  //click login
	  driver.findElement(By.xpath("//button[text()='Log in']")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
  
  @Test(priority = 5)
  public void username() throws InterruptedException 
  {
	  //click on user name
	  driver.findElement(By.xpath("//span[text()='Sachinn Gowda']")).click();
	  Thread.sleep(10000);
	  
  }
  
  
  @Test(priority = 6)
  public void verifylogin() throws InterruptedException
  {
	  //Verify login is successful or not
	  
	  String EXPURL = "https://www.facebook.com/profile.php?id=100027982447602";
	  String ACTURL = driver.getCurrentUrl();
	  
	  if(ACTURL.equals(EXPURL))
	  {
		  System.out.println("Login is successful - Test passed");
	  }
	  else
	  {
		  System.out.println("Login is unsuccessful - Test failed");
	  }
	  
	 Assert.assertEquals(ACTURL, EXPURL);
  }
	 
	 @Test(priority = 7)
	 public void close()
	 {
	 	//close
	 driver.close();
	 }
  }

  
  
	  
	  
  
  
  
	  
  

