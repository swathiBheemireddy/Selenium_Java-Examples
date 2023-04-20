package Selenium_HRMS;
//package StepDefination;

import org.openqa.selenium.By;

	
	
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

//	import io.cucumber.java.en.Given;
//	import io.cucumber.java.en.Then;
//	import io.cucumber.java.en.When;
	public class Calender {

		WebDriver driver;
		//@Given("user enter Giru website")
		public void user_enter_giru_website() {
			System.out.println("hi");
			System.setProperty("webdriver.chrome.driver",
		            "C:\\swathi_online training\\JarFiles\\Chromedriver\\Chromedriver111\\chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(options);
			 driver.navigate().to("https://demo.guru99.com/test/");
		}
		//@When("user,Date of birth")
		public void user_date_of_birth() throws InterruptedException {
		WebElement calender=   driver.findElement(By.name("bdaytime"));
		calender.sendKeys("05241993");
		Thread.sleep(2000);
		calender.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		calender.sendKeys("3:00PM");
		Thread.sleep(2000);
		
		}
		//@Then("user logout button")
		public void user_logout_button() {
		    driver.close();
		}

	}



