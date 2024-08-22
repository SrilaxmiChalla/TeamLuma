package testcasesluma;


import org.testng.annotations.Test;

import pageobject.Registration;

public class registrationfun extends Baseclass {
	
	@Test
	public void registration() {
		Registration r=new Registration(driver);
		r.Createaccnt();
		r.Firstname();
		r.Lastname();
		r.Emailadd();
		r.Password();
		r.Cpassword();
		r.Submitbtn();
		
	}

}
