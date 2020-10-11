package com.personal.test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public WebDriver driver;
	public Properties prop;
	public String pathtoValuesfile=System.getProperty("user.dir")+ "\\src\\test\\java\\resources\\values.properties";
	
	public WebDriver initializedriver() throws IOException
	{
		
		prop = new Properties();
		FileInputStream file = new FileInputStream(pathtoValuesfile);
		 prop.load(file);
		 if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		 {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/java/drivers/chromedriver.exe");	 
		 driver= new ChromeDriver();
		 }
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		return driver;
		
	}
	 	
	
	
	/*
	 * public String getscreenshot(String methodname, WebDriver driver) throws
	 * IOException { TakesScreenshot scrsht= (TakesScreenshot) driver; File fs=
	 * scrsht.getScreenshotAs(OutputType.FILE); String filePath =
	 * System.getProperty("user.dir")+
	 * "\\Reports\\Screenshots\\"+ methodname+System.currentTimeMillis() + ".png";
	 * FileUtils.copyFile(fs, new File(filePath)); return filePath; // returning
	 * file path so that it can be used for attaching the screenshot in extent
	 * reports. Used in Listeners }
	 */
}