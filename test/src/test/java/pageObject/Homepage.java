package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.personal.test.base;

public class Homepage extends base{
	
	WebDriver driver;
	//driver = base.initializedriver();
	
	By bestsell= By.linkText("Best Sellers");
	

	public Homepage(WebDriver driver) {
		this.driver= driver;

	}


	public WebElement clicklink()
	{
		return driver.findElement(bestsell);
	}
	
}
