package testcasesluma;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Baseclass {
	//implementation of all the common testcases for application
	public static WebDriver driver;
	public Logger log;
	@BeforeClass
	@Parameters({"Browser","URL"})
	public void OpenApplication(String br,String url) {
		
		if(br.equals("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(br.equals("Edge")){
			driver=new EdgeDriver();
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
		
		log=Logger.getLogger("Projectreadingwritingexcel");
		PropertyConfigurator.configure("log4j.properties");
		
		
	}
	@AfterClass
	public void CloseApplication() {
		driver.close();
	}

}
