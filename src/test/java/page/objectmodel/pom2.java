package page.objectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class pom2 {
	
	static WebDriver driver;
	static page_object_model pom;
	
	
  @Test
  public void VerifyFBlogin() throws InterruptedException {
	    //Launch chromedriver
	    driver = new ChromeDriver();
	  
	    //send url
		driver.get("https://www.facebook.com/");
		pom = new page_object_model(driver);
		Thread.sleep(5000);
		
		//input number
		pom.type_number("8496036310");
		
		 //input password
		pom.type_password("devuprasadyuvi1");
		
		//click login
		pom.click();
		
		//click on profile icon button
		pom.profileiconclick();
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
		
@AfterMethod
public void teardown()
{
	driver.close();
}
  }

