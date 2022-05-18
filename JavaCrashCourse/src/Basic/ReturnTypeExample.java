package Basic;

public class ReturnTypeExample {
	
	public int amount = 5000;
 
	public int  sonCollectAmountandGiveitToMe() {
	
		
		System.out.println("Daddy I Have collected the amount Rs"+amount);
		return amount;
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ReturnTypeExample daddy = new ReturnTypeExample();
	
		System.out.println("Hi Son I have Collected the amount you sent"+daddy.sonCollectAmountandGiveitToMe());

		
		
	}

}
