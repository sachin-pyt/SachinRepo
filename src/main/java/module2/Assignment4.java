package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/?safe=active&ssui=on");
		Thread.sleep(5000);
		
		String gettitle = driver.getTitle();
		System.out.println(gettitle);
		

	}

}
