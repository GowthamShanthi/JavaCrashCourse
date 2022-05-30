package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageModel {
	
	public static WebElement username(WebDriver driver ) {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement usernamefield = driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")); 
		
		return usernamefield;
		
	} 
	
	public WebElement passowrd(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement passwordfield =  driver.findElement(By.xpath("//input[@id='txtPassword']"));
		return passwordfield;
		
	}
	
	public WebElement loginbutton(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
	WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));  
	return loginbutton;
		 
		
	}
		
		
	}
	
 


