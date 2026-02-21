package mainrelated;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.LoginPage;
import driverRelated.DriverInitialization;

public class MainClass extends DriverInitialization{
	
	@BeforeClass
	public void init() {
		setDriver();
	}
	
	@Test(priority=1)
	public void login() {
		getDriver().get("https://testautomationpractice.blogspot.com/");
		getDriver().manage().window().maximize();
		LoginPage l=new LoginPage(getDriver());
		l.loginpage();
	}
	
	@AfterClass
	public void teardown() {
		removeDriver();
	}

}
