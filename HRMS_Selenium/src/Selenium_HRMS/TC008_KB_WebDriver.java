package Selenium_HRMS;


	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	public class TC008_KB_WebDriver {

	public static void main(String args[]) throws Exception{
	    //Test Steps
	System.setProperty("webdriver.chrome.driver","C:\\swathi_online training\\JarFiles\\Chromedriver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(4000);
	driver.findElement(By.name("q")).sendKeys("selenium");
	Thread.sleep(4000);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(4000);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(4000);
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	Thread.sleep(4000);
	driver.close();
	}
	}


