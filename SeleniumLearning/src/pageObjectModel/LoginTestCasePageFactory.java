package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTestCasePageFactory {
	
 
 
	@Test
 public void login( ) {
	 
 
	 
	 
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\V GOWTHAM\\Desktop\\Softwares\\Chromedriver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

PageFactory.initElements(driver, LoginPagemodelFindby.class);
LoginPagemodelFindby.username.sendKeys("admin");
LoginPagemodelFindby.password.sendKeys("admin123");
LoginPagemodelFindby.submitbtn.click(); 
 
 



	 
	
}
	
 
	

}
