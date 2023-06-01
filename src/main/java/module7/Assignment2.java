package module7;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		//Open the URL
				WebDriver driver = new FirefoxDriver();
				driver.get("https://www.selenium.dev/downloads/");
				Thread.sleep(3000);
				
				//click on choose file button
				driver.findElement(By.linkText("4.9.1 (May 08, 2023)")).click();
				Thread.sleep(3000);
				
				//put the path into clipboard
				StringSelection s = new StringSelection("/Users/pyt/Downloads/sachin.pdf");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
				
				
				//send the data from clipboard to screen
				//Paste control V
				//Using Java Robot
				
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(2000);
				
				//Enter Operation
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(2000);
				
				//Close the browser
				driver.close();
		        

	}

}
