package batchLaunchApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IonTrading {

	public String Webelement;
	IonTrading(){
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.iontrading.com");	
		WebElement Username = chromeDriver.findElement(By.xpath("//*[@id='content_menu']/form/input[1]"));
		Username.sendKeys("anupam.ahlawat");
		WebElement Password = chromeDriver.findElement(By.xpath("//*[@id='content_menu']/form/input[2]"));
		Password.sendKeys("Password1010");
		WebElement Enter = chromeDriver.findElement(By.xpath("//*[@id='content_menu']/form/input[3]"));
		Enter.click();
		WebElement Contact = chromeDriver.findElement(By.xpath("//*[@id='contact']"));
		Contact.sendKeys("anupam");
		WebElement Search = chromeDriver.findElement(By.xpath("//*[@id='search_contact']"));
		Search.click();
		WebElement exportToExcel = chromeDriver.findElement(By.xpath("/html/body/table/tbody/tr[1]/th/a/img"));
		exportToExcel.click();
		
	}
	
	
}
