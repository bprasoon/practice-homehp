package Screencapture;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshotcapture {
	public static String getscreenshot(String methodname, WebDriver driver) throws IOException
	{
		TakesScreenshot scrsht= (TakesScreenshot) driver;
		File fs= scrsht.getScreenshotAs(OutputType.FILE);
		String filePath = System.getProperty("user.dir")+ "\\Reports\\Screenshots\\"+ methodname+System.currentTimeMillis() + ".png"; 
		FileUtils.copyFile(fs, new File(filePath));
		return filePath;  // returning file path so that it can be used for attaching the screenshot in extent reports. Used in Listeners
	}

}
