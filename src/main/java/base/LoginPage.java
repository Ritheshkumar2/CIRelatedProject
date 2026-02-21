package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='name']")
	WebElement element;
	
	public void loginpage() {
		//https://testautomationpractice.blogspot.com/
		System.out.println(driver.getCurrentUrl());
		element.sendKeys("kumar");
		System.out.print(element.getAttribute("value"));
		
	}

}
