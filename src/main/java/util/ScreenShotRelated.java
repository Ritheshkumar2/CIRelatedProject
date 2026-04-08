package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

public class ScreenShotRelated {
		
	public static void takescreenshotmethod(WebDriver driver,String filename) throws IOException {
		//String path="C:/Users/hp/eclipse-workspace/CIRelatedProject/target/screenshots";
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        File dest = new File("screenshots/" + filename + "_" + timestamp + ".png");
		FileUtils.copyFile(src, dest);
		
		
	}

}
