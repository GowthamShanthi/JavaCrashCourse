package javaPrograms;

import java.util.Scanner;

import org.apache.xalan.xsltc.compiler.sym;

public class OccuranceOfcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String givenword;
int noofoccurance = 0;
char letter;
		
		System.out.println("Enter the Word");
		Scanner scanner = new Scanner(System.in);
	givenword = scanner.next();
	System.out.println("The given Word is "+givenword);
	
	System.out.println("Enter Letter for which the occurance to be counted ");
	letter = scanner.next().charAt(0);
	
	System.out.println("The Letter to be counted\t"+letter);
	
	for(int i=0;i<givenword.length();i++) {
		
		if (letter == givenword.charAt(i)) {
			
			noofoccurance = noofoccurance+1;
			
		 
		}
	}
		
		
	
	System.out.println("The occurance of Letter "+letter+"In the given word is "+noofoccurance);
	}

}
