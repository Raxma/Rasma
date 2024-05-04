package com.protrainingtech.org.TrainingSession;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;


public class MultipleWindows {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rasman khurshid\\eclipse-workspace\\TrainingSession\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		String ParentWindowHandle= driver.getWindowHandle();
		System.out.println("Parent: " +ParentWindowHandle);
		Thread.sleep(6000);
		WebElement cookie=driver.findElement(By.xpath("//button[contains(text(), 'Decline optional cookies')]"));
		cookie.click();

		WebElement MultipleWindow=driver.findElement(By.linkText("Forgotten password?"));
		Actions ob= new Actions(driver);
		ob.keyDown(Keys.SHIFT).build().perform();
		MultipleWindow.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		
		Set<String> WindowHandler= driver.getWindowHandles();
		java.util.Iterator<String> iterators=WindowHandler.iterator();
		String FirstWindowHandle=iterators.next();
		String SecondWindowHandle=iterators.next();
		System.out.println("First Handler: "+FirstWindowHandle);
		System.out.println("Second Handler: "+SecondWindowHandle);
		driver.switchTo().window(SecondWindowHandle);
		
		
		WebElement NameField=driver.findElement(By.id("identify_email"));
		NameField.sendKeys("rasmakhan37@gmail.com");
		WebElement search=driver.findElement(By.name("did_submit"));
		search.click();
		
		driver.switchTo().window(FirstWindowHandle);
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("rasmakhan37@yahoo.com");
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("XYz@1234***");
		WebElement login=driver.findElement(By.name("login"));
		login.click();
	}

}
