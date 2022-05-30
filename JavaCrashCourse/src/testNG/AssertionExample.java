package testNG;

import org.junit.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	
	String name = "Namachivaya";
	Boolean isit = true;
	
	@Test
	 public void name() {
		 
		 Assert.assertEquals(name, "Namachivaya");
		
	}
	@BeforeClass
	public void name13() {
		
		
		System.out.println("This is Before Class in assertion example ========================");
		
	}
	
	@Test
	 public void name1() {
		 
		 Assert.assertNotEquals(name, "Test");
		
	}
	
	@Test
	 public void name3() {
		 
		 Assert.assertEquals(isit, "This should be false");;;
		
	}


	@Test
	public void name6() {
		
		System.out.println("This is nacmachivaya Valgavae==============");
		
	}
	
	
}
