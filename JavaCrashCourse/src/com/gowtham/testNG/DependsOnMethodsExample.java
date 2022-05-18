package com.gowtham.testNG;

import org.testng.annotations.Test;

public class DependsOnMethodsExample {
	
	
@Test(priority = 2)	
	public void complete10th() {
		System.out.println("The student has completed 10th std succesfully");
		
	}
	
	@Test(priority = 1, dependsOnMethods  = "complete10th")
	public void complete12th () {		
		
		System.out.println("The student has completed 12th std succesfully");
		
	}
	
	@Test(priority = 3)
	public void completeUG() {		
		
		System.out.println("The student has completed UG Degree succesfully");
		
	}
	
	public void completePG() {		
		
		System.out.println("The student has completed PG Degree succesfully");
		
	}

	 

 
	
}
