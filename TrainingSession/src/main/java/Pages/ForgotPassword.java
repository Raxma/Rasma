package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {
	WebDriver driver;
	
@FindBy (id="identify_email") WebElement forgottenfield;
@FindBy (name="did_submit") WebElement Searchbutton;
@FindBy (xpath = "//*[text()='Reset Your Password']") WebElement Verifies;
public ForgotPassword (WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

public void forgottenfield() {
	forgottenfield.sendKeys("rasmakhan37@yahoo.com");
}
public void search() {
	Searchbutton.click();
}
public String Google() {
	String Forgotelement=Verifies.getText();
	return Forgotelement; 
}
}
