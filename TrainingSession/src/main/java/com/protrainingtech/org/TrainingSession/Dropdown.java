package com.protrainingtech.org.TrainingSession;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdown {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rasman khurshid\\eclipse-workspace\\TrainingSession\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement NewAccount= driver.findElement(By.linkText("Create new account"));
		Thread.sleep(6000);
		NewAccount.click();
		Thread.sleep(6000);
		
		//WebElement FirstName= driver.findElement(By.name("firstname"));
		WebElement FirstName= driver.findElement(By.xpath("//input[@name='firstname']"));
		FirstName.sendKeys("Rasman");
		WebElement Surname= driver.findElement(By.name("lastname"));
		Surname.sendKeys("Khurshid");
		WebElement Mobile= driver.findElement(By.name("reg_email__"));
		Mobile.sendKeys("rasmakhan37@gmail.com");
		WebElement ReenterEmail= driver.findElement(By.name("reg_email_confirmation__"));
		ReenterEmail.sendKeys("rasmakhan37@gmail.com");
		WebElement NewPassword= driver.findElement(By.name("reg_passwd__"));
		NewPassword.sendKeys("RasKhurshid");
		
		
		WebElement MonthofBirth=driver.findElement(By.id("month"));
		Select ob= new Select(MonthofBirth);
		ob.selectByValue("4");
		WebElement DateofBirth=driver.findElement(By.name("birthday_day"));
		Select db= new Select(DateofBirth);
		db.selectByValue("23");
		WebElement YearofBirth=driver.findElement(By.name("birthday_year"));
		Select yb= new Select(YearofBirth);
		yb.selectByValue("1991");
	
		//Radio Button
		WebElement Gender=driver.findElement(By.xpath("//input[@name='sex' and @value='1']"));
		Gender.click();
		
		WebElement Signup= driver.findElement(By.name("websubmit"));
		Thread.sleep(6000);
		Signup.click();
		
		
		
	}

}
