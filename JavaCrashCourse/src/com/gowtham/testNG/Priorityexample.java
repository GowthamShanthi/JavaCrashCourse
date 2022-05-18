package com.gowtham.testNG;

import org.testng.annotations.Test;

public class Priorityexample {
	
	
	
	@Test(priority = 3)	
	public void Gowtham() {
		
		System.out.println("Gowtham Born After Shanthi Amma");
		
	}
	
	@Test(priority = 4)	
	public void Mahalaksmi() {
		
		System.out.println("Mahalashmi Born After Gowtham");
		
	}
	
	
	@Test(priority = 2)
	
	public void Shanthi() {
		
		System.out.println("Shanthi Born After Velumani");
		
	}
	
	
	@Test(priority = 1)
	public void Velumani() {
		
		System.out.println("Velumani Born First ");
		
	}
	
	
	
	

}
