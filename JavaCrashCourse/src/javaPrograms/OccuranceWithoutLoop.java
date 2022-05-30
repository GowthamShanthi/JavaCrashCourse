package javaPrograms;

import java.util.Scanner;

public class OccuranceWithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1.Change all the given string to uniform 
		 * 2.Find the length of the given
		 * string] 3.Replace the tofind letter with empty space 
		 * 4.Now find the length of
		 * the updated string 5.Now subtract t he latest length with the old length
		 */
		
		System.out.println("Enter the word");
		String givenstring;
		char tofind;
		int oldlength;
		int latestlength;
		
	
		Scanner scnr = new Scanner(System.in);
	givenstring = scnr.next();
	
	
	System.out.println("Enter the letter to find the occurance");
				tofind = scnr.next().charAt(0) ;
				System.out.println("The character to br found is "+tofind);
				
				oldlength = givenstring.length();
				
			String updatedgivenstring;
			updatedgivenstring = givenstring.toUpperCase();
		System.out.println("The string After updation is "+updatedgivenstring);
		String	tofindout = Character.toString(tofind);
		
		String afterupdation = updatedgivenstring.replace(tofindout, "" );
		System.out.println("The updated string is "+afterupdation);
		
		
		 int noofoccurance =  updatedgivenstring.length()-afterupdation.length();
		 
		 
		 System.out.println("The length of the updated given string is "+updatedgivenstring.length());
		 System.out.println("The length of the after space updation is "+afterupdation.length());
		System.out.println("The number of times the character "+tofindout+"occurs is "+noofoccurance);
			
			
			
				
				
		
		
		
	}

}


