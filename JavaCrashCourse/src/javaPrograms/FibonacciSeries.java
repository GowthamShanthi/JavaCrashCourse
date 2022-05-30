package javaPrograms;

import java.util.Iterator;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nvalue;
		int n1 =0;
		int n2=1;
		System.out.println("Enter the Limit");
		Scanner scanner = new Scanner(System.in);
		nvalue = scanner.nextInt();
		System.out.println("The Entered Value is"+nvalue);
		 
		
		
		
		System.out.print(n1+"\t");
		System.out.print(n2+"\t");
		
		for(int i =2;i<nvalue;i++ ) {
			
			int n3 = n1+n2;
			System.out.print(n3+"\t");	
			
			  n1=n2;
			  n2=n3; 
			
		
		
	
		  
	}
 
		 
		
		 
		

	}
}



