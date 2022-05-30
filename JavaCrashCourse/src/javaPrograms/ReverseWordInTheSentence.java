package javaPrograms;

import java.util.Scanner;

public class ReverseWordInTheSentence {
	
	
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to be reversed");
		 
		String givensentence ;
	
		givensentence = scanner.nextLine();
		String reversedsentence = "";
		System.out.println("The lengthof the given string is "+givensentence.length());
		System.out.println("The Given Sentence is \t"+givensentence);

		String [] temp;
		temp=givensentence.split(" ");
		
		System.out.println("The length of the string after space splitting is"+temp.length);
		
		for(int i = temp.length-1;i>=0;i--) {
			
			reversedsentence = reversedsentence+temp[i]+" ";
		}
System.out.println("The Reversed Sentence is "+reversedsentence);
	 
		 
		
		
		 
		
		
	}

}
