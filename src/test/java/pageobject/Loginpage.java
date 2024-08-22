package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {  //it is the page object class
	
	//1.constructor 2.Identifying the webelements 3.create actions accordingly
	
	public static WebDriver driver;
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	//2.Identify the WebElements
	
	
	@FindBy(xpath="(//li[@class='authorization-link']/a)[1]")
	WebElement Signin;
	
	@FindBy(id="email")
	WebElement txtemail;
	
	@FindBy(id="pass")
	WebElement txtpswd;
	
	@FindBy(linkText="Sign In")
	WebElement btnSubmit;

	//3. Perform Actions
	
	public void Signin() throws InterruptedException {
		Thread.sleep(3000);
		Signin.click();
	}
	public void email(String User) {
		txtemail.sendKeys(User);
		}
	public void password(String pwd) {
		
		txtpswd.sendKeys(pwd);
		
	}
	
	public void submit() {
		btnSubmit.click();
		
	}

}
