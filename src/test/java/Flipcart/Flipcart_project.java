package Flipcart;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipcart_project {
	WebDriver driver;
	List<WebElement> price;
	List<WebElement> phones;
	
	
  @Test(priority = 1)
  public void searchmobile() throws InterruptedException {
	  driver = new ChromeDriver();
	  
	  //launch url
	  driver.get("https://www.flipkart.com/");
	  
	//close login alert
			driver.findElement(By.xpath("//span[text() = 'Login']/preceding::*[1]")).click();
			Thread.sleep(5000);
	  
	//Click on search box and type mobile phones in the search box
			driver.findElement(By.xpath("//input[@placeholder = 'Search for products, brands and more']")).sendKeys("Mobile Phones");
			Thread.sleep(5000);
			
			//click on search 
			driver.findElement(By.xpath("//button[@type = 'submit']")).click();
			Thread.sleep(5000);
  }
			
@Test(priority = 2)
public void testresult() {
	phones = driver.findElements(By.xpath("//div[@class = '_4rR01T']"));
	int noOfPhones = phones.size();
	for (int i=0; i<noOfPhones; i++)
	{
		System.out.println(phones.get(i).getText());
	}
	price = driver.findElements(By.xpath("//div[@class = '_30jeq3 _1_WHN1']"));
	 int list = price.size();
	System.out.println(list);
	for(int i=0; i<list; i++)
	{
		System.out.println(price.get(i).getText());
	}
}
	
@Test(priority = 3)
public void outputtoexcelsheet() {
	File f = new File("/Users/pyt/Downloads/flipcartproject.xlsx");
	XSSFWorkbook w = new XSSFWorkbook();
	XSSFSheet s = w.createSheet("flipcart_output");
	XSSFRow r = s.createRow(0);
	r.createCell(0).setCellValue("items");
	r.createCell(1).setCellValue("price");
	for(int i=0; i<list; i++)
	{
		XSSFRow r1 = s.createRow(i+1);
		r1.createCell(0).setCellValue(phones.get(i).getText());
		r1.createCell(0).setCellValue(price.get(i).getText());
	}
	
	FileOutputStream fop = new FileOutputStream(f);
	w.write(fop);
	w.close();
	driver.quit();
	}
}
		
	







