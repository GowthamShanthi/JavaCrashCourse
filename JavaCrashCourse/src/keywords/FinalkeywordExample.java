package keywords;



// This class is declared as final, so it cannot be extened(inherited by any other class)
public   class FinalkeywordExample {
	
	

	final String name = "namachivaya"; // This string cannot be changed throughout the program
	
	
	// This method is declared as final, so it cannot be overridden by another child class 
	public final void name() {
		
		
		String gname = "Vaalga";
		
	}
	
 
 

	
	
public static void main(String[] args) {
	
	
	FinalkeywordExample example = new FinalkeywordExample();
	example.name = "vaalgavae";
}
	

}
