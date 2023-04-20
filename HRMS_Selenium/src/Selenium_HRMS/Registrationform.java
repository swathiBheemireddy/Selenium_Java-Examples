package Selenium_HRMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registrationform {
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver",
				"C:\\swathi_online training\\JarFiles\\Chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	   driver.navigate().to("https://facebook.com/");
//	   https://facebook.com/reg/
//		   https://testproject.io/
}

}
