package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagemodelFindby {
	
@FindBy(xpath = "//*[@id=\"txtUsername\"]")
public static WebElement username;

@FindBy(xpath = "//input[@id='txtPassword']")
public static WebElement password;


@FindBy(xpath = "//*[@id=\"btnLogin\"]")
public static WebElement submitbtn;
	
}
