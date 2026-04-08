package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	}
	
	@FindBy(xpath="//*/[@id='name']")
	WebElement element;
	
	public void loginpage() {
		//https://testautomationpractice.blogspot.com/
		System.out.println(driver.getCurrentUrl());
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys("kumar");
		System.out.print(element.getAttribute("value"));
		
	}

}
