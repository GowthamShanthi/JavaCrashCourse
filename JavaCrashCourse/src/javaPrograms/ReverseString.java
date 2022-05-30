package javaPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String givenstring;
		String reversedstring = "";
		System.out.println("Enter the string to be reversed");
Scanner scanner = new Scanner(System.in);
givenstring = scanner.next();
 
/*
 * char[] chararray = givenstring.toCharArray();
 * 
 * System.out.println(chararray.length);
 */


for(int i = givenstring.length()-1;i>=0;i--) {
	
reversedstring = reversedstring+givenstring.charAt(i);
}

System.out.println(reversedstring);
	
}

/*for(int i = chararray.length-1;i>0;i--) {
	
  reversedstring = reversedstring+chararray[i];

	
}
System.out.println("The reversed String is "+reversedstring);

	}
*/
}
