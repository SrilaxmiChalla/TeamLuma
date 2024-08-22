package testcasesluma;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.Loginpage;

public class LoginFunctionality extends Baseclass{
	
	@Test(dataProvider="data")
	public void logintest(String User,String PWD) throws InterruptedException {
		Loginpage lp=new Loginpage(driver);
		lp.Signin();
		log.info("Signin link is clicked");
		lp.email(User);
		log.info("Email is entered");
		lp.password(PWD);
		log.info("Password is entered");
		lp.submit();
		log.info("Login button is clicked");
		
	}
	@DataProvider(name="data",indices= {0,1,2})
	String [][]logindata(){
		//data creation for testcases
		String data[][]= {{"srilaxmichalla","Tester@123"},
				{"Srilaxmi","Tester"},{"Challa","tester@12"}};
		return data;
		}
		
	}


