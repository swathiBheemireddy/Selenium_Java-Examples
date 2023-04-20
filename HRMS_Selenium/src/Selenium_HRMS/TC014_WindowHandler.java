package Selenium_HRMS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import org.openqa.selenium.By;
public class TC014_WindowHandler {
	
	public static void main(String args[]) throws Exception{
	    //Test Steps
		System.setProperty("webdriver.chrome.driver",
				"C:\\swathi_online training\\JarFiles\\Chromedriver\\chromedriver.exe");
		     WebDriver driver = new ChromeDriver();
	//driver.get("file:///F:/Suresh_Selenium/HtmlFiles/multiplewindows.html");
	driver.get("file:///C:/swathi_online%20training/HRMS/MutlipleWindowsURL/multiplewindows.html");
	Thread.sleep(4000);
	//2nd wind
	driver.findElement(By.id("btn2")).click();
	Thread.sleep(4000);
	//3rd wind
	driver.findElement(By.id("btn3")).click();
	Thread.sleep(4000);
	ArrayList<String> windinfo=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(windinfo.get(0));
	Thread.sleep(4000);
	//driver.close();
	driver.quit();
	}
	}


