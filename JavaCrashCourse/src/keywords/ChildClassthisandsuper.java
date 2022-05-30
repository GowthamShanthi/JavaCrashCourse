package keywords;

public class ChildClassthisandsuper extends Parentclass{
	
	String name = "childname";
	
	
	public void name() {
		
		
		System.out.println("This name is from parent class name\t"+super.name);
	    System.out.println("This name is from child class name\t"+this.name);
	
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass childClass = new ChildClass();
		childClass.name();

	}

}
