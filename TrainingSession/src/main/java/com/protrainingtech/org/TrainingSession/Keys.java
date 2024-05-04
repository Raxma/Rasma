package com.protrainingtech.org.TrainingSession;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Keys {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rasman khurshid\\eclipse-workspace\\TrainingSession\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		WebElement names=driver.findElement(By.name("email"));
		names.sendKeys("rasmakhan37@gmail.com");
		
		Actions ob=new Actions(driver);
		//We will select the whole email address
		ob.keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("a").build().perform();
		//release the key 
		ob.keyUp(org.openqa.selenium.Keys.CONTROL).build().perform();
		//Now copy the email
		ob.keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("c").build().perform();
		ob.keyUp(org.openqa.selenium.Keys.CONTROL).build().perform();
		//Now clear the email address field 
		Thread.sleep(6000);
		names.clear();
		Thread.sleep(6000);
		
		names.click();
		ob.keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("v").build().perform();
		ob.keyUp(org.openqa.selenium.Keys.CONTROL).build().perform();
	}

}
