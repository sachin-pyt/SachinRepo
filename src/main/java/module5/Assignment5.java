package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new FirefoxDriver();
       driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
       Thread.sleep(5000);
       
       driver.switchTo().frame(0);
       driver.findElement(By.xpath("//button[text() = 'Try it']")).click();
       
       driver.switchTo().alert().sendKeys("Hi DUDE");
       Thread.sleep(5000);
       
       
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
        
        String ptext = driver.findElement(By.xpath("//p[@id = 'demo']")).getText();
        System.out.println(ptext);
        
         driver.close();
	}

}
