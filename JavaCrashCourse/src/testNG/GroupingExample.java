package testNG;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupingExample {

	
	
	@BeforeTest
	public void name4() {
		
		System.out.println("This is before test in grouping example");
		
	}
	
	
	
	@BeforeClass
	public void name5() {
		
		System.out.println("This is before class in grouping example=================================");
		
	}
	
	@BeforeClass
	public void name3() {
		
		System.out.println("This will execute before grouping example class");
		
	}
	
	@BeforeGroups("Lenovo")
	public  void name() {		
	System.out.println("This is before group - Will execute each time Before lenovo Group is executed");
		
	}
	
	

	@Test(groups = "Motorola")
	public void Motorola1() {

		System.out.println("This Test Belongs to Motorola Group");

	}
	
	
	@Test(priority = 4,groups  = "Motorola")
	public void Motorola2() {

		System.out.println("This Test Belongs to Motorola Group4");

	}
	
	
	@Test(groups = "Motorola")
	public void Motorola3() {

		System.out.println("This Test Belongs to Motorola Group");

	}	

	
	@Test(groups = "Motorola")
	public void Motorola4() {

		System.out.println("This Test Belongs to Motorola Group");

	}

	
	@Test(groups = "Lenovo")
	public void lenovo1() {

		System.out.println("This Test Belongs to lenovo Group");

	}


	@Test(groups = "Lenovo")
	public void lenovo2() {

		System.out.println("This Test Belongs to lenovo Group");

	}





	@Test(groups = "Lenovo")
	public void lenovo3() {

		System.out.println("This Test Belongs to lenovo Group");

	}



 




}
