package TestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class Assignment_02 {
	public WebDriver driver;
	
@Test (dataProvider = "testdata_FB")
public void LoginPageFB(String uname, String pwd) throws InterruptedException
{
	driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	
	  //input number
	  driver.findElement(By.xpath("//input[@id ='email']")).sendKeys(uname);
	  Thread.sleep(5000);
 
	  //input password
	driver.findElement(By.xpath("//input[@id ='pass']")).sendKeys(pwd);
	Thread.sleep(5000);


	  //click login
	  driver.findElement(By.xpath("//button[text()='Log in']")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
	  //click on user name
	  driver.findElement(By.xpath("//span[text()='Sachinn Gowda']")).click();
	  Thread.sleep(10000);

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
public void getTestResult(ITestResult testResult)
{
	System.out.println("TestCase Name :" +testResult.getName());
	System.out.println("TestCase Result :" +testResult.getStatus());
	int status = testResult.getStatus();
	if(status==1)
	{
		driver.close();
		System.out.println("test");
	}
	else
	{
		//Take screenshot and close the browser
		File outfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(outfile, new File("/Users/pyt/eclipse-workspace/sachinsmavenproject/src/test/resources/scrennshotss" + testResult.getParameters()[0] + "Defect.jpeg"));
		} catch (IOException e)  {
			e.printStackTrace();
		}
		driver.close();
	}
}

@DataProvider(name = "testdata_FB")
public Object [][] readExcel() throws BiffException, IOException
{
	//Open the Excel for read and write which is available in the same project
	
	File f = new File("/Users/pyt/eclipse-workspace/sachinsmavenproject/src/test/resources/datadrivern.xls");
	Workbook w = Workbook.getWorkbook(f);
	Sheet s = w.getSheet(0);
	int noofRows = s.getRows();
	int noofColu = s.getColumns();
	
	//Creating an array to store the data of an excel sheet
	String inputData[][] = new String[noofRows - 1][noofColu];
	int count = 0;
	for(int i=1; i<noofRows; i++)
	{
		for(int j=0; j<noofColu; j++)
		{
			jxl.Cell c =s.getCell(j,i);
			inputData[count][j] = c.getContents();
		}
		count++;
	}
	return inputData;
		}
	}


