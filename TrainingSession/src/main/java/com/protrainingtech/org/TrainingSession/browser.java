package com.protrainingtech.org.TrainingSession;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class browser {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rasman khurshid\\eclipse-workspace\\TrainingSession\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("https://www.protrainingtech.com"); //it will create the history in browser
		driver.get("https://www.youtube.com"); // This will also do the same thing as driver.navigate but it will not create history in browser
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		Thread.sleep(6000);
		//driver.close();
		String title= driver.getTitle();
		System.out.println(title); //it will print the title of the page being opened
		String currenturl= driver.getCurrentUrl();
		System.out.println(currenturl);
		String Session= driver.getWindowHandle();
		System.out.println(Session);
	}

}
