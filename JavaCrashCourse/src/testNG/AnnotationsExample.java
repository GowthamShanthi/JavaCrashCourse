package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsExample {
	
	@BeforeSuite	
 
	public void name() {
		

	 
		System.out.println("This is Before Suite Code");
		
	}
	
	
	@AfterSuite
	
	public void name1() {
		
		System.out.println("This is After Suite Code");
		
	}
	
	@BeforeTest
	public void name2() {
		
		System.out.println("This is before Test code");
		
	}
	
	
	@AfterTest
	public void name3() {
		
		System.out.println("This is after Test code");
		
	}
	
	
	@BeforeMethod()
	//@Test
public void name4() {
		
		System.out.println("This is Before Method Code");
		
	
		
	}

	
	@Test
	public void testMethod1() {
		System.out.println("This is test method1");
		
	}
	
	@Test
	public void testMethod2() {
		System.out.println("This is test method2");
		
	}
	
	@AfterMethod
	public  void name5() {
		
		System.out.println("This is after method code");
		
	}
	
	
	@BeforeClass
	public void name6() {
		
		System.out.println("This code will execute before AnnotationsExample Class");
		
	}
	
	@AfterClass
	public void name7() {
		
		System.out.println("This code will execute after AnnotationsExample Class");
		
	}
	
	
	
	
}
