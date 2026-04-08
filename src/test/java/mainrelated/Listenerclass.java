package mainrelated;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import driverRelated.DriverInitialization;
import util.ScreenShotRelated;


public class Listenerclass implements ITestListener {
	
	public void onTestFailure(ITestResult result) {
		String filename=result.getMethod().getMethodName();
		try {
			ScreenShotRelated.takescreenshotmethod(DriverInitialization.getDriver(), filename);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
