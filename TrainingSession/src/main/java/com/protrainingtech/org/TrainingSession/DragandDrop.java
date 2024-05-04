package com.protrainingtech.org.TrainingSession;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rasman khurshid\\eclipse-workspace\\TrainingSession\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://jqueryui.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		WebElement dropable=driver.findElement(By.linkText("Droppable"));
		dropable.click();
		Thread.sleep(6000);
		driver.switchTo().frame(0);
		WebElement dragable=driver.findElement(By.id("draggable"));
		WebElement dropableElement=driver.findElement(By.id("droppable"));
		Actions ob=new Actions(driver);
		ob.dragAndDrop(dragable, dropableElement).build().perform();
		
		Thread.sleep(6000);
		driver.switchTo().parentFrame();
		WebElement Resizeable=driver.findElement(By.linkText("Resizable"));
		Resizeable.click();
		
		Thread.sleep(6000);
		driver.switchTo().frame(0);
		WebElement Resize= driver.findElement(By.xpath("//div[contains(@class, 'ui-resizable-handle')][contains(@class, 'ui-resizable-se')]"));
		ob.clickAndHold(Resize).moveByOffset(40, 60).release().build().perform();
		
		
		
	
	}

}
