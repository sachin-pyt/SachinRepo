package page.objectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class page_object_model {
	WebDriver driver;
	
	
	//Specify the objects/elements locators
	
	By UserNameField = By.xpath("//input[@id ='email']");
	
	By PasswordField = By.xpath("//input[@id ='pass']");
	
	By LoginButton = By.xpath("//button[text()='Log in']");
	
	By ProfileIconClick = By.xpath("//span[text()='Sachinn Gowda']");

 


public page_object_model(WebDriver driver) {
	  this.driver = driver;
  }
  
  
  public void type_number(String uname) throws InterruptedException
  {
	//input number
	  driver.findElement(UserNameField).sendKeys(uname);
	  Thread.sleep(5000);
  }
  
  
  public void type_password(String pwd) throws InterruptedException
  {
	  //input password
		driver.findElement(PasswordField).sendKeys(pwd);
		Thread.sleep(5000);
  }
  
  
  public void click() throws InterruptedException
  {
	//click login
	  driver.findElement(LoginButton).click();
	  Thread.sleep(5000);
  }

  public void profileiconclick() throws InterruptedException 
  {
	  //click on profile icon button
	  driver.findElement(ProfileIconClick).click();
	  Thread.sleep(5000);
  }


}
