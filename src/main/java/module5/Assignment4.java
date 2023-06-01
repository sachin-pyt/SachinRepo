package module5;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.jquery-az.com/javascript/demo.php?ex=151.1_1");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[text() = 'Click here to show confirm alert']")).click();
	    Thread.sleep(5000);
	    
	  String alerttext1 = driver.switchTo().alert().getText();
	  System.out.println(alerttext1);
	  Thread.sleep(5000);
	  
	  driver.switchTo().alert().accept();
	  Thread.sleep(5000);
	  
	 String alerttext2 = driver.switchTo().alert().getText();
	 System.out.println(alerttext2);
	 Thread.sleep(5000);
	 
	 driver.switchTo().alert().accept();
	 Thread.sleep(5000);
	 
	 driver.close();
	  
	
	}


}
