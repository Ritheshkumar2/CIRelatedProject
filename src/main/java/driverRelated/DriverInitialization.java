package driverRelated;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverInitialization {
	
	private static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
	
	
	public void setDriver() {
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--headless=new");
		driver.set(new ChromeDriver(options));
	} 
	
	public WebDriver getDriver() {
		return driver.get();
	}
	
	public void removeDriver() {
	    if (driver.get() != null) {
	        driver.get().quit();
	        driver.remove();
	    }
	}

}
