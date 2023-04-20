package Selenium_HRMS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.interactions.Actions;
public class TC020_DragandDrop {
	
	
	public static void main(String args[]) throws Exception{
	    //Test Steps
		System.setProperty("webdriver.chrome.driver",
				"C:\\swathi_online training\\JarFiles\\Chromedriver\\chromedriver.exe");
		     WebDriver driver = new ChromeDriver();
	
	driver.get("https://jqueryui.com/droppable/");
	Thread.sleep(4000);
	//Verify Title: stop the exe in case of cond: fail
	assertEquals(driver.getTitle(),"Droppable | jQuery UI");
	System.out.println("Title matched");
	//Enter into frame
	driver.switchTo().frame(0);
	//dragdrop
	Actions a = new Actions(driver);
	a.dragAndDrop(driver.findElement(By.id("draggable")),
	              driver.findElement(By.id("droppable"))).perform();
	System.out.println("dragdrop");
	Thread.sleep(4000);
	//exit from frame
	driver.switchTo().defaultContent();
	driver.close();
	}
	}


