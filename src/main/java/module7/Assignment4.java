package module7;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment4 {

		
		public static void main(String[] args) throws InterruptedException, AWTException {
			//Open the URL
					WebDriver driver = new FirefoxDriver();
					driver.get("https://www.selenium.dev/downloads/");
					Thread.sleep(3000);

					//Get the plain text Java , Python  into Console 
					
					String ptext1 = driver.findElement(By.xpath("//p[text() = 'Java']")).getText();
					System.out.println(ptext1);
					
					String ptext2 = driver.findElement(By.xpath("//p[text() = 'Ruby']")).getText();
					System.out.println(ptext2);
					
					//Close the browser
					driver.close();
	}

}
