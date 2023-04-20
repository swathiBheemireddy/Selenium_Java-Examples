package Selenium_HRMS;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC015_WebTable {
	
	public static void main(String args[]) throws Exception{
	    //Test Steps
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\swathi_online training\\JarFiles\\Chromedriver\\chromedriver.exe");
		     WebDriver driver ;
		System.setProperty("webdriver.chrome.driver",
	            "C:\\swathi_online training\\JarFiles\\Chromedriver\\Chromedriver111\\chromedriver.exe");
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);
		//WebDriver driver = new ChromeDriver(options);//input[@id='hobbies-checkbox-2']
		driver.navigate().to("https://demoqa.com/alerts"); 
		  driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
	driver.get("file:///C:/swathi_online%20training/HRMS/MutlipleWindowsURL/WebTable.html");
	//count
	int row=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
	int col=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
	int row_col=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();

	System.out.println(row);
	System.out.println(col);
	System.out.println(row_col);
	//Data - cell
	String celldata=driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
	System.out.println(celldata);
	//data - Table
	// DT var vv
	for(int i=1; i<=row; i++) {
	String data=driver.findElement(By.
	        xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
	Thread.sleep(1000);
	System.out.println(data);
	}
	driver.close();

	}
	}


