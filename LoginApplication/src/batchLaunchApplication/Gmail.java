package batchLaunchApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	
	
	public Gmail() {
		//InternetExplorerDriver iedriver = new InternetExplorerDriver();
		//iedriver.get("http://gmail.com");
		//if (iedriver instanceof JavascriptExecutor){
			//iedriver.findElementById("Email").sendKeys("anupam");
		//}
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https:/www.gmail.com");
		WebElement username = chromeDriver.findElement(By.xpath("//*[@id='Email']"));
		username.sendKeys("anupam");
		
	}

}
