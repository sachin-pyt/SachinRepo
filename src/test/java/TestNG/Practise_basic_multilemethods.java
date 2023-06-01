package TestNG;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practise_basic_multilemethods {
	public WebDriver driver;
	
	
  @Test(priority = 0)
  public void setup() throws InterruptedException {
	 
	 //Launch Chrome Browser 
	  driver = new ChromeDriver();
	  
  }
  
	
  
  @Test(priority = 1)
  public void gotourl() throws InterruptedException
  {
	  //Go to Test URL https://demoqa.com/browser-windows
	  driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(5000);
  }  
  
  @Test(priority = 2)
  public void maximize()
  {
		//Maximize the Browser Window
		driver.manage().window().maximize();
  }
  
  
   @Test(priority = 3)
  public void gettitle1() throws InterruptedException
  {
		
		//Get the Title of Page
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
  }
  
  
   @Test(priority = 4)
  public void click() throws InterruptedException
  {
		//Click on knowmore Link Text
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(5000);
  }
  
  
	@Test(priority = 5)	
  public void switchto() throws InterruptedException
  {
		//Switch from 0th   Window to 1st   Window
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
				System.out.println(tabs);
		Thread.sleep(5000);
		
		driver.switchTo().window(tabs.get(1));
  }
  
  @Test(priority = 6)
  public void gettitle2() throws InterruptedException
  {		
		//After Switching Get the Title of Page
		String title1 = driver.getTitle();
		System.out.println(title1);
		Thread.sleep(5000);
		
  }
  
  
  @Test(priority = 7)
  public void close1()
  {
		//Close 1st Window 
		driver.close();
  }  
  
  
  
 @Test (priority = 8)
public void switch2() throws InterruptedException
{
		
		//Switch from 1st   Window to 0th  Window
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	System.out.println(tabs);
    Thread.sleep(5000);

   driver.switchTo().window(tabs.get(0));
}
   
@Test  (priority = 9) 
   public void gettitle3() throws InterruptedException
   {
	//After Switching Get the Title of Page
		String title2 = driver.getTitle();
		System.out.println(title2);
		Thread.sleep(5000);
}


@Test(priority = 10)
public void close2()
{
		//Close 0th Window  
		driver.close();
}

	}


