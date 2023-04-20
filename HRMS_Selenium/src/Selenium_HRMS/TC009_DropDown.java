package Selenium_HRMS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class TC009_DropDown {
	

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
	    Select st = new Select(driver.findElement(By.name("loc_code")));
	    Thread.sleep(4000);
	    st.selectByVisibleText("Emp. ID");
	    Thread.sleep(4000);
	    driver.findElement(By.name("loc_name")).sendKeys("0003");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@value='Search']")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.name("chkLocID[]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@value='Delete']")).click();
	    Thread.sleep(4000);
	    driver.switchTo().defaultContent();
	    driver.findElement(By.linkText("Logout")).click();
	    Thread.sleep(4000);
	    driver.close();
	    }
	}


