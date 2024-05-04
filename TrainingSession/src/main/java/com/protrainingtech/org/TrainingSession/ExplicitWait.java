package com.protrainingtech.org.TrainingSession;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait {
	static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rasman khurshid\\eclipse-workspace\\TrainingSession\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		
		WebElement CreateAccount= driver.findElement(By.linkText("Create new account"));
		CreateAccount.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		//Explicit Waiting
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("lastname")));
		WebElement NametoField=driver.findElement(By.name("lastname"));
		NametoField.sendKeys("Rasma");
		

	}

}
