package dataProviderTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingDataProvider {
	String [][] data = {
			{"Admin","admin"},
			{"Admins","admin123"},
			{"Adminsss","admin123dsdsd"},
			{"Admin","admin123"}
			
	};
	
	
@DataProvider(name ="testdata")
 public String[][] gowtham() {
	 
	 return data;
	
}


@Test(dataProvider = "testdata" )
public void login(String Uname,String Password) {
	 
	 
	 
	 
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\V GOWTHAM\\Desktop\\Softwares\\Chromedriver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

WebElement usernamefield = driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")); 
usernamefield.sendKeys(Uname);

 WebElement passwordfield =  driver.findElement(By.xpath("//input[@id='txtPassword']"));
 passwordfield.sendKeys(Password);

	
	  WebElement loginbutton =
	  driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")); loginbutton.click();
	 






	 
	
}

}
