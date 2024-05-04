package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	WebDriver driver;
@FindBy (name="email") WebElement email;
@FindBy (name="pass") WebElement password; 
@FindBy (linkText="Forgotten password?") WebElement forgotten;
@FindBy (linkText="Create new account")WebElement newaccount;

public Home(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void emailfill()
{
	email.sendKeys("rasmakhan37@yahoo.com");
	
}
public void passwordfille()
{
	password.sendKeys("XYz@1234**");

}
public void forgottenpassword() {
	forgotten.click();
}
public void newAcc() {
	newaccount.click();
}
}
