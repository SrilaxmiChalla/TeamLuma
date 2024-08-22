package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Registration {
	public static WebDriver driver;
	//Constructors
	public Registration(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	//identify the webelements
	
	@FindBy(linkText="Create an Account")
	WebElement Createacc;
	
	@FindBy(id="firstname")
	WebElement Fname;
	
	@FindBy(id="lastname")
	WebElement Lname;
	
	@FindBy(id="email_address")
	WebElement Email;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="password-confirmation")
	WebElement Cpassword;
	
	@FindBy(linkText="Create an Account")
	WebElement Submit;
	
	//Performing actions
	
	public void Createaccnt() {
		Createacc.click();
	}
	
	public void Firstname() {
		Fname.sendKeys("Srilaxmi");
	}
	public void Lastname() {
		Lname.sendKeys("Challa");
	}
	public void Emailadd() {
		Email.sendKeys("srilaxmichalla1929@gmail.com");
		
	}
	public void Password() {
		Password.sendKeys("Srilaxmi@123");
	}
	public void Cpassword() {
		Cpassword.sendKeys("Srilaxmi@123");
	}
	public void Submitbtn() {
		Submit.click();
	}

}
