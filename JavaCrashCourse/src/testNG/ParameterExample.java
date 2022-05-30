package testNG;

import org.junit.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParameterExample {
	
	
	
	@BeforeClass
	public void name1() {
		
		System.out.println("This is before class in parameter tttttttttttttttttttttttttttttttttttttttt");
		
	}
	
	
	@Test
	 @BeforeSuite
	@Parameters("Namachivaya")
	public void gowtham( String parvalue ) {
		
		System.out.println("The value passed form parameter in xml file is "+parvalue);
		
	
		
	}
	
	
	
	
	
}
