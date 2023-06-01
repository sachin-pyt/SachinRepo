package module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/?safe=active&ssui=on");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
   String URL = driver.getCurrentUrl();
   System.out.println(URL);
	Thread.sleep(5000);
	
	driver.navigate().to("https://www.selenium.dev/https://www.selenium.dev/");
	String URL2 = driver.getCurrentUrl();
	 System.out.println(URL2);
	Thread.sleep(5000);
	
	driver.navigate().back();
	String URL3 = driver.getCurrentUrl();
	 System.out.println(URL3);
	Thread.sleep(5000);
	
	driver.navigate().forward();
	String URL4 = driver.getCurrentUrl();
	 System.out.println(URL4);
	Thread.sleep(5000);
	
	driver.navigate().refresh();
	String URL5 = driver.getCurrentUrl();
	 System.out.println(URL5);
	Thread.sleep(5000);
	
	driver.close();
	
		
	
	
	
	}

}
