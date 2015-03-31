package batchLaunchApplication;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {
	public static int ROW_COUNT =1;
	public static int MAX_ROW_COUNT = 1;
	public String link;
	public String usrName;
	public String pwd;

	public static void main(String[] args) throws InvalidFormatException, IOException, NullPointerException, InterruptedException {
		
		//CODE TO READ VALUES FROM EXCEL FILE
		//FileInputStream inputFile = new FileInputStream("..\\Resources\\JavaReadValues.xlsx");
		System.out.println("Initializing File");
		FileInputStream inputFile = new FileInputStream("C:\\Users\\anupam.ahlawat\\git\\LoginApplication\\LoginApplication\\Resources\\JavaReadValues.xlsx");
		Workbook wb = WorkbookFactory.create(inputFile);
		Sheet sheet = wb.getSheet("LoginInformation");
		MAX_ROW_COUNT = sheet.getLastRowNum();
		ReadExcel readExcel = new ReadExcel();
		
		//INITIALIZING IE WEBDRIVER
		System.out.println("Initializing Selenium Java Driver");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\anupam.ahlawat\\git\\LoginApplication\\LoginApplication\\Resources\\IEDriverServer_x64_2.45.0\\IEDriverServer.exe");
		for( int i=0; i<MAX_ROW_COUNT; i++){
			String link = readExcel.getLink(sheet, ROW_COUNT);
			String usrName = readExcel.getUsername(sheet, ROW_COUNT);
			String pwd = readExcel.getPassword(sheet, ROW_COUNT);
			System.out.println("The link is :" + link + "\n" +"The username is:" + usrName + "\n" +"The password is: " + pwd);
			//STARTING NEW INSTANCE OF IE
			InternetExplorerDriver iedriver = new InternetExplorerDriver();
			iedriver.get(link);
			//Wait for jvm to come up
			Thread.sleep(4000);
			WebElement username = iedriver.findElement(By.name("j_username"));
			username.sendKeys(usrName);
			WebElement password = iedriver.findElement(By.name("j_password"));
			password.sendKeys(pwd);
			//WebElement loginButton = iedriver.findElement(By.value("idSIButton9"));
			//loginButton.click();
			WebElement loginButton = iedriver.findElementByXPath("//*[@type='submit']");
			loginButton.click();
			ROW_COUNT++;
			
			
		}
		
		
			
		//System.setProperty("webdriver.ie.driver", "C:\\Professional\\Selenium\\Installers\\IEDriverServer_x64_2.45.0\\IEDriverServer.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Professional\\Selenium\\Installers\\chromedriver_win32\\chromedriver.exe");
		
		//IonTrading chevlaunch = new IonTrading();
		
		//Gmail gmail = new Gmail();
		
	}
	
}
