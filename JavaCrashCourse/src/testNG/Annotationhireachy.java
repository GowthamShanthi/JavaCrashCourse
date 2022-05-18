package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationhireachy {
	
	
	@BeforeSuite
	public void beforesuite() {
		
		System.out.println("This is before Suite");
	}
	
	@AfterSuite
	public void Aftersuite() {
		
		System.out.println("This is After Suite");
	}
	
	
	@BeforeTest
	public void beforetest() {
		
		System.out.println("This is before Test");
	}
	
	@AfterTest
	public void Aftertest() {
		
		System.out.println("This is Aftertest");
	}
	
	
	@BeforeGroups("Namachivaya")
public void beforegropus() {
		
		System.out.println("This is beforegropus");
	}
	
	
	@AfterGroups
public void aftergroups() {
		
		System.out.println("This is aftergroups");
	}
	
	@BeforeClass
	public void beforeclass() {
		
		System.out.println("This is beforeclass");
		
	}
	
	@AfterClass
	public void afterclass() {
		
		System.out.println("This is afterclass");
		
	}
	
	
	@BeforeMethod
	public void beforemethod() {
		
		System.out.println("This is beforemethod");
		
	}
	
	@AfterMethod
	public void aftermethod() {
		
		System.out.println("This is aftermethod");
		
	}

	
	@Test(groups = "Namachivaya")
	public void name() {
		
		System.out.println("This is the real test1");
		
	}

	@Test(groups = "Namachivaya")
	public void name1() {
		
		System.out.println("This is the real test2");
		
	}
 
	
	

}
