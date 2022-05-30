package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginWithoutFindby {
	
	public static WebElement  txtUsername;
	public static WebElement  txtPassword;
	public static WebElement Submit;


public class LoginTestCase {
	
 
	@Test
 
 public void login( ) {
	 
 
	 
	 
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\V GOWTHAM\\Desktop\\Softwares\\Chromedriver\\chromedriver.exe");

	
WebDriver driver = new ChromeDriver();

PageFactory.initElements(driver, LoginWithoutFindby.class);
driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
 
 
txtUsername.sendKeys("admin");
txtPassword.sendKeys("admin123");
Submit.click();



	 
	}
}
}
	
 
	


