package Basic;

import org.testng.annotations.Test;

public class BankAccount {


	Long Accountnumber = 1234567890L;

	String  Accountholdername = "Gowtham V";

	Integer accountbalance = 99945;
	
	 
	public void getBalance() {

		System.out.println("The account balance is"+accountbalance);
		Accountholdername = "vaalgave";


	}
	
	public void name() {
	System.out.println("The accont name currently is "+Accountholdername);
		Accountholdername = "Naathan Thaal Vaalga";
	System.out.println("The accont name currently is "+Accountholdername);
		
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount account = new BankAccount();
	
		account.name();
		account.getBalance();

		System.out.println("Now the account holder name is "+account.Accountholdername);
		account.Accountholdername = "Namachivaya Vaalga";
		System.out.println("Account holder name Updated in Main class and it is now\t"+account.Accountholdername);


	}

}
