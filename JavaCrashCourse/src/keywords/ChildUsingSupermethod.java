package keywords;

public class ChildUsingSupermethod extends Parentclass{
	
	
public void gowtham() {
	
	System.out.println("This is child method - using this ");
	
}
 
	
	public   void callingfparentmthod() {
		
		super.gowtham();
		this.gowtham();
		

		
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 ChildUsingSupermethod childUsingSupermethod = new ChildUsingSupermethod();
	 childUsingSupermethod.callingfparentmthod();

	}

}
