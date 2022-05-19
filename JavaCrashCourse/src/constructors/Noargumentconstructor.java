package constructors;

public class Noargumentconstructor {

	String Namachivaya;
	
	
	public Noargumentconstructor( ) {
		// TODO Auto-generated constructor stub
		
		Namachivaya = "God";
		
		System.out.println("The example objectis created");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Noargumentconstructor example = new Noargumentconstructor();
		System.out.println("The value for Namachivaya is now intialized via constructor to \t"+example.Namachivaya);
		
 

		
		
	}

}
