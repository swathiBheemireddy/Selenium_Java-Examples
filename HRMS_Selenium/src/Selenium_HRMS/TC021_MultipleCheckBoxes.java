package Selenium_HRMS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC021_MultipleCheckBoxes {
	
	
	    public static void main(String args[]) throws Exception{
	        //Test Steps
	    	System.setProperty("webdriver.chrome.driver",
					"C:\\swathi_online training\\JarFiles\\Chromedriver\\chromedriver.exe");
			     WebDriver driver = new ChromeDriver();
			     driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	    
	    System.out.println(driver.getTitle());
	    driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	    driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	    driver.findElement(By.name("Submit")).click();
	    System.out.println("Login completed");
	    Thread.sleep(4000);
	    //Enter into Frame
	    driver.switchTo().frame("rightMenu");
	    // DT Var VV
	    for(int i=1; i<=10; i=i+2) {
	    driver.findElement(By.
	    xpath("//*[@id='standardView']/table/tbody/tr["+i+"]/td[1]/input")).click();    
	    System.out.println("clickd on checkbox " + i);
	    Thread.sleep(3000);
	    }
	    driver.switchTo().defaultContent();
	    driver.findElement(By.linkText("Logout")).click();
	    driver.close();
	   
	    }
	}

