package pageObjectModel;
 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import pageObjectModel.LoginPageModel;


public class LoginTestCase {
	
 
	@Test
	@Parameters({"Namachivaya","Vaalga"})
 public void login(String Uname,String Password) {
	 
 
	 
	 
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\V GOWTHAM\\Desktop\\Softwares\\Chromedriver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
LoginPageModel loginPageModel = new LoginPageModel();
loginPageModel.username(driver).sendKeys("admin");
loginPageModel.passowrd(driver).sendKeys("admin123");
loginPageModel.loginbutton(driver).click();
 
 
 



	 
	
}
	
 
	

}
