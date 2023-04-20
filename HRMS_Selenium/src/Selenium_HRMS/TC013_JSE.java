package Selenium_HRMS;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC013_JSE {
	
	    public static void main(String args[]) throws Exception{
	    	System.setProperty("webdriver.chrome.driver",
					"C:\\swathi_online training\\JarFiles\\Chromedriver\\chromedriver.exe");
			     WebDriver driver = new ChromeDriver();
	           //test casse steps
	        driver.manage().window().maximize();
	       // driver.get("http://183.82.103.245/nareshit/login.php&quot;);
	        driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	        
	        		System.out.println(driver.getTitle());
	       driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("nareshit");
	       driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	        //using javascriptExecuter to click on login btn
	WebElement loginbtn = driver.findElement(By.name("Submit"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", loginbtn);
	        Thread.sleep(4000);
	        System.out.println("Login completed");
	       // using javascriptExecuter to click on logout btn
	WebElement logout = driver.findElement(By.linkText("Logout"));
	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	executor1.executeScript("arguments[0].click();", logout);
	            System.out.println("Logout completed");
	        driver.close();
	       
	      }
	}


