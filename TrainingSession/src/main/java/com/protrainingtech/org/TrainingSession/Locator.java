package com.protrainingtech.org.TrainingSession;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locator {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rasman khurshid\\eclipse-workspace\\TrainingSession\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		//driver.navigate().to("https://www.protrainingtech.com"); //it will create the history in browser
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement EmailField= driver.findElement(By.id("email"));
		EmailField.sendKeys("rasmakhan37@yahoo.com");
		WebElement PasswordField= driver.findElement(By.name("pass"));
		PasswordField.sendKeys("XYz@1234***");
		WebElement Login= driver.findElement(By.name("login"));
		Thread.sleep(6000);
		Login.click();
	}

}
