package driverRelated;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInitialization {
	
	private static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
	
	
	public void setDriver() {
		driver.set(new ChromeDriver());
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
