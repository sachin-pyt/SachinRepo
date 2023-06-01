package module8;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		//Open the URL
		WebDriver driver = new ChromeDriver();
		driver.get("https://smallpdf.com/word-to-pdf");
		Thread.sleep(3000);
		
		//click on choose file button
		driver.findElement(By.xpath("//span[text() = 'Choose Files']")).click();
		Thread.sleep(3000);
		
		//put the path into clipboard
		StringSelection s = new StringSelection("/Users/pyt/Downloads/sachin.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		
		//send the data from clipboard to screen
		//Paste control V
		//Using Java Robot
		
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		
		//Enter Operation and give Explicit wait time 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement e = new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text() = 'Download']")));
		
		//Click on download
		e.click();
		Thread.sleep(10000);
		
		//Close the browser
		driver.close();

	}

}
