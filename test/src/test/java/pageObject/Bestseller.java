package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.personal.test.base;

public class Bestseller extends base {
	WebDriver driver;
	
	By linktext=By.cssSelector("[href*='Best-Sellers-Toys']");
	
	public Bestseller(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getText()
	{
		return driver.findElement(linktext);
		
		
	}

}
