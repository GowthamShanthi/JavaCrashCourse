package javaPrograms;

import java.util.Scanner;

public class FindtheCharLength {
	
	
	public void name() {
		
System.out.println("Enter the string");

String givenstring;
Scanner scanner = new Scanner(System.in);
givenstring = scanner.next();
 

int length =0;
/*
 * char[] chararray = givenstring.toCharArray();
 * 
 * 
 * for (char c : chararray) {
 * 
 * length = length+1;
 * 
 * }
 */
System.out.println("The length of the given"+length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindtheCharLength charLength = new FindtheCharLength();
		charLength.name();

	}

}
	

