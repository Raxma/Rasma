package com.protrainingtech.org.TrainingSession;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightToClick {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rasman khurshid\\eclipse-workspace\\TrainingSession\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		WebElement rightImage=driver.findElement(By.xpath("//img[@style='cursor: pointer;']"));
		Actions ob=new Actions(driver);
		ob.contextClick(rightImage).build().perform();
		
		Thread.sleep(6000);
		WebElement homeOption=driver.findElement(By.id("dm2m1i0tdT"));
		homeOption.click();
		//ob.moveToElement(homeOption).click().build().perform();

	}

}
