package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ApplePhones {
	
	@AfterGroups("Apple")
	public  void nameApple() {		
	System.out.println("This is After  group - Will execute each time After Apple Group is executed");
		
	}
	
	
	
	@BeforeClass
	public void name() {
		
	System.out.println("This code will execute before ApplePhones Class");
		
	}
	
	@AfterClass
	public void name1() {
		
		System.out.println("This code will execute after ApplePhones Class");
			
		}

	
	@Test(priority = 1, groups  = "Apple")
	public void Apple1() {
		
		System.out.println("This Test Belongs to Apple1 Group");
		
	}
	
	
	@Test(priority = 2,groups = "Apple")
	public void Apple2() {
		
		System.out.println("This Test Belongs to Apple2 Group");
		
	}
	
	
	@Test(priority = 3,groups = "Apple")
	public void Apple3() {
		
		System.out.println("This Test Belongs to Apple3 Group");
		
	}
	
	

}
