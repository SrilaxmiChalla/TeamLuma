package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
public static WebDriver driver;
	
	@Test(priority=1,groups= {"smoke"})
    public void openApplication() {
    	
    	driver=new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("https://adactinhotelapp.com/");
    	driver.manage().window().maximize();
    	
    }
	
	@Test(priority=2,groups= {"smoke"},dependsOnMethods= {"openApplication"})
    public void LoginFunctionality() {
    	
    	driver.findElement(By.id("username")).sendKeys("kirandarapu");
        driver.findElement(By.id("password")).sendKeys("Tester@2747");
       driver.findElement(By.id("login")).click();
    }
    
	@Test(priority=4,groups= {"smoke"},dependsOnMethods= {"LoginFunctionality"})
    public void Validation() {
    	
    	String Act_Title=driver.getTitle();
    	String Exp_Title="Adactin.com - Search Hotel";
    	
    	if(Act_Title.equals(Exp_Title)) {
    		
    		System.out.println("testcases is passed..");
    	}
    	else {
    		System.out.println("testcase is failed..");
    	}
    }
	
	@Test(priority=3,groups= {"sanity"})
    public void CloseApplication() {
    	driver.close();
    }
}
