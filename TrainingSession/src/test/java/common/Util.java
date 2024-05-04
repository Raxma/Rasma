package common;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
public class Util {	
	public WebDriver driver;
	@BeforeMethod
	@Parameters({"browser","url"})
	  public void Ibrowsers(String browser, String website)
	  {
		  if(browser.equalsIgnoreCase("Chrome"))
		  {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rasman khurshid\\eclipse-workspace\\TrainingSession\\Driver\\chromedriver.exe");
				driver= new ChromeDriver();
		  }
		  else if(browser.equalsIgnoreCase("Edge"))
		  {
			  System.setProperty("webdriver.edge.driver", "C:\\Users\\rasman khurshid\\eclipse-workspace\\TrainingSession\\Driver\\msedgedriver.exe");
				driver= new EdgeDriver();
		  }
		  else {
			  System.out.println("Browser doesnt exist");
		  }
		  	driver.get(website);
			driver.manage().window().maximize();
			WebElement cookie=driver.findElement(By.xpath("//button[contains(text(), 'Decline optional cookies')]"));
			cookie.click();
	  }

	  @AfterMethod
	  public void afterMethod() throws InterruptedException {
		  Thread.sleep(6000);
		  }
	  public void shots() throws IOException 
	  {
		  Date sessio=new Date();
		  System.out.println(sessio);
		  String kj=sessio.toString().replace(" ", "_").replace(":", "_");
		  System.out.println(kj);
		  File output= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(output, new File("C:\\Users\\rasman khurshid\\eclipse-workspace\\TrainingSession\\Pictures\\"+kj+"pic.png"));
	  }
}
