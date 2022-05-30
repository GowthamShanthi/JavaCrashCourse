package conditionStatements;

import java.util.Scanner;

public class Switch_Example {
	
 Scanner scanner = new Scanner(System.in);
 
 public void  name() {
	 
	
	 
	 //Note - In this program have not given any break statement inside any case statement, so when one case is satisfied and executed, all the following case will be executed
	 
	 System.out.println("Enter the God Name");
	 String God;
	 God = scanner.next();
	 
	switch (God) {
	case "Namachivaya":
		System.out.println("The god is Namachivaya");
		
		case "Naathan":
			System.out.println("The god is Naathan");
		   
		case "Gurumanithan":
			    System.out.println("The god is Gurumanithan");

	default:
		System.out.println("The God has no name");
		
		 
	}
	
}
 
public static void main(String[] args) {
	
	Switch_Example example = new Switch_Example();
	example.name();
	
}
	

}
