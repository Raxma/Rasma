package com.protrainingtech.org.TrainingSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionOfAmazon {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rasman khurshid\\eclipse-workspace\\TrainingSession\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.lexus.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		WebElement shop=driver.findElement(By.xpath("//*[text()='SHOP' and @aria-expanded='false']"));
		Actions ob=new Actions(driver);
		ob.moveToElement(shop).build().perform();
		Thread.sleep(6000);
		
		//WebElement search= driver.findElement(By.xpath("//a[@aria-label=\"SEARCH L/CERTIFIED\"]"));
		//ob.moveToElement(search).click().build().perform();
		
		WebElement dealerSearch=driver.findElement(By.xpath("//a[@aria-label=\"FIND A DEALER\"]"));
		ob.moveToElement(dealerSearch).build().perform(); //this will hover on the element only
		ob.moveToElement(dealerSearch).click().build().perform(); // this will click on the element
	}

}
