package conditionStatements;

import java.util.Scanner;

import org.testng.annotations.Test;

public class If_Else_Example {

	@Test(invocationCount = 2)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String EnteredValue;
		System.out.println("Enter The value");
		EnteredValue = scanner.next();
		
		if(EnteredValue.equals("Namachivaya")) {
			
			System.out.println("The user Entered Namachivaya");
		}
		
		else
		{
			System.out.println("The user does not enetered namachivaya");
		}
		
		
	}

}
